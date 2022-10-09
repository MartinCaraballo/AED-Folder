/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ut6_pd1;

import com.mycompany.ut6_pd1.Medicion.*;

/**
 *
 * @author Martin
 */
public class Main {
    
    private static final int REPETICIONES = 100;

    public static void main(String[] args) {
        TArbolTrieHashMap trieHashMapPrueba = new TArbolTrieHashMap();
        TArbolTrieHashMap trieHashMap = new TArbolTrieHashMap();
        TArbolTrie trie = new TArbolTrie();

        String[] palabrasclave = ManejadorArchivosGenerico.leerArchivo("./src/palabras1.txt");
        for (String p : palabrasclave) {
                trieHashMapPrueba.insertar(p);
        }
        trieHashMapPrueba.imprimir();
        
        String[] libro = ManejadorArchivosGenerico.leerArchivo("./src/libro.txt");
        for (String linea : libro) {
            String[] palabras = linea.split(" ");
            for (String palabra : palabras) {
                palabra = ManejadorArchivosGenerico.filtrarPalabra(palabra);
                trie.insertar(palabra);
                trieHashMap.insertar(palabra);
            }
        }
        
        Medible[] mediblesPredecir = new Medible[2];
        String[] lineas = new String[3];
        int k = 0;
        mediblesPredecir[k++] = new MedicionPredecirTrie(trie);
        mediblesPredecir[k++] = new MedicionPredecirTrieHashMap(trieHashMap);
        Medicion miPredecir;
        k = 0;
        String[] aBuscar = {"h"};
        Object[] paramsPredecir = {REPETICIONES, aBuscar};
        lineas[k++] = "algoritmo,tiempo,memoria";
        for (Medible m : mediblesPredecir) {
            miPredecir = m.medir(paramsPredecir);
            miPredecir.print();
            lineas[k++] = "\n" + miPredecir.getTexto() + "," + miPredecir.getTiempoEjecucion().toString() + "," + miPredecir.getMemoria().toString();
        }

        ManejadorArchivosGenerico.escribirArchivo("./src/salidaPredecir.csv", lineas);
    }
}
