/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerciciospd9;

import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Factorial instance = new Factorial();
        System.out.println("Ingrese un número para calcular su factorial:");
        int userInput = scanner.nextInt();
        System.out.println("El factorial de " + userInput + " es: " + instance.factorial(userInput));
        
        ContadorNumeros contador = new ContadorNumeros();
        if (ContadorNumeros.isPrime(userInput)) {
            System.out.println("Suma de todos los pares desde 0 hasta " + userInput + ": " + contador.ContadorNumeros(userInput));
        } else {
            System.out.println("Suma de todos los impares desde 0 hasta " + userInput + ": " + contador.ContadorNumeros(userInput));
        }
        
        
    }
}
