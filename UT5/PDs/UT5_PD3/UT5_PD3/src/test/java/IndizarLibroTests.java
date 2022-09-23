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
public class IndizarLibroTests {
    
    TArbolTrie arbolPrueba;
    
    @BeforeEach
    public void setUp() {
        arbolPrueba = new TArbolTrie();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void indizarLibroTest() {
        // cargamos un pequeño texto con pocas palabras
        arbolPrueba.indizarLibro("src/indizarLibroTest.txt");
        
        String expected = """
                          Indice:
                          comercializada | Páginas: [1]
                          de | Páginas: [1]
                          es | Páginas: [1]
                          fue | Páginas: [1]
                          informatica | Páginas: [1]
                          java | Páginas: [1]
                          lenguaje | Páginas: [1]
                          microsystems | Páginas: [1]
                          plataforma | Páginas: [1]
                          por | Páginas: [1]
                          programacion | Páginas: [1]
                          que | Páginas: [1]
                          sun | Páginas: [1]
                          un | Páginas: [1]
                          una | Páginas: [1]
                          y | Páginas: [1]
                          """;
        
        String actual = arbolPrueba.imprimirIndice();
        
        assertEquals(expected, actual);
    }
}
