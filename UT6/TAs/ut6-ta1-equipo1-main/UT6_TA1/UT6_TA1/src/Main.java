/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jechague
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Crear una tabla de tipo THash e insertar las claves del archivo "claves_insertar.txt"
        THash tabla = new THash(200);
        String[] aInsertar = ManejadorArchivosGenerico.leerArchivo("src/claves_buscar.txt");
        for (String linea : aInsertar) {
            int clave = Integer.parseInt(linea);
            tabla.insertar(clave);
        }
        
        // Buscar en la tabla creada anteriormente las claves indicadas en el archivo "claves_buscar.txt"
        String[] aBuscar = ManejadorArchivosGenerico.leerArchivo("src/claves_buscar.txt");
        for (String linea : aBuscar) {
            int clave = Integer.parseInt(linea);
            tabla.buscar(clave);
        }
    }
    
}
