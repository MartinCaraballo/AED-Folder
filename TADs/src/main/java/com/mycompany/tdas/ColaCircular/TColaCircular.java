/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tdas;
/**
 *
 * @author juan-
 */
public class TColaCircular<T> implements IColaCircular {

    public TNodoColaCircular<T>[] cola;
    public int primero = 0;
    public int prox = 0;

    public TColaCircular(int largo)
    {
        cola = new TNodoColaCircular[largo];
    }
    
    @Override
    public int getPrimero() {
        return this.primero;
    }

    @Override
    public int getProx() {
        return this.prox;
    }
    
    @Override
    public boolean poneEnCola(TNodoColaCircular nodo) {
        if (estaLlenaCola()) {
            return false;
        } else {
            cola[this.prox] = nodo;
            this.prox++;
            if (this.prox == this.largoCola()) {
                this.prox = 0;
            }
        }
        return true;
    }

    @Override
    public TNodoColaCircular quitarDeCola() {
        TNodoColaCircular<T> eliminado = null;
        if (!esVacia()) {
            eliminado = cola[this.primero];
            cola[this.primero] = null;
            this.primero++;
            if (this.primero == this.largoCola()) {
                this.primero = 0;
            }
        }
        return eliminado;
    }

    @Override
    public boolean esVacia() {
        if (this.primero == this.prox && cola[this.primero] == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public TNodoColaCircular getPrimerNodo() {
        return cola[this.primero];
    }

    @Override
    public int largoCola() {
        return this.cola.length;
    }

    @Override
    public boolean estaLlenaCola() {
        if (this.primero == this.prox && cola[primero] != null) {
            return true;
        } else {
            return false;
        }
    }

}
