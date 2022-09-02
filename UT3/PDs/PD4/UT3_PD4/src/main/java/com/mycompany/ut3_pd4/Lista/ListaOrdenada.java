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
        } else if (primero.getSiguiente() == null) {
            int comp = primero.getEtiqueta().compareTo(nodo.getEtiqueta());
            if (comp >= 0) {
                primero.setSiguiente(nodo);
                longitud++;
            } else {
                nodo.setSiguiente(primero);
                setPrimero(nodo);
                longitud++;
            }
        } else {
            Nodo<T> nodoAnterior = primero;
            Nodo<T> nodoActual = primero.getSiguiente();
            while (nodoActual != null) {
                int comparacion = nodoActual.getEtiqueta().compareTo(nodo.getEtiqueta());
                if (comparacion < 0) {
                    nodo.setSiguiente(nodoActual.getSiguiente());
                    nodoActual.setSiguiente(nodo);
                    longitud++;
                    break;
                } else if (comparacion >= 0) {
                    nodo.setSiguiente(nodoActual);
                    nodoAnterior.setSiguiente(nodo);
                    longitud++;
                    break;
                }
                nodoAnterior = nodoAnterior.getSiguiente();
                nodoActual = nodoActual.getSiguiente();
            }
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
