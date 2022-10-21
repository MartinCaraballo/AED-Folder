
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author carolglass
 */
public class Almacen {

    private TreeSet<Producto> productos;

    public Almacen() {
        productos = new TreeSet<>(new Comparator<Producto>() {
            @Override
            public int compare(Producto prod1, Producto prod2) {
                if (prod1.getCodigo() < prod2.getCodigo()) {
                    return -1;
                } else if (prod1.getCodigo() > prod2.getCodigo()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public ArrayList<String> listaProductos() {
        final ArrayList<String> arrayProductos = new ArrayList(productos.size());
        productos.forEach((producto) -> {
            String texto = String.valueOf(producto.getCodigo() + "," + producto.getStock());
            arrayProductos.add(texto);
        });
        return arrayProductos;
    }

    public int stockSegunCodigo(int codigo) {
        Iterator<Producto> itr = productos.iterator();
        int resultado = 0;
        while (itr.hasNext()) {
            Producto productoActual = itr.next();
            if (productoActual.getCodigo() == codigo) {
                System.out.println("Codigo Producto:" + productoActual.getCodigo() + " Stock: " + productoActual.getStock());
                resultado = productoActual.getStock();
            }
        }
        return resultado;
    }

}
