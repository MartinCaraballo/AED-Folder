package com.mycompany.ut6_pd5.ejercicio3;


import java.util.HashMap;
import java.util.LinkedList;

public class TNodoTrieTelefonosHashMap implements INodoTrieTelefonosHashMap {
    
    private static final int CANT_NUMEROS = 10;
    private HashMap<Comparable, TNodoTrieTelefonosHashMap> hijos;
    private boolean esNumero;
    private TAbonado abonado;
    
    public TNodoTrieTelefonosHashMap() {
        hijos = new HashMap<Comparable, TNodoTrieTelefonosHashMap>(CANT_NUMEROS);
        esNumero = false;
    }
    
    public TAbonado getAbonado() {
        return abonado;
    }
    
    @Override
    public void buscarTelefonos(String codigoPais, String codigoArea, LinkedList<TAbonado> abonados) {
        String prefijo = codigoPais + codigoArea;
        TNodoTrieTelefonosHashMap ultimoPrefijo = buscarNodoTrie(prefijo);
        if (ultimoPrefijo != null) {
            ultimoPrefijo.predecir(prefijo, abonados, ultimoPrefijo);
        }
    }

    @Override
    public void insertar(String numero, TAbonado unAbonado) {
        numero = comprobar(numero);
        TNodoTrieTelefonosHashMap nodo = this;
        for (int c = 0; c < numero.length(); c++) {
            int indice = (int)numero.charAt(c) - '0';
            if (nodo.hijos.get(indice) == null) {
                nodo.hijos.put(indice, new TNodoTrieTelefonosHashMap());
            }
            nodo = nodo.hijos.get(indice);
        }
        nodo.esNumero = true;
        nodo.abonado = unAbonado;
    }
    
    @Override
    public TNodoTrieTelefonosHashMap buscar(String s) {
        TNodoTrieTelefonosHashMap nodo = this;
        int comparaciones = 0;
        for (int c = 0; c < s.length(); c++) {
            int indice = (int)s.charAt(c) - '0';
            if (nodo.hijos.get(indice) == null) {
                return null;
            } else {
                nodo = nodo.hijos.get(indice);
                comparaciones += 1;
            }
        }
        return nodo;
    }
    
    private String comprobar(String cadena) {
        cadena = cadena.toLowerCase();
        char[] partes = cadena.toCharArray();
        StringBuilder string = new StringBuilder();
        int cont = 0;
        
        for(char c : partes) {
            int index = c-'0';
            if( index >= 0 && index <=10) {
                string.append(c);
            } 
        }
        return string.toString();
    }
    
    private TNodoTrieTelefonosHashMap buscarNodoTrie(String s) {
        s = s.toLowerCase();
        TNodoTrieTelefonosHashMap nodo = this;
        for (int c = 0; c < s.length(); c++) {
            int indice = (int)s.charAt(c) - '0';
            if (nodo.hijos.get(indice) == null) {
                return null;
            }
            nodo = nodo.hijos.get(indice);
        }
        return nodo;
    }

    private void predecir(String s, LinkedList<TAbonado> abonados, TNodoTrieTelefonosHashMap nodo) {
        // implementar
        if (nodo != null) {
            if (nodo.esNumero) {
                abonados.add(nodo.abonado);
            }
            for (int c = 0; c < CANT_NUMEROS; c++) {
                if (nodo.hijos.get(c) != null) {
                    nodo.hijos.get(c).predecir(s + (char) (c + '0'), abonados, nodo.hijos.get(c));
                }
            }
        }
        
    }    
}
