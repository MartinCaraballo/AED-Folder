/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciospd6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Martin
 */
public class LectorArchivos {
    
    public static void leerEntradaArchivo(String rutaArchivo) throws FileNotFoundException, IOException {
        try {
            File entrada = new File(rutaArchivo);
            BufferedReader reader = new BufferedReader(new FileReader(entrada));
            StringBuilder response = new StringBuilder();

            int entero = Integer.parseInt(reader.readLine());
            float flotante = Float.parseFloat(reader.readLine());
            String nombre = reader.readLine();

            response.append("El entero léido es: " + entero + "\n")
                        .append("El número de punto flotante es: " + flotante + "\n")
                            .append("La cadena leída es \"" + nombre + "\"\n")
                                .append("¡Hola " + nombre + "! La suma de " + entero + " y " + flotante + " es " + (entero + flotante) + ".\n")
                                    .append("La división entera de " + flotante + " y " + entero + " es " + ((int)(flotante / entero)) + " y su resto es " + (flotante % entero)+ ".\n");
            System.out.println(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
