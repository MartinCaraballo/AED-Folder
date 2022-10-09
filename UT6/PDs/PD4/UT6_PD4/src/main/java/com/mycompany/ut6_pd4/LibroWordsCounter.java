/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut6_pd4;

import java.util.*;

/**
 *
 * @author Martin
 */
public class LibroWordsCounter {
    
    Map<String, Integer> map;
    
    public LibroWordsCounter() {
        map = new HashMap<>();
    }
    
    public void cargarLibro(String rutaAlArchivo) {
        String[] libro = ManejadorArchivosGenerico.leerArchivo(rutaAlArchivo);
        for (String lineas : libro) {
            if (lineas.isBlank() || lineas.isEmpty()) { continue; }
            String[] palabras = lineas.split("\\s+");
            for (String palabra : palabras) {
                palabra = ManejadorArchivosGenerico.filtrarPalabra(palabra);
                if (map.containsKey(palabra)) {
                    map.put(palabra, map.get(palabra) + 1);
                } else {
                    map.put(palabra, 1);
                }
            }
        }
    }
    
    public void imprimirEnOrden() {
        TreeMap tree = new TreeMap();
        tree.putAll(map);
        tree.forEach((K, v) -> {
            System.out.println("Palabra: " + K + " | Repeticiones: " + v); 
        });
    }
    
    public ArrayList<String> getMayoresValoresRepeticiones(int cantidadDeValores) {
        ArrayList<String> valoresMaximos = new ArrayList<>(cantidadDeValores);
        Map<String, Integer> aux = new HashMap<>(map.size());
        aux.putAll(map);
        for (int i = 0; i < cantidadDeValores; i++) {
            int maximo = 0;
            String maximoKey = "";
            for (Map.Entry<String, Integer> entry : aux.entrySet()) {
                if (entry.getValue() > maximo) {
                    maximo = entry.getValue();
                    maximoKey = entry.getKey();
                }
            }
            valoresMaximos.add(maximoKey + ", " + maximo);
            aux.remove(maximoKey);
        }
        return valoresMaximos;
    }
    
}
