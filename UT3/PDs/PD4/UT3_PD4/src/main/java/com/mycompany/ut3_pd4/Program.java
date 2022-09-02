
import com.mycompany.ut3_pd4.ManejadorArchivosGenerico;


/**
 *
 * @author abadie
 */
public class Program {

    public static void main(String[] args) {
        Almacen geant = new Almacen("San Martin 2343", "099123456", "Geant");
        int incrementoValor = 0;
        String[] lineaLeidaSeparada = new String[4];
        String[] lectura = ManejadorArchivosGenerico.leerArchivo("src\\altas.txt");
        for (int i = 0; i < lectura.length; i++) {
            lineaLeidaSeparada = lectura[i].split(",");
            Producto producto = new Producto(lineaLeidaSeparada[0], lineaLeidaSeparada[1], Integer.parseInt(lineaLeidaSeparada[2]), Integer.parseInt(lineaLeidaSeparada[3]));
            incrementoValor += (producto.getPrecio() * producto.getStock());
            geant.insertarProducto(producto);

        }
        System.out.println(geant.imprimirProductos());
        /*
        Nodo<Producto> nodoActual = geant.getListaProductos().primero;
        while (nodoActual.getSiguiente() != null) {
            System.out.println(nodoActual.getDato().getNombre());
            nodoActual = nodoActual.getSiguiente();
        }
         */
        System.out.println("El valor total de los productos añadidos es " + incrementoValor);

        int decrementoValor = 0;
        String[] lineaLeidaVentas = new String[2];
        String[] lecturaVentas = ManejadorArchivosGenerico.leerArchivo("src\\ventas.txt");
        for (int i = 0; i < lecturaVentas.length; i++) {
            lineaLeidaVentas = lecturaVentas[i].split(",");
            Producto producto = geant.buscarPorCodigo(lineaLeidaVentas[0]);
            geant.vender(producto, Integer.parseInt(lineaLeidaVentas[1]));
            decrementoValor = producto.getPrecio() * Integer.parseInt(lineaLeidaVentas[1]);
        }
        System.out.println("\nEl valor total de los productos vendidos es " + decrementoValor);
        System.out.println(geant.imprimirProductosVendidos());

    }

}
