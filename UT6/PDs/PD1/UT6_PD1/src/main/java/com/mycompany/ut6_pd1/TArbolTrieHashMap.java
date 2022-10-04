package com.mycompany.ut6_pd1;



import java.util.LinkedList;


public class TArbolTrieHashMap implements IArbolTrie {

    private TNodoTrieHashMap raiz;

    @Override
    public void insertar(String palabra) {
        if (raiz == null) {
            raiz = new TNodoTrieHashMap();
        }
        raiz.insertar(palabra);
    }

    @Override
    public void imprimir() {
        if (raiz != null) {
            raiz.imprimir();
        }
    }

    @Override
    public int buscar(String palabra) {
        if (raiz== null){
              raiz = new TNodoTrieHashMap();
        }
        return raiz.buscar(palabra);
    }

    @Override
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
