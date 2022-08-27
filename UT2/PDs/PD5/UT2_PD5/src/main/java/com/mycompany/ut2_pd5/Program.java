/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ut2_pd5;

import com.mycompany.ut2_pd5.Ejercicio1.HasTwoTrueValues;
import com.mycompany.ut2_pd5.Ejercicio2.BinarySearch;

/**
 *
 * @author Martin
 */
public class Program {

    public static void main(String[] args) {

        // EJERCICIO 1.
        HasTwoTrueValues instance = new HasTwoTrueValues();
        Utils utilsInstance = new Utils();

        boolean[] randomlyGenerated = utilsInstance.generateExtraLargeBooleanArray(10000);
        //boolean[] falseBooleanArray = {false, false, false, false, false, false, false, false};

        // Version 1 del algoritmo, medicion del tiempo:
        System.out.println("EJERCICIO 1:");
        long inicioEjecucionV1 = System.nanoTime();
        instance.hasTwoTrueValuesV1(randomlyGenerated);
        //System.out.println("Version 1: " + instance.hasTwoTrueValuesV1(randomlyGenerated));
        long finEjecucionV1 = System.nanoTime();
        System.out.println("La ejecución de la version 1 del algoritmo llevó: " + (finEjecucionV1 - inicioEjecucionV1) / 1000000F + " ms.");

        // Version 2 del algoritmo, medicion del tiempo:
        long inicioEjecucionV2 = System.nanoTime();
        instance.hasTwoTrueValuesV2(randomlyGenerated);
        //System.out.println("Version 2: " + instance.hasTwoTrueValuesV2(randomlyGenerated));
        long finEjecucionV2 = System.nanoTime();
        System.out.println("La ejecución de la version 2 del algoritmo llevó: " + (finEjecucionV2 - inicioEjecucionV2) / 1000000F + " ms.");

        // Version 3 del algoritmo, medicion del tiempo:
        long inicioEjecucionV3 = System.nanoTime();
        instance.hasTwoTrueValuesV3(randomlyGenerated);
        //System.out.println("Version 3: " + instance.hasTwoTrueValuesV3(randomlyGenerated));
        long finEjecucionV3 = System.nanoTime();
        System.out.println("La ejecución de la version 3 del algoritmo llevó: " + (finEjecucionV3 - inicioEjecucionV3) / 1000000F + " ms.");

        // EJERCICIO 2:
        /*
        BinarySearch binarySearchInstance = new BinarySearch();
        Integer[] ordenedIntArray = utilsInstance.generateOrdenedIntArray(20000000);
        System.out.println("\nEJERCICIO 2:");
        long inicioEjecucionBinarySearch = System.nanoTime();
        binarySearchInstance.binarySearch(ordenedIntArray, 20000000);
        //System.out.println("Elemento 10 encontrado en la posicion: " + binarySearchInstance.binarySearch(ordenedIntArray, 10));
        long finEjecucionBinarySearch = System.nanoTime();
        System.out.println("Para una entrada de " + ordenedIntArray.length + " elementos el algoritmo demoró "
                + (finEjecucionBinarySearch - inicioEjecucionBinarySearch) / 1000000F + " ms.");*/
    }
}

/* 
Ejercicio 1:
   Con un array de 20.000.000 elementos generados "aleatoriamente" los algoritmos demoraron aproximadamente:
    La version 1 del algoritmo demoró: 77.825 ms
    La version 2 del algoritmo demoró: 0.0036 ms
    La version 3 del algoritmo demoró: 0.0137 ms


   Con un array de 12.000.000 elementos generados "aleatoriamente" los algoritmos demoraron aproximadamente:
    La version 1 del algoritmo demoró: 47.776 ms
    La version 2 del algoritmo demoró: 0.0034 ms
    La version 3 del algoritmo demoró: 0.0141 ms

   Con un array de 1.000.000 elementos generados "aleatoriamente" los algoritmos demoraron aproximadamente:
    La version 1 del algoritmo demoró: 6.6806 ms
    La version 2 del algoritmo demoró: 4.2968 ms
    La version 3 del algoritmo demoró: 0.0053 ms

   Con un array de 100.000 elementos generados "aleatoriamente" los algoritmos demoraron aproximadamente:
    La version 1 del algoritmo demoró: 1.5842 ms
    La version 2 del algoritmo demoró: 0.0029 ms
    La version 3 del algoritmo demoró: 0.0023 ms

   Con un array de 10.000 elementos generados "aleatoriamente" los algoritmos demoraron aproximadamente:
    La version 1 del algoritmo demoró: 0.1977 ms
    La version 2 del algoritmo demoró: 0.4619 ms
    La version 3 del algoritmo demoró: 0.0027 ms

Con las pruebas realizadas, podríamos decir que en promedio la version 3 del algoritmo es la que se ejecuta más rápido; ya que los valores se acercan bastante a 0 ms.
Para la medición del tiempo se utilizo la función nanoTime() de la clase System. Para obtener el tiempo que demoró el algoritmo, calcule la diferencia
entre la medicion antes de ejecutar el método y luego de la ejecución; pero esa diferencia esta en nanosegundos, por lo tanto para pasarlo a milisegundos
se divide entre 1.000.000.

Ejercicio 2:
   Con un array de 20.000.000 elementos, el algoritmo binarySearch demoró aproximadamente 0.0209 ms. (probado comentando todas las operaciones del ej1)
   Con un array de 12.000.000 elementos, el algoritmo binarySearch demoró aproximadamente 0.0177 ms. (probado comentando todas las operaciones del ej1)
   Con un array de 10 elementos, el algoritmo binarySearch demoró aproximadamente 0.0123 ms. (probado comentando todas las operaciones del ej1)

 */
