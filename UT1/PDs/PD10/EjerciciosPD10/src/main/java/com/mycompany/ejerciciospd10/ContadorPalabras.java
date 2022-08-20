/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciospd10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author Martin
 */
public class ContadorPalabras {

    // Método extraido del TA3.
    public static int ContadorPalabras(String texto) {
        int cont = 0;
        boolean isPalabra = false;
        texto = texto.trim();
        for (int i = 1; i < texto.length(); i++) {
            char character = texto.charAt(i);
            if (Character.isLetter(character)) {
                isPalabra = true;
                if (character == ' ' | isPalabra) {
                    cont++;
                    isPalabra = false;
                }
            }
        }
        return cont;
    }

    public String[] palabrasComunes(String[] palabras1, String[] palabras2) {
        String[] arResultado;
        String[] arMasChico;
        String[] arMasLargo;

        // fijamos el array de resultados, con el largo del mas chico de los pasados como parametro.
        // guardamos una referencia del array con menos elementos en 'arMasChico' y lo mismo para el mas largo.
        if (palabras1.length <= palabras2.length) {
            arResultado = new String[palabras1.length];
            arMasChico = palabras1;
            arMasLargo = palabras2;
        } else {
            arResultado = new String[palabras2.length];
            arMasChico = palabras2;
            arMasLargo = palabras1;
        }

        // Recorremos el array mas chico primero.
        for (int indiceArChico = 0; indiceArChico < arMasChico.length; indiceArChico++) {
            String palabraLeida = arMasChico[indiceArChico];

            // Recorremos el array mas largo para buscar si aparece la palabra leida
            for (int indiceArLargo = 0; indiceArLargo < arMasLargo.length; indiceArLargo++) {
                // Si la palabra aparece
                if (arMasLargo[indiceArLargo].equals(palabraLeida)) {
                    // La añadimos al array de resultados
                    arResultado[indiceArChico] = palabraLeida;
                }
            }
        }

        return arResultado;
    }

    public String[] palabrasComunes(String rutaArchivo) {
        try {
            File archivo = new File(rutaArchivo);
            BufferedReader reader = new BufferedReader(new FileReader(archivo));

            int lineasTotales = getLineasArchivo(rutaArchivo);
            Random random = new Random();
            int indicePrimerLineaALeer = random.nextInt(0, lineasTotales);
            int indiceSegundaLineaALeer = random.nextInt(0, lineasTotales);
            //System.out.println("PRIMER LINEA: " + indicePrimerLineaALeer);
            //System.out.println("SEGUNDA LINEA: " + indiceSegundaLineaALeer);

            String[] arr1 = new String[1];
            String[] arr2 = new String[1];

            for (int i = 1; i <= lineasTotales; i++) {
                String lineaLeida = reader.readLine().toLowerCase();
                if (i == indicePrimerLineaALeer) {
                    arr1 = lineaLeida.split(" ");
                } else if (i == indiceSegundaLineaALeer) {
                    arr2 = lineaLeida.split(" ");
                }
            }
            
            return palabrasComunes(arr1, arr2);

        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + rutaArchivo);

        }
        return null;
    }

    public int getLineasArchivo(String rutaArchivo) {
        try {
            File archivo = new File(rutaArchivo);
            BufferedReader reader = new BufferedReader(new FileReader(archivo));

            String linea = reader.readLine();
            int contadorLineas = 0;
            while (linea != null) {
                contadorLineas++;
                linea = reader.readLine();
            }
            return contadorLineas;

        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + rutaArchivo);
        }
        return 0;
    }

}
