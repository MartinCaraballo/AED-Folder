/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.parcial1_2016;

/**
 *
 * @author Martin
 */
public class Parcial1 {

    public static void main(String[] args) {
        IConjunto<Integer> unConjunto = new Conjunto<>();
        IConjunto<Integer> otroConjunto = new Conjunto<>();
        
        unConjunto.insertar(new Nodo<Integer>(1, 1));
        unConjunto.insertar(new Nodo<Integer>(2, 2));
        unConjunto.insertar(new Nodo<Integer>(4, 4));
        unConjunto.insertar(new Nodo<Integer>(5, 5));
        unConjunto.insertar(new Nodo<Integer>(8, 8));
        unConjunto.insertar(new Nodo<Integer>(9, 9));
        
        otroConjunto.insertar(new Nodo<Integer>(2, 2));
        otroConjunto.insertar(new Nodo<Integer>(3, 3));
        otroConjunto.insertar(new Nodo<Integer>(6, 6));
        otroConjunto.insertar(new Nodo<Integer>(7, 7));
        
        IConjunto conjuntoResultado = unConjunto.diferenciaSimetrica(otroConjunto);
        System.out.println(conjuntoResultado.imprimir("-"));
        
    }
}
