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

    private Nodo<T> primero;
    // Para no tener que recorrer la lista cada vez que queramos obtener el largo,
    // guardamos en una variable y vamos incrementando y decrementando a medida que
    // insertamos y eliminamos elementos.
    private int longitud;
    
    public Lista() {
        primero = null;
        longitud = 0;
    }

    @Override
    public void insertar(Nodo<T> nodo) {
        if (primero == null) {
            primero = nodo;
            primero.setSiguiente(null);
            longitud++;
        } else {
            Nodo<T> nodoActual = primero;

            while (nodoActual.getSiguiente() != null) {
                nodoActual = nodoActual.getSiguiente();
            }
            nodoActual.setSiguiente(nodo);
            longitud++;
        }
    }

    @Override
    public Nodo<T> buscar(Comparable clave) {
        if (primero == null) {
            return null;
        } else {
            Nodo<T> nodoActual = primero;
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
        if (primero == null) {
            return false;
        } else {
            // Si es el unico elemento en la lista, y es el nodo que queremos borrar, primero se vuelve null (lo eliminamos)
            if (primero.getSiguiente() == null && primero.getEtiqueta().equals(clave)) {
                primero = null;
                longitud--;
                return true;
                // Si es el primer elemento el que queremos borrar.
            } else if (primero.getEtiqueta().equals(clave)) {
                setPrimero(primero.getSiguiente());
                longitud--;
                return true;
            } else {
                Nodo<T> nodoAnterior = primero;
                Nodo<T> nodoActual = primero.getSiguiente();
                while (nodoActual != null && !nodoActual.getEtiqueta().equals(clave)) {
                    nodoAnterior = nodoAnterior.getSiguiente();
                    nodoActual = nodoActual.getSiguiente();
                }
                if (nodoActual != null) {
                    nodoAnterior.setSiguiente(nodoActual.getSiguiente());
                    longitud--;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String imprimir() {
        if (primero == null) {
            return "Lista vacía.";
        }
        Nodo<T> nodoActual = primero;
        StringBuilder stringBuilder = new StringBuilder();
        while (nodoActual != null) {
            stringBuilder.append(nodoActual.getDato());
            nodoActual = nodoActual.getSiguiente();
        }
        return stringBuilder.toString();
    }

    @Override
    public String imprimir(String separador) {
        if (primero == null) {
            return "Lista vacía.";
        }
        Nodo<T> nodoActual = primero;
        StringBuilder stringBuilder = new StringBuilder();
        while (nodoActual != null) {
            stringBuilder.append(nodoActual.getDato()).append(separador);
            nodoActual = nodoActual.getSiguiente();
        }
        return stringBuilder.toString();
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
        if (primero == null) {
            primero = unNodo;
            longitud++;
        } else {
            // antes de borrar el nodo, apuntamos su siguiente a null, para no tener punteros perdidos.
            primero.setSiguiente(null);
            primero = unNodo;
            longitud++;
        }
    }
}
