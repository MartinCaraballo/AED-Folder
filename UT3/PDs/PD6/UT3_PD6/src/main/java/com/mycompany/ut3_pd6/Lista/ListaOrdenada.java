package com.mycompany.ut3_pd6.Lista;


import com.mycompany.ut3_pd6.Nodo.Nodo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Martin
 */
public class ListaOrdenada<T> extends Lista<T> {

    private Nodo<T> primero;
    private int longitud;

    public ListaOrdenada() {
        primero = null;
        longitud = 0;
    }

    // falta arrelar, no ordena del todo bien
    public void insertarOrdenado(Nodo<T> nodo) {
        if (primero == null) {
            primero = nodo;
            primero.setSiguiente(null);
            longitud++;
        } else if (primero.getEtiqueta().compareTo(nodo.getEtiqueta()) > 0) {
            Nodo<T> aux = primero;
            setPrimero(nodo);
            primero.setSiguiente(aux);
            longitud++;
        } else {
            if (primero.getSiguiente() != null) {
                Nodo<T> nodoAnterior = primero;
                Nodo<T> nodoActual = primero.getSiguiente();
                while (nodoActual != null) {
                    if (nodoActual.getEtiqueta().compareTo(nodo.getEtiqueta()) > 0) {
                        nodoAnterior.setSiguiente(nodo);
                        nodo.setSiguiente(nodoActual);
                        longitud++;
                        return;
                    }
                    nodoAnterior = nodoAnterior.getSiguiente();
                    nodoActual = nodoActual.getSiguiente();
                }
                nodoAnterior.setSiguiente(nodo);
                longitud++;
                return;
            }
            primero.setSiguiente(nodo);
            longitud++;
        }
    }

    @Override
    public boolean esVacia() {
        return (primero == null);
    }

    @Override
    public Nodo<T> getPrimero() {
        return primero;
    }

    @Override
    public void setPrimero(Nodo<T> unNodo) {
        primero = unNodo;
        longitud++;
    }
}
