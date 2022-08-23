/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut2_pd2;

/**
 *
 * @author Martin
 */
public class Factorial {
    
    public int factorial(int numero) {
        if (numero == 1 || numero == 0) {
            return 1;
        } else {
            return (numero * factorial(numero - 1));
        }
    }
}
