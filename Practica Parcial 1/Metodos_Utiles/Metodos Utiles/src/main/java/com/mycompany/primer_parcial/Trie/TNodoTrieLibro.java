package com.mycompany.primer_parcial.Trie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class TNodoTrieLibro {

    private static final int CANTIDAD_LETRAS_ALFABETO = 26;
    private final TNodoTrieLibro[] hijos;
    private boolean esPalabra;
    public TPalabra dato;

    public TNodoTrieLibro() {
        hijos = new TNodoTrieLibro[CANTIDAD_LETRAS_ALFABETO];
        esPalabra = false;
        dato = null;
    }

    /**
     *
     * @param palabra
     */
     void insertar(TPalabra palabra) {
        TNodoTrieLibro nodo = this;
        for (int i = 0; i < palabra.getNombre().trim().length(); i++) {
            int indice = palabra.getNombre().trim().charAt(i) - 'a';
            if (nodo.hijos[indice] == null) {
                nodo.hijos[indice] = new TNodoTrieLibro();
            }
            nodo = nodo.hijos[indice];
        }
        nodo.esPalabra = true;
        nodo.dato = palabra;
    }

    /**
     *
     * @param palabra
     * @return
     */
    public TNodoTrieLibro buscarNodoTrie(String palabra) {
        TNodoTrieLibro aux = this;
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
    public void buscar(String prefijo, LinkedList<String> lista) {
        TNodoTrieLibro aux = buscarNodoTrie(prefijo);
        buscarEnPrefijos(aux, lista, "");
    }

    private void buscarEnPrefijos(TNodoTrieLibro nodo, LinkedList<String> lista, String palabra) {
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

    public void indizarLibro(String rutaArchivo) {
        FileReader fr;
        ArrayList<String> listaLineasArchivo = new ArrayList<>();
        try {
            fr = new FileReader(rutaArchivo);
            BufferedReader br = new BufferedReader(fr);
            String lineaActual = br.readLine();
            while (lineaActual != null){
                listaLineasArchivo.add(lineaActual);
                lineaActual = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] lineasDelLibro = listaLineasArchivo.toArray (new String [0]);

        int contadorPagina = 1;
        int contadorInterno = 1;
        for (String linea : lineasDelLibro) {
            String[] palabraslinea = linea.split(" ");
            for (String palabra : palabraslinea) {
                palabra = filtrarPalabra(palabra);
                if (buscarNodoTrie(palabra) != null && buscarNodoTrie(palabra).esPalabra) {
                    if (!buscarNodoTrie(palabra).dato.getPaginas().contains(contadorPagina)) {
                        buscarNodoTrie(palabra).dato.setPaginas(contadorPagina);
                    }
                }
            }
            contadorInterno++;
            if (contadorInterno == 50) {
                contadorPagina++;
                contadorInterno = 0;
            }
        }
    }

    public void imprimirIndice(TNodoTrieLibro nodo, String string) {
        if (nodo != null) {
            if (nodo.esPalabra) {
                System.out.println(nodo.dato.getNombre() + ": " + nodo.dato.getStringPaginas());
            }
            for (int indice = 0; indice < CANTIDAD_LETRAS_ALFABETO; indice++) {
                if (nodo.hijos[indice] != null) {
                    imprimirIndice(nodo.hijos[indice], string + (char)(indice + 'a'));
                }
            }
        }
    }
}
