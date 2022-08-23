/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TA3;

/**
 *
 * @author Martin
 */
public class Program {
    
    public static void main(String[] args) {
        Ejer1 instance = new Ejer1();
        System.out.println(instance.ContadorPalabras("Hola como estas 4444 "));
        int[] resultadoVocalesConsonantes = instance.ContadorVocalesConsonantes("Hola como estas 646kj54");
        System.out.println("Cantidad de vocales: " + resultadoVocalesConsonantes[0]);
        System.out.println("Cantidad de consonantes: " + resultadoVocalesConsonantes[1]);
    }
}
