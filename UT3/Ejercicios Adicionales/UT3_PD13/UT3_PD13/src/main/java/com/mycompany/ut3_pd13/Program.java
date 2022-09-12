/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ut3_pd13;

import java.util.Stack;

/**
 *
 * @author Martin
 */
public class Program {

    public static void main(String[] args) {
        Pila pila = new Pila();
        System.out.println("PILA:");
        for (int i = 0; i <= 5; i++) {
            Nodo<Integer> nodo = new Nodo(i, i);
            pila.insertar(nodo);
        }
        System.out.println(pila.imprimir("-"));
        System.out.println("POP:" + pila.pop().getDato());
        System.out.println(pila.imprimir("-"));
        
        Cola cola = new Cola();
        System.out.println("\nCOLA:");
        for (int i = 0; i <= 5; i++) {
            Nodo<Integer> nodo = new Nodo(i, i);
            cola.insertar(nodo);
        }
        System.out.println(cola.imprimir("-"));
        System.out.println("POP:" + cola.pop().getDato());
        System.out.println(cola.imprimir("-"));
        
    }
}
