/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
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
public class ListarContactosTest {

    TGrafoNoDirigido grafoPruebas;

    public ListarContactosTest() {
    }

    @Before
    public void setUp() {
        grafoPruebas = UtilGrafos.cargarGrafo("src/actores.txt", "src/en_pelicula.txt", false, TGrafoNoDirigido.class);
    }

    /**
     * Test of listarContactos method, of class TVertice.
     */
    @Test
    public void testListarContactosActorInexistente() {
        Collection<TVertice> resultado = grafoPruebas.listarContactos("lolo", 12);

        assertNull(resultado);
    }

    @Test
    public void testListarContactosActorExistenteUnSalto() {
        Collection<TVertice> resultado = grafoPruebas.listarContactos("Robert_Niro", 1);
        
        List<String> expected = List.of("Orlando_Bloom", "Michael_Peña", "Anthony_Daniels", "Lukas_Haas");
        
        int resultadosCorrectos = 0;
        
        for (TVertice vertice : resultado) {
            if (expected.contains(vertice.getEtiqueta().toString())) {
                resultadosCorrectos++;
            }
        }
        
        assertEquals(resultadosCorrectos, resultado.size());

    }
    
    @Test
    public void testListarContactosActorExistente() {
        Collection<TVertice> resultado = grafoPruebas.listarContactos("Robert_Niro", 1);
        
        List<String> expected = List.of("Orlando_Bloom", "Michael_Peña", "Anthony_Daniels", "Lukas_Haas",
                "Cate_Blanchett", "Christopher_Lee", "Keira_Knightley", "Geoffrey_Rush", "Robin_Wright",
                "Kevin_Bacon", "Carrie_Fisher", "Carrie-Anne_Moss", "Djimon_Hounsou");
        
        int resultadosCorrectos = 0;
        
        for (TVertice vertice : resultado) {
            if (expected.contains(vertice.getEtiqueta().toString())) {
                resultadosCorrectos++;
            }
        }
        
        assertEquals(resultadosCorrectos, resultado.size());
    }

}
