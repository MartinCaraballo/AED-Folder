/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ut2_pd4;

import com.mycompany.ut2_pd4.Ejercicio2.MetodoContains;

/**
 *
 * @author Martin
 */
public class Program {

    public static void main(String[] args) {
        // EJERCICIO 1:
        /*BusquedaInterpolacion instance = new BusquedaInterpolacion();
        Utils utilsInstance = new Utils();
        int[] ordenedIntArray = utilsInstance.generateOrdenedIntArray(1000000);
        
        long inicioEjecucion = System.nanoTime();
        instance.busquedaInterpolacion(ordenedIntArray, 1000000);
        long finEjecucion = System.nanoTime();
        //System.out.println("Elemento encontrado en la posicion: " + instance.busquedaInterpolacion(ordenedIntArray, 50));
        System.out.println("Duración de la ejecución: " + (finEjecucion - inicioEjecucion) / 1000000F + " ms."); //ronda los 0.0054 ms.
         */
        // EJERCICIO 2:
        MetodoContains instanceEj2 = new MetodoContains();
        int[][] m = {{4, 6, 8}, {5, 9, 11}, {7, 11, 14}};
        long inicioEjecucionEj2 = System.nanoTime();
        instanceEj2.metodoContains(m, 14);
        //System.out.println(instanceEj2.metodoContains(m, 14));
        long finEjecucionEj2 = System.nanoTime();
        System.out.println("Tiempo de ejecución del algoritmo contains: " + (finEjecucionEj2 - inicioEjecucionEj2) / 1000000F + " ms.");
        
    }
}
