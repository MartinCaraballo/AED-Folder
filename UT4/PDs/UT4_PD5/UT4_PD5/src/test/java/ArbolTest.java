/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.ut4_pd5.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Martin
 */
public class ArbolTest {
    
    TArbolBB<Integer> arbol;
    
    @BeforeEach
    public void setUp() {
        arbol = new TArbolBB<>();
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
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void menorClaveTest() {
        Comparable menorClave = arbol.obtenerMenorClave();
        assertEquals(4, menorClave);
    }
    
    @Test
    public void mayorClaveTest() {
        Comparable mayorClave = arbol.obtenerMayorClave();
        assertEquals(4, mayorClave);
    }
    
    @Test
    public void claveInmediataAnteriorTest() {
        Comparable claveInmediataAnterior = arbol.obtenerClaveAnterior(9);
        assertEquals(8, claveInmediataAnterior);
    }
    
    @Test
    public void cantNodosEnNivelTest() {
        int cantNodosNivel2 = arbol.obtenerCantNodosNivel(2);
        assertEquals(3, cantNodosNivel2);
    }
    
    @Test
    public void esBinarioTest() {
        boolean esBinario = arbol.verificarArbol();
        assertTrue(esBinario);
    }
}
