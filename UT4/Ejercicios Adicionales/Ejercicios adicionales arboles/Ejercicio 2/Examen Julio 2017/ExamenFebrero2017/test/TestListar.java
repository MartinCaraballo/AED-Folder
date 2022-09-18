/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import examen.TArbolBB;
import examen.TElementoAB;
import java.util.ArrayList;
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
public class TestListar {
    
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
        arbolPrueba.insertar(elemento1);
        arbolPrueba.insertar(elemento2);
        arbolPrueba.insertar(elemento3);
        arbolPrueba.insertar(elemento4);
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void listarElementosArbolTest() {
        ArrayList<Integer> listado = arbolPrueba.listar();
        assertTrue(listado.contains(elemento1.getDatos()));
        assertTrue(listado.contains(elemento2.getDatos()));
        assertTrue(listado.contains(elemento3.getDatos()));
        assertTrue(listado.contains(elemento4.getDatos()));
    }
}
