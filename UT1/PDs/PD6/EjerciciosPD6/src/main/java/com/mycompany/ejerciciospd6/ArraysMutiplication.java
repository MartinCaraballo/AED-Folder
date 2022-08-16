/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciospd6;

/**
 *
 * @author Martin
 */
public class ArraysMutiplication {
    
    // Para multiplicar dos arrays, se deben recorrer a la vez e ir añadiendo los resultados en un tercer
    // array o sumar en una variable los resultados. Las condiciones son que ambos arrays deben ser del 
    // mismo tamaño ya que si no se puede generar una excepción. 
    public static int arrayMultiplication(int[] arr1, int[] arr2) {
        int[] results = new int[arr1.length];
        int additionResult = 0;
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                int multiply = arr1[i] * arr2[i];
                results[i] = multiply;
                additionResult += multiply;
            }
        }
        return additionResult;
    }
}
