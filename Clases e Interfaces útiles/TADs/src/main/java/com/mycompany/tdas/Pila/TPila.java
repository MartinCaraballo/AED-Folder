package com.mycompany.tdas;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juan-
 */
public class TPila<T> implements IPila{
   
    protected TNodo<T> tope;
    
    public void TPila()
    {
        
    }
    
    @Override
    public TNodo<T> tope() {
        return this.tope;
    }

    @Override
    public TNodo<T> pop() {
        TNodo<T> aux= null;
        if(!isEmpty())
        {
            aux = tope;
            tope = tope.getSiguiente();
        }
        return aux;
    }

    @Override
    public void push(TNodo pNodo) {
       if(isEmpty())
       {
           tope = pNodo;
           pNodo.setSiguiente(null);
       }
       else
       {
           pNodo.setSiguiente(tope);
           tope= pNodo;
       }
    }

    @Override
    public boolean isEmpty() {
        return tope == null;
    }

    @Override
    public int cantElementos()
    {
        int cantElementos =0;
        TNodo<T> aux = this.tope();
        while(aux != null)
        {
            aux= aux.getSiguiente();
            cantElementos++;
        }
        return cantElementos;
    }
    

    
}
