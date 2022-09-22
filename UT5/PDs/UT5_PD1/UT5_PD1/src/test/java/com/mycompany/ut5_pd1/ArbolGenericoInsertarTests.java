/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ut5_pd1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Martin
 */
public class ArbolGenericoInsertarTests {

    ArbolGenerico<Comparable> arbolPruebas;
    
    @BeforeEach
    public void setUp() {
        arbolPruebas = new ArbolGenerico<>();
    }

    @Test
    public void testInsertarEnArbolNuloSinEtiquetaPadre() {
        arbolPruebas.insertar("unElemento", "");
        NodoArbolGenerico<Comparable> resultado = arbolPruebas.buscar("unElemento");
        
        assertTrue(arbolPruebas.esRaizDelArbol(resultado));
    }
    
    @Test
    public void testInsertarEnArbolNuloConEtiquetaPadre() {
        arbolPruebas.insertar("unElemento", "otroElemento");
        NodoArbolGenerico<Comparable> resultado = arbolPruebas.buscar("unElemento");
        
        assertNull(resultado);
    }
    
    @Test
    public void testInsertarEnArbolSinEtiquetaPadre() {
        arbolPruebas.insertar("Rectoria", "");
        arbolPruebas.insertar("Vicerectoria del medio universitario", "Rectoria");
        arbolPruebas.insertar("Vicerectoria academica", "Rectoria");
        arbolPruebas.insertar("Vicerectoria administrativa", "");
        
        NodoArbolGenerico<Comparable> resultado = arbolPruebas.buscar("Vicerectoria administrativa");
        NodoArbolGenerico<Comparable> resultado2 = arbolPruebas.buscar("Vicerectoria academica");
        
        assertTrue(arbolPruebas.esRaizDelArbol(resultado));
        // Probamos que el arbol no se rompe al cambiar la raiz.
        assertEquals("Vicerectoria academica", resultado2.getEtiqueta());
    }
    
    @Test
    public void testInsertarEnArbolConEtiquetaPadreExistente() {
        arbolPruebas.insertar("Rectoria", "");
        
        arbolPruebas.insertar("Vicerectoria del medio universitario", "Rectoria");
        arbolPruebas.insertar("Vicerectoria academica", "Rectoria");
        arbolPruebas.insertar("Vicerectoria administrativa", "Rectoria");
        
        Comparable[] expected = {"Vicerectoria del medio universitario", "Vicerectoria academica", "Vicerectoria administrativa"};
        Comparable[] actual = new Comparable[3];
        
        NodoArbolGenerico<Comparable> raiz = arbolPruebas.buscar("Rectoria");
        NodoArbolGenerico<Comparable> nodoActual = raiz.getPrimerHijo();
        int contador = 0;
        while (nodoActual != null) {
            actual[contador] = nodoActual.getEtiqueta();
            nodoActual = nodoActual.getSiguienteHermano();
            contador++;
        }
        
        for (int i = 0; i < 3; i++) {
            assertTrue(expected[i].equals(actual[i]));
        }
    }
    
    @Test
    public void testInsertarEnArbolConEtiquetaPadreInexistente() {
        arbolPruebas.insertar("Rectoria", "");
        
        arbolPruebas.insertar("Vicerectoria del medio universitario", "Bedelia");
        arbolPruebas.insertar("Vicerectoria academica", "Bedelia");
        arbolPruebas.insertar("Vicerectoria administrativa", "Bedelia");
        NodoArbolGenerico<Comparable> raiz = arbolPruebas.buscar("Rectoria");
        NodoArbolGenerico<Comparable> nodoActual = raiz.getPrimerHijo();
        
        assertNull(nodoActual);
    }
    
}
