/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut9_pd1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import static ut9_pd1.TClasificador.METODO_CLASIFICACION_INSERCION;
import static ut9_pd1.TClasificador.METODO_CLASIFICACION_SHELL;
import static ut9_pd1.TClasificador.METODO_CLASIFICACION_BURBUJA;
import static ut9_pd1.TClasificador.METODO_CLASIFICACION_QUICKSORT;

/**
 *
 * @author Martin
 */
public class UT9_PD1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TClasificador clasificador = new TClasificador();
        GeneradorDatosGenericos generador = new GeneradorDatosGenericos();
        
        Map<String, Map<String, Float>> resultadosMedicion = new HashMap<>();
        
        int[] prueba = {20, 1, 55, 2, 4};
        int[] ordenado = clasificador.clasificar(prueba, METODO_CLASIFICACION_INSERCION);
        System.out.println("Resultado:");
        for (int i = 0; i < ordenado.length; i++) {
            System.out.print("-" + ordenado[i]);
        }
        System.out.println("");
        
        String estaOrdenado = (clasificador.estaOrdenado(ordenado)) ? "Si" : "No";
        System.out.println("Esta ordenado? " + estaOrdenado);
        
        int[] vectorAscendente = generador.generarDatosAscendentes();
        int[] vectorAleatorio = generador.generarDatosAleatorios();
        int[] vectorDescendente = generador.generarDatosDescendentes();
        
        System.out.println("\nANTES DE ORDENAR:");
        System.out.println(Arrays.toString(vectorAscendente));
        System.out.println(Arrays.toString(vectorAleatorio));
        System.out.println(Arrays.toString(vectorDescendente));
        
        clasificador.clasificar(vectorAscendente, METODO_CLASIFICACION_INSERCION);
        clasificador.clasificar(vectorAleatorio, METODO_CLASIFICACION_INSERCION);
        clasificador.clasificar(vectorDescendente, METODO_CLASIFICACION_INSERCION);
        
        System.out.println("\nLUEGO DE ORDENAR POR INSERCION:");
        System.out.println(Arrays.toString(vectorAscendente));
        System.out.println(Arrays.toString(vectorAleatorio));
        System.out.println(Arrays.toString(vectorDescendente));
        
        vectorAscendente = generador.generarDatosAscendentes();
        vectorAleatorio = generador.generarDatosAleatorios();
        vectorDescendente = generador.generarDatosDescendentes();
        
        System.out.println("\nANTES DE ORDENAR POR SHELL:");
        System.out.println(Arrays.toString(vectorAscendente));
        System.out.println(Arrays.toString(vectorAleatorio));
        System.out.println(Arrays.toString(vectorDescendente));
        
        clasificador.clasificar(vectorAscendente, METODO_CLASIFICACION_SHELL);
        clasificador.clasificar(vectorAleatorio, METODO_CLASIFICACION_SHELL);
        clasificador.clasificar(vectorDescendente, METODO_CLASIFICACION_SHELL);
        
        System.out.println("\nDESPUES DE ORDENAR POR SHELL:");
        System.out.println(Arrays.toString(vectorAscendente));
        System.out.println(Arrays.toString(vectorAleatorio));
        System.out.println(Arrays.toString(vectorDescendente));
        
        vectorAscendente = generador.generarDatosAscendentes();
        vectorAleatorio = generador.generarDatosAleatorios();
        vectorDescendente = generador.generarDatosDescendentes();
        
        System.out.println("\nANTES DE ORDENAR POR BURBUJA:");
        System.out.println(Arrays.toString(vectorAscendente));
        System.out.println(Arrays.toString(vectorAleatorio));
        System.out.println(Arrays.toString(vectorDescendente));
        
        clasificador.clasificar(vectorAscendente, METODO_CLASIFICACION_BURBUJA);
        clasificador.clasificar(vectorAleatorio, METODO_CLASIFICACION_BURBUJA);
        clasificador.clasificar(vectorDescendente, METODO_CLASIFICACION_BURBUJA);
        
        System.out.println("\nLUEGO DE ORDENAR POR BURBUJA:");
        System.out.println(Arrays.toString(vectorAscendente));
        System.out.println(Arrays.toString(vectorAleatorio));
        System.out.println(Arrays.toString(vectorDescendente));
        
        vectorAscendente = generador.generarDatosAscendentes();
        vectorAleatorio = generador.generarDatosAleatorios();
        vectorDescendente = generador.generarDatosDescendentes();
        
        System.out.println("\nANTES DE ORDENAR POR QUICKSORT:");
        System.out.println(Arrays.toString(vectorAscendente));
        System.out.println(Arrays.toString(vectorAleatorio));
        System.out.println(Arrays.toString(vectorDescendente));
        
        clasificador.clasificar(vectorAscendente, METODO_CLASIFICACION_QUICKSORT);
        clasificador.clasificar(vectorAleatorio, METODO_CLASIFICACION_QUICKSORT);
        clasificador.clasificar(vectorDescendente, METODO_CLASIFICACION_QUICKSORT);
        
        System.out.println("\nLUEGO DE ORDENAR POR QUICKSORT:");
        System.out.println(Arrays.toString(vectorAscendente));
        System.out.println(Arrays.toString(vectorAleatorio));
        System.out.println(Arrays.toString(vectorDescendente));
        
        
        
    }
    
}
