/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tdas;
/**
 *
 * @author juan-
 */
public class TCola<T> implements ICola {
    
    protected TNodo<T> frente;
    protected TNodo<T> ultimo;
    
    public void TCola()
    {
        this.frente = null;
        this.ultimo = null;
    }
    
            
    @Override
    public TNodo<T> getFrente() {
        return frente;
    }
    
    @Override
    public TNodo getUltimo() {
        return ultimo;
    }
    
    @Override
    public boolean poneEnCola(TNodo nodo) {
        if(esVacia())
        {
            ultimo = nodo;
            frente = nodo;
        }
        else
        {
            ultimo.setSiguiente(nodo);
            ultimo=nodo;
        }
        return true;
    }

    @Override
    public TNodo quitarDeCola() {
        TNodo aux = null;
        if(!esVacia())
        {
            aux = frente;
            frente = frente.getSiguiente();
        }
        return aux;
    } 
    
    @Override
    public boolean esVacia()
    {
        return frente == null;
    }
    
    @Override
    public int cantElementos()
    {
        int cantElementos =0;
        if(!esVacia())
        {
            TNodo<T> aux = this.getFrente();
            while(aux != null){
                aux = aux.getSiguiente();
                cantElementos++;
            }
        }
        return cantElementos;
    }


    
}
