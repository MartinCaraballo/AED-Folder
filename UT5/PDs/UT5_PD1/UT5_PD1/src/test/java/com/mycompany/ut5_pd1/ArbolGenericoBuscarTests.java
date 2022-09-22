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
public class ArbolGenericoBuscarTests {
    
    ArbolGenerico<Comparable> arbolPruebas;
    
    @BeforeEach
    public void setUp() {
        arbolPruebas = new ArbolGenerico<>();
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testBuscarArbolNulo() {
        NodoArbolGenerico<Comparable> resultado = arbolPruebas.buscar("algo");
        
        assertNull(resultado);
    }
    
    @Test
    public void testBuscarArbolEtiquetaExistente() {
        Comparable etiquetaToInsertar = "unElemento";
        arbolPruebas.insertar(etiquetaToInsertar, "");
        NodoArbolGenerico<Comparable> resultado = arbolPruebas.buscar("unElemento");
        
        assertEquals(etiquetaToInsertar, resultado.getEtiqueta()); 
    }
    
    @Test
    public void testbuscarArbolEtiquetaInexistente() {
        Comparable etiquetaToInsertar = "unElemento";
        arbolPruebas.insertar(etiquetaToInsertar, "");
        NodoArbolGenerico<Comparable> resultado = arbolPruebas.buscar("otroElemento");
        
        assertNull(resultado);
    }
    
    @Test
    public void testBuscarArbolVariosElementosEtiquetaExistente() {
        arbolPruebas.insertar("Rectoria", "");
        arbolPruebas.insertar("Vicerectoria del medio universitario", "Rectoria");
        arbolPruebas.insertar("Vicerectoria academica", "Rectoria");
        arbolPruebas.insertar("Vicerectoria administrativa", "Rectoria");
        
        NodoArbolGenerico<Comparable> resultado = arbolPruebas.buscar("Vicerectoria academica");
        assertEquals("Vicerectoria academica", resultado.getEtiqueta());
    }
    
    @Test
    public void testBuscarArbolVariosElementosEtiquetaInexistente() {
        arbolPruebas.insertar("Rectoria", "");
        arbolPruebas.insertar("Vicerectoria del medio universitario", "Rectoria");
        arbolPruebas.insertar("Vicerectoria academica", "Rectoria");
        arbolPruebas.insertar("Vicerectoria administrativa", "Rectoria");
        
        NodoArbolGenerico<Comparable> resultado = arbolPruebas.buscar("Asuntos Estudiantiles");
        assertNull(resultado);
    }
}
