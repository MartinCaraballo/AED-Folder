/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ut2_pd6;

/**
 *
 * @author Martin
 */
public class Program {

    public static void main(String[] args) {
        Fibonacci fibonacciInstance = new Fibonacci();
        
        // FibonacciTopDown
        System.out.println("FibonacciTopDown:\nResultado de fibonacci de 15: " + fibonacciInstance.fibonacciTopDown(15));
        System.out.println("Veces que se invoco la función: " + fibonacciInstance.contadorLlamadasFibTopDown
                + "\nVeces que se accedió a memoria: " + fibonacciInstance.contadorAccesosAMemoria
                + "\nVeces que se utilizan valores previamente almacenados: " + fibonacciInstance.getCountAccesoValoresPrevAlmacenados());
        
        // FibonacciBottomUp
        System.out.println("\nFibonacciBottomUp\nResultado de fibonacci de 15: " + fibonacciInstance.fibonacciBottomUp(15));
    }
}
