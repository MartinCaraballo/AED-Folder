
import java.util.Collection;
import java.util.LinkedList;

public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // cargar grafo con actores y relaciones
        TGrafoNoDirigido gkb = UtilGrafos.cargarGrafo("src/actores.txt", "src/en_pelicula.txt", false, TGrafoNoDirigido.class);

        String actorZZ1 = "Harrison_Ford"; // se indicará en el pizarrón
        Collection<TVertice> contactos1 = gkb.listarContactos(actorZZ1, 1);
        // escribir los resultados al archivo "salida.txt"
        String[] salidaContactos1 = new String[contactos1.size() + 1];
        salidaContactos1[0] = "Salida de contactos 1:";
        int contador = 1;
        for (TVertice contacto : contactos1) {
            salidaContactos1[contador] = contacto.getEtiqueta().toString();
            contador++;
        }
        ManejadorArchivosGenerico.escribirArchivo("src/salida.txt", salidaContactos1);

        String actorZZ2 = "Robert_Niro"; // se indicará en el pizarrón
        Collection<TVertice> contactos2 = gkb.listarContactos(actorZZ2, 2);

        // escribir los resultados al archivo "salida.txt"
        // emitir un archivo de salida, "salida.txt" con la lista de contactos obtenida
        String[] salidaContactos2 = new String[contactos2.size() + 1];
        salidaContactos2[0] = "Salida de contactos 2:";
        contador = 1;
        for (TVertice contacto : contactos2) {
            salidaContactos2[contador] = contacto.getEtiqueta().toString();
            contador++;
        }

        ManejadorArchivosGenerico.escribirArchivo("src/salida.txt", salidaContactos2);

    }
}
