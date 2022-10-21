package com.mycompany.primer_parcial.List_Stack_Queue;

public class Cola<T> {
    protected Nodo<T> frente;
    protected Nodo<T> ultimo;

    public Cola() {
        this.frente = null;
        this.ultimo = null;
    }

    /**
     * Obtiene el elemento de frente de la cola.
     * @return Devuelve el elemento frente de la cola.
     */
    public Nodo<T> getFrente() {
        return frente;
    }

    /**
     * Obtiene el ultimo elemento de la cola.
     * @return Devuelve el ultimo elemento de la cola.
     */
    public Nodo<T> getUltimo() {
        return ultimo;
    }

    /**
     * Pone un elemento en cola.
     * @param elemento Elemento que se quiere poner en cola.
     * @return Devuelve true si el elemento se puso en cola, false por el contrario.
     */
    public boolean poneEnCola(Nodo<T> elemento) {
        if (isEmpty()) {
            ultimo = elemento;
            frente = elemento;
        } else {
            ultimo.setSiguiente(elemento);
            ultimo = elemento;
        }
        return true;
    }

    /**
     * Quita el elemento de frente de la cola.
     * @return Devuelve el elemento eliminado de la cola o null por el contrario.
     */
    public Nodo<T> quitarDeCola() {
        Nodo<T> aux = null;
        if (!isEmpty()) {
            aux = frente;
            frente = frente.getSiguiente();
        }
        return aux;
    }

    /**
     * Calcula la cantidad de elementos dentro de la cola.
     * @return Devuelve un int con la cantidad de elementos de la cola.
     */
    public int cantElementos() {
        int cantElementos = 0;
        if (!isEmpty()) {
            Nodo<T> aux = this.getFrente();
            while (aux != null) {
                aux = aux.getSiguiente();
                cantElementos++;
            }
        }
        return cantElementos;
    }

    public boolean isEmpty() {
        return frente == null;
    }

}
