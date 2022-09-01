/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ut3_pd3;

/**
 *
 * @author Martin
 */
public class Program {

    public static void main(String[] args) {
        Nodo<Integer> nodo1 = new Nodo<Integer>("1", 1);
        Nodo<Integer> nodo2 = new Nodo<Integer>("2", 2);
        Nodo<Integer> nodo3 = new Nodo<Integer>("3", 3);
        Nodo<Integer> nodo4 = new Nodo<Integer>("4", 4);

        Lista<Integer> lista = new Lista<>();
        lista.insertar(nodo1);
        lista.insertar(nodo2);
        lista.insertar(nodo3);
        lista.insertar(nodo4);

        System.out.println("Los elementos de la lista son: " + lista.imprimir());
        System.out.println("Resultado de buscar \"2\": " + lista.buscar("2").getEtiqueta());

        Lista<Integer> lista2 = new Lista<>();
        nodo1 = new Nodo<Integer>("1", 1);
        nodo2 = new Nodo<Integer>("2", 2);
        nodo3 = new Nodo<Integer>("3", 3);
        nodo4 = new Nodo<Integer>("4", 4);

        lista2.setPrimero(nodo4);
        System.out.println("\nLos elementos de la lista2 son: " + lista2.imprimir());
        lista2.insertar(nodo1);
        lista2.insertar(nodo2);
        lista2.insertar(nodo3);
        System.out.println("Los elementos de la lista2 son: " + lista2.imprimir());

        System.out.println("Buscar 4 en lista2: " + lista2.buscar("4").getEtiqueta());
        System.out.println("Largo de la lista 2: " + lista2.cantElementos());
        System.out.println("Los elementos de la lista2 son: " + lista2.imprimir());
        System.out.println("Eliminar 2: " + lista2.eliminar("2"));
        System.out.println("Los elementos de la lista2 son: " + lista2.imprimir());
        System.out.println("Largo de la lista2: " + lista2.cantElementos());

    }
}
