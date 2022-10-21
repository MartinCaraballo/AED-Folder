package com.mycompany.primer_parcial.Hashing.TrieHashMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class TNodoTrieHashMap {
    private final HashMap<Character, TNodoTrieHashMap> hijos;
    private boolean esPalabra;
    public Object dato;

    public TNodoTrieHashMap() {
        hijos = new HashMap<>();
        esPalabra = false;
        dato = null;
    }

    public void insertar(Object object) {
        TNodoTrieHashMap nodo = this;
        if (object instanceof TPalabra) {
            for (Character character : ((TPalabra) object).getNombre().toCharArray()) {
                if (!nodo.hijos.containsKey(character)) {
                    nodo.hijos.put(character, new TNodoTrieHashMap());
                }
                nodo = nodo.hijos.get(character);
            }
            nodo.dato = object;
        } else if (object instanceof TAbonado) {
            for (Character character : ((TAbonado) object).getTelefono().toCharArray()) {
                if (!nodo.hijos.containsKey(character)) {
                    nodo.hijos.put(character, new TNodoTrieHashMap());
                }
                nodo = nodo.hijos.get(character);
            }
            nodo.dato = object;
        }
        nodo.esPalabra = true;
    }

    public TNodoTrieHashMap buscarNodoTrie(String string) {
        TNodoTrieHashMap nodo = this;
        for (int i = 0; i < string.length(); i++) {
            Character character = string.charAt(i);
            if (nodo.hijos.get(character) == null) {
                return null;
            }
            nodo = nodo.hijos.get(character);
        }
        return nodo;
    }

    public void buscarSufijo(TNodoTrieHashMap nodo, LinkedList<Object> sufijos) {
        if (nodo != null) {
            if (nodo.esPalabra) {
                sufijos.add(nodo.dato);
            }
            for (Character character : nodo.hijos.keySet()) {
                if (nodo.hijos.get(character) != null) {
                    buscarSufijo(nodo.hijos.get(character), sufijos);
                }
            }
        }
    }

    public void buscar(String prefijo, LinkedList<Object> sufijos) {
        TNodoTrieHashMap nodo = buscarNodoTrie(prefijo);
        buscarSufijo(nodo, sufijos);
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

    public void indizarLibro(String libro) {
        FileReader fr;
        ArrayList<String> listaLineasArchivo = new ArrayList<>();
        try {
            fr = new FileReader(libro);
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
                    if (!((TPalabra) buscarNodoTrie(palabra).dato).getPaginas().contains(contadorPagina)) {
                        ((TPalabra) buscarNodoTrie(palabra).dato).setPaginas(contadorPagina);
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

    public void imprimirIndice(TNodoTrieHashMap nodo) {
        if (nodo != null) {
            if (nodo.esPalabra) {
                System.out.println(((TPalabra) nodo.dato).getNombre() + ": " + ((TPalabra) nodo.dato).getStringPaginas());
            }
            for (Character character : nodo.hijos.keySet()) {
                if (nodo.hijos.containsKey(character)) {
                    imprimirIndice(nodo.hijos.get(character));
                }
            }
        }
    }
}
