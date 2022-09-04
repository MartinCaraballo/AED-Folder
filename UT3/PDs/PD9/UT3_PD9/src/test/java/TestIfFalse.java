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
public class TestIfFalse {

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testIfFalse() {
        Expresion instance = new Expresion();

        String incorrecto = "{{{{{{{{{{{}}}}}}}}}}{{{{{}";
        String incorrecto2 = "{{{{{{{{{{{}}}}}}}}}}}{{}{}{{}";

        char[] prueba1 = incorrecto.toCharArray();
        char[] prueba2 = incorrecto2.toCharArray();
        
        assertFalse(instance.controlCorchetes(prueba1));
        assertFalse(instance.controlCorchetes(prueba2));

    }
}
