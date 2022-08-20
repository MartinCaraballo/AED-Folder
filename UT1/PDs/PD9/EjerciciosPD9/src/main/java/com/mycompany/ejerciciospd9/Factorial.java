/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciospd9;

import java.math.BigInteger;

/**
 *
 * @author Martin
 */
public class Factorial {

    // Utilizar la clase BigInteger es necesario para los numeros que superan los rangos de int, long, double, etc.
    // BigInteger trabaja con Strings, por lo tanto se inicializa con "1" y en cada iteración del for se crea
    // una nueva instancia de BigInteger pasandole i como String.
    // Documentación: https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/math/BigInteger.html
    public BigInteger factorial(int numero) {
        try {
            if (numero < 0) {
                throw new IllegalArgumentException();
            }
            BigInteger resultado = new BigInteger("1");
            for (int i = 1; i <= numero; i++) {
                resultado = resultado.multiply(new BigInteger(Integer.toString(i)));
            }
            
            return resultado;
        } catch (IllegalArgumentException e) {
            System.out.println("El valor ingresado es incorrecto.");
        }
        
        return null;
    }

}
