package org.example;

import java.util.Scanner;

public class Parte3menu {
    double[][] sismos;

    Parte3menu(){
        this.sismos = sismos;

    }

    public static void dimensionArreglo(double[][] sismos, int dias){
        sismos = new double[dias][24];
    }

    public static void recorreArray (double[][] sismos) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < sismos.length; i++) {
            for (int j = 0; j < sismos[i].length; j++) {
                System.out.println("Ingresa el dato del dia "+i+" a la hora "+j+":00 hrs");
                sismos[i][j] = sc.nextDouble();
    }}}}






}

