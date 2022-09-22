/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut5_pd1;

/**
 *
 * @author Martin
 */
public class ArbolGenerico<T> implements IArbolGenerico<T> {
    
    protected NodoArbolGenerico<T> raiz;
    
    public ArbolGenerico() {
        raiz = null;
    }
    
    public boolean esRaizDelArbol(NodoArbolGenerico<T> unNodo) {
        return raiz == unNodo;
    } 

    @Override
    public boolean insertar(Comparable unaEtiqueta, Comparable etiquetaPadre) {
        if (raiz == null && etiquetaPadre.equals("")) {
            raiz = new NodoArbolGenerico(unaEtiqueta);
            return true;
        } else if (etiquetaPadre.equals("")) {
            NodoArbolGenerico<T> nodo = new NodoArbolGenerico<>(unaEtiqueta);
            nodo.setPrimerHijo(raiz);
            raiz = nodo;
            return true;
        } else if (raiz != null) {
            return raiz.insertar(unaEtiqueta, etiquetaPadre);
        } else {
            return false;
        }
    }

    @Override
    public NodoArbolGenerico<T> buscar(Comparable unaEtiqueta) {
        if (raiz == null) {
            return null;
        } else {
            return raiz.buscar(unaEtiqueta);
        }
    }

    @Override
    public String listarIndentado() {
        StringBuffer string = new StringBuffer();
        if (raiz != null) {
            raiz.listarIndentado(0, string);
        } else {
            return "El arbol no tiene elementos.";
        }
        return string.toString();
    }
}
