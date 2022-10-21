/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.util.TreeSet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author carolglass
 */
public class Parcial1Test {
    
    public Parcial1Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class Parcial1.
     */
    @Test
    public void testMain1(){       
        Almacen elAlmacen = new Almacen();
        Producto p1 = new Producto(120,12);
        Producto p2 = new Producto(133,5);
        Producto p3 = new Producto(101,11);
        Producto p4 = new Producto(150,14);
        
        elAlmacen.agregarProducto(p1);
        elAlmacen.agregarProducto(p2);
        elAlmacen.agregarProducto(p3);
        elAlmacen.agregarProducto(p4);
        int expResult =12;
        int result = elAlmacen.stockSegunCodigo(120);
        
        assertEquals(expResult, result);
    }
    
}
