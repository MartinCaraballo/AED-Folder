/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.tdas;

/**
 *
 * @author juan-
 *
 */
public interface IColaCircular<T> {
    
    public int getPrimero();
    
    public int getProx();

    public boolean poneEnCola(TNodoColaCircular<T> nodo);
    
    public TNodoColaCircular<T> quitarDeCola();
    
    public boolean esVacia();
    
    public TNodoColaCircular<T> getPrimerNodo();
    
    public int largoCola();
    
    public boolean estaLlenaCola();
    
   
}
