/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut3_pd3;

/**
 *
 * @author Martin
 * @param <T> Node data type.
 */
public class Lista<T> implements ILista<T> {

    private Nodo<T> primero = null;
    private int longitud = 0;

    @Override
    public void insertar(Nodo<T> nodo) {
        if (this.primero == null) {
            this.primero = nodo;
            this.primero.setSiguiente(null);
            this.longitud++;
        } else {
            INodo<T> puntero = this.primero;

            while (puntero.getSiguiente() != null) {
                puntero = puntero.getSiguiente();
            }
            puntero.setSiguiente(nodo);
            this.longitud++;
        }
    }

    @Override
    public Nodo<T> buscar(Comparable clave) {
        if (this.esVacia()) {
            return null;
        } else {
            Nodo<T> nodoActual = this.primero;
            while (nodoActual != null) {
                if (nodoActual.getEtiqueta().equals(clave)) {
                    return nodoActual;
                }
                nodoActual = nodoActual.getSiguiente();
            }
            return null;
        }
    }

    @Override
    public boolean eliminar(Comparable clave) {
        if (this.esVacia()) {
            return false;
        } else {
            Nodo<T> nodoAnterior = this.primero;
            Nodo<T> nodoActual = this.primero.getSiguiente();
            if (nodoAnterior.getEtiqueta().equals(clave)) {
                this.primero = primero.getSiguiente();
                longitud--;
                return true;
            }
            while (nodoActual != null) {
                if (nodoActual.getEtiqueta().equals(clave)) {
                    if (nodoActual.getSiguiente() != null) {
                        nodoAnterior.setSiguiente(nodoActual.getSiguiente());
                        this.longitud--;
                        return true;
                    }
                    nodoAnterior.setSiguiente(null);
                    this.longitud--;
                    return true;
                }
                nodoAnterior = nodoActual;
                nodoActual = nodoActual.getSiguiente();
            }
        }
        return false;
    }

    @Override
    public String imprimir() {
        Nodo<T> puntero = this.primero;
        if (puntero == null) {
            return "Lista vacía.";
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (puntero != null) {
            stringBuilder.append(puntero.getEtiqueta().toString());
            puntero = puntero.getSiguiente();
        }
        return stringBuilder.toString();
    }

    @Override
    public String imprimir(String separador) {
        Nodo<T> puntero = this.primero;
        if (puntero == null) {
            return "Lista vacía.";
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (puntero != null) {
            stringBuilder.append(puntero.getEtiqueta().toString() + separador);
            puntero = puntero.getSiguiente();
        }
        return stringBuilder.toString();
    }

    @Override
    public int cantElementos() {
        return this.longitud;
    }

    @Override
    public boolean esVacia() {
        return this.longitud == 0;
    }

    @Override
    public void setPrimero(Nodo<T> unNodo) {
        this.primero = unNodo;
        this.longitud++;
    }

}
