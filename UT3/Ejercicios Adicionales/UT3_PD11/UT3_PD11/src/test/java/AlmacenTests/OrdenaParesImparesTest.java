/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package AlmacenTests;

import com.mycompany.ut3_pd11.Almacen;
import com.mycompany.ut3_pd11.Articulo;
import com.mycompany.ut3_pd11.Lista;
import com.mycompany.ut3_pd11.Nodo;
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
public class OrdenaParesImparesTest {

    Almacen almacen;
    Articulo articulo1;
    Articulo articulo2;
    Articulo articulo3;
    Articulo articulo4;
    Articulo articulo5;
    Articulo articulo6;
    Articulo articulo7;
    Articulo articulo8;
    Articulo articulo9;
    Articulo articulo10;

    @BeforeEach
    public void setUp() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void paresImparesTest() {
        almacen = new Almacen("Almacen");
        articulo1 = new Articulo("Monitor", "Monitor oficina", 4);
        articulo2 = new Articulo("Mouse", "Mouse genérico", 71);
        articulo3 = new Articulo("Mouse inalámbrico", "Mouse inalámbrico Logitech", 3);
        articulo4 = new Articulo("Monitor gamer", "Monitor gamer 144Hz", 6);
        articulo5 = new Articulo("Monitor curvo", "Monitor curvo 1080p", 12);
        articulo6 = new Articulo("Teclado gamer mecánico", "Teclado gamer mecánico Razer", 8);
        articulo7 = new Articulo("Auriculares", "Auriculares con cable", 35);
        articulo8 = new Articulo("Auriculares inalámbricos", "Auriculares inalámbricos Logitech", 11);
        articulo9 = new Articulo("Impresora", "Impresora multifunción", 22);
        articulo10 = new Articulo("Laptop HP", "Laptop HP core i5", 17);
        almacen.insertarArticuloInventario(articulo1);
        almacen.insertarArticuloInventario(articulo2);
        almacen.insertarArticuloInventario(articulo3);
        almacen.insertarArticuloInventario(articulo4);
        almacen.insertarArticuloInventario(articulo5);
        almacen.insertarArticuloInventario(articulo6);
        almacen.insertarArticuloInventario(articulo7);
        almacen.insertarArticuloInventario(articulo8);
        almacen.insertarArticuloInventario(articulo9);
        almacen.insertarArticuloInventario(articulo10);
        almacen.ordenaParesImpares();

        int[] expected = {3, 11, 17, 35, 71, 4, 6, 8, 12, 22};

        Lista<Articulo> actual = almacen.getInventario();

        int contador = 0;
        int contadorResultadosCorrectos = 0;
        Nodo<Articulo> nodoActual = actual.getPrimero();
        while (nodoActual != null) {
            if (nodoActual.getDato().getCodigo() == expected[contador]) {
                contadorResultadosCorrectos++;
            }
            nodoActual = nodoActual.getSiguiente();
            contador++;
        }

        assertTrue(actual.cantElementos() == contadorResultadosCorrectos);
    }

    @Test
    public void paresTest() {
        almacen = new Almacen("Almacen");
        articulo9 = new Articulo("Impresora", "Impresora multifunción", 22);
        articulo4 = new Articulo("Monitor gamer", "Monitor gamer 144Hz", 6);
        articulo5 = new Articulo("Monitor curvo", "Monitor curvo 1080p", 12);
        articulo1 = new Articulo("Monitor", "Monitor oficina", 4);
        articulo6 = new Articulo("Teclado gamer mecánico", "Teclado gamer mecánico Razer", 8);
        almacen.insertarArticuloInventario(articulo9);
        almacen.insertarArticuloInventario(articulo4);
        almacen.insertarArticuloInventario(articulo5);
        almacen.insertarArticuloInventario(articulo1);
        almacen.insertarArticuloInventario(articulo6);
        almacen.ordenaParesImpares();
        
        int[] expected = {4, 6, 8, 12, 22};
        
        Lista<Articulo> actual = almacen.getInventario();

        int contador = 0;
        int contadorResultadosCorrectos = 0;
        Nodo<Articulo> nodoActual = actual.getPrimero();
        while (nodoActual != null) {
            if (nodoActual.getDato().getCodigo() == expected[contador]) {
                contadorResultadosCorrectos++;
            }
            nodoActual = nodoActual.getSiguiente();
            contador++;
        }

        assertTrue(actual.cantElementos() == contadorResultadosCorrectos);
    }
    
    @Test
    public void imparesTest() {
        almacen = new Almacen("Almacen");
        articulo2 = new Articulo("Mouse", "Mouse genérico", 71);
        articulo3 = new Articulo("Mouse inalámbrico", "Mouse inalámbrico Logitech", 3);
        articulo7 = new Articulo("Auriculares", "Auriculares con cable", 35);
        articulo8 = new Articulo("Auriculares inalámbricos", "Auriculares inalámbricos Logitech", 11);
        articulo10 = new Articulo("Laptop HP", "Laptop HP core i5", 17);
        almacen.insertarArticuloInventario(articulo2);
        almacen.insertarArticuloInventario(articulo3);
        almacen.insertarArticuloInventario(articulo7);
        almacen.insertarArticuloInventario(articulo8);
        almacen.insertarArticuloInventario(articulo10);
        almacen.ordenaParesImpares();
        
        int[] expected = {3, 11, 17, 35, 71};
        
        Lista<Articulo> actual = almacen.getInventario();

        int contador = 0;
        int contadorResultadosCorrectos = 0;
        Nodo<Articulo> nodoActual = actual.getPrimero();
        while (nodoActual != null) {
            if (nodoActual.getDato().getCodigo() == expected[contador]) {
                contadorResultadosCorrectos++;
            }
            nodoActual = nodoActual.getSiguiente();
            contador++;
        }

        assertTrue(actual.cantElementos() == contadorResultadosCorrectos);
    }
}
