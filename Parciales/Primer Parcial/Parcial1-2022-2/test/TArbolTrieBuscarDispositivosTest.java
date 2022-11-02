/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.util.LinkedList;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;
import org.junit.Test;

/**
 *
 * @author Martin
 */
public class TArbolTrieBuscarDispositivosTest {
    
    TArbolTrie triePruebas = new TArbolTrie();
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testBuscarArbolVacio() {
        String aBuscar = "172.132.323";
        LinkedList<TDispositivo> actual = triePruebas.buscarDispositivos(aBuscar);
        
        assertNull(actual);
    }
    
    @Test
    public void testBuscarConExitoArbolConElementos() {
        TDispositivo dispositivo1 = new TDispositivo("010.024.007.024", "Dispositivo1", "unDato");
        TDispositivo dispositivo2 = new TDispositivo("010.024.007.025", "Dispositivo2", "unDato");
        TDispositivo dispositivo3 = new TDispositivo("010.024.007.026", "Dispositivo3", "unDato");
        TDispositivo dispositivo4 = new TDispositivo("010.024.008.024", "Dispositivo4", "unDato");
        TDispositivo dispositivo5 = new TDispositivo("010.024.008.037", "Dispositivo5", "unDato");
        TDispositivo dispositivo6 = new TDispositivo("010.024.008.038", "Dispositivo6", "unDato");
        triePruebas.insertar(dispositivo1);
        triePruebas.insertar(dispositivo2);
        triePruebas.insertar(dispositivo3);
        triePruebas.insertar(dispositivo4);
        triePruebas.insertar(dispositivo5);
        triePruebas.insertar(dispositivo6);
        
        LinkedList<TDispositivo> expected = new LinkedList();
        expected.add(dispositivo1);
        expected.add(dispositivo2);
        expected.add(dispositivo3);
        expected.add(dispositivo4);
        expected.add(dispositivo5);
        expected.add(dispositivo6);
        
        LinkedList<TDispositivo> actual = triePruebas.buscarDispositivos("010.024.");
        
        int resultadosCorrectos = 0;
        for (int i = 0; i < 6; i++) {
            TDispositivo exp = expected.get(i);
            TDispositivo act = actual.get(i);
            if (exp.equals(act)) {
                resultadosCorrectos++;
            }
        }
        
        assertEquals(expected.size(), resultadosCorrectos);          
    }
    
    @Test
    public void testBuscarSinExitoArbolConElementos() {
        TDispositivo dispositivo1 = new TDispositivo("010.024.007.024", "Dispositivo1", "unDato");
        TDispositivo dispositivo2 = new TDispositivo("010.024.007.025", "Dispositivo2", "unDato");
        TDispositivo dispositivo3 = new TDispositivo("010.024.007.026", "Dispositivo3", "unDato");
        TDispositivo dispositivo4 = new TDispositivo("010.024.008.024", "Dispositivo4", "unDato");
        TDispositivo dispositivo5 = new TDispositivo("010.024.008.037", "Dispositivo5", "unDato");
        TDispositivo dispositivo6 = new TDispositivo("010.024.008.038", "Dispositivo6", "unDato");
        triePruebas.insertar(dispositivo1);
        triePruebas.insertar(dispositivo2);
        triePruebas.insertar(dispositivo3);
        triePruebas.insertar(dispositivo4);
        triePruebas.insertar(dispositivo5);
        triePruebas.insertar(dispositivo6);
        
        LinkedList<TDispositivo> expected = new LinkedList();
        
        LinkedList<TDispositivo> actual = triePruebas.buscarDispositivos("192.");
        
        assertEquals(expected.size(), actual.size());
    }
    
}
