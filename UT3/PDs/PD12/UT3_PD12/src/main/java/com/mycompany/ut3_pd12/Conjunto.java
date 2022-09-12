package com.mycompany.ut3_pd12;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ernesto
 * @param <T>
 */
public class Conjunto<T> extends ListaOrdenada<T> implements IConjunto {

    @Override
    public Conjunto union(Conjunto otroConjunto) {
        if (otroConjunto.esVacia()) {
            return this;
        }
        if (this.esVacia()) {
            return otroConjunto;
        }
        
        Conjunto<T> conjuntoResultado = new Conjunto<>();
        Nodo<T> nodoActual = this.getPrimero();
        while (nodoActual != null) {
            if (otroConjunto.buscar(nodoActual.getEtiqueta()) == null) {
                Nodo<T> nuevoNodo = new Nodo(nodoActual.getEtiqueta(), nodoActual.getDato());
                conjuntoResultado.insertar(nuevoNodo);
            }
            nodoActual = nodoActual.getSiguiente();
        }
        
        nodoActual = otroConjunto.getPrimero();
        while (nodoActual != null) {
            if (this.buscar(nodoActual.getEtiqueta()) == null) {
                Nodo<T> nuevoNodo = new Nodo(nodoActual.getEtiqueta(), nodoActual.getDato());
                conjuntoResultado.insertar(nuevoNodo);
            }
            nodoActual = nodoActual.getSiguiente();
        }
        return conjuntoResultado;
    }

    @Override
    public Conjunto interseccion(Conjunto otroConjunto) {
        if (this.esVacia() || otroConjunto.esVacia()) {
            return null;
        }
        
        Conjunto<T> conjuntoResultado = new Conjunto<>();
        Nodo<T> nodoActual = this.getPrimero();
        while (nodoActual != null) {
            if (otroConjunto.buscar(nodoActual.getEtiqueta()) != null) {
                Nodo<T> nuevoNodo = new Nodo(nodoActual.getEtiqueta(), nodoActual.getDato());
                conjuntoResultado.insertar(nuevoNodo);
            }
            nodoActual = nodoActual.getSiguiente();
        }
        return conjuntoResultado;
    }
}
