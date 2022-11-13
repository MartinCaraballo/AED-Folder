/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
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
public class TVerticeTest {
    
    TGrafoContagios grafoPruebas;
    
    public TVerticeTest() {
    }
    
    
    @Before
    public void setUp() {
        grafoPruebas = UtilGrafos.cargarGrafo("src/personas.txt", "src/contactos.txt", false, TGrafoContagios.class);
    }
    

    /**
     * Test of obtenerAnillos method, of class TVertice.
     */
    @Test
    public void testObtenerAnillosPersonaInexistente() {
        TAnillosContagio resultado = grafoPruebas.anillosDeProbablesContagiados("pololo", 15);
        
        assertNull(resultado);
    }
    
    @Test
    public void testObtenerAnillosDistanciaUno() {
        TAnillosContagio resultado = grafoPruebas.anillosDeProbablesContagiados("Kevin_Bacon", 1);
        
        TreeSet<String> contactos = resultado.obtenerAnillo(1);
        
        List<String> expected = List.of("Anthony_Daniels", "Carrie_Fisher", "Harrison_Ford", "Peter_Cushing");
        
        int resultadosCorrectos = 0;
        
        for (String contacto : expected) {
            if (contacto.contains(contacto)) {
                resultadosCorrectos++;
            }
        }
        
        assertEquals(contactos.size(), resultadosCorrectos);
    }
    
    @Test
    public void testObtenerAnillos() {
        
        TAnillosContagio resultado = grafoPruebas.anillosDeProbablesContagiados("Kevin_Bacon", 3);
        
        TreeSet<String> contactos = resultado.obtenerAnillo(2);
        
        List<String> expected = List.of("Bruce_Willis", "Cate_Blanchett", "Elijah_Wood", "Gary_Sinise", "Geoffrey_Rush",
                "Keira_Knightley", "Mykelti_Williamson", "Orlando_Bloom", "Sally_Field", "Tom_Hanks", "Viggo_Mortensen");
        
        int resultadosCorrectos = 0;
        
        for (String contacto : expected) {
            if (contacto.contains(contacto)) {
                resultadosCorrectos++;
            }
        }
        
        assertEquals(contactos.size(), resultadosCorrectos);
        
    }
    
}
