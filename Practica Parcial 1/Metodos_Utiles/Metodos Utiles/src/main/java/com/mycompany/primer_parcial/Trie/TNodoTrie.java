package com.mycompany.primer_parcial.Trie;

import java.util.LinkedList;

public class TNodoTrie {

    private static final int CANTIDAD_LETRAS_ALFABETO = 26;
    private final TNodoTrie[] hijos;
    private boolean esPalabra;

    public TNodoTrie() {
        hijos = new TNodoTrie[CANTIDAD_LETRAS_ALFABETO];
        esPalabra = false;
    }

    /**
     *
     * @param palabra
     */
    public void insertar(String palabra) {
        TNodoTrie nodo = this;
        for (int i = 0; i < palabra.length(); i++) {
            int indice = palabra.charAt(i) - 'a';
            if (nodo.hijos[indice] == null) {
                nodo.hijos[indice] = new TNodoTrie();
            }
            nodo = nodo.hijos[indice];
        }
        nodo.esPalabra = true;
    }

    /**
     *
     * @param palabra
     * @return
     */
    public int buscarConContador(String palabra) {
        int contador = 0;
        TNodoTrie nodo = this;
        for (int i = 0; i < palabra.length(); i++) {
            contador++;
            int indice = palabra.charAt(i);
            if (nodo.hijos[indice] != null && nodo.hijos[indice].esPalabra) {
                return contador;
            }
            nodo = nodo.hijos[indice];
        }
        return contador;
    }

    /**
     *
     * @param palabra
     * @return
     */
    public TNodoTrie buscarNodoTrie(String palabra) {
        TNodoTrie aux = this;
        for (int i = 0; i < palabra.length(); i++) {
            int stringIndex = palabra.charAt(i) - 'a';
            if (aux.hijos[stringIndex] == null) {
                return null;
            }
            aux = aux.hijos[stringIndex];
        }
        return aux;
    }

    /**
     *
     * @param prefijo
     * @param lista
     */
    public void predecir(String prefijo, LinkedList<String> lista) {
        TNodoTrie aux = buscarNodoTrie(prefijo);
        buscarEnPrefijos(aux, lista, "");
    }

    private void buscarEnPrefijos(TNodoTrie nodo, LinkedList<String> lista, String palabra) {
        if (nodo != null) {
            if (nodo.esPalabra) {
                lista.add(palabra);
            }
            for (int i = 0; i < CANTIDAD_LETRAS_ALFABETO; i++) {
                if (nodo.hijos[i] != null) {
                    buscarEnPrefijos(nodo.hijos[i], lista, palabra + (char)(i + 'a'));
                }
            }
        }
    }

    /**
     *
     * @param unaPalabra
     * @return
     */
    public static String filtrarPalabra(String unaPalabra) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < unaPalabra.length(); i++) {
            char caracter = unaPalabra.charAt(i);
            if ((caracter >= 'A' && caracter <= 'Z') ||
                    (caracter >= 'a' && caracter <= 'z'))
                sb.append(caracter);
        }
        return sb.toString().toLowerCase();
    }

    /**
     *
     * @param palabra
     * @return
     */
    public int buscarConComparaciones(String palabra) {
        TNodoTrie nodo = this;
        int comparaciones = 0;
        for (int i = 0; i < palabra.length(); i++) {
            int indice = palabra.charAt(i) - 'a';
            if (nodo.hijos[indice] == null) {
                return -1;
            }
            comparaciones++;
            nodo = nodo.hijos[indice];
        }
        return comparaciones;
    }

    /**
     *
     * @return
     */
    public int cantPalabras() {
        int contador = 0;
        if (this.esPalabra) {
            contador++;
        }
        for (int i = 0; i < CANTIDAD_LETRAS_ALFABETO; i++) {
            if (this.hijos[i] != null) {
                contador += this.hijos[i].cantPalabras();
            }
        }
        return contador;
    }
}
