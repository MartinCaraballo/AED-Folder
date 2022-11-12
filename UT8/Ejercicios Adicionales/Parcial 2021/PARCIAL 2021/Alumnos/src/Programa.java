
import java.util.LinkedList;

public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // LEER CUIDADOSAMENTE LA CONSIGNA DE ESTE TRABAJO, PUBLICADA EN LA TAREA PARCIAL2_PARTE3
        // LOS COMENTARIOS DEL PRESENTE ARCHIVO NO SUSTITUYEN LO INDICADO EN LA LETRA DE LA TAREA
        
        TGrafoRedDatos redDatos;

        // cargar grafo con SERVIDORES y ENLACES
        //redDatos = (TGrafoRedDatos)UtilGrafos.cargarGrafo...
       
        // EJECUTAR PARA servidor1 = BUF y servidor2 = DFW
        String servidor1 = "BUF";
        String servidor2 = "DFW";   //BUF BWI PIT DFW
        LinkedList<TVertice> ruta = redDatos.rutaMenosSaltos(servidor1, servidor2);
        // ESCRIBIR RUTA EN rutas.txt SEGUIDO DE 2 LINEAS EN BLANCO

        // EJECUTAR PARA servidor1 = BUF y servidor2 = LAS
        servidor2 = "LAS";
        ruta = redDatos.rutaMenosSaltos(servidor1, servidor2);
        // ESCRIBIR RUTA EN rutas.txt SEGUIDO DE 2 LINEAS EN BLANCO


        // EJECUTAR PARA servidor1 = BUF y servidor2 = MIA
        servidor2 = "MIA";
        ruta = redDatos.rutaMenosSaltos(servidor1, servidor2);
        // ESCRIBIR RUTA EN rutas.txt SEGUIDO DE 2 LINEAS EN BLANCO

    }
}
