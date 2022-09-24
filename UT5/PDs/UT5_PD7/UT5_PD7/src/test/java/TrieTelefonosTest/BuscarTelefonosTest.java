/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TrieTelefonosTest;

import com.mycompany.ut5_pd7.TAbonado;
import com.mycompany.ut5_pd7.TArbolTrieTelefonos;
import com.mycompany.ut5_pd7.TNodoTrieTelefonos;
import java.util.LinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Martin
 */
public class BuscarTelefonosTest {
    
    TArbolTrieTelefonos arbolPrueba;
    
    @BeforeEach
    public void setUp() {
        arbolPrueba = new TArbolTrieTelefonos();
    }


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testBuscarArbolNulo() {
        LinkedList<TAbonado> resultado = arbolPrueba.buscarTelefonos("598", "90");
        
        assertNull(resultado);
    }
    
    @Test
    public void testBuscarArbolUnElementoInexistente() {
        arbolPrueba.insertar("59890564987", new TAbonado("abonado", "59890564987"));
        
        LinkedList<TAbonado> resultado = arbolPrueba.buscarTelefonos("564", "03");
    }
    
    @Test
    public void testBuscarArbolUnElementoExistente() {
        TAbonado abonado = new TAbonado("abonado", "59890564987");
        arbolPrueba.insertar("59890564987", abonado);
        
        LinkedList<TAbonado> resultado = arbolPrueba.buscarTelefonos("598", "90");
        
        assertEquals(abonado, resultado.get(0));
    }
    
    @Test
    public void testBuscarInexistenteArbolVariosElementos() {
        arbolPrueba.insertar("59890564987", new TAbonado("abonado", "59890564987"));
        arbolPrueba.insertar("59891234565", new TAbonado("abonado1", "59891234565"));
        arbolPrueba.insertar("59894565554", new TAbonado("abonado2", "59894565554"));
        arbolPrueba.insertar("59890546789", new TAbonado("abonado3", "59890546789"));
        
        LinkedList<TAbonado> resultado = arbolPrueba.buscarTelefonos("598", "45");
        
        assertTrue(resultado.isEmpty());
    }
    
    @Test
    public void testBuscarExistenteArbolVariosElementos() {
        TAbonado abonado1 = new TAbonado("abonado1", "59890465123");
        TAbonado abonado2 = new TAbonado("abonado2", "59890123789");
        TAbonado abonado3 = new TAbonado("abonado3", "59890213519");
        TAbonado abonado4 = new TAbonado("abonado4", "59890951357");
        TAbonado abonado5 = new TAbonado("abonado5", "59890461379");
        
        arbolPrueba.insertar(abonado1.getTelefono(), abonado1);
        arbolPrueba.insertar(abonado2.getTelefono(), abonado2);
        arbolPrueba.insertar(abonado3.getTelefono(), abonado3);
        arbolPrueba.insertar(abonado4.getTelefono(), abonado4);
        arbolPrueba.insertar(abonado5.getTelefono(), abonado5);
        
        LinkedList<TAbonado> resultado = arbolPrueba.buscarTelefonos("598", "90");
        
        LinkedList<TAbonado> expected = new LinkedList();
        expected.add(abonado2);
        expected.add(abonado3);
        expected.add(abonado5);
        expected.add(abonado1);
        expected.add(abonado4);
        
        assertEquals(expected, resultado);
    }
    
    /**
     * Igual que el anterior, solamente que no todos son agregados con los mismos codigos.
     */
    @Test
    public void testBuscarArbolVariosElementos() {
        TAbonado abonado1 = new TAbonado("abonado1", "59890465123");
        TAbonado abonado2 = new TAbonado("abonado2", "59890123789");
        TAbonado abonado3 = new TAbonado("abonado3", "59890213519");
        TAbonado abonado4 = new TAbonado("abonado4", "59890951357");
        TAbonado abonado5 = new TAbonado("abonado5", "59890461379");
        TAbonado abonado6 = new TAbonado("abonado6", "54151235748");
        TAbonado abonado7 = new TAbonado("abonado7", "54613258694");
        TAbonado abonado8 = new TAbonado("abonado8", "14258741598");
        TAbonado abonado9 = new TAbonado("abonado9", "58497822596");
        TAbonado abonado10 = new TAbonado("abonado10", "58497645655");
        
        arbolPrueba.insertar(abonado1.getTelefono(), abonado1);
        arbolPrueba.insertar(abonado2.getTelefono(), abonado2);
        arbolPrueba.insertar(abonado3.getTelefono(), abonado3);
        arbolPrueba.insertar(abonado4.getTelefono(), abonado4);
        arbolPrueba.insertar(abonado5.getTelefono(), abonado5);
        arbolPrueba.insertar(abonado6.getTelefono(), abonado6);
        arbolPrueba.insertar(abonado7.getTelefono(), abonado7);
        arbolPrueba.insertar(abonado8.getTelefono(), abonado8);
        arbolPrueba.insertar(abonado9.getTelefono(), abonado9);
        arbolPrueba.insertar(abonado10.getTelefono(), abonado10);
        
        LinkedList<TAbonado> resultado = arbolPrueba.buscarTelefonos("584", "97");
        
        LinkedList<TAbonado> expected = new LinkedList();
        expected.add(abonado10);
        expected.add(abonado9);
        
        assertEquals(expected, resultado);
    }
}
