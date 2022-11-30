/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut9_pd2;
import java.util.Arrays;
import static ut9_pd2.TClasificador.METODO_CLASIFICACION_BURBUJA_MEJORADO;
import static ut9_pd2.TClasificador.METODO_CLASIFICACION_SHAKERSORT;
import static ut9_pd2.TClasificador.METODO_CLASIFICACION_BURBUJA;

import static ut9_pd2.MedicionTiempo.ALEATORIO;
import static ut9_pd2.MedicionTiempo.ASCENDENTE;
import static ut9_pd2.MedicionTiempo.DESCENDENTE;

/**
 *
 * @author Martin
 */
public class UT9_PD2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TClasificador clasificador = new TClasificador();
        GeneradorDatosGenericos generador = new GeneradorDatosGenericos(300);
        
        int[] prueba = {56, 2, 99, 10, 3, 9, 5, 1, 18, 0};
        
        int[] ordenado = clasificador.clasificar(prueba.clone(), METODO_CLASIFICACION_BURBUJA_MEJORADO);
        System.out.println("Ordenado por burbuja mejorado: " + Arrays.toString(ordenado));
        
        ordenado = clasificador.clasificar(prueba.clone(), METODO_CLASIFICACION_SHAKERSORT);
        System.out.println("Ordenado por shakersort: " + Arrays.toString(ordenado));
        
        // MEDICION DE TIEMPOS
        System.out.println("\nMEDICION DE TIEMPOS CON 300 ELEMENTOS:");
        
        MedicionTiempo medicion = new MedicionTiempo(300);
        
        
        // BURBUJA
        System.out.println("\nBurbuja, Vector Aleatorio. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_BURBUJA, ALEATORIO) + "ns");
        System.out.println("Burbuja, Vector Ascendente. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_BURBUJA, ASCENDENTE) + "ns");
        System.out.println("Burbuja, Vector Descendente. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_BURBUJA, DESCENDENTE) + "ns");
        
        // BURBUJA MEJORADO
        System.out.println("\nBurbuja Mejorado, Vector Aleatorio. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_BURBUJA_MEJORADO, ALEATORIO) + "ns");
        System.out.println("Burbuja Mejorado, Vector Ascendente. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_BURBUJA_MEJORADO, ASCENDENTE) + "ns");
        System.out.println("Burbuja Mejorado, Vector Descendente. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_BURBUJA_MEJORADO, DESCENDENTE) + "ns");
        
        // SHAKERSORT
        System.out.println("\nShakerSort, Vector Aleatorio. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_SHAKERSORT, ALEATORIO) + "ns");
        System.out.println("ShakerSort, Vector Ascendente. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_SHAKERSORT, ASCENDENTE) + "ns");
        System.out.println("ShakerSort, Vector Descendente. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_SHAKERSORT, DESCENDENTE) + "ns");
        
        
        
        System.out.println("\n-----------------------------------------------------");
        System.out.println("\nMEDICION DE TIEMPOS CON 3000 ELEMENTOS:");
        
        medicion = new MedicionTiempo(3000);
        
        // BURBUJA
        System.out.println("\nBurbuja, Vector Aleatorio. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_BURBUJA, ALEATORIO) + "ns");
        System.out.println("Burbuja, Vector Ascendente. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_BURBUJA, ASCENDENTE) + "ns");
        System.out.println("Burbuja, Vector Descendente. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_BURBUJA, DESCENDENTE) + "ns");
        
        // BURBUJA MEJORADO
        System.out.println("\nBurbuja Mejorado, Vector Aleatorio. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_BURBUJA_MEJORADO, ALEATORIO) + "ns");
        System.out.println("Burbuja Mejorado, Vector Ascendente. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_BURBUJA_MEJORADO, ASCENDENTE) + "ns");
        System.out.println("Burbuja Mejorado, Vector Descendente. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_BURBUJA_MEJORADO, DESCENDENTE) + "ns");
        
        // SHAKERSORT
        System.out.println("\nShakerSort, Vector Aleatorio. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_SHAKERSORT, ALEATORIO) + "ns");
        System.out.println("ShakerSort, Vector Ascendente. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_SHAKERSORT, ASCENDENTE) + "ns");
        System.out.println("ShakerSort, Vector Descendente. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_SHAKERSORT, DESCENDENTE) + "ns");
        
        System.out.println("\n-----------------------------------------------------");
        System.out.println("\nMEDICION DE TIEMPOS CON 30000 ELEMENTOS:");
        
        medicion = new MedicionTiempo(30000);
        
        // BURBUJA
        System.out.println("\nBurbuja, Vector Aleatorio. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_BURBUJA, ALEATORIO) + "ns");
        System.out.println("Burbuja, Vector Ascendente. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_BURBUJA, ASCENDENTE) + "ns");
        System.out.println("Burbuja, Vector Descendente. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_BURBUJA, DESCENDENTE) + "ns");
        
        // BURBUJA MEJORADO
        System.out.println("\nBurbuja Mejorado, Vector Aleatorio. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_BURBUJA_MEJORADO, ALEATORIO) + "ns");
        System.out.println("Burbuja Mejorado, Vector Ascendente. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_BURBUJA_MEJORADO, ASCENDENTE) + "ns");
        System.out.println("Burbuja Mejorado, Vector Descendente. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_BURBUJA_MEJORADO, DESCENDENTE) + "ns");
        
        // SHAKERSORT
        System.out.println("\nShakerSort, Vector Aleatorio. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_SHAKERSORT, ALEATORIO) + "ns");
        System.out.println("ShakerSort, Vector Ascendente. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_SHAKERSORT, ASCENDENTE) + "ns");
        System.out.println("ShakerSort, Vector Descendente. Tiempo: " + medicion.medicionTiempo(METODO_CLASIFICACION_SHAKERSORT, DESCENDENTE) + "ns");

    }
    
}
