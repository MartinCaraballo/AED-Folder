package com.mycompany.ut3_pd10;

public class Nodo<T> implements INodo<T> {

    private Comparable etiqueta;
    private T dato;
    private INodo<T> siguiente = null;

    public Nodo(Comparable clave, T dato) {
        this.etiqueta = clave;
        this.dato = dato;
    }

    public Nodo(Comparable clave) {
        this.etiqueta = clave;
        this.dato = null;
    }

    public Comparable getEtiqueta() {
        return this.etiqueta;
    }

    public void setDato(T datoNuevo) {
        dato = datoNuevo;
    }

    public T getDato() {
        return dato;
    }

    public void setEtiqueta(Comparable unaClave) {
        this.etiqueta = unaClave;

    }

    public void setSiguiente(INodo<T> nodo) {
        this.siguiente = nodo;

    }

    public INodo<T> getSiguiente() {
        return this.siguiente;
    }

    public void imprimirEtiqueta() {
        System.out.println(etiqueta.toString());
    }

    public Nodo<T> clonar() {
        return new Nodo(this.etiqueta, this.dato);
    }

    @Override
    public boolean equals(INodo unNodo) {
        return this.etiqueta.equals(unNodo.getEtiqueta());
    }

    @Override
    public int compareTo(INodo unNodo) {
        return this.etiqueta.compareTo(unNodo.getEtiqueta());
    }

    @Override
    public String imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
