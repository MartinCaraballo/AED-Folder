/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fibonaccibinario;

import java.util.Arrays;

/**
 *
 * @author Martin
 */
public class Program {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        FibonacciLineal instance = new FibonacciLineal();
        System.out.println(Arrays.toString(instance.fibonacciLineal(38)));
        System.out.println(FibonacciBinario.fibonacciBinario(100));
    }
}
