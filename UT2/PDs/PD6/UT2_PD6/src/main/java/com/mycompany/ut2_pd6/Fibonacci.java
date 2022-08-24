/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut2_pd6;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Martin
 */
public class Fibonacci {

    public long fibonacciTopDown(long numero) {
        Map<Long, Long> memo = new HashMap<>();

        if (!memo.containsKey(numero)) {
            if (numero <= 2) {
                memo.put(numero, 1L);
            } else {
                memo.put(numero,
                        fibonacciTopDown(numero - 1)
                        + fibonacciTopDown(numero - 2));
            }
        }
        return memo.get(numero);
    }
    
    public long fibonacciBottomUp(long numero) {
        long fibAnterior;
        long fibActual;
        
        if (numero == 0) {
            return 0;
        } else {
            fibAnterior = 0;
            fibActual = 1;
            do {
                long fibNuevo = fibActual + fibAnterior;
                fibAnterior = fibActual;
                fibActual = fibNuevo;
                numero--;
                
            } while (numero > 1);
            
        }
        return fibActual;
    }
}
