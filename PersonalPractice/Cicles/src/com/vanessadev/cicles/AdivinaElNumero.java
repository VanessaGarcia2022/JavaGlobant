package com.vanessadev.cicles;

import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
        /*
            Desarrolle un programa que pida al usuario adivinar un numero entre 0 t 10.
            El numero se debe generar aleatoriamente.
            El usuario tiene 3 intentospara adivinar el nuemero.
            - Generar el numero random entre 0 y 10;
            - Pedir al usuario que intente adivinar y validar si acerto.
            - Validar el numero de intentos.
         */
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int randNum = r.nextInt(11);
        int userNum = -1;
        int intentos = 3;

        while (userNum != randNum) {
            System.out.println("Adivina el numero entre 0 y 10: ");
            userNum = sc.nextInt();
            if (userNum == randNum){
                System.out.println("Ganaste!");
            }else{
                intentos--;
                System.out.println("Fallaste, sigue intentando.");
                System.out.println("Numero de intentos restantes:"+intentos);
                if(intentos == 0){
                    System.out.println("Perdiste...");
                    System.out.println("el numero aleatoria era: "+randNum);
                    break;
                }
            }
        }
    }
}
