
import ut3.ta2.ManejadorArchivosGenerico;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Almacen geant = new Almacen("Geant");

        // cargar los productos desde el archivo "altasprueba.txt"
        String[] altasPrueba = ManejadorArchivosGenerico.leerArchivo("src/altasPrueba.txt");
        for (String alta : altasPrueba) {
            String[] altaSplitted = alta.split(",");
            Producto producto = new Producto(altaSplitted[0], altaSplitted[1]);
            producto.setPrecio(Integer.valueOf(altaSplitted[2]));
            producto.agregarStock(Integer.valueOf(altaSplitted[3]));
            geant.insertarProducto(producto);

        }

        // listar los productos ordenados por codigo, junto con su cantidad existente
        System.out.println(geant.imprimirProductos());

        //emitir el valor del stock
        System.out.println("El valor del stock del almacen es: " + geant.valorAlmacen());
        
        // simular las ventas a partir del archivo "ventaspruebas.txt"
        int antesVender = geant.valorAlmacen();
        String[] ventasPrueba = ManejadorArchivosGenerico.leerArchivo("src/ventasPrueba.txt");
        for (String venta : ventasPrueba) {
            String[] ventaSplitted = venta.split(",");
            geant.restarStock(ventaSplitted[0], Integer.valueOf(ventaSplitted[1]));
        }
        int luegoVender = geant.valorAlmacen();
        System.out.println("El valor del stock del almacen luego de la venta es: " + geant.valorAlmacen() + "\nDiferencia: " + (antesVender - luegoVender));
        
        // simular la eliminación de productos a partir del archivo "elimPrueba.txt"
        int antesEliminacion = geant.valorAlmacen();
        System.out.println("El valor del stock del almacen antes de la eliminacion de productos es: " + geant.valorAlmacen());
        String[] aEliminar = ManejadorArchivosGenerico.leerArchivo("src/elimPrueba.txt");
        for (String codigo : aEliminar) {
            geant.eliminarProducto(codigo);
        }
        int luegoEliminacion = geant.valorAlmacen();
        System.out.println("El valor del stock del almacen luego de la eliminación de productos es: " + geant.valorAlmacen() + "\nDiferencia: " + (antesEliminacion - luegoEliminacion));
                
        // listar los productos ordenados por codigo, junto con su cantidad existente
        System.out.println(geant.imprimirProductos());
        
        geant.obtenerListadoOrdenadoPorDescripcion();
        
        System.out.println(geant.buscarProductoPorCodigo("1000088"));

    }
}
