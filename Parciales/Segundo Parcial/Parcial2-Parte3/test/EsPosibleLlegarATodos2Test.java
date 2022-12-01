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
public class EsPosibleLlegarATodos2Test {
    
    TGrafoDirigido gd;
    
    public EsPosibleLlegarATodos2Test() {
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void llegaATodosGrafoNuloTest() {
        gd = new TGrafoDirigido(new LinkedList(), new LinkedList());

        boolean actual = gd.esPosibleLlegarATodos2("PHL");

        assertFalse(actual);
    }

    @Test
    public void llegaATodosGrafoUnVerticeTest() {
        TVertice vert1 = new TVertice("V1");
        Collection<TVertice> vertices = List.of(vert1);
        Collection<TArista> aristas = new LinkedList();

        gd = new TGrafoDirigido(vertices, aristas);

        boolean actual = gd.esPosibleLlegarATodos2("V1");

        assertTrue(actual);

    }

    @Test
    public void llegaATodosGrafoDosVerticesUnoConectadoTest() {
        TVertice vert1 = new TVertice("V1");
        TVertice vert2 = new TVertice("V2");
        Collection<TVertice> vertices = List.of(vert1, vert2);

        TArista arista = new TArista("V1", "V2", 0d);
        Collection<TArista> aristas = List.of(arista);

        gd = new TGrafoDirigido(vertices, aristas);

        boolean actual = gd.esPosibleLlegarATodos2("V1");
        boolean actual2 = gd.esPosibleLlegarATodos2("V2");

        assertTrue(actual);
        assertFalse(actual2);
    }

    @Test
    public void llegaATodosGrafoDosVerticesNoConectadosTest() {
        TVertice vert1 = new TVertice("V1");
        TVertice vert2 = new TVertice("V2");
        Collection<TVertice> vertices = List.of(vert1, vert2);

        gd = new TGrafoDirigido(vertices, new LinkedList());

        boolean actual = gd.esPosibleLlegarATodos2("V1");
        boolean actual2 = gd.esPosibleLlegarATodos2("V2");

        assertFalse(actual);
        assertFalse(actual2);
    }

    @Test
    public void llegaATodosAeropuertoInexistenteTest() {
        gd = UtilGrafos.cargarGrafo("src/aeropuertos.txt", "vuelos.txt", false, TGrafoDirigido.class);

        boolean actual = gd.esPosibleLlegarATodos2("Minas");

        assertFalse(actual);
    }

    @Test
    public void llegaATodosAeropuertoExistente() {
        TVertice vertice1 = new TVertice("V1");
        TVertice vertice2 = new TVertice("V2");
        TVertice vertice3 = new TVertice("V3");
        TVertice vertice4 = new TVertice("V4");
        Collection<TVertice> vertices = List.of(vertice1, vertice2, vertice3, vertice4);
        
        TArista arista1 = new TArista("V1", "V2", 0d);
        TArista arista2 = new TArista("V2", "V3", 0d);
        TArista arista3 = new TArista("V3", "V4", 0d);
        TArista arista4 = new TArista("V1", "V4", 0d);
        Collection<TArista> aristas = List.of(arista1, arista2, arista3, arista4);
        
        gd = new TGrafoDirigido(vertices, aristas);
        
        boolean actual = gd.esPosibleLlegarATodos2("V1");
        boolean actual2 = gd.esPosibleLlegarATodos2("v4");
        
        assertTrue(actual);
        assertFalse(actual2);
        
        
    }
    
    @Test
    public void llegaATodosGrafoTodosConectados() {
        TVertice vertice1 = new TVertice("V1");
        TVertice vertice2 = new TVertice("V2");
        TVertice vertice3 = new TVertice("V3");
        TVertice vertice4 = new TVertice("V4");
        Collection<TVertice> vertices = List.of(vertice1, vertice2, vertice3, vertice4);
        
        TArista arista1 = new TArista("V1", "V2", 0d);
        TArista arista2 = new TArista("V2", "V3", 0d);
        TArista arista3 = new TArista("V3", "V1", 0d);
        TArista arista4 = new TArista("V3", "V4", 0d);
        TArista arista5 = new TArista("V1", "V4", 0d);
        TArista arista6 = new TArista("V4", "V1", 0d);
        Collection<TArista> aristas = List.of(arista1, arista2, arista3, arista4, arista5, arista6);
        
        TGrafoDirigido gd = new TGrafoDirigido(vertices, aristas);
        
        boolean actual = gd.esPosibleLlegarATodos2("V1");
        boolean actual2 = gd.esPosibleLlegarATodos2("V2");
        boolean actual3 = gd.esPosibleLlegarATodos2("V3");
        boolean actual4 = gd.esPosibleLlegarATodos2("V4");
        boolean resultado = actual && actual2 && actual3 && actual4;
        
        assertTrue(resultado);
    }
}
