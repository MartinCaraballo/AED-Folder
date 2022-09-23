package com.mycompany.ut5_pd3;


import java.util.LinkedList;


public class TArbolTrie implements IArbolTrie {

    private TNodoTrie raiz;

    @Override
    public void insertar(String palabra) {
        if (raiz == null) {
            raiz = new TNodoTrie();
        }
        raiz.insertar(palabra);
    }
    
    @Override
    public void insertar(String palabra, int pagina) {
        if (raiz == null) {
            raiz = new TNodoTrie();
        }
        raiz.insertar(palabra, pagina);
    }
    
    @Override
    public void indizarLibro(String rutaAlLibro) {
        if (raiz == null) {
            raiz = new TNodoTrie();
        }
        raiz.indizarLibro(rutaAlLibro);
    }
    
    @Override
    public String imprimirIndice() {
        if (raiz == null) {
            return "No hay palabras insertadas.";
        } else {
            return raiz.imprimirIndice();
        }
    }

    @Override
    public void imprimir() {
        if (raiz != null) {
            raiz.imprimir();
        }
    }

    @Override
    public String buscar(String palabra) {
        if (raiz== null){
              raiz = new TNodoTrie();
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
