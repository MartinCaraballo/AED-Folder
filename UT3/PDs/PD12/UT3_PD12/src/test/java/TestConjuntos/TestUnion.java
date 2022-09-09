package TestConjuntos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */


import com.mycompany.ut3_pd12.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Martin
 */
public class TestUnion {
    
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
    public void testUnionAmbosConjuntos() {
        clase3 = clase1.union(clase2);
        int resultadoContador = 0;
        // Clase 3 debe contener todos los elementos de clase 1 y clase 2.
        Nodo<Alumno> nodo = clase3.getPrimero();
        while (nodo != null) {
            if (clase1.buscar(nodo.getEtiqueta()) != null) {
                resultadoContador++;
            }
            if (clase2.buscar(nodo.getEtiqueta()) != null) {
                resultadoContador++;
            }
            nodo = nodo.getSiguiente();
        }
        
        assertTrue(resultadoContador == clase3.cantElementos());
        
    }
    
    @Test
    public void testUnionUnConjunto() {
        clase4 = clase1.union(new Conjunto<Alumno>());
        assertTrue(clase4 == clase1);        
    }
}
