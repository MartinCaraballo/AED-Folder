
import java.util.Collection;
import java.util.LinkedList;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        TArbolTrie trie = new TArbolTrie();

        // CARGAR EN EL TRIE LOS DISPOSITIVOS PARTIR DEL ARCHIVO DISPOSITIVOS.TXT
        String[] dispositivos = ManejadorArchivosGenerico.leerArchivo("src/dispositivos.txt");
        for (String dispositivo : dispositivos) {
            String[] dispositivoSplitted = dispositivo.split(",");
            TDispositivo aInsertar = new TDispositivo(dispositivoSplitted[0], dispositivoSplitted[1], "unosDatos");
            trie.insertar(aInsertar);
        }
        
//        String subRed = "192.168."; // utilizar el indicado en el archivo "subredes.txt"
//        
//        LinkedList<TDispositivo> dispositivosResultado = trie.buscarDispositivos(subRed);
//        String[] salida = new String[dispositivosResultado.size()];
//        int contador = 0;
//        
//        for (TDispositivo tDispositivo : dispositivosResultado) {
//            String aEscribir = tDispositivo.getNombre() + "," + tDispositivo.getDirIP();
//            salida[contador] = aEscribir;
//            contador++;
//        }

        String[] subRedesABuscar = ManejadorArchivosGenerico.leerArchivo("src/subRedes.txt");
        for (String subRed : subRedesABuscar) {
            LinkedList<TDispositivo> resultado = trie.buscarDispositivos(subRed);
            String[] salida = new String[resultado.size() + 1];
            salida[0] = "Resultado para la subred: " + subRed;
            int contador = 1;
            for (TDispositivo tDispositivo : resultado) {
                String aEscribir = tDispositivo.getNombre() + "," + tDispositivo.getDirIP();
                salida[contador] = aEscribir;
                contador++;
            }
            ManejadorArchivosGenerico.escribirArchivo("src/salida.txt", salida);
        }

        // crear el archivo "salida.txt", con los dispositivos(1 por linea) 
        // correspondientes a la subred indicada
        // imprimir Nombre y dirección de  IP, 
        //ManejadorArchivosGenerico.escribirArchivo("./src/salida.txt", salida);
    }
}
