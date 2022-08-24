/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ut2_pd2;

import java.util.Arrays;

/**
 *
 * @author Martin
 */
public class Program {

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println("Factorial:");
        System.out.println(factorial.factorial(4));
        System.out.println(factorial.factorial(5));
        System.out.println(factorial.factorial(0));
        
        SumaLineal sumaLinealInstance = new SumaLineal();
        System.out.println("\nSumalineal:");
        int[] arr = {4, 3, 6, 2, 5};
        //int[] arr = { };
        System.out.println(sumaLinealInstance.sumaLineal(arr, 5));
        System.out.println(sumaLinealInstance.sumaLineal(arr, 1));
        
        Potencia potenciaInstance = new Potencia();
        System.out.println("\nPotencia:");
        System.out.println(potenciaInstance.potencia(2, 4));
        //System.out.println(potenciaInstance.potencia(2.5, 4.9));
        //System.out.println(potenciaInstance.potencia(2, 4.7));
        System.out.println(potenciaInstance.potencia(-2, 5));
        System.out.println(potenciaInstance.potencia(-2.8, 5));
        //System.out.println(potenciaInstance.potencia(2, -5));
        
        InvertirArray invertirArrayInstance = new InvertirArray();
        System.out.println("\nInvertirArray:");
        //int[] arr2 = { 1, 2, 3, 4, 5, 6 };
        //int[] arr2 = { };
        int[] arr2 = { 1 };
        //invertirArrayInstance.invertirArray(arr2, 0, 5);
        //invertirArrayInstance.invertirArray(arr2, -1, 5);
        //invertirArrayInstance.invertirArray(arr2, 1, 5);
        invertirArrayInstance.invertirArray(arr2, 0, 0);
        System.out.println(Arrays.toString(arr2));
        
        
    }
}
