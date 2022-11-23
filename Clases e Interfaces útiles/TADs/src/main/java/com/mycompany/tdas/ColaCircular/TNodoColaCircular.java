/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tdas;

/**
 *
 * @author juan-
 */
public class TNodoColaCircular<T> implements INodoColaCircular<T>{
    protected Comparable etiqueta;
    protected T dato;

    public  TNodoColaCircular(Comparable pEtiqueta, T pDato)
    {
        this.etiqueta=pEtiqueta;
        this.dato= pDato;
    }
    
    @Override
    public T getDato() {
        return this.dato;
    }

    @Override
    public void imprimir() {
        System.out.println(dato.toString());
    }

    @Override
    public void imprimirEtiqueta() {
        System.out.println(etiqueta.toString());
    }

    @Override
    public Comparable getEtiqueta() {
        return this.etiqueta;
    }

    @Override
    public int compareTo(Comparable etiqueta) {
        return this.etiqueta.compareTo(etiqueta);
    }
    
    @Override 
    public boolean equalsTo(T pDato)
    {
        return this.dato.equals(pDato);
    }

    @Override
    public TNodoColaCircular<T> clonar() {
        return new TNodoColaCircular<T>(this.etiqueta,this.dato);
    }
    
    
}
