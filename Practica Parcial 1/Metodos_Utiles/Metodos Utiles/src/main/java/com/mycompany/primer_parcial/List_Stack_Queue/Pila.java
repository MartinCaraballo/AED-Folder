package com.mycompany.primer_parcial.List_Stack_Queue;

public class Pila<T> {

    protected Nodo<T> tope;

    public Pila() {
        this.tope = null;
    }

    public Nodo<T> tope() {
        return this.tope;
    }

    public Nodo<T> pop() {
        Nodo<T> aux = null;
        if (!isEmpty()) {
            aux = tope;
            tope = tope.getSiguiente();
        }
        return aux;
    }

    public void push(Nodo<T> pNodo) {
        if (isEmpty()) {
            tope = pNodo;
            pNodo.setSiguiente(null);
        } else {
            pNodo.setSiguiente(tope);
            tope = pNodo;
        }
    }

    public boolean isEmpty() {
        return tope == null;
    }

    public int cantElementos() {
        int cantElementos =0;
        Nodo<T> aux = this.tope();
        while (aux != null) {
            aux = aux.getSiguiente();
            cantElementos++;
        }
        return cantElementos;
    }

}