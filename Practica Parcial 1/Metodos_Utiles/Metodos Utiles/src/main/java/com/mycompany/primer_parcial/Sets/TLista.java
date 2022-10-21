package com.mycompany.primer_parcial.Sets;

public class TLista<T> {

    protected TNodo<T> primero;

    public TLista() {
        primero = null;
    }

    public void insertar(TNodo<T> nodo) {
        if (nodo != null) {
            if (esVacia()) {
                this.primero = nodo;
            } else {
                TNodo<T> aux = this.primero;
                while (aux.getSiguiente() != null) {
                    aux = aux.getSiguiente();
                }
                aux.setSiguiente(nodo);
            }
        }
    }

    //Retorno un clon del elemento encontrado.
    public TNodo<T> buscar(Comparable clave) {
        if (!esVacia()) {
            TNodo<T> aux = this.primero;
            while (aux != null && !aux.getEtiqueta().equals(clave)) {
                aux = aux.getSiguiente();
            }
            return aux;
        }
        return null;
    }

    public int buscarComparaciones(Comparable clave) {
        int comparaciones = 0;
        if (!esVacia()) {
            TNodo<T> aux = this.primero;
            while (aux != null && !aux.getEtiqueta().equals(clave)) {
                aux = aux.getSiguiente();
                comparaciones++;
            }
            if (aux != null) {
                return comparaciones;
            }
        }
        return -1;
    }

    public boolean eliminar(Comparable clave) {
        boolean seElimino = false;
        if (!esVacia()) {
            TNodo<T> aux = this.primero;
            if (aux.getEtiqueta().equals(clave)) {
                this.primero = this.primero.getSiguiente();
                return true;
            }
            TNodo<T> auxSig = aux.getSiguiente();
            while (auxSig != null && !auxSig.getEtiqueta().equals(clave)) {
                aux = auxSig;
                auxSig = auxSig.getSiguiente();
            }
            if (auxSig != null) {
                seElimino = true;
                aux.setSiguiente(auxSig.getSiguiente());
            }
        }
        return seElimino;
    }

    public int eliminarDuplicados(Comparable clave) {
        int seEliminaron = 0;
        if (!esVacia()) {
            TNodo<T> aux = this.primero;
            if (aux.getEtiqueta().equals(clave)) {
                this.primero = this.primero.getSiguiente();
                aux = this.primero;
                seEliminaron++;
            }
            if (aux != null) {
                TNodo<T> auxSig = aux.getSiguiente();
                while (auxSig != null) {
                    if (auxSig.getEtiqueta().equals(clave) ) {
                        seEliminaron++;
                        aux.setSiguiente(auxSig.getSiguiente());
                    } else {
                        aux = auxSig;
                    }
                    auxSig = auxSig.getSiguiente();
                }
                if (aux.getEtiqueta().equals(clave)) {
                    this.primero = null;
                    seEliminaron++;
                }
            }
        }
        return seEliminaron;
    }

    public String imprimir() {
        StringBuilder result = new StringBuilder();
        if (!this.esVacia()) {
            TNodo<T> aux = primero;
            result = new StringBuilder(primero.getEtiqueta().toString());
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
                result.append(" ").append(aux.getEtiqueta().toString());
            }
        }
        return result.toString();
    }

    public String imprimir(String separador) {
        StringBuilder result = new StringBuilder();
        if (!this.esVacia()) {
            TNodo<T> aux = primero;
            result = new StringBuilder(primero.getEtiqueta().toString());
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
                result.append(separador).append(aux.getEtiqueta().toString());
            }
        }
        return result.toString();
    }

    public int cantElementos() {
        int cant = 0;
        if (!esVacia()) {
            TNodo<T> aux = this.primero;
            while (aux != null) {
                cant++;
                aux = aux.getSiguiente();
            }
        }
        return cant;
    }

    public boolean esVacia() {
        return this.primero == null;
    }

    public void setPrimero(TNodo<T> unNodo) {
        this.primero = unNodo;
    }

    public TNodo<T> getPrimero() {
        return this.primero;
    }

}
