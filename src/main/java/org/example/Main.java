package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de días a registrar:");
        int dias = scanner.nextInt();

        SismosMasIntenso sismoMasIntenso = new SismosMasIntenso(dias);

        menu(sismoMasIntenso.lecturas, sismoMasIntenso);
    }

    public static void menu(double[][] sismos, SismosMasIntenso sismoMasIntenso) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menu");
            System.out.println("1.- Mostrar sismos ≥ 4.0 grados Richter");
            System.out.println("2.- Mostrar sismos Intensos");
            System.out.println("3.- Reiniciar el arreglo con nuevos valores");
            System.out.println("4.- Salir");
            try {
                opcion = teclado.nextInt();
                switch (opcion) {
                    case 1:
                        mostrarSismosGrado4(sismos);
                        break;
                    case 2:
                        sismoMasIntenso.MostrarSismoMasIntenso();
                        break;
                    case 3:
                        sismos = crearMatriz(sismos.length, sismos[0].length);
                        System.out.println("Arreglo reiniciado con nuevos valores.");
                        break;
                    case 4:
                        System.out.println("¡BYEBYE!");
                        System.exit(0);
                    default:
                        System.out.println("Opcion INVALIDA");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor ingrese un número válido.");
                teclado.next();
                opcion = 0;
            }

        } while (opcion != 4);
    }

    public static double[][] crearMatriz(int filas, int columnas) {
        double[][] sismos = new double[filas][columnas];
        Random random = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sismos[i][j] = 1.0 + (9.5 - 1.0) * random.nextDouble();
            }
        }
        return sismos;
    }

    public static void mostrarSismosGrado4(double[][] sismos) {
        int[] contadorPorDia = new int[sismos.length];
        for (int i = 0; i < sismos.length; i++) {
            for (int j = 0; j < sismos[i].length; j++) {
                if (sismos[i][j] >= 4) {
                    contadorPorDia[i]++;
                }
            }
        }

        for (int i = 0; i < contadorPorDia.length; i++) {
            System.out.println("Día " + (i + 1) + ": " + contadorPorDia[i] + " veces");
        }
    }
}

