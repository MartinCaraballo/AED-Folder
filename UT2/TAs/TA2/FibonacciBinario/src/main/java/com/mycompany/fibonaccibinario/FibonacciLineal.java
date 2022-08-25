/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fibonaccibinario;

/**
 *
 * @author Martin
 */
public class FibonacciLineal {
    int contador = 0;
    
    public int[] fibonacciLineal(int numero) {
        contador++;
        int[] resultado = { 1, 0 };
        if (numero == 1) {
            return resultado;
            
        } else {
            resultado = fibonacciLineal(numero - 1);
            int sumaIJ = resultado[0];
            resultado[0] = resultado[0] + resultado[1];
            resultado[1] = sumaIJ;
            System.out.println(contador);
            return resultado;
        }
    }
}
