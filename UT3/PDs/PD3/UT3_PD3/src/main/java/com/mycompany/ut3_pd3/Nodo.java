/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut3_pd3;

/**
 *
 * @author Martin
 * @param <T> Tipo de dato del nodo.
 */
public class Nodo<T> implements INodo {
    
    private Comparable etiqueta;
    private T dato;
    private INodo<T> siguiente;
    
    public Nodo(Comparable etiqueta, T dato) {
        this.etiqueta = etiqueta;
        this.dato = dato;
    }
    
    @Override
    public T getDato() {
        return this.dato;
    }
    
    @Override
    public Nodo<T> getSiguiente() {
        return (Nodo) this.siguiente;
    }
    
    @Override
    public void setSiguiente(Nodo nodo) {
        this.siguiente = nodo;
    }
    
    @Override
    public void imprimir() {
        System.out.println(this.dato.toString());
    }
    
    @Override
    public void imprimirEtiqueta() {
        System.out.println(this.etiqueta);
    }
    
    @Override
    public Comparable getEtiqueta() {
        return this.etiqueta;
    }
    
    @Override
    public int compareTo(Comparable etiqueta) {
        Integer i = this.etiqueta.compareTo(etiqueta);
        if ( i < 1)
            return -1;
        else if (i == 0)
            return 0;
        else
            return 1;
    }
    
}
