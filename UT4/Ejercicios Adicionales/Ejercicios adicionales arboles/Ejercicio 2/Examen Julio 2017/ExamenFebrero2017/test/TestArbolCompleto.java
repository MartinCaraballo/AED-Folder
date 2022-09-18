/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import examen.TArbolBB;
import examen.TElementoAB;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Martin
 */
public class TestArbolCompleto {
    
    TArbolBB<Integer> arbolPrueba;
    
    @Before
    public void setUp() {
        arbolPrueba = new TArbolBB<>();
        TElementoAB<Integer> elemento1 = new TElementoAB<>(20, 20);
        TElementoAB<Integer> elemento2 = new TElementoAB<>(10, 10);
        TElementoAB<Integer> elemento3 = new TElementoAB<>(8, 8);
        TElementoAB<Integer> elemento4 = new TElementoAB<>(4, 4);
        TElementoAB<Integer> elemento5 = new TElementoAB<>(9, 9);
        TElementoAB<Integer> elemento6 = new TElementoAB<>(12, 12);
        TElementoAB<Integer> elemento7 = new TElementoAB<>(11, 11);
        TElementoAB<Integer> elemento8 = new TElementoAB<>(14, 14);
        TElementoAB<Integer> elemento9 = new TElementoAB<>(40, 40);
        TElementoAB<Integer> elemento10 = new TElementoAB<>(46, 46);
        TElementoAB<Integer> elemento11 = new TElementoAB<>(44, 44);
        TElementoAB<Integer> elemento12 = new TElementoAB<>(48, 48);
        TElementoAB<Integer> elemento13 = new TElementoAB<>(30, 30);
        TElementoAB<Integer> elemento14 = new TElementoAB<>(26, 26);
        TElementoAB<Integer> elemento15 = new TElementoAB<>(36, 36);
        arbolPrueba.insertar(elemento1);
        arbolPrueba.insertar(elemento2);
        arbolPrueba.insertar(elemento3);
        arbolPrueba.insertar(elemento4);
        arbolPrueba.insertar(elemento5);
        arbolPrueba.insertar(elemento6);
        arbolPrueba.insertar(elemento7);
        arbolPrueba.insertar(elemento8);
        arbolPrueba.insertar(elemento9);
        arbolPrueba.insertar(elemento10);
        arbolPrueba.insertar(elemento11);
        arbolPrueba.insertar(elemento12);
        arbolPrueba.insertar(elemento13);
        arbolPrueba.insertar(elemento14);
        arbolPrueba.insertar(elemento15);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void esCompletoTest() {
        boolean resultado = arbolPrueba.esCompleto();
        assertTrue(resultado);
    }
}
