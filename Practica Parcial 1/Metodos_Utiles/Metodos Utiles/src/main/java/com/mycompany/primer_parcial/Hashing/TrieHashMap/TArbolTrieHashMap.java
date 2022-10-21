package com.mycompany.primer_parcial.Hashing.TrieHashMap;

import java.util.LinkedList;

public class TArbolTrieHashMap {

    private TNodoTrieHashMap raiz;

    public LinkedList<Object> buscar(String prefijo) {
        if (raiz != null) {
            LinkedList<Object> resultado = new LinkedList<>();
            raiz.buscar(prefijo, resultado);
            return resultado;
        }
        return null;
    }

    public void insertar(Object palabra) {
        if (raiz == null) {
            raiz = new TNodoTrieHashMap();
        }
        raiz.insertar(palabra);
    }

    public void indizarLibro(String rutaArchivoLibro) {
        raiz.indizarLibro(rutaArchivoLibro);
    }

    public void imprimirIndice() {
        TNodoTrieHashMap nodo = this.raiz;
        raiz.imprimirIndice(nodo);
    }
}
