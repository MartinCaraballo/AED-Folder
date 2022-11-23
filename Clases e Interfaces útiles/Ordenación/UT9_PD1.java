/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut9_pd1;
import java.util.Arrays;
import static ut9_pd1.TClasificador.METODO_CLASIFICACION_INSERCION;
import static ut9_pd1.TClasificador.METODO_CLASIFICACION_SHELL;
import static ut9_pd1.TClasificador.METODO_CLASIFICACION_BURBUJA;
import static ut9_pd1.TClasificador.METODO_CLASIFICACION_QUICKSORT;
import static ut9_pd1.TClasificador.METODO_CLASIFICACION_HEAPSORT;
import static ut9_pd1.TClasificador.METODO_CLASIFICACION_SELECCION;

import static ut9_pd1.MedicionTiempo.ALEATORIO;
import static ut9_pd1.MedicionTiempo.ASCENDENTE;
import static ut9_pd1.MedicionTiempo.DESCENDENTE;

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
        GeneradorDatosGenericos generador = new GeneradorDatosGenericos(50);
        
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
        
        vectorAscendente = generador.generarDatosAscendentes();
        vectorAleatorio = generador.generarDatosAleatorios();
        vectorDescendente = generador.generarDatosDescendentes();
        
        System.out.println("\nANTES DE ORDENAR POR HEAPSORT:");
        System.out.println(Arrays.toString(vectorAscendente));
        System.out.println(Arrays.toString(vectorAleatorio));
        System.out.println(Arrays.toString(vectorDescendente));
        
        clasificador.clasificar(vectorAscendente, METODO_CLASIFICACION_HEAPSORT);
        clasificador.clasificar(vectorAleatorio, METODO_CLASIFICACION_HEAPSORT);
        clasificador.clasificar(vectorDescendente, METODO_CLASIFICACION_HEAPSORT);
        
        System.out.println("\nDESPUES DE ORDENAR POR HEAPSORT:");
        System.out.println(Arrays.toString(vectorAscendente));
        System.out.println(Arrays.toString(vectorAleatorio));
        System.out.println(Arrays.toString(vectorDescendente));
        
        vectorAscendente = generador.generarDatosAscendentes();
        vectorAleatorio = generador.generarDatosAleatorios();
        vectorDescendente = generador.generarDatosDescendentes();
        
        System.out.println("\nANTES DE ORDENAR POR SELECCION:");
        System.out.println(Arrays.toString(vectorAscendente));
        System.out.println(Arrays.toString(vectorAleatorio));
        System.out.println(Arrays.toString(vectorDescendente));
        
        clasificador.clasificar(vectorAscendente, METODO_CLASIFICACION_SELECCION);
        clasificador.clasificar(vectorAleatorio, METODO_CLASIFICACION_SELECCION);
        clasificador.clasificar(vectorDescendente, METODO_CLASIFICACION_SELECCION);
        
        System.out.println("\nDESPUES DE ORDENAR POR SELECCION:");
        System.out.println(Arrays.toString(vectorAscendente));
        System.out.println(Arrays.toString(vectorAleatorio));
        System.out.println(Arrays.toString(vectorDescendente));
        
        // MEDICION DE TIEMPOS
        System.out.println("\nMEDICION DE TIEMPOS:");
        
        MedicionTiempo medicion = new MedicionTiempo(10000);
        
        // SHELLSORT
        System.out.println("\nShellSort, Vector Aleatorio. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_SHELL, ALEATORIO) + "ns");
        System.out.println("ShellSort, Vector Ascendente. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_SHELL, ASCENDENTE) + "ns");
        System.out.println("ShellSort, Vector Descendente. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_SHELL, DESCENDENTE) + "ns");
        
        // INSERCION
        System.out.println("\nInsercion, Vector Aleatorio. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_INSERCION, ALEATORIO) + "ns");
        System.out.println("Insercion, Vector Ascendente. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_INSERCION, ASCENDENTE) + "ns");
        System.out.println("Insercion, Vector Descendente. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_INSERCION, DESCENDENTE) + "ns");
        
        // BURBUJA
        System.out.println("\nBurbuja, Vector Aleatorio. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_BURBUJA, ALEATORIO) + "ns");
        System.out.println("Burbuja, Vector Ascendente. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_BURBUJA, ASCENDENTE) + "ns");
        System.out.println("Burbuja, Vector Descendente. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_BURBUJA, DESCENDENTE) + "ns");
        
        // QuickSort
        System.out.println("\nQuickSort, Vector Aleatorio. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_QUICKSORT, ALEATORIO) + "ns");
        System.out.println("QuickSort, Vector Ascendente. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_QUICKSORT, ASCENDENTE) + "ns");
        System.out.println("QuickSort, Vector Descendente. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_QUICKSORT, DESCENDENTE) + "ns");
        
        // HEAPSORT
        System.out.println("\nHeapSort, Vector Aleatorio. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_HEAPSORT, ALEATORIO) + "ns");
        System.out.println("HeapSort, Vector Ascendente. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_HEAPSORT, ASCENDENTE) + "ns");
        System.out.println("HeapSort, Vector Descendente. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_HEAPSORT, DESCENDENTE) + "ns");
        
        // SELECCION
        System.out.println("\nSeleccion, Vector Aleatorio. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_SELECCION, ALEATORIO) + "ns");
        System.out.println("Seleccion, Vector Ascendente. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_SELECCION, ASCENDENTE) + "ns");
        System.out.println("Seleccion, Vector Descendente. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_SELECCION, DESCENDENTE) + "ns"); 
        
        
    }
    
}
