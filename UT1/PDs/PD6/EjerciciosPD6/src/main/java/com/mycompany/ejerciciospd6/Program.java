/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerciciospd6;

import java.io.IOException;

/**
 *
 * @author Martin
 */
public class Program {

    public static void main(String[] args) throws IOException {
        // EJERCICIO 1:
        Tablero.imprimirTablero(1, 9);
        
        // EJERCICIO 2 - A:
       // LectorArchivos.leerEntradaArchivo("E:\\Juegos y TODO\\Archivos\\Usuarios\\Martin\\GITHUB\\AED-Folder\\UT1\\PDs\\PD6\\EjerciciosPD6\\src\\main\\java\\com\\mycompany\\ejerciciospd6\\entrada.txt");
                
        // EJERCICIO 2 - B:
        double[] resultadosAreaPerimetro = LectorArchivos.leerEntradaStdin();
        System.out.println("La circunferencia con radio " + resultadosAreaPerimetro[0] + " tiene:\nUn área de: " + resultadosAreaPerimetro[1] + "\nY un perímetro de: " + resultadosAreaPerimetro[2]);
        
        
        // EJERCICIO 3:
        //ManejoStrings.transformarTextoT9("C:\\Users\\marti\\OneDrive - Universidad Católica del Uruguay\\Escritorio\\Algoritmos y Estructuras de Datos\\UT1\\PDs\\PD6\\EjerciciosPD6\\src\\entrada.txt");
        //ManejoStrings.transformarT9Texto("C:\\Users\\marti\\OneDrive - Universidad Católica del Uruguay\\Escritorio\\Algoritmos y Estructuras de Datos\\UT1\\PDs\\PD6\\EjerciciosPD6\\src\\parte b\\entrada.txt");
        
        // EJERCICIO 4:
        int[] arr1 = {2, 3, 5, 6, 3, 2};
        int[] arr2 = {9, 4, 9, 1, 4, 3};
        System.out.println("\nLa multipliación de los arrays dio como resultado: " + ArraysMutiplication.arrayMultiplication(arr1, arr2));
        
    }
}
