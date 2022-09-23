/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.ut5_pd3.TArbolTrie;
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
public class AgregarTests {
    
    TArbolTrie arbolPruebas;
    
    @BeforeEach
    public void setUp() {
        arbolPruebas = new TArbolTrie();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void agregarArbolNuloTest() {
        String palabra = "palabra";
        arbolPruebas.insertar(palabra, 1);
        String expected = "Indice:\npalabra | Páginas: [1]\n";
        String actual = arbolPruebas.imprimirIndice();
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void agregarArbolTest() {
        arbolPruebas.insertar("palabra" , 1);
        arbolPruebas.insertar("otrapalabra" , 2);
        arbolPruebas.insertar("otraotrapalabra" , 3);
        arbolPruebas.insertar("otraspalabras" , 4);
        String expected = "Indice:\npalabra | Páginas: [1]\notrapalabra | Páginas: [2]\notraotrapalabra | Páginas: [3]\notraspalabras | Páginas: [4]\n";
    }
}
