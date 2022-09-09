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
public class ListaOrdenada<T> extends Lista<T> {
    
    private int longitud;
        
    public ListaOrdenada() {
        primero = null;
        longitud = 0;
    }

    @Override
    public void insertar(Nodo<T> unNodo) {
          if (primero == null) {
            primero = unNodo;
            primero.setSiguiente(null);
            longitud++;
        } else if (primero.getEtiqueta().compareTo(unNodo.getEtiqueta()) > 0) {
            Nodo<T> aux = primero;
            setPrimero(unNodo);
            primero.setSiguiente(aux);
            longitud++;
        } else {
            if (primero.getSiguiente() != null) {
                Nodo<T> nodoAnterior = primero;
                Nodo<T> nodoActual = primero.getSiguiente();
                while (nodoActual != null) {
                    if (nodoActual.getEtiqueta().compareTo(unNodo.getEtiqueta()) > 0) {
                        nodoAnterior.setSiguiente(unNodo);
                        unNodo.setSiguiente(nodoActual);
                        longitud++;
                        return;
                    }
                    nodoAnterior = nodoAnterior.getSiguiente();
                    nodoActual = nodoActual.getSiguiente();
                }
                nodoAnterior.setSiguiente(unNodo);
                longitud++;
                return;
            }
            primero.setSiguiente(unNodo);
            longitud++;
        }
    }
    
    @Override
    public Nodo<T> getPrimero() {
        return primero;
    }
    
    @Override
    public int cantElementos() {
        return longitud;
    }
}