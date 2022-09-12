/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.parcial1_2015;

/**
 *
 * @author Martin
 */
public class Parcial1 {

    public static void main(String[] args) {
        ListaOrdenada<Integer> unaListaOrdenada = new ListaOrdenada<>();
        ListaOrdenada<Integer> otraListaOrdenada = new ListaOrdenada<>();
        
        unaListaOrdenada.insertar(new Nodo<Integer>(1,1));
        unaListaOrdenada.insertar(new Nodo<Integer>(2,2));
        unaListaOrdenada.insertar(new Nodo<Integer>(4,4));
        unaListaOrdenada.insertar(new Nodo<Integer>(5,5));
        unaListaOrdenada.insertar(new Nodo<Integer>(8,8));
        unaListaOrdenada.insertar(new Nodo<Integer>(9,9));
        
        otraListaOrdenada.insertar(new Nodo<Integer>(2, 2));
        otraListaOrdenada.insertar(new Nodo<Integer>(3, 3));
        otraListaOrdenada.insertar(new Nodo<Integer>(6, 6));
        otraListaOrdenada.insertar(new Nodo<Integer>(7, 7));
        
        ListaOrdenada<Integer> resultadoListaOrdenada = unaListaOrdenada.mezclar(otraListaOrdenada);
        System.out.println(unaListaOrdenada.imprimir());
        System.out.println(otraListaOrdenada.imprimir());
        System.out.println(resultadoListaOrdenada.imprimir("-"));
    }
}
