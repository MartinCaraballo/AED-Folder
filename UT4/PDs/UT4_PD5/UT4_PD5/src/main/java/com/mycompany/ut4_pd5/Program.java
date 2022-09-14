/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ut4_pd5;

/**
 *
 * @author Martin
 */
public class Program {

    public static void main(String[] args) {
        TArbolBB<Integer> arbol = new TArbolBB<>();
        TElementoAB<Integer> elemento0 = new TElementoAB<>(10, 10);
        TElementoAB<Integer> elemento1 = new TElementoAB<>(15, 15);
        TElementoAB<Integer> elemento2 = new TElementoAB<>(12, 12);
        TElementoAB<Integer> elemento3 = new TElementoAB<>(8, 8);
        TElementoAB<Integer> elemento4 = new TElementoAB<>(4, 4);
        TElementoAB<Integer> elemento5 = new TElementoAB<>(6, 6);
        TElementoAB<Integer> elemento6 = new TElementoAB<>(9, 9);
        arbol.insertar(elemento0);
        arbol.insertar(elemento1);
        arbol.insertar(elemento2);
        arbol.insertar(elemento3);
        arbol.insertar(elemento4);
        arbol.insertar(elemento5);
        arbol.insertar(elemento6);
        System.out.println("Menor clave: " + arbol.obtenerMenorClave());
        System.out.println("Mayor clave: " + arbol.obtenerMayorClave());
        System.out.println("Obtener clave inmediata (6): " + arbol.obtenerClaveAnterior(6));
        System.out.println("Cantidad de nodos al nivel 2: " + arbol.obtenerCantNodosNivel(2));
        System.out.println("Listado de Hojas:");
        arbol.listarHojas();
        System.out.println("¿Es un árbol de búsqueda?: " + arbol.verificarArbol());
        
        
        
    }
}
