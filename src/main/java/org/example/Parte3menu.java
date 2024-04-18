package org.example;

import java.util.Scanner;

public class Parte3menu {


    public static double[][] dimensionArreglo(int dias){
        double[][] sismos = new double[dias][24];
        return sismos;
    }

    public static void recorreArray (double[][] sismos, int dias ) {
        dimensionArreglo(dias);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < sismos.length; i++) {
            for (int j = 0; j < sismos[i].length; j++) {
                System.out.println("Ingresa el dato del dia "+i+" a la hora "+j+":00 hrs");
                sismos[i][j] = ingresaScanner();
    }}}
    public static double ingresaScanner(){
        Scanner sc = new Scanner(System.in);
        double dato = sc.nextDouble();
        return dato;

        }
    public static void mostrarArray(double[][]sismos) {
        for (int i = 0; i < sismos.length; i++) {
            for (int j = 0; j < sismos[i].length; j++) {
                System.out.println(sismos[i][j]);
            }}}
    }









