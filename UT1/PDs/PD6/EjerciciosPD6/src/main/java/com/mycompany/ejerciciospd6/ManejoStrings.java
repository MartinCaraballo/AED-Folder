/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciospd6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Martin
 */
public class ManejoStrings {
    
    
    
    enum digito {
        A("abcABC", "2"),
        D("defDEF", "3"),
        G("ghiGHI", "4"),
        J("jklJKL", "5"),
        M("mnñoMNÑO", "6"),
        P("pqrsPQRS", "7"),
        T("tuvTUV", "8"),
        W("wxyzWXYZ", "9"),
        ESP(" ", "0"),
        PUN("." , "1");
    
        
        public String letras;
        public String digitos;
        
        digito(String letra, String digito) {
            this.letras = letra;
            this.digitos = digito;
        }
    }
    
    public static void transformarTextoT9(String rutaArchivo) {
        try {
            File archivoEntrada = new File(rutaArchivo);
            String pathArchivoSalida = "";
            BufferedReader reader = new BufferedReader(new FileReader(archivoEntrada));
            BufferedWriter writer = new BufferedWriter(new FileWriter("src\\salida.txt", true));

            String linea = reader.readLine();
            while (linea != null) {
                // Recorremos la linea leida
                for (int i = 0; i < linea.length(); i++) {
                    // Obtenemos un caracter de la linea
                    char character = linea.charAt(i);
                    // Recorremos la enumeracion de los digitos
                    for (digito d : digito.values()) {
                        if (d.letras.contains(Character.toString(character))) {
                            int posicion = d.letras.indexOf(character);
                            // segun la posicion de la letra en la tecla, depende de cuantas veces debemos 
                            // apretar la tecla, por ejemplo para llegar a la 'A' debemos apretar 4 veces la tecla 2.
                            // Agrego un espacio al final para separar las letras unas de otras.
                            writer.write(d.digitos.repeat(posicion + 1) + " ");
                        }
                    }
                }
                linea = reader.readLine();
            }
            writer.newLine();
            reader.close();
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + rutaArchivo);
        }
        
    }
    
    public static void transformarT9Texto(String rutaArchivo) throws FileNotFoundException, IOException {
        try {
            File archivoEntrada = new File(rutaArchivo);
            BufferedReader reader = new BufferedReader(new FileReader(archivoEntrada));
            BufferedWriter writer = new BufferedWriter(new FileWriter("src\\parte b\\salida.txt", true));

            String linea = reader.readLine();
            while (linea != null) {
                // Al generar la salida en la parte anterior, deje un espacio entre los digitos para poder
                // obtener la letra de una manera facil. Para obtener la letra simplemente invocamos
                // el metodo .split(" ").
                String[] letras = linea.split(" ");
                // Recorremos el array de letras de manera invertida
                for (int i = letras.length - 1; i >= 0; i--) {
                    // Obtenemos el digito que se 'presionó'
                    String letra = letras[i];
                    // Guardamos la posicion de la letra en la enumeracion
                    int posicionLetra = letra.length() - 1;
                    // Recorremos la enumeracion
                    for (digito d : digito.values()) {
                        if (d.digitos.contains(String.valueOf(letra.charAt(0)))) {
                            // Finalemente escribimos en el archivo la letra
                            writer.write(d.letras.charAt(posicionLetra));
                        }
                    }
                }
                linea = reader.readLine();
            }
            writer.newLine();
            reader.close();
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + rutaArchivo);
        }
    }
}
