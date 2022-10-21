package com.mycompany.primer_parcial.GenericTree;

public class TArbolGenerico<T> {

    protected TNodoArbolGenerico<T> raiz;

    public TArbolGenerico() {
        this.raiz = null;
    }

    public TNodoArbolGenerico<T> buscar(Comparable etiqueta) {
        if (this.raiz != null) {
            return this.raiz.buscar(etiqueta);
        }
        return null;
    }

    public boolean insertar(Comparable etiqueta, Comparable etiquetaPadre) {
        if (this.raiz != null) {
            return this.raiz.insertar(etiqueta, etiquetaPadre);
        }
        this.raiz = (TNodoArbolGenerico<T>) new TNodoArbolGenerico<T>(etiqueta, null);
        return true;
    }

    public boolean insertar(TNodoArbolGenerico<T> nodo, Comparable etiquetaPadre) {
        if (this.raiz != null) {
            return this.raiz.insertar(nodo, etiquetaPadre);
        }
        return false;
    }

    public String listarIndentado() {
        if (raiz != null) {
            return raiz.listarIndentado();
        }
        return "";
    }

    public int cantElementos() {
        if (raiz != null) {
            return raiz.cantElementos();
        }
        return 0;
    }
}
