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

    public static void rellenoSismos(double sismos[][]) {
        for (int i = 0; i < sismos.length; i++) {
            for (int j = 0; j < sismos[i].length; j++) {
                sismos[i][j] = 1 + (Math.random() * 8.5);
            }
        }
    }

    public static void mostrarSismos(double sismos[][]) {
        for (int i = 0; i < sismos.length; i++) {
            System.out.println();
            for (int j = 0; j < sismos[i].length; j++) {
                System.out.print("|" + sismos[i][j] + "|");
            }
        }
        System.out.println();
    }


    public static void menu (){
        double[][] sismos = crearMatriz(7, 24);

        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menu");
            System.out.println("1.- Dias A registrar");
            System.out.println("2.- Mostrar sismo de mayor magnitud");
            System.out.println("3.- Contar sismos mayores o iguales a 5.0");
            System.out.println("4.- Enviar SMS por cada sismo mayor o igual a 7.0");
            System.out.println("5.- Mostar Tablilla de sismos Semanales");
            System.out.println("6.- Salir");
            try{
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    rellenoSismos(sismos);
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 5:
                    mostrarSismos(sismos);
                    break;
                case 6:
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