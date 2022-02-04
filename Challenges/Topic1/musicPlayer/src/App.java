
import musicPlayers.Facade;

import java.util.Scanner;

/**
 * Entry point.
 */

public class App {
    public static void main(String[] args) {
        String color;
        int batery, memory;
        Scanner sc = new Scanner(System.in);
        Facade create = new Facade();


        menu();
        //store de options
        System.out.println("1) What do you color prefer?\tBlue or Green");
        color = sc.next();
        System.out.println("2) What do you hours of battery life prefer?\t 5 or 8");
        batery= sc.nextInt();
        System.out.println("3) What do you gigabytes of memory prefer?\t 8 or 16");
        memory= sc.nextInt();

        create.CreateMP(color, memory,batery);


    }

    public static void menu(){
        System.out.println("+-------------------------------------------------------+");
        System.out.println("|        Welcome to your builder of music players       |");
        System.out.println("+-------------------------------------------------------+\n");
        System.out.println("Please select three preferences to build your music player:");


    }
}
