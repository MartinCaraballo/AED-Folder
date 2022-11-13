
import java.util.ArrayList;
import java.util.TreeSet;

public class Parcial2 {

    public static void main(String[] args) {

        // CREAR EL GRAFO CON PERSONAS.TXT y CONTACTOS.TXT
        TGrafoContagios grafoTrazabilidad = (TGrafoContagios) UtilGrafos.cargarGrafo(
                "src/personas.txt",
                "src/contactos.txt",
                false, TGrafoContagios.class);

        String personaCOVID = "Kevin_Bacon";
        int maxDistancia = 6;

        // invocar al método "anillosDeProbablesContagiados" con estos parámetros;
        TAnillosContagio resultado = grafoTrazabilidad.anillosDeProbablesContagiados(personaCOVID, maxDistancia);

        // emitir por consola la cantidad de contactos que se encuentran a la distancia
        // de la personaCOVID indicada EN EL PIZARRÓN: distAnilloBuscar
        int distAnilloBuscar = 2;
        TreeSet<String> contactos = resultado.obtenerAnillo(distAnilloBuscar);

        System.out.println("Distancia de contacto: 3");
        contactos.forEach((contacto) -> {
            System.out.println(contacto);
        });

        // EMITIR EL ARCHIVO "ANILLOS.TXT", CON EL FORMATO INDICADO EN LA LETRA, 
        // CON LOS CONJUNTOS DE CONTACTOS HASTA UNA DISTANCIA MENOR O IGUAL A LA INDICADA
        // EN EL PIZARRÓN: distMaxParaArchivoListado
        int distMaxParaArchivoListado = 6;// SE INDICARÁ EN EL PIZARRÓN
        ArrayList<String> salida = new ArrayList<>();

        for (int i = 1; i <= distMaxParaArchivoListado; i++) {
            TreeSet<String> salidaContactos = resultado.obtenerAnillo(i);
            salida.add("DISTANCIA DE CONTACTO: " + i);
            salida.addAll(salidaContactos);
        }
        
        String[] salidaArchivo = new String[salida.size()];
        
        ManejadorArchivosGenerico.escribirArchivo("src/ANILLOS.txt", salida.toArray(salidaArchivo));
        
        
    }
}
