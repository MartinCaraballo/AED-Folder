/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut2_pd5;

import java.util.Random;

/**
 *
 * @author Martin
 */
public class Utils {

    // Programa sencillo para generar un array de booleanos "rellenado aleatoriamente"
    // para realizar distintas pruebas en las diferentes versiones.
    public boolean[] generateExtraLargeBooleanArray(int size) {
        Random random = new Random();
        boolean[] resultadoArr = new boolean[size];

        for (int i = 0; i < size; i++) {
            resultadoArr[i] = random.nextBoolean();
        }
        return resultadoArr;
    }

    // Programa sencillo para generar un array ordenado de enteros, desde 1 hasta el numero ingresado.
    public Integer[] generateOrdenedIntArray(int size) {
        Integer[] resultadoArr = new Integer[size];

        for (int i = 0; i < size; i++) {
            resultadoArr[i] = i + 1;
        }
        return resultadoArr;
    }
}
