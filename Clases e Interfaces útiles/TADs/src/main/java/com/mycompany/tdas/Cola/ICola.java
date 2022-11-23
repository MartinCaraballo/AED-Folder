/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.tdas;

/**
 *
 * @author juan-
 */
public interface ICola<T>{
    
    public TNodo<T> getFrente();
    
    public TNodo<T> getUltimo();

    public boolean poneEnCola(TNodo<T> nodo);
    
    public TNodo<T> quitarDeCola();
    
    public boolean esVacia(); 
    
    public int cantElementos();
    
}
