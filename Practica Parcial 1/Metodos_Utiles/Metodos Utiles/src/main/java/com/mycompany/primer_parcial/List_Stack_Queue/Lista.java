/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primer_parcial.List_Stack_Queue;

/**
 *
 * @author Ikken
 */
public class Lista<T> {
    
    private Nodo<T> primero;

    public Lista() {
        primero = null;
    }
    
    public Nodo<T> getPrimero(){
        return this.primero;
    }

    public Nodo<T> insertar(Nodo<T> nodo) {
        if (esVacia()){
            primero = nodo;
            return nodo;
        } else {
            Nodo<T> aux = primero;
            while (aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nodo);
        }
        return nodo;
    }
    
    @SuppressWarnings("unchecked")
    public void insertarOrdenado(Nodo<T> nodo) {
        if (primero == null) {
            primero = nodo;
            primero.setSiguiente(null);
        } else if (primero.getEtiqueta().compareTo(nodo.getEtiqueta()) > 0) {
            Nodo<T> aux = primero;
            setPrimero(nodo);
            primero.setSiguiente(aux);
        } else {
            if (primero.getSiguiente() != null) {
                Nodo<T> nodoAnterior = primero;
                Nodo<T> nodoActual = primero.getSiguiente();
                while (nodoActual != null) {
                    if (nodoActual.getEtiqueta().compareTo(nodo.getEtiqueta()) > 0) {
                        nodoAnterior.setSiguiente(nodo);
                        nodoAnterior.setSiguiente(nodoActual);
                        return;
                    }
                    nodoAnterior = nodoAnterior.getSiguiente();
                    nodoActual = nodoActual.getSiguiente();
                }
                nodoAnterior.setSiguiente(nodo);
                return;
            }
            primero.setSiguiente(nodo);
        }
    }

    public Nodo<T> buscar(Comparable clave) {
        if (!this.esVacia()) {
            Nodo<T> first = primero;
            while (first != null) {
                if (first.getEtiqueta().equals(clave)) {
                    return first;
                }
                first = first.getSiguiente();
            }
        }
        return null;
    }

    public Nodo<T> eliminar(Comparable clave) {
        if (primero == null) {
            return null;
        } else {
            if (primero.getSiguiente() == null && primero.getEtiqueta().equals(clave)) {
                primero = null;
                return null;
            } else if (primero.getEtiqueta().equals(clave)) {
                setPrimero(primero.getSiguiente());
                return primero;
            } else {
                Nodo<T> first = primero;
                Nodo<T> next = first.getSiguiente();
                while (next != null && !next.getEtiqueta().equals(clave)) {
                    first = first.getSiguiente();
                    next = next.getSiguiente();
                }
                if (next != null) {
                    first.setSiguiente(next.getSiguiente());
                    return first;
                }
            }
        }
        return null;
    }

    public StringBuilder imprimir() {
        StringBuilder result = new StringBuilder();
        if (this.esVacia()) {
            return result;
        } else {
            Nodo<T> first = primero;
            while(first != null) {
                result.append(String.valueOf(first.getDato())).append("\n");
                first = first.getSiguiente();
            }
        }
        return result;
    }

    public StringBuilder imprimir(String separador) {
        StringBuilder result = new StringBuilder();
        if (this.esVacia()) {
            return result;
        } else {
            Nodo<T> first = primero;
            while(first != null) {
                result.append(String.valueOf(first.getDato()));
                result.append("\n").append(separador);
                first = first.getSiguiente();
            }
        }
        return result;
    }

    public int cantElementos() {
        int contador = 0;
        if (this.esVacia()) {
            return 0;
        } else {
            Nodo<T> first = primero;
            while (first != null) {
                contador++;
                first = first.getSiguiente();
            }
        }
        return contador;
    }

    public boolean esVacia() {
        return this.primero == null;
    }

    public void setPrimero(Nodo<T> unNodo) {
        this.primero = unNodo;
    }
}
