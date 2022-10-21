package com.mycompany.primer_parcial.Trie;

import java.util.LinkedList;

public class TArbolTrie {
    private TNodoTrie raiz;

    public void insertar(String palabra) {
        if (raiz == null) {
            raiz = new TNodoTrie();
        }
        raiz.insertar(palabra);
    }

    public int buscarConContador(String palabra) {
        if (raiz != null) {
            return raiz.buscarConContador(palabra);
        }
        return -1;
    }

    public LinkedList<String> predecir(String prefijo) {
        if (raiz != null) {
            LinkedList<String> lista = new LinkedList<>();
            raiz.predecir(prefijo, lista);
            return lista;
        }
        return null;
    }
}
