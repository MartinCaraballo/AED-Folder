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

    public static void leerEntradaStdin() throws FileNotFoundException, IOException {
        try {
            String path = "C:\\Users\\marti\\OneDrive - Universidad Católica del Uruguay\\Escritorio\\Algoritmos y Estructuras de Datos\\UT1\\PDs\\PD6\\EjerciciosPD6\\src\\main\\java\\com\\mycompany\\ejerciciospd6\\stdin.txt";

            File file = new File(path);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder response = new StringBuilder();
            String fileReaded = reader.readLine();

            int radioValue = Integer.valueOf(fileReaded.split("=")[1].trim());
            double circArea = Math.PI * Math.pow(radioValue, 2);
            double circPerimeter = 2 * Math.PI * radioValue;

            response.append("El área de la circunferencia de " + radioValue + " cm de radio es: " + circArea
                    + "\nY su perímetro es de " + circPerimeter + ".");
            System.out.println(response.toString());
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }

    }
}
