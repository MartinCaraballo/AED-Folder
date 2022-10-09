/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut6_pd3;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Martin
 */
public class IntercambiarClaveValorMap {

    public Map<String, String> intercambiarClaveValor(Map<String, String> unMap) {
        Map<String, String> aux = new HashMap<>();
        unMap.forEach((K, v) -> {
            try {
                if (aux.containsKey(K)) {
                    throw new Exception();
                }
                aux.put(v, K);
            } catch (Exception e) {
                System.out.println("El mapa pasado como parámetro contiene elementos repetidos.");
            }
        });
        return aux;
    }
}
