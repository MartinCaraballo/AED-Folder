/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciospd9;

/**
 *
 * @author Martin
 */
public class ContadorNumeros {

    public static boolean isPrime(long n) {
        boolean prime = true;
        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        if ((n % 2 != 0 && prime && n > 2) || n == 2) {
            return true;
        } else {
            return false;
        }
    }
    
    public long ContadorNumeros(long n) {
        boolean esPrimo = isPrime(n);
        int contador = 0;
        long suma = 0;
        
        if (esPrimo) {
            while (contador <= n) {
                if (contador % 2 == 0) {
                    suma += contador;
                    contador++;
                } else {
                    contador++;
                }
            }
        } else {
            while (contador <= n) {
                if (contador % 2 != 0) {
                    suma += contador;
                    contador++;
                } else {
                    contador++;
                }
            }
        }
        
        return suma;
    }

}
