/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut2_pd5.Ejercicio1;

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
}
