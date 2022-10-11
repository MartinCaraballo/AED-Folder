package com.mycompany.tdas;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juan-
 */
public interface INodoTrieHashMap {

    int buscar(String s); // devuelve la cantidad de comparaciones!
    void imprimir();

    void insertar(String unaPalabra);
    public void predecir(String prefijo, LinkedList<String> palabras);
    
    
}
