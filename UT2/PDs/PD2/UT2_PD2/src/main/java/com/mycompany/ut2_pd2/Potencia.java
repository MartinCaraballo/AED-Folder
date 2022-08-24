/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut2_pd2;

/**
 *
 * @author Martin
 */
public class Potencia {
    
    public double potencia(double numero, double exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return numero * potencia(numero, exponente - 1);
        }
    }
}
