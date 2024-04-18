package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static double[][] crearMatriz(int filas, int columnas) {
        double[][] sismos = new double[filas][columnas];
        return sismos;
    }


public static int[] contarSismosGrado4(double[][] sismos) {
    int[] contadorPorDia = new int[sismos.length];
    for (int i = 0; i < sismos.length; i++) {
        for (int j = 0; j < sismos[i].length; j++) {
            if (sismos[i][j] >= 4) {
                contadorPorDia[i]++;
            }
        }
    }
    return contadorPorDia;
    }
    public static void menu (){
        double[][] sismos = crearMatriz(7, 24);

        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menu");
            System.out.println("1.- Dias A registrar");
            System.out.println("2.- Mostrar sismos ≥ 4.0 grados Richter");
            System.out.println("3.- Reiniciar el arreglo con nuevos valores");
            System.out.println("4.- Salir");
            try{
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:

                    break;
                case 2:
                    int[] sismosGrado4OMayor = contarSismosGrado4(sismos);
                    for (int i = 0; i < sismosGrado4OMayor.length; i++) {
                        System.out.println("Día " + (i + 1) + ": " + sismosGrado4OMayor[i] + " veces");
                    }
                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Bye Bye");
                    System.exit(0);
                default:
                    System.out.println("Opcion INVALIDA");
                    break;
            }
        }catch (InputMismatchException e) {
            System.out.println("Error: Por favor ingrese un número válido.");
            teclado.next();
            opcion = 0;
        }

        } while (opcion != 8);

    }
}