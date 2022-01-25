import exceptions.MemoryOverflowException;
import models.ApplicationProcess;
import models.Memory;
import models.Process;
import models.SystemProcess;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final Memory memory = new Memory();
        String input, method, typeProcess;
        Process process;


        // Welcome
        showMenu();
        do {
            System.out.print("$: ");
            input = String.valueOf(sc.next()).toLowerCase();
            if (input.length()<2){
                System.out.println("Enter a valid option: ca, cs, d+(id), q");
                continue;
            }
            method = String.valueOf(input.charAt(0));

            if (method.equals("c")){
                System.out.print("Create: ");
                typeProcess = String.valueOf(input.charAt(1));
                switch (typeProcess) {
                    case "s" -> {
                        System.out.println("System process");
                        //create SystemProcess instance
                        process = createSystem();
                        // add instance to memory
                        try {
                            memory.addProcess(process);
                        } catch (MemoryOverflowException e) {
                            System.err.println(e);
                        }
                    }
                    case "a" -> {
                        System.out.println("Aplication process");
                        // crear applicationProcess instance
                        process = createApplication();
                        // add instance to memory
                        try {
                            memory.addProcess(process);
                        } catch (MemoryOverflowException e) {
                            System.err.println(e);
                        }
                    }
                    default -> System.out.println("Enter a valid option: ca, cs, d+(id), q");
                }
            }else if (method.equals("d")){
                int idDelete;
                // cast string id to integer
                if(input.length() >= 2) {
                    idDelete = Integer.parseInt(input.replace("d", " ").trim());
                    // delete process
                    memory.deleteProcess(idDelete);
                }else{
                    System.out.println("Please, add the ID of process to delete");
                }
            }

        }
        while(!input.equals("q"));
        System.out.println("Bye!");

    }
    public static void showMenu() {
        System.out.println("+------------------------------------------------------------------------------+");
        System.out.println("|--------        Welcome to memory simulation program           ---------------|");
        System.out.println("+------------------------------------------------------------------------------+"+ "\n");
        System.out.println("To create a system process please type: cs");
        System.out.println("To create an application process please type: ca");
        System.out.println("To dele a process please type: d + id of process (ex: d1)");
        System.out.println("Exit: q");
    }

    public static String formatInput(String input) {
        String fInput;
        if(input.length() > 2){
            fInput = input.toLowerCase().substring(0,2);
            return fInput;
        }
        return input.toLowerCase();
    }
    private static void delaySegundo()
    {
        try
        {
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Error delay");
        }
    }
    private static Process createSystem() {
        return new SystemProcess();
    }
    private static Process createApplication() {
        return new ApplicationProcess();
    }
}
