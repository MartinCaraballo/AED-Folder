/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerciciospd10;

/**
 *
 * @author Martin
 */
public class Program {

    public static void main(String[] args) {
        
        ContadorPalabras instance = new ContadorPalabras();/*
        String[] ar1 = {"Hola", "mundo", "de", "los", "algoritmos"};
        String[] ar2 = {"Hola", "mundo", "de", "la", "informática"};
        String[] arResultado = instance.palabrasComunes(ar1, ar2);
        for (int i = 0; i < arResultado.length; i++) {
            String palabra = arResultado[i];
            if (palabra != null)
                System.out.println(palabra);
        }
        //instance.getLineasArchivo("src\\archivo1.txt"); // salida: 48
        */
        
        String[] arResultadoArchivo1 = instance.palabrasComunes("src\\archivo1.txt");
        String[] arResultadoArchivo2 = instance.palabrasComunes("src\\archivo2.txt");
        
        System.out.println("Primer Archivo:");
        for (int j = 0; j < arResultadoArchivo1.length; j++) {
            String palabra = arResultadoArchivo1[j];
            if (palabra != null) {
                System.out.println(palabra);
            }
        }
        
        System.out.println("Segundo Archivo:");
        for (int k = 0; k < arResultadoArchivo2.length; k++) {
            String palabra = arResultadoArchivo2[k];
            if (palabra != null) {
                System.out.println(palabra);
            }
        }
    }
}
