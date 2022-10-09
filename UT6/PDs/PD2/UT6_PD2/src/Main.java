
import java.util.Random;

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
        // 140 elementos para que la tabla quede con un factor de carga de 0,7
        for (int i = 0; i < 140; i++) {
            int clave = Integer.parseInt(aInsertar[i]);
            tabla.insertar(clave);
        }
        
        // Para calcular las comparaciones al insertar con X factor de carga, primero inserto elementos hasta que la tabla quede
        // con ese factor de carga, y luego inserto un elemento para ver las comparaciones.
        // Para las comparaciones de buscar con exito, busco un elemento ya insertado, y para las busquedas sin exito busco
        // un elemento que todavía no ha sido insertado del archivo claves_buscar.txt.
        
        System.out.println("Comparaciones de insertar con factor de carga 0,7: " + promedioCompInsercion(tabla, aInsertar, 140));
        System.out.println("Comparaciones de buscar con exito con factor de carga 0,7: " + promedioCompBusquedaConExito(tabla, aInsertar, 140));
        System.out.println("Comparaciones de buscar sin exito con factor de carga 0,7: " + promedioCompBusquedaSinExito(tabla));
        
        
        // 150 elementos para que la tabla quede con un factor de carga de 0,75
        for (int i = 141; i < 150; i++) {
            int clave = Integer.parseInt(aInsertar[i]);
            tabla.insertar(clave);
        }
        
        System.out.println("\nComparaciones de insertar con factor de carga 0,75: " + promedioCompInsercion(tabla, aInsertar, 150));
        System.out.println("Comparaciones de buscar con exito con factor de carga 0,75: " + promedioCompBusquedaConExito(tabla, aInsertar, 150));
        System.out.println("Comparaciones de buscar sin exito con factor de carga 0,75: " + promedioCompBusquedaSinExito(tabla));
        
        // 160 elementos para que la tabla quede con un factor de carga de 0,8
        for (int i = 151; i < 160; i++) {
            int clave = Integer.parseInt(aInsertar[i]);
            tabla.insertar(clave);
        }
        
        System.out.println("\nComparaciones de insertar con factor de carga 0,8: " + promedioCompInsercion(tabla, aInsertar, 160));
        System.out.println("Comparaciones de buscar con exito con factor de carga 0,8: " + promedioCompBusquedaConExito(tabla, aInsertar, 160));
        System.out.println("Comparaciones de buscar sin exito con factor de carga 0,8: " + promedioCompBusquedaSinExito(tabla));
        
        // 170 elementos para que la tabla quede con un factor de carga de 0,85
        for (int i = 161; i < 170; i++) {
            int clave = Integer.parseInt(aInsertar[i]);
            tabla.insertar(clave);
        }
        
        System.out.println("\nComparaciones de insertar con factor de carga 0,85: " + promedioCompInsercion(tabla, aInsertar, 170));
        System.out.println("Comparaciones de buscar con exito con factor de carga 0,85: " + promedioCompBusquedaConExito(tabla, aInsertar, 170));
        System.out.println("Comparaciones de buscar sin exito con factor de carga 0,85: " + promedioCompBusquedaSinExito(tabla));
        
        // 180 elementos para que la tabla quede con un factor de carga de 0,9
        for (int i = 171; i < 180; i++) {
            int clave = Integer.parseInt(aInsertar[i]);
            tabla.insertar(clave);
        }
        
        System.out.println("\nComparaciones de insertar con factor de carga 0,9: " + promedioCompInsercion(tabla, aInsertar, 180));
        System.out.println("Comparaciones de buscar con exito con factor de carga 0,9: " + promedioCompBusquedaConExito(tabla, aInsertar, 180));
        System.out.println("Comparaciones de buscar sin exito con factor de carga 0,9: " + promedioCompBusquedaSinExito(tabla));
        
        // 182 elementos para que la tabla quede con un factor de carga de 0,92
        tabla.insertar(Integer.parseInt(aInsertar[181]));
        
        System.out.println("\nComparaciones de insertar con factor de carga 0,91: " + promedioCompInsercion(tabla, aInsertar, 181));
        System.out.println("Comparaciones de buscar con exito con factor de carga 0,91: " + promedioCompBusquedaConExito(tabla, aInsertar, 181));
        System.out.println("Comparaciones de buscar sin exito con factor de carga 0,91: " + promedioCompBusquedaSinExito(tabla));
        
        // 184 elementos para que la tabla quede con un factor de carga de 0,92
        tabla.insertar(Integer.parseInt(aInsertar[183]));
        
        System.out.println("\nComparaciones de insertar con factor de carga 0,92: " + promedioCompInsercion(tabla, aInsertar, 183));
        System.out.println("Comparaciones de buscar con exito con factor de carga 0,92: " + promedioCompBusquedaConExito(tabla, aInsertar, 183));
        System.out.println("Comparaciones de buscar sin exito con factor de carga 0,92: " + promedioCompBusquedaSinExito(tabla));
        
        // 186 elementos para que la tabla quede con un factor de carga de 0,93
        tabla.insertar(Integer.parseInt(aInsertar[185]));
        
        System.out.println("\nComparaciones de insertar con factor de carga 0,93: " + promedioCompInsercion(tabla, aInsertar, 185));
        System.out.println("Comparaciones de buscar con exito con factor de carga 0,93: " + promedioCompBusquedaConExito(tabla, aInsertar, 185));
        System.out.println("Comparaciones de buscar sin exito con factor de carga 0,93: " + promedioCompBusquedaSinExito(tabla));
        
        // 188 elementos para que la tabla quede con un factor de carga de 0,94
        tabla.insertar(Integer.parseInt(aInsertar[187]));
        
        System.out.println("\nComparaciones de insertar con factor de carga 0,94: " + promedioCompInsercion(tabla, aInsertar, 187));
        System.out.println("Comparaciones de buscar con exito con factor de carga 0,94: " + promedioCompBusquedaConExito(tabla, aInsertar, 187));
        System.out.println("Comparaciones de buscar sin exito con factor de carga 0,94: " + promedioCompBusquedaSinExito(tabla));
        
        // 190 elementos para que la tabla quede con un factor de carga de 0,95
        tabla.insertar(Integer.parseInt(aInsertar[189]));
        
        System.out.println("\nComparaciones de insertar con factor de carga 0,95: " + promedioCompInsercion(tabla, aInsertar, 189));
        System.out.println("Comparaciones de buscar con exito con factor de carga 0,95: " + promedioCompBusquedaConExito(tabla, aInsertar, 189));
        System.out.println("Comparaciones de buscar sin exito con factor de carga 0,95: " + promedioCompBusquedaSinExito(tabla));
        
        // 192 elementos para que la tabla quede con un factor de carga de 0,96
        tabla.insertar(Integer.parseInt(aInsertar[191]));
        
        System.out.println("\nComparaciones de insertar con factor de carga 0,96: " + promedioCompInsercion(tabla, aInsertar, 191));
        System.out.println("Comparaciones de buscar con exito con factor de carga 0,96: " + promedioCompBusquedaConExito(tabla, aInsertar, 191));
        System.out.println("Comparaciones de buscar sin exito con factor de carga 0,96: " + promedioCompBusquedaSinExito(tabla));
        
        // 194 elementos para que la tabla quede con un factor de carga de 0,97
        tabla.insertar(Integer.parseInt(aInsertar[193]));
        
        System.out.println("\nComparaciones de insertar con factor de carga 0,97: " + promedioCompInsercion(tabla, aInsertar, 193));
        System.out.println("Comparaciones de buscar con exito con factor de carga 0,97: " + promedioCompBusquedaConExito(tabla, aInsertar, 193));
        System.out.println("Comparaciones de buscar sin exito con factor de carga 0,97: " + promedioCompBusquedaSinExito(tabla));
        
        // 196 elementos para que la tabla quede con un factor de carga de 0,98
        tabla.insertar(Integer.parseInt(aInsertar[195]));
        
        System.out.println("\nComparaciones de insertar con factor de carga 0,98: " + promedioCompInsercion(tabla, aInsertar, 195));
        System.out.println("Comparaciones de buscar con exito con factor de carga 0,98: " + promedioCompBusquedaConExito(tabla, aInsertar, 195));
        System.out.println("Comparaciones de buscar sin exito con factor de carga 0,98: " + promedioCompBusquedaSinExito(tabla));
        
        // 198 elementos para que la tabla quede con un factor de carga de 0,99
        tabla.insertar(Integer.parseInt(aInsertar[197]));
        
        System.out.println("\nComparaciones de insertar con factor de carga 0,99: " + promedioCompInsercion(tabla, aInsertar, 197));
        System.out.println("Comparaciones de buscar con exito con factor de carga 0,99: " + promedioCompBusquedaConExito(tabla, aInsertar, 197));
        System.out.println("Comparaciones de buscar sin exito con factor de carga 0,99: " + promedioCompBusquedaSinExito(tabla));
        
    }
    
    private static int promedioCompBusquedaConExito(THash h, String[] clavesInsertadas, int ultimaLineaInsertada) {
        int promedio = 0;
        
        for (int j = 0; j < 200; j++) {
            promedio += busquedaConExito(h, clavesInsertadas, ultimaLineaInsertada + 1);
        }
        
        return promedio / 200;
    }
    
    private static int busquedaConExito(THash h, String[] clavesInsertadas, int ultimaLineaInsertada) {
        Random random = new Random();
        int claveABuscar = random.nextInt(0, ultimaLineaInsertada);
        return h.buscar(Integer.parseInt(clavesInsertadas[claveABuscar]));
    }
    
    private static int promedioCompBusquedaSinExito(THash h) {
        int promedio = 0;
        
        for (int j = 0; j < 200; j++) {
            promedio += busquedaSinExito(h);
        }
        
        return promedio / 200;
    }
    
    private static int busquedaSinExito(THash h) {
       Random random = new Random();
       // Todos los numeros insertados son de 7 digitos o menos, por lo tanto para asegurarnos de
       // el numero generado no este, tomamos como minimo un numero de 8 digitos.
       int claveABuscar = random.nextInt(9999999, Integer.MAX_VALUE);
       return h.buscar(claveABuscar);
    }
    
    private static int promedioCompInsercion(THash h, String[] clavesAInsertar, int ultimaLineaInsertada) {
        int promedio = 0;
        
        for (int j = 0; j < 200; j++) {
            promedio += insercion(h, clavesAInsertar, ultimaLineaInsertada + 1);
        }
        
        return promedio / 200;
    }
    
    private static int insercion(THash h, String[] clavesAInsertar, int ultimaLineaInsertada) {
        THash aux = new THash(200);
        Random random = new Random();
        int lineaAInsertar = random.nextInt(ultimaLineaInsertada, 199);
        aux.setTabla(h.retornarTabla()); // para que el factor de carga no sea modificado.
        return (aux.insertar(Integer.parseInt(clavesAInsertar[lineaAInsertar])));
    }
    
}
