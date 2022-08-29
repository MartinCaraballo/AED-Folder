/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut2_pd4;

/**
 *
 * @author Martin
 */
public class Utils {
    
    // Programa sencillo para generar un array ordenado de enteros, desde 1 hasta el numero ingresado.
    public int[] generateOrdenedIntArray(int size) {
        int[] resultadoArr = new int[size];

        for (int i = 0; i < size; i++) {
            resultadoArr[i] = i + 1;
        }
        return resultadoArr;
    }
}
