/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut3_pd7;

import com.mycompany.ut3_pd7.Lista.Lista;
import com.mycompany.ut3_pd7.Nodo.Nodo;

/**
 *
 * @author Martin
 */
public class Conjunto<T> extends Lista<T> implements IConjunto<T> {

    @Override
    public IConjunto<T> union(IConjunto<T> otroConjunto) {
        if (otroConjunto.esVacia()) {
            return this;
        }
        if (this.esVacia()) {
            return otroConjunto;
        }
        
        Conjunto<T> conjuntoResultado = new Conjunto<>();
        Nodo<T> nodoActual = this.getPrimero();
        while(nodoActual != null) {
            if (conjuntoResultado.buscar(nodoActual.getEtiqueta()) == null) {
                Nodo<T> nodo = new Nodo<>(nodoActual.getEtiqueta(), nodoActual.getDato());
                conjuntoResultado.insertar(nodo);
            }
            nodoActual = nodoActual.getSiguiente();
        }
        
        nodoActual = otroConjunto.getPrimero();
        while(nodoActual != null) {
            if (conjuntoResultado.buscar(nodoActual.getEtiqueta()) == null) {
                Nodo<T> nodoAuxiliar = new Nodo<>(nodoActual.getEtiqueta(), nodoActual.getDato());
                conjuntoResultado.insertar(nodoAuxiliar);
            }
            nodoActual = nodoActual.getSiguiente();
        }
        return conjuntoResultado;
    }

    @Override
    public IConjunto<T> interseccion(IConjunto<T> otroConjunto) {
        if (this.esVacia() || otroConjunto.esVacia()) {
            return null;
        }
        
        Conjunto<T> conjuntoResultado = new Conjunto<>();
        Nodo<T> nodoActual = primero;
        while(nodoActual != null) {
            if (otroConjunto.buscar(nodoActual.getEtiqueta()) != null) {
                Nodo<T> nodo = new Nodo(nodoActual.getEtiqueta(), nodoActual.getDato());
                conjuntoResultado.insertar(nodo);
            }
            nodoActual = nodoActual.getSiguiente();
        }
        return conjuntoResultado;
    }
}
