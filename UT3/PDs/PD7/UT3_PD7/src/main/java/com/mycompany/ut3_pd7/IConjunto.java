/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ut3_pd7;

import com.mycompany.ut3_pd7.Lista.ILista;
import com.mycompany.ut3_pd7.Nodo.Nodo;

/**
 *
 * @author Martin
 */
public interface IConjunto<T> extends ILista<T> {
    public IConjunto<T> union(IConjunto<T> otroConjunto);
    public IConjunto<T> interseccion(IConjunto<T> otroConjunto);
    public Nodo<T> getPrimero();
}
