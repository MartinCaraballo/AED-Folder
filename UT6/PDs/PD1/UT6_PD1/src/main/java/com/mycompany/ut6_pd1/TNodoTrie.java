package com.mycompany.ut6_pd1;


import java.util.HashMap;
import java.util.LinkedList;

public class TNodoTrie implements INodoTrie {

    private static final int CANT_CHR_ABECEDARIO = 26;
    private HashMap<Comparable, TNodoTrie> hijos;
    private boolean esPalabra;

    public TNodoTrie() {
        hijos = new HashMap<>();
        esPalabra = false;
    }

    @Override
    public void insertar(String unaPalabra) {
        TNodoTrie nodo = this;
        for (int c = 0; c < unaPalabra.length(); c++) {
            int indice = unaPalabra.charAt(c) - 'a';
            if (nodo.hijos.get(indice) == null) {
                nodo.hijos.put(indice, new TNodoTrie());
            }
            nodo = nodo.hijos.get(indice);
        }
        nodo.esPalabra = true;
    }

    private void imprimir(String s, TNodoTrie nodo) {
        if (nodo != null) {
            if (nodo.esPalabra) {
                System.out.println(s);

            }
            for (int c = 0; c < CANT_CHR_ABECEDARIO; c++) {
                if (nodo.hijos.get(c) != null) {
                    imprimir(s + (char) (c + 'a'), nodo.hijos.get(c));
                }
            }
        }
    }

    @Override
    public void imprimir() {

        imprimir("", this);
    }

    private TNodoTrie buscarNodoTrie(String s) {
        TNodoTrie nodo = this;
        for (int c = 0; c < s.length(); c++) {
            int indice = s.charAt(c) - 'a';
            if (nodo.hijos.get(indice) == null) {
                return null;
            }
            nodo = nodo.hijos.get(indice);
        }
        return nodo;
    }

    private void predecir(String s, LinkedList<String> palabras, TNodoTrie nodo) {
        // implementar
        if (nodo != null) {
            if (nodo.esPalabra) {
                palabras.add(s);
            }
            for (int c = 0; c < CANT_CHR_ABECEDARIO; c++) {
                if (nodo.hijos.get(c) != null) {
                    nodo.hijos.get(c).predecir(s + (char) (c + 'a'), palabras, nodo.hijos.get(c));
                }
            }
        }
        
    }

    @Override
    public void predecir(String prefijo, LinkedList<String> palabras) {
        TNodoTrie ultimoPrefijo = buscarNodoTrie(prefijo);
        if (ultimoPrefijo != null) {
            ultimoPrefijo.predecir(prefijo, palabras, ultimoPrefijo);
        }
    }

    @Override
    public int buscar(String s) {
        TNodoTrie nodo = this;
        int comparaciones = 0;
        for (int c = 0; c < s.length(); c++) {
            int indice = s.charAt(c) - 'a';
            if (nodo.hijos.get(indice) == null) {
                return 0;
            } else {
                nodo = nodo.hijos.get(indice);
                comparaciones += 1;
            }
        }
        return comparaciones;
    }

}
