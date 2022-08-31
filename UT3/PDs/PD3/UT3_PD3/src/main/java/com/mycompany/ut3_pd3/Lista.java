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

    private Nodo<T> cabeza = null;
    private int longitud = 0;

    @Override
    public void insertar(Nodo<T> nodo) {
        if (cabeza == null) {
            cabeza = nodo;
        } else {
            INodo<T> puntero = cabeza;
            
            while (puntero.getSiguiente() != null) {
                puntero = puntero.getSiguiente();
            }
            puntero.setSiguiente(nodo);
            longitud++;
        }
    }

    @Override
    public Nodo<T> buscar(Comparable clave) {
        if (cabeza == null)
            return null;
        else {
            Nodo<T> nodoActual = cabeza;
            while (nodoActual != null) {
                if (nodoActual.getEtiqueta().equals(clave))
                    return nodoActual;
                nodoActual = nodoActual.getSiguiente();
            }
            return null;
        }
    }

    @Override
    public boolean eliminar(Comparable clave) {
        Nodo<T> nodoActual = cabeza;
        if (cabeza == null)
            return false;
        else if (longitud == 1) {
            if (cabeza.getEtiqueta().equals(clave)) {
                cabeza = null;
                return true;
            }      
        } else {
            Nodo<T> nodoSiguiente = nodoActual.getSiguiente();
            while (nodoSiguiente != null) {
                if (nodoSiguiente.getEtiqueta().equals(clave)) {
                    nodoActual.setSiguiente(nodoSiguiente.getSiguiente());
                    nodoSiguiente = null;
                    return true;
                }
                nodoActual = nodoSiguiente;
            }
        }
        return false;
    }

    @Override
    public String imprimir() {

    }

    @Override
    public String imprimir(String separador) {

    }

    @Override
    public int cantElementos() {
        return longitud;
    }

    @Override
    public boolean esVacia() {
        return longitud == 0;
    }

    @Override
    public void setPrimero(Nodo<T> unNodo) {
        Nodo<T> cabezaAntiguo = cabeza;
        cabeza = unNodo;
        cabeza.setSiguiente(cabezaAntiguo);
    }

}
