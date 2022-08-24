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
        System.out.println("FibonacciTopDown: " + fibonacciInstance.fibonacciTopDown(15));
        System.out.println("FibonacciBottomUp: " + fibonacciInstance.fibonacciBottomUp(15));
    }
}
