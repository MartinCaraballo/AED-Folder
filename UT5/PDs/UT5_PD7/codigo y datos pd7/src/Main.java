import java.util.LinkedList;
import java.util.List;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args){
        TArbolTrieTelefonos trieAbonados = new TArbolTrieTelefonos();

       // CARGAR EN EL TRIE LOS TELÉFONOS Y NOMBRES A PARTIR DEL ARCHIVO ABONADOS.TXT
       String[] abonados = ManejadorArchivosGenerico.leerArchivo("src/abonados.txt");
       for (String abonado : abonados) {
           String[] abonadoSplitted = abonado.split(",");
           TAbonado aux = new TAbonado(abonadoSplitted[1], abonadoSplitted[0]);
           trieAbonados.insertar(abonadoSplitted[0], aux);
       }
        
        
        String codigoPais = "054" ; // utilizar el indicado en el archivo "codigos.txt"
        String codigoArea = "90" ;// utilizar el indicado en el archivo "codigos.txt"
        LinkedList<TAbonado> ab = trieAbonados.buscarTelefonos(codigoPais, codigoArea);
        
        // crear el archivo "salida.txt", con los abonados (1 por linea) 
        // correspondientes al pais y area 
        // imprimir Nombre y teléfono, 
        // ordenados alfabeticamente por nombre
        String[] salida = new String[ab.size()];
        for (int i = 0; i < ab.size(); i++) {
            TAbonado abonado = ab.get(i);
            String linea = abonado.getNombre() + "," + abonado.getTelefono();
            salida[i] = linea;
        }
        ManejadorArchivosGenerico.escribirArchivo("src/salida.txt", salida);
        
        LinkedList<TAbonado> ab2 = trieAbonados.buscarTelefonos("596", "96");
        salida = new String[ab2.size()];
        for (int i = 0; i < ab2.size(); i++) {
            TAbonado abonado = ab2.get(i);
            String linea = abonado.getNombre() + "," + abonado.getTelefono();
            salida[i] = linea;
        }
        ManejadorArchivosGenerico.escribirArchivo("src/salida2.txt", salida);
      
        
    }
}