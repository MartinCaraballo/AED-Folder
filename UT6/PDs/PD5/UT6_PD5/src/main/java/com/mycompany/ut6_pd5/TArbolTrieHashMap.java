/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut6_pd5;

import java.util.LinkedList;

/**
 *
 * @author Martin
 */
public class TArbolTrieHashMap implements IArbolTrieHashMap {

    private TNodoTrieHashMap raiz;

    public void insertar(String palabra) {
        if (raiz == null) {
            raiz = new TNodoTrieHashMap();
        }
        raiz.insertar(palabra);
    }

    public void imprimir() {
        if (raiz != null) {
            raiz.imprimir();
        }
    }

    public int buscar(String palabra) {
        if (raiz== null){
              raiz = new TNodoTrieHashMap();
        }
        return raiz.buscar(palabra);
    }

    public LinkedList<String> predecir(String prefijo) {
        if (raiz == null) {
            return null;
        } else {
            LinkedList<String> resultado = new LinkedList<>();
            raiz.predecir(prefijo, resultado);
            return resultado;
        }
    }
}
