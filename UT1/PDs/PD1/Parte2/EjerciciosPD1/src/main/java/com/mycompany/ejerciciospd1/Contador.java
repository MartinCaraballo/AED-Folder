/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciospd1;

/**
 *
 * @author Martin
 */
public class Contador {
    
    private final int MAX_CONT = 50;
    private int incremento = 1;
    private int contador = 1;
    
    public void mostrarContador() {
        
        /*while (contador <= MAX_CONT) {
            System.out.println(contador);
            contador += incremento;
        }*/
        /*do {
            System.out.println(contador);
            contador += incremento;
        } while (contador <= MAX_CONT);*/
        for (int i = 1; i <= MAX_CONT; i += incremento) {
            System.out.println(contador);
            contador += incremento;
        }
    }
}
