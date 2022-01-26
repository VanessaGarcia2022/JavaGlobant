import exceptions.MemoryOverflowException;
import models.ApplicationProcess;
import models.Memory;
import models.Process;
import models.SystemProcess;

import java.util.Scanner;

/**
 * <h1>Simulation of process creation and memory management</h1>
 * Program that Create a matrix named "memory", in this memory the process type system
 * and application are saved, and each one has a different size.
 */

public class Main {
    /**
     * Entry point.
     * @param args args
     */
    public static void main(String[] args) {

        // main memory instance
        final Memory memory = new Memory();

        // Attributes
        String input, method, typeProcess;
        Process process;

        // obtain the input
        Scanner sc = new Scanner(System.in);

        // Welcome
        showMenu();
        do {
            System.out.print("$: ");
            input = String.valueOf(sc.next()).toLowerCase();
            if (input.length()<2){
                System.out.println("Enter a valid option: ca, cs, d+(id), q");
                continue;
            }
            method = String.valueOf(input.charAt(0)); // define method "c" or "d"

            if (method.equals("c")){ // create
                System.out.print("Create: ");
                typeProcess = String.valueOf(input.charAt(1)); // define type of process "a" or "s"
                switch (typeProcess) {
                    case "s" -> {
                        System.out.println("System process");
                        //create SystemProcess instance
                        process = createSystem();
                        // add instance to memory
                        try {
                            memory.addProcess(process);
                        } catch (MemoryOverflowException e) { // no memory space
                            System.out.println(e);
                        }
                    }
                    case "a" -> {
                        System.out.println("Aplication process");
                        // create applicationProcess instance
                        process = createApplication();
                        // add instance to memory
                        try {
                            memory.addProcess(process);
                        } catch (MemoryOverflowException e) { //no memory space
                            System.out.println(e);
                        }
                    }
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
            }else if (input.equals("exit")){
                    System.out.println("Bye!");
                    break;
            }else{
                System.out.println("Enter a valid option: ca, cs, d+(id), q");
            }

        }
        while(true);
    }

    /**
     * Method to show menu.
     */
    public static void showMenu() {
        System.out.println("+------------------------------------------------------------------------------+");
        System.out.println("|--------        Welcome to memory simulation program           ---------------|");
        System.out.println("+------------------------------------------------------------------------------+"+ "\n");
        System.out.println("To create a system process please type: cs");
        System.out.println("To create an application process please type: ca");
        System.out.println("To dele a process please type: d + id of process (ex: d1)");
        System.out.println("Exit: exit");
    }

    /**
     * Method to create procces type System
     * @return a new instance of system
     */
    private static Process createSystem() {
        return new SystemProcess();
    }

    /**
     * Method to create procces type System
     * @return a new instance of system
     */
    private static Process createApplication() {
        return new ApplicationProcess();
    }
}
