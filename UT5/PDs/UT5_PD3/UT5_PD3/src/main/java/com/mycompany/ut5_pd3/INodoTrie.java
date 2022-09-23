package com.mycompany.ut5_pd3;


import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ernesto
 */
public interface INodoTrie {

    String buscar(String s); // devuelve la cantidad de comparaciones!
    void imprimir();

    void insertar(String unaPalabra);
    void insertar(String unaPalabra, int pagina);
    void indizarLibro(String rutaAlLibro);
    String imprimirIndice();
    public void predecir(String prefijo, LinkedList<String> palabras);
    
    
}
