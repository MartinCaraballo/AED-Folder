/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pd1.ejercicio4;

/**
 *
 * @author Martin
 */
public class Program {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
        Alumno alumno = new Alumno("José");
        Alumno alumno2 = new Alumno("Pedro");
        
        System.out.println(alumno.getNombreAdmiracion());
        System.out.println(alumno2.getNombreAdmiracion());
    }
}
