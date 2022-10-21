
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Parcial1 {

    public static void main(String[] args) throws IOException {

        String[] lineas = ManejadorArchivosGenerico.leerArchivo("src/productosCompras.txt");

        Almacen elAlmacen = new Almacen();

        //Set permite agregar elementos sin duplicados y ordenados. 
        for (String l : lineas) {
            String[] linea = l.split(",");
            Producto producto = new Producto(Integer.valueOf(linea[0]), Integer.valueOf(linea[1]));
            elAlmacen.agregarProducto(producto);
        }

        int codProducto1 = 1226;// indicado en el pizarron
        elAlmacen.stockSegunCodigo(codProducto1);

        ArrayList<String> arrayProductos = elAlmacen.listaProductos();

        ManejadorArchivosGenerico.escribirArchivo("src/listado.txt", arrayProductos);

    }

}
