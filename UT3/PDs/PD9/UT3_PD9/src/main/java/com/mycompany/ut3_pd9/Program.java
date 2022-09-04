/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ut3_pd9;

import java.util.List;

/**
 *
 * @author Martin
 */
public class Program {

    public static void main(String[] args) {
        Expresion instance = new Expresion();
        
        String correcto = "{}{{}}";
        String incorrecto = "{{}{{}";
        String correcto2 = "{}{{{}}}{{}}";
        String incorrecto2 = "{{{{}}}}{{{{}}";
        
        char[] prueba1 = correcto.toCharArray();
        char[] prueba2 = incorrecto.toCharArray();
        char[] prueba3 = correcto2.toCharArray();
        char[] prueba4 = incorrecto2.toCharArray();
        
        System.out.println(instance.controlCorchetes(prueba1));
        System.out.println(instance.controlCorchetes(prueba2));
        System.out.println(instance.controlCorchetes(prueba3));
        System.out.println(instance.controlCorchetes(prueba4));
    }
}
