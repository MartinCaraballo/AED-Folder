package TestConjuntos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */


import com.mycompany.ut3_pd12.Alumno;
import com.mycompany.ut3_pd12.Conjunto;
import com.mycompany.ut3_pd12.ManejadorArchivosGenerico;
import com.mycompany.ut3_pd12.Nodo;
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
public class TestInterseccion {
    
    Conjunto<Alumno> clase1;
    Conjunto<Alumno> clase2;
    Conjunto<Alumno> clase3;
    Conjunto<Alumno> clase4;
    

    @BeforeEach
    public void setUp() {
        clase1 = new Conjunto<>();
        clase2 = new Conjunto<>();
        clase4 = new Conjunto<>();
        String[] alumnosClase1 = ManejadorArchivosGenerico.leerArchivo("src/basico-ing.txt");
        for (String alumno : alumnosClase1) {
            String[] alumnoSplitted = alumno.split(",");
            int codigo = Integer.parseInt(alumnoSplitted[0]);
            Nodo<Alumno> nodo = new Nodo(codigo, new Alumno(codigo, alumnoSplitted[1]));
            clase1.insertar(nodo);
        }
        String[] alumnosClase2 = ManejadorArchivosGenerico.leerArchivo("src/basico-emp.txt");
        for (String alumno : alumnosClase2) {
            String[] alumnoSplitted = alumno.split(",");
            int codigo = Integer.parseInt(alumnoSplitted[0]);
            Nodo<Alumno> nodo = new Nodo(codigo, new Alumno(codigo, alumnoSplitted[1]));
            clase2.insertar(nodo);
        }
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testInterseccionAmbosConjuntos() {
        clase3 = clase1.interseccion(clase2);
        int contadorResultados = 0;
        
        Nodo<Alumno> nodoActual = clase3.getPrimero();
        while (nodoActual != null) {
            if (clase1.buscar(nodoActual.getEtiqueta()) != null && clase2.buscar(nodoActual.getEtiqueta()) != null) {
                contadorResultados++;
            }
            nodoActual = nodoActual.getSiguiente();
        }
        
        assertTrue(contadorResultados == clase3.cantElementos());
    }
    
    @Test
    public void testInterseccionUnConjunto() {
        clase4 = clase1.interseccion(new Conjunto<>());
        
        assertTrue(clase4 == clase1);
    }
}
