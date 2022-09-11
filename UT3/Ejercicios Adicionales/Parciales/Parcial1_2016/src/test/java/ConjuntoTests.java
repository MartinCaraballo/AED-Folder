/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.parcial1_2016.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Martin
 */
public class ConjuntoTests {
    
    IConjunto<Integer> unConjunto;
    IConjunto<Integer> otroConjunto;
    
    @BeforeEach
    public void setUp() {
        unConjunto = new Conjunto<>();
        otroConjunto = new Conjunto<>();
        unConjunto.insertar(new Nodo<Integer>(1, 1));
        unConjunto.insertar(new Nodo<Integer>(2, 2));
        unConjunto.insertar(new Nodo<Integer>(4, 4));
        unConjunto.insertar(new Nodo<Integer>(5, 5));
        unConjunto.insertar(new Nodo<Integer>(8, 8));
        unConjunto.insertar(new Nodo<Integer>(9, 9));
        
        otroConjunto.insertar(new Nodo<Integer>(2, 2));
        otroConjunto.insertar(new Nodo<Integer>(3, 3));
        otroConjunto.insertar(new Nodo<Integer>(6, 6));
        otroConjunto.insertar(new Nodo<Integer>(7, 7));
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void diferenciaSimetricaTest() {
        IConjunto conjuntoResultado = unConjunto.diferenciaSimetrica(otroConjunto);
        int contadorResultadosCorrectos = 0;
        int[] expected = {1, 3, 4, 5, 6, 7, 8, 9};
        int contador = 0;
        Nodo<Integer> nodoActual = conjuntoResultado.getPrimero();
        while (nodoActual != null && contador < expected.length) {
            if (nodoActual.getDato().equals(expected[contador])) {
                contadorResultadosCorrectos++;
            }
            nodoActual = nodoActual.getSiguiente();
            contador++;
        }
        assertTrue(contadorResultadosCorrectos == expected.length);
    }
}
