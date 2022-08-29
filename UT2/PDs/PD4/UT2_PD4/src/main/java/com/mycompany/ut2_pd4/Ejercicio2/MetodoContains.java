/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut2_pd4.Ejercicio2;

/**
 *
 * @author Martin
 */
public class MetodoContains {
    
    public static boolean metodoContains(int[][] m, int val) {
        int N = m.length;
        
        for (int r = 0; r < N; r++ ) {
            for (int c = 0; c < N; c++) {
                if (m[r][c] == val)
                    return true;
            }
        }
        return false;
    }
}
