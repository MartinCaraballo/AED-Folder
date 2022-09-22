/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut5_pd1;

/**
 *
 * @author Martin
 */
public class NodoArbolGenerico<T> implements INodoArbolGenerico<T> {
    
    private Comparable etiqueta;
    private NodoArbolGenerico<T> primerHijo;
    private NodoArbolGenerico<T> siguienteHermano;
    
    public NodoArbolGenerico(Comparable unaEtiqueta) {
        etiqueta = unaEtiqueta;
        primerHijo = null;
        siguienteHermano = null;
    }
    
    public Comparable getEtiqueta() {
        return etiqueta;
    }
    
    public NodoArbolGenerico<T> getPrimerHijo() {
        return primerHijo;
    }
    
    public NodoArbolGenerico<T> getSiguienteHermano() {
        return siguienteHermano;
    }
    
    public void setPrimerHijo(NodoArbolGenerico<T> unNodo) {
        primerHijo = unNodo;
    }
    
    public void setSiguienteHermano(NodoArbolGenerico<T> unNodo) {
        siguienteHermano = unNodo;
    }

    @Override
    public boolean insertar(Comparable unaEtiqueta, Comparable etiquetaPadre) {
        NodoArbolGenerico nodoPadre = buscar(etiquetaPadre);
        if (nodoPadre != null) {
            if (nodoPadre.primerHijo == null) {
                nodoPadre.primerHijo = new NodoArbolGenerico(unaEtiqueta);
                return true;
            } else {
                NodoArbolGenerico nodoActual = nodoPadre.primerHijo;
                while (nodoActual.siguienteHermano != null) {
                    nodoActual = nodoActual.siguienteHermano;
                }
                nodoActual.siguienteHermano = new NodoArbolGenerico(unaEtiqueta);
                return true;
            }
        } else {
            return false;
        }
    }

    @Override
    public NodoArbolGenerico<T> buscar(Comparable unaEtiqueta) {
        if (etiqueta.equals(unaEtiqueta)) {
            return this;
        }
        NodoArbolGenerico unHijo = primerHijo;
        while (unHijo != null) {
            NodoArbolGenerico temp = unHijo.buscar(unaEtiqueta);
            if (temp != null) {
                return temp;
            }
            unHijo = unHijo.siguienteHermano;
        }
        return null;
    }

    @Override
    public void listarIndentado(int tabulaciones, StringBuffer string) {
        string.append("\t".repeat(tabulaciones)).append(etiqueta).append("\n");
        if (primerHijo != null) {
            primerHijo.listarIndentado(tabulaciones + 1, string);
        }
        if (siguienteHermano != null) {
            siguienteHermano.listarIndentado(tabulaciones,string);
        }
    }
    
    
}
