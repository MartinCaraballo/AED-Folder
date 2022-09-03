/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.ut3_pd7.Alumno;
import com.mycompany.ut3_pd7.Clase;
import com.mycompany.ut3_pd7.Conjunto;
import com.mycompany.ut3_pd7.IConjunto;
import com.mycompany.ut3_pd7.Nodo.Nodo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Martin
 */
public class TestUnion {
   
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    @Test
    public void unionTest() {
        Conjunto<Alumno> aedI = new Conjunto<>();
        Conjunto<Alumno> pf = new Conjunto<>();
        
        Alumno jhonDoe = new Alumno("1234", "jhon", "Doe");
        Alumno juanGome = new Alumno("3124", "Juan", "Gome");
        Alumno renaultClio = new Alumno("5646", "Renault", "Clio");
        Alumno martinGallego= new Alumno("9647", "Martín", "Gallego");
        Alumno volkswagenGol = new Alumno("9756", "Volkswagen", "Gol");
        Alumno federicoCabezas = new Alumno("4574", "Federico", "Cabezas");
        Alumno santiagoOlivera = new Alumno("4712", "Santiago", "Olivera");
        Alumno dilanAguilar = new Alumno("2787", "Dilan", "Aguilar");
        
        aedI.insertar(new Nodo<>(jhonDoe.getCedulaIdentidad(), jhonDoe));
        aedI.insertar(new Nodo<>(juanGome.getCedulaIdentidad(), juanGome));
        aedI.insertar(new Nodo<>(renaultClio.getCedulaIdentidad(), renaultClio));
        aedI.insertar(new Nodo<>(martinGallego.getCedulaIdentidad(), martinGallego));
        aedI.insertar(new Nodo<>(volkswagenGol.getCedulaIdentidad(), volkswagenGol));
        aedI.insertar(new Nodo<>(dilanAguilar.getCedulaIdentidad(), dilanAguilar));
        aedI.insertar(new Nodo<>(santiagoOlivera.getCedulaIdentidad(), santiagoOlivera));
        
        pf.insertar(new Nodo<>(volkswagenGol.getCedulaIdentidad(), volkswagenGol));
        pf.insertar(new Nodo<>(federicoCabezas.getCedulaIdentidad(), federicoCabezas));
        pf.insertar(new Nodo<>(santiagoOlivera.getCedulaIdentidad(), santiagoOlivera));
        pf.insertar(new Nodo<>(dilanAguilar.getCedulaIdentidad(), dilanAguilar));
        pf.insertar(new Nodo<>(jhonDoe.getCedulaIdentidad(), jhonDoe));
        pf.insertar(new Nodo<>(juanGome.getCedulaIdentidad(), juanGome));
        pf.insertar(new Nodo<>(renaultClio.getCedulaIdentidad(), renaultClio));
        
        IConjunto<Alumno> ambosCursos = aedI.union(pf);
        
        // Estan todos los elementos.
        assertEquals(jhonDoe, ambosCursos.buscar("1234").getDato());
        assertEquals(juanGome, ambosCursos.buscar("3124").getDato());
        assertEquals(renaultClio, ambosCursos.buscar("5646").getDato());
        assertEquals(martinGallego, ambosCursos.buscar("9647").getDato());
        assertEquals(volkswagenGol, ambosCursos.buscar("9756").getDato());
        assertEquals(federicoCabezas, ambosCursos.buscar("4574").getDato());
        assertEquals(santiagoOlivera, ambosCursos.buscar("4712").getDato());
        assertEquals(dilanAguilar, ambosCursos.buscar("2787").getDato());
             
    }
}
