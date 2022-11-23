/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ut9_pd1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static ut9_pd1.TClasificador.METODO_CLASIFICACION_BURBUJA;
import static ut9_pd1.TClasificador.METODO_CLASIFICACION_INSERCION;
import static ut9_pd1.TClasificador.METODO_CLASIFICACION_QUICKSORT;
import static ut9_pd1.TClasificador.METODO_CLASIFICACION_SHELL;
import static ut9_pd1.TClasificador.METODO_CLASIFICACION_HEAPSORT;
import static ut9_pd1.TClasificador.METODO_CLASIFICACION_SELECCION;

/**
 *
 * @author Martin
 */
public class TClasificadorTest {

    TClasificador clasificador;
    int[] pruebas;

    public TClasificadorTest() {
    }

    @Before
    public void setUp() {
        clasificador = new TClasificador();
    }

    /**
     * Test of ordenarPorInsercion method, of class TClasificador.
     */
    @Test
    public void testOrdenarPorInsercion() {
        int[] prueba = {99, 2323, 43434, 4, 1, 123213, 0, 5};

        clasificador.clasificar(prueba, METODO_CLASIFICACION_INSERCION);
        boolean actual = clasificador.estaOrdenado(prueba);

        assertTrue(actual);
    }

    @Test
    public void testOrdenarPorBurbuja() {
        int[] prueba = {99, 2323, 43434, 4, 1, 123213, 0, 5};

        clasificador.clasificar(prueba, METODO_CLASIFICACION_BURBUJA);
        boolean actual = clasificador.estaOrdenado(prueba);

        assertTrue(actual);
    }

    @Test
    public void testOrdenarPorShell() {
        int[] prueba = {99, 2323, 43434, 4, 1, 123213, 0, 5};

        clasificador.clasificar(prueba, METODO_CLASIFICACION_SHELL);
        boolean actual = clasificador.estaOrdenado(prueba);

        assertTrue(actual);
    }

    @Test
    public void testOrdenarPorHeapSort() {
        int[] prueba = {99, 2323, 43434, 4, 1, 123213, 0, 5};

        clasificador.clasificar(prueba, METODO_CLASIFICACION_HEAPSORT);
        boolean actual = clasificador.estaOrdenado(prueba);

        assertTrue(actual);
    }

    @Test
    public void testOrdenarPorSeleccionDirecta() {
        int[] prueba = {99, 2323, 43434, 4, 1, 123213, 0, 5};
        
        clasificador.clasificar(prueba, METODO_CLASIFICACION_SELECCION);
        boolean actual = clasificador.estaOrdenado(prueba);
        
        assertTrue(actual);
    }

    /**
     * Test of estaOrdenado method, of class TClasificador.
     */
    @Test
    public void testEstaOrdenadoVectorVacio() {
        pruebas = new int[0];

        boolean actual = clasificador.estaOrdenado(pruebas);

        assertTrue(actual);
    }

    @Test
    public void testEstaOrdenadoVectorUnElemento() {
        pruebas = new int[1];

        pruebas[0] = 4;

        boolean actual = clasificador.estaOrdenado(pruebas);

        assertTrue(actual);
    }

    @Test
    public void testNoEstaOrdenado() {
        int[] prueba = {8, 1, 19, 6, 99, 0};

        boolean actual = clasificador.estaOrdenado(prueba);

        assertFalse(actual);
    }

    @Test
    public void testEstaOrdenadoVectorVariosElementos() {
        int[] prueba = {99, 2323, 43434, 4, 1, 123213, 0, 5};

        int[] actual = clasificador.clasificar(prueba, METODO_CLASIFICACION_INSERCION);
        
        int[] expected = {0, 1, 4, 5, 99, 2323, 43434, 123213};
        
        boolean estaOrdenado = clasificador.estaOrdenado(prueba);

        Assert.assertArrayEquals(expected, actual);
        
        assertTrue(estaOrdenado);
    }

    /**
     * Test of ordenarPorQuickSort method, of class TClasificador.
     */
    @Test
    public void testOrdenarPorQuickSort() {
        int[] prueba = {99, 2323, 43434, 4, 1, 123213, 0, 5};

        clasificador.clasificar(prueba, METODO_CLASIFICACION_QUICKSORT);
        boolean actual = clasificador.estaOrdenado(prueba);

        assertTrue(actual);
    }

}
