/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut2_pd1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;

/**
 *
 * @author Martin
 */
public class Utils {

    public int[] miFuncion(String rutaArchivo) {
        try {
            int valorI;
            int valorJ;
            int contador = 0;

            File entrada = new File(rutaArchivo);
            BufferedReader reader = new BufferedReader(new FileReader(entrada));

            int numeroLineas = Integer.parseInt(reader.readLine());
            int[] arrResultados = new int[numeroLineas];

            for (int c = 0; c < numeroLineas; c++) {
                arrResultados[c] = Integer.parseInt(reader.readLine());
            }

            for (int i = 0, j = numeroLineas - 1; i <= numeroLineas; i++, j--) {
                if (i < j) {
                    contador++;
                    valorI = arrResultados[i];
                    valorJ = arrResultados[j];

                    Array.setInt(arrResultados, i, valorJ);
                    Array.setInt(arrResultados, j, valorI);
                }
            }

            System.out.println("Número de veces que se ejecuta el condicional if: " + contador);
            System.out.println("Largo del array: " + numeroLineas);
            System.out.println("Primera posición del array: " + arrResultados[0]);
            System.out.println("Última posición del array: " + arrResultados[numeroLineas - 1]);

            return arrResultados;

        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + rutaArchivo);
        }
        return null;
    }
}

