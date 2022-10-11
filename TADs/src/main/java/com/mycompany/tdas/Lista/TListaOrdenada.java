/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tdas;

/**
 *
 * @author juan- Ordenado por Etiqueta
 */
public class TListaOrdenada<T> extends TLista implements ILista {

    @Override
    public void insertar(TNodo nodo) {
        if (esVacia()) {
            this.primero = nodo;
        } else {
            TNodo aux = this.primero;
            TNodo auxSig = aux.getSiguiente();
            //Lo meto al principio
            if (aux.getEtiqueta().compareTo(nodo.getEtiqueta()) > 0) {
                nodo.setSiguiente(aux);
                this.primero = nodo;
            } else {
                //Lo busco en el resto de la lista
                while (auxSig != null && auxSig.getEtiqueta().compareTo(nodo.getEtiqueta()) < 0) {
                    aux = auxSig;
                    auxSig = auxSig.getSiguiente();
                }
                //Lo meto en la lista entre aux y auxSig
                aux.setSiguiente(nodo);
                nodo.setSiguiente(auxSig);
            }
        }
    }
}
