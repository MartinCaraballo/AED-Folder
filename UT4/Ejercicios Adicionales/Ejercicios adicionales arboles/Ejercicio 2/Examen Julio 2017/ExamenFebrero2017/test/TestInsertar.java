/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import examen.TArbolBB;
import examen.TElementoAB;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Martin
 */
public class TestInsertar {
     
    TArbolBB<Integer> arbolPrueba;
    TElementoAB<Integer> elemento1;
    TElementoAB<Integer> elemento2;
    TElementoAB<Integer> elemento3;
    TElementoAB<Integer> elemento4;
    
    @Before
    public void setUp() {
        arbolPrueba = new TArbolBB<>();
        elemento1 = new TElementoAB<>(20, 20);
        elemento2 = new TElementoAB<>(10, 10);
        elemento3 = new TElementoAB<>(15, 15);
        elemento4 = new TElementoAB<>(30, 30);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void insertarEnArbolNuloTest() {
        arbolPrueba.insertar(elemento1);
        assertEquals(elemento1, arbolPrueba.getRaiz());
    }
    
    @Test
    public void insertarEnArbolNoNuloTest() {
        arbolPrueba.insertar(elemento1);
        arbolPrueba.insertar(elemento2);
        arbolPrueba.insertar(elemento3);
        arbolPrueba.insertar(elemento4);
        assertEquals(elemento1, arbolPrueba.getRaiz());
        assertEquals(elemento2, arbolPrueba.getRaiz().getHijoIzq());
        assertEquals(elemento3, arbolPrueba.getRaiz().getHijoIzq().getHijoDer());
        assertEquals(elemento4, arbolPrueba.getRaiz().getHijoDer());
    }
}
