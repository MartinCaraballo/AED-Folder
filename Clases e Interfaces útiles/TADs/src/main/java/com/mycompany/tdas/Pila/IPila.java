/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.tdas;

/**
 *
 * @author juan-
 */
public interface IPila<T> {
    
    public TNodo<T> tope();
    
    public TNodo<T> pop();
    
    public void push(TNodo<T> pNodo);
    
    public boolean isEmpty();
        
    public int cantElementos();
}
