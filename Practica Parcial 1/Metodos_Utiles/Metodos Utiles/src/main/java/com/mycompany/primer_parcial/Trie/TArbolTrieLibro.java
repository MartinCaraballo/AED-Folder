package com.mycompany.primer_parcial.Trie;

public class TArbolTrieLibro {

    private TNodoTrieLibro raiz;


    public void indizarLibro(String rutaArchivo) {
        if (raiz != null) {
            raiz.indizarLibro(rutaArchivo);
        }
    }


}
