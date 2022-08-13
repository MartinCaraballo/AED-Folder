/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerciciospd1;

/**
 *
 * @author Martin
 */
public class Program {

    public static void main(String[] args) {
        // EJERCICIO 3
        System.out.println("Ejercicio 3:");
        double double1 = 1.0;
        double double2 = 2.0;
        double double3 = 3.0;
        
        System.out.println(Multsuma.multsuma(double1, double2, double3));
        
        // EJERCICIO 4
        System.out.println("\nEjercicio 4:");
        Alumno alumno = new Alumno("José");
        
        System.out.println(alumno.getNombreAdmiracion());
        System.out.println("El resultado de recorrer la cadena " + alumno.getNombreAdmiracion() + ": " + Utils.recorrer(alumno.getNombreAdmiracion()));
        System.out.println("Función 'getValor()': " + Utils.getValor());
        System.out.println("Función 'getPrimerCaracter()': " + Utils.getPrimerCaracter(alumno.getNombreAdmiracion()));
        System.out.println("Función 'paraAString()': " + Utils.paraAString(13));
        
        // EJERCICIO 5
        System.out.println("\nEjercicio 5:");
        Contador contador = new Contador();
        contador.mostrarContador();
    }
}
