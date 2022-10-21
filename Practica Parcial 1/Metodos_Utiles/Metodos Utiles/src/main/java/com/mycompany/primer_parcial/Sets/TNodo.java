/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primer_parcial.Sets;

/**
 *
 * @author Ikken
 */
public class TNodo<T> {
    
    private final Comparable etiqueta;
    private T dato;
    private TNodo<T> siguiente = null;
    
    public TNodo(Comparable etiqueta, T dato ) {
        this.etiqueta = etiqueta;
        this.dato = dato;
    }
        
    public void setDato(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return this.dato;
    }

    public TNodo<T> getSiguiente() {
        return this.siguiente;
    }

    public void setSiguiente(TNodo<T> TNodo) {
        this.siguiente = TNodo;
    }

    public void imprimir() {
        System.out.println(dato.toString());
    }

    public void imprimirEtiqueta() {
        System.out.println(this.etiqueta);
    }

    public Comparable getEtiqueta() {
        return this.etiqueta;
    }

    public int compareTo(Comparable etiqueta) {
        return this.etiqueta.compareTo(etiqueta);
    }
}
