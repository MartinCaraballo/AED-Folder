/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.ut3_pd10.*;
import java.util.Random;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Martin
 */
public class TestPreparado {
    
    Preparado preparado;
    Random random;
    String[] suerosArray;
    String[] listaBlanca;
    String[] listaNegra;
    Lista<Suero> listaSueros;

    @BeforeEach
    public void setUp() {
        preparado = new Preparado();
        random = new Random();
        suerosArray = ManejadorArchivosGenerico.leerArchivo("src/Sueros.txt");
        listaBlanca = ManejadorArchivosGenerico.leerArchivo("src/listablanca.txt");
        listaNegra = ManejadorArchivosGenerico.leerArchivo("src/listanegra.txt");
        listaSueros = new Lista<>();
        
        for (String suero : suerosArray) {
            String[] sueroSplitted = suero.split(",");
            INodo<Suero> nodo = new Nodo(sueroSplitted[0], new Suero(sueroSplitted[0], sueroSplitted[1]));
            listaSueros.insertar(nodo);
        }        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testPreparadoTrue() {
        int sueroIDRandom = random.nextInt(1, 17);
        Suero suero = listaSueros.buscar(String.valueOf(sueroIDRandom)).getDato();
        Lista<INodo> idsFarmacos = new Lista<>();
        for (int i = 0; i <= 5; i++) {
            int farmacosRandomIndex = random.nextInt(1, listaBlanca.length);
            Nodo nodo = new Nodo(listaBlanca[farmacosRandomIndex]);
            idsFarmacos.insertar(nodo);
        }
        
        // Tiene que estar siempre true porque estamos sacando el identificador del fármaco del archivo
        // listablanca.txt, archivo donde estan los fármacos que se pueden preparar con cualquier suero.
        // Tomamos de una manera "aleatoria" ese ID del archivo, al igual que el suero.
        assertTrue(preparado.preparadoViable(suero.getSueroID(), idsFarmacos));
    }
    
    @Test
    public void testPreparadoFalse() {
        int randomStringLineListaNegra = random.nextInt(0, listaNegra.length);
        String lineaListaNegra = listaNegra[randomStringLineListaNegra];
        String sueroID = lineaListaNegra.split(",")[0];
        Lista<INodo> idsFarmacos = new Lista<>();
        for (int i = 0; i <= 5; i++) {
            randomStringLineListaNegra = random.nextInt(0, listaNegra.length);
            lineaListaNegra = listaNegra[randomStringLineListaNegra];
            String farmacoID = lineaListaNegra.split(",")[1];
            idsFarmacos.insertar(new Nodo(farmacoID));
        }
        
        // Tiene que estar siempre false porque estamos sacando el identificador del suero y de los fármacos
        // de la lista negra.
        assertFalse(preparado.preparadoViable(sueroID, idsFarmacos));
    }
}
