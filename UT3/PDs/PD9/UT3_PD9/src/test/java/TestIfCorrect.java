/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.ut3_pd9.Expresion;
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
public class TestIfCorrect {
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testIfCorrect() {
        Expresion instance = new Expresion();
        String correcto = "{}{{{}}}{{}}";
        String correcto2 = "{{{{{{{{{{}}}}}}}}}}{}{}{}{{{{{}}}}}";
        
        char[] prueba1 = correcto.toCharArray();
        char[] prueba2 = correcto2.toCharArray();
        
        assertTrue(instance.controlCorchetes(prueba1));
        assertTrue(instance.controlCorchetes(prueba2));
    }
}
