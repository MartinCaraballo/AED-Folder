package com.mycompany.ut6_pd1;



import java.io.Serializable;
import java.util.LinkedList;


public class TArbolTrieHashMap implements Serializable {

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
