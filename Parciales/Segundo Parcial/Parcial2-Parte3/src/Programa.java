
import java.util.Arrays;
import java.util.Collection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ernesto
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*  CARGAR EL GRAFO CON LA RED DE AEROPUERTOS Y VUELOS
         TGrafoDirigido gd = (TGrafoDirigido) UtilGrafos.cargarGrafo(....
        

        /* invocar a esPosibleLlegarATodos(Comparable aeropuertoOrigen) para cada 
         aeropuerto indicado en el documento / pizarrón, imprimir el resultado por pantalla
         y poner los resultados en la hoja de parcial distribuida.
         Poner también los resultados en el archivo de texto “vuelosAED.txt” 
        
        
         */

        TGrafoDirigido gd = UtilGrafos.cargarGrafo("src/aeropuertos.txt", "src/vuelos.txt", false, TGrafoDirigido.class);
        String[] parametros = {"", "PHL", "ORF", "ABQ", "ZZZ"};
        String[] resultado = new String[5];
        String[] resultadoSegundoMetodo = new String[5];
        resultado[0] = "Metodo: esPosibleLLegarATodos";
        resultadoSegundoMetodo[0] = "Metodo: esPosibleLLegarATodos2";
        for (int i = 1; i < 5; i++) {
            boolean llegaATodos = gd.esPosibleLlegarATodos(parametros[i]);
            String llegaATodosRespuesta = (llegaATodos) ? "Si" : "No";
            String linea = parametros[i] + ", " + llegaATodosRespuesta;
            resultado[i] = linea;
        }
        
        for (int i = 1; i < 5; i++) {
            boolean llegaATodos = gd.esPosibleLlegarATodos2(parametros[i]);
            String llegaATodosRespuesta = (llegaATodos) ? "Si" : "No";
            String linea = parametros[i] + ", " + llegaATodosRespuesta;
            resultadoSegundoMetodo[i] = linea;
        }
        
        
        
        System.out.println("Metodo esPosibleLlegarATodos: " + Arrays.toString(resultado));
        System.out.println("Metodo esPosibleLlegarATodos2: " + Arrays.toString(resultadoSegundoMetodo));
        
        ManejadorArchivosGenerico.escribirArchivo("src/vuelosAED.txt", resultado);
        ManejadorArchivosGenerico.escribirArchivo("src/vuelosAED2.txt", resultadoSegundoMetodo);
    }
}
