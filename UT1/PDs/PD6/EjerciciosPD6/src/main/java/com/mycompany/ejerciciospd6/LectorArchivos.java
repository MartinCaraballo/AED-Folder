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
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class LectorArchivos {

    public static void leerEntradaArchivo(String rutaArchivo) {
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
                    .append("La división entera de " + flotante + " y " + entero + " es " + ((int) (flotante / entero)) + " y su resto es " + (flotante % entero) + ".\n");
            System.out.println(response.toString());
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + rutaArchivo);
        }
    }

    public static double[] leerEntradaStdin() throws IllegalArgumentException {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa el radio de la circunferencia: ");
            double userInputRadioValue = scanner.nextDouble();
            
            if (userInputRadioValue == 0) {
                throw new IllegalArgumentException();
            }
            double[] resultados = new double[3];
            
            double circArea = Math.PI * Math.pow(userInputRadioValue, 2);
            double circPerimeter = 2 * Math.PI * userInputRadioValue;
            resultados[0] = userInputRadioValue;
            resultados[1] = circArea;
            resultados[2] = circPerimeter;
            
            return resultados;

        } catch (IllegalArgumentException e) {
            System.out.println("No se ingresaron parámetros.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
