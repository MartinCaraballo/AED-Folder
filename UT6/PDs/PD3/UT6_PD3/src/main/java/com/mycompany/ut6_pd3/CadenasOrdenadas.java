/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut6_pd3;

import java.util.TreeMap;

/**
 *
 * @author Martin
 */
public class CadenasOrdenadas {

    public void cadenasOrdenadas(String[] cadenas) {
        // Necesitamos tener en orden las palabras por su longitud, por eso elegí un treemap.
        // Pero, cuando dos palabras tienen el mismo largo, deben de quedar a la misma "altura",
        // por eso usé otro treemap para mantener ordenadas las claves tambien dentro.
        TreeMap<Integer, TreeMap<String, String>> tree = new TreeMap();

        for (String cadena : cadenas) {
            if (tree.containsKey(cadena.length())) {
                tree.get(cadena.length()).put(cadena, cadena);
            } else {
                TreeMap palabras = new TreeMap();
                palabras.put(cadena, cadena);
                tree.put(cadena.length(), palabras);
            }
        }

        tree.forEach((K, v) -> System.out.println(v.values()));
    }

}
