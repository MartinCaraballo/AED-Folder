/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut6_pd3;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author Martin
 */
public class ImprimirAleatorio {
    
    public void imprimirAleatorio(String rutaAlArchivo, int numeroDeLineasAImprimir) {
        String[] archivo = ManejadorArchivosGenerico.leerArchivo(rutaAlArchivo);
        Map<Integer, String> map = new HashMap<>(archivo.length);
        
        int contador = 0;
        for (String linea : archivo) {
            map.put(contador++, linea);
        }
        
        Random random = new Random();
        
        for (int i = 0; i < numeroDeLineasAImprimir; i++) {
            int linea = random.nextInt(0, archivo.length - 1);
            System.out.println(map.get(linea));
        }
    }
    
}
