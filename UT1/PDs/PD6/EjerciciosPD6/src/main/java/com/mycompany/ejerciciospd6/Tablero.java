/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciospd6;

/**
 *
 * @author Martin
 */
public class Tablero {
    
    public static void imprimirTablero(int largo, int ancho) {
        try {
            if (largo <= 0 || ancho <= 0)
                throw new Exception();
            
            StringBuilder tablero = new StringBuilder("Tablero de " + largo + " X " + ancho + " :\n");
            for (int countLargo = 0; countLargo < largo; countLargo++) {
                for (int countAncho = 0; countAncho < ancho; countAncho++) {
                    tablero.append("#");
                }
                tablero.append("\n");
            }
            System.out.println(tablero.toString());
        } catch (Exception e) {
            System.out.println("Tablero inválido.");
        }
    }
}
