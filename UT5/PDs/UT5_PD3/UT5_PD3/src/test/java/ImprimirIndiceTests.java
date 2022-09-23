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
public class ImprimirIndiceTests {

    TArbolTrie arbolPruebas;

    @BeforeEach
    public void setUp() {
        arbolPruebas = new TArbolTrie();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void indiceNingunElementoTest() {
        String expected = "No hay palabras insertadas.";
        String actual = arbolPruebas.imprimirIndice();

        assertEquals(expected, actual);
    }

    @Test
    public void indiceUnElementoTest() {
        arbolPruebas.insertar("palabraprueba", 1);

        String expected = "Indice:\npalabraprueba | Páginas: [1]\n";
        String actual = arbolPruebas.imprimirIndice();

        assertEquals(expected, actual);
    }

    @Test
    public void indiceVariosElementosTest() {
        arbolPruebas.insertar("palabra", 1);
        arbolPruebas.insertar("otrapalabra", 1);
        arbolPruebas.insertar("elemento", 2);
        arbolPruebas.insertar("otroelemento", 2);
        arbolPruebas.insertar("algo", 3);
        arbolPruebas.insertar("coso", 3);

        String expected = """
                          Indice:
                          algo | Páginas: [3]
                          coso | Páginas: [3]
                          elemento | Páginas: [2]
                          otrapalabra | Páginas: [1]
                          otroelemento | Páginas: [2]
                          palabra | Páginas: [1]
                          """;

        String actual = arbolPruebas.imprimirIndice();

        assertEquals(expected, actual);
    }
}
