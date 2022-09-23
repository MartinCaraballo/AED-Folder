package com.mycompany.ut5_pd3;


import java.util.LinkedList;

public class TNodoTrie implements INodoTrie {

    private static final int CANT_CHR_ABECEDARIO = 26;
    private TNodoTrie[] hijos;
    private LinkedList<Integer> paginas;
    private boolean esPalabra;

    public TNodoTrie() {
        hijos = new TNodoTrie[CANT_CHR_ABECEDARIO];
        paginas = new LinkedList<>();
        esPalabra = false;
    }

    @Override
    public void insertar(String unaPalabra) {
        TNodoTrie nodo = this;
        for (int c = 0; c < unaPalabra.length(); c++) {
            int indice = unaPalabra.charAt(c) - 'a';
            if (nodo.hijos[indice] == null) {
                nodo.hijos[indice] = new TNodoTrie();
            }
            nodo = nodo.hijos[indice];
        }
        nodo.esPalabra = true;
    }
    
    @Override
    public void insertar(String unaPalabra, int pagina) {
        TNodoTrie nodo = this;
        for (int c = 0; c < unaPalabra.length(); c++) {
            int indice = unaPalabra.charAt(c) - 'a';
            if (nodo.hijos[indice] == null) {
                nodo.hijos[indice] = new TNodoTrie();
            }
            nodo = nodo.hijos[indice];
        }
        nodo.esPalabra = true;
        if (!nodo.paginas.contains(pagina)) {
            nodo.paginas.add(pagina);
        }
    }
    
    @Override
    public void indizarLibro(String rutaAlLibro) {
        String[] libro = ManejadorArchivosGenerico.leerArchivo(rutaAlLibro);
        int contador = 0;
        int pagina = 1;
        for (String linea : libro) {
            String[] palabras = linea.split(" ");
            for (String palabra : palabras) {
                String palabraFiltrada = ManejadorArchivosGenerico.filtrarPalabra(palabra);
                insertar(palabraFiltrada, pagina);
            }
            // Si el contador llega a 50, entonces quiere decir que ya se recorrió una pagina.
            if (++contador == 50) {
                pagina++;
                contador = 0;
            }
        }
    }
    
    private void imprimirIndice(String s, StringBuilder indice, TNodoTrie actual) {
        if (actual != null) {
            if (actual.esPalabra) {
                indice.append(s).append(" | Páginas: ").append(actual.paginas.toString()).append("\n");
            }
            for (int c = 0; c < CANT_CHR_ABECEDARIO; c++) {
                if (actual.hijos[c] != null) {
                    imprimirIndice(s + (char) (c + 'a'), indice, actual.hijos[c]);
                }
            }
        }
    }
    
    @Override
    public String imprimirIndice() {
        StringBuilder indice = new StringBuilder("Indice:\n");
        imprimirIndice("", indice, this);
        return indice.toString();
    }

    private void imprimir(String s, TNodoTrie nodo) {
        if (nodo != null) {
            if (nodo.esPalabra) {
                System.out.println(s);

            }
            for (int c = 0; c < CANT_CHR_ABECEDARIO; c++) {
                if (nodo.hijos[c] != null) {
                    imprimir(s + (char) (c + 'a'), nodo.hijos[c]);
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
            if (nodo.hijos[indice] == null) {
                return null;
            }
            nodo = nodo.hijos[indice];
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
                if (nodo.hijos[c] != null) {
                    nodo.hijos[c].predecir(s + (char) (c + 'a'), palabras, nodo.hijos[c]);
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

    /*
    @Override
    public int buscar(String s) {
        TNodoTrie nodo = this;
        int comparaciones = 0;
        for (int c = 0; c < s.length(); c++) {
            int indice = s.charAt(c) - 'a';
            if (nodo.hijos[indice] == null) {
                return 0;
            } else {
                nodo = nodo.hijos[indice];
                comparaciones += 1;
            }
        }
        return comparaciones;
    }*/
    
    @Override
    public String buscar(String s) {
        TNodoTrie nodo = this;
        int comparaciones = 0;
        for (int c = 0; c < s.length(); c++) {
            int indice = s.charAt(c) - 'a';
            if (nodo.hijos[indice] == null) {
                return "No existe en el índice | Comparaciones: " + comparaciones;
            } else {
                nodo = nodo.hijos[indice];
                comparaciones += 1;
            }
        }
        return "Resultado de la búsqueda:\nExiste en el índice | Comparaciones: " + comparaciones + " | Palabra: " + s + " | Páginas: " + nodo.paginas.toString();
    }

}
