package com.vanessadev.cicles;

import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        /*
            Desarrollar un programa que obtenga el promedio de calificacion de un alumno con 5 materias.
            - solicitar y almacenar la informacion de las 5 materias.
            - Sumar el total de las calificaciones.
            - obtener el promedio.
         */
        float [] calificaciones = new float[5];
        Scanner sc = new Scanner(System.in);
        float suma = 0;
        float promedio;

        // ciclo para pedir las calificaciones
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Ingrese la calificacion " + (i+1) + ": ");
            calificaciones[i] = sc.nextFloat();
        }

        for (float f: calificaciones) {
            suma += f;
        }
        promedio = suma / calificaciones.length;

        System.out.println(" el promedio del alumno es: " + promedio);
    }
}
