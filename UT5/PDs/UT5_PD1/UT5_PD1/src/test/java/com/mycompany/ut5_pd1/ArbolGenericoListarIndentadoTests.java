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
public class ArbolGenericoListarIndentadoTests {
    
    ArbolGenerico<Comparable> arbolPruebas;
    
    @BeforeEach
    public void setUp() {
        arbolPruebas = new ArbolGenerico<>();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testListarIndentadoArbolNulo() {
        String resultado = arbolPruebas.listarIndentado();
        
        assertEquals("El arbol no tiene elementos.", resultado);
    }
    
    @Test
    public void testListarIndentadoElementoArbol() {
        arbolPruebas.insertar("unElemento", "");
        String resultado = arbolPruebas.listarIndentado();
        
        assertEquals("unElemento\n", resultado);
    }
    
    @Test
    public void testListarIndentadoElementosArbol() {
        arbolPruebas.insertar("unElemento", "");
        arbolPruebas.insertar("otroElemento1", "unElemento");
        arbolPruebas.insertar("otroElemento2", "unElemento");
        arbolPruebas.insertar("otroElemento3", "unElemento");
        arbolPruebas.insertar("elementoFinal", "otroElemento3");
        arbolPruebas.insertar("elementoFinalFinal", "elementoFinal");
        String resultado = arbolPruebas.listarIndentado();
        
        String expected = "unElemento\n\totroElemento1\n\totroElemento2\n\totroElemento3\n\t\telementoFinal\n\t\t\telementoFinalFinal\n";
        
        assertEquals(expected, resultado);
        
    }
}
