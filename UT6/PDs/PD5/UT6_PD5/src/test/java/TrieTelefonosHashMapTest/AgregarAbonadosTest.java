/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TrieTelefonosHashMapTest;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.mycompany.ut6_pd5.ejercicio3.*;

/**
 *
 * @author Martin
 */
public class AgregarAbonadosTest {
    
    TArbolTrieTelefonosHashMap arbolPrueba;

    @BeforeEach
    public void setUp() {
        arbolPrueba = new TArbolTrieTelefonosHashMap();
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void agregarArbolNuloTest() {
        TAbonado abonado1 = new TAbonado("abonado1", "59899677264");

        arbolPrueba.insertar("59899677264", abonado1);
        TNodoTrieTelefonosHashMap actual = arbolPrueba.buscar("59899677264");
        
        assertEquals(abonado1, actual.getAbonado());
        
    }

    @Test
    public void agregarArbolConUnElementoTest() {
        TAbonado abonado1 = new TAbonado("abonado1", "59899677264");
        TAbonado abonado2 = new TAbonado("abonado2", "59899132654");

        arbolPrueba.insertar("59899677264", abonado1);
        arbolPrueba.insertar("59899132654", abonado2);
        
        TNodoTrieTelefonosHashMap actual = arbolPrueba.buscar("59899677264");
        TNodoTrieTelefonosHashMap actual2 = arbolPrueba.buscar("59899132654");
        
        assertEquals(abonado1, actual.getAbonado());
        assertEquals(abonado2, actual2.getAbonado());
    }

    @Test
    public void agregarArbolConVariosElementosTest() {
        TAbonado abonado1 = new TAbonado("abonado1", "59899677264");
        TAbonado abonado2 = new TAbonado("abonado2", "59899132654");
        TAbonado abonado3 = new TAbonado("abonado3", "59899258147");
        TAbonado abonado4 = new TAbonado("abonado4", "59899369852");

        arbolPrueba.insertar("59899677264", abonado1);
        arbolPrueba.insertar("59899132654", abonado2);
        arbolPrueba.insertar("59899258147", abonado3);
        arbolPrueba.insertar("59899369852", abonado4);
        
        TNodoTrieTelefonosHashMap actual = arbolPrueba.buscar("59899677264");
        TNodoTrieTelefonosHashMap actual2 = arbolPrueba.buscar("59899132654");
        TNodoTrieTelefonosHashMap actual3 = arbolPrueba.buscar("59899258147");
        TNodoTrieTelefonosHashMap actual4 = arbolPrueba.buscar("59899369852");
        
        assertEquals(abonado1, actual.getAbonado());
        assertEquals(abonado2, actual2.getAbonado());
        assertEquals(abonado3, actual3.getAbonado());
        assertEquals(abonado4, actual4.getAbonado());
    }
}
