
import ut3.ta2.ManejadorArchivosGenerico;


public class Almacen implements IAlmacen {

    private String nombre;
    private String direccion;
    private String telefono;

    private TArbolBB<Producto> productos;

    public Almacen(String nombre) {
        this.nombre = nombre;
        this.productos = new TArbolBB<Producto>();
    }

    @Override
    public void insertarProducto(Producto unProducto) {
        TElementoAB<Producto> elementoProducto = new TElementoAB<>(unProducto.getEtiqueta(), unProducto);
        productos.insertar(elementoProducto);
    }

    @Override
    public String imprimirProductos() {
        Lista<Producto> listaProductos = productos.inorden();
        StringBuilder sb = new StringBuilder("Productos:");
        Nodo<Producto> nodoActual = listaProductos.getPrimero();
        while (nodoActual != null) {
            Producto producto = nodoActual.getDato();
            sb.append("\nNombre: ").append(producto.getNombre()).append(" | Precio: ").append(producto.getPrecio())
                    .append(" | Stock: ").append(producto.getStock()).append(" | Etiqueta: ").append(producto.getEtiqueta());
            nodoActual = nodoActual.getSiguiente();
        }
        return sb.toString();
    }

    @Override
    public Boolean agregarStock(Comparable clave, Integer cantidad) {
        Producto producto = productos.buscar(clave).getDatos();
        if (producto != null) {
            producto.agregarStock(cantidad);
            return true;
        }
        return false;
    }

    @Override
    public Integer restarStock(Comparable clave, Integer cantidad) {
        TElementoAB<Producto> elementoEncontrado = productos.buscar(clave);
        if (elementoEncontrado != null) {
            Producto producto = elementoEncontrado.getDatos();
            producto.restarStock(cantidad);
            return producto.getStock();
        }
        return -1;
    }

    @Override
    public Producto buscarPorCodigo(Comparable clave) {
        return productos.buscar(clave).getDatos();
    }

    @Override
    public boolean eliminarProducto(Comparable clave) {
        TElementoAB<Producto> elementoEncontrado = productos.buscar(clave);
        if (elementoEncontrado != null) {
            Producto prod = elementoEncontrado.getDatos();
            productos.eliminar(clave);
            return true;
        }
        return false;
    }

    public Integer valorAlmacen() {
        int valorAlmacen = 0;
        Lista<Producto> listaProductos = productos.inorden();
        Nodo<Producto> nodoActual = listaProductos.getPrimero();
        while (nodoActual != null) {
            Producto producto = nodoActual.getDato();
            valorAlmacen += (producto.getPrecio() * producto.getStock());
            nodoActual = nodoActual.getSiguiente();
        }
        return valorAlmacen;
    }
    
    public Lista<Producto> obtenerListadoOrdenadoPorDescripcion() {
        TArbolBB<Producto> aux = new TArbolBB<>();
        String[] codsProductosEnOrden = productos.inOrden().split("-");
        for (String codProducto : codsProductosEnOrden) {
            Producto productoEncontrado = buscarPorCodigo(codProducto);
            if (productoEncontrado != null) {
                TElementoAB<Producto> elemento = new TElementoAB<>(productoEncontrado.getNombre(), productoEncontrado);
                aux.insertar(elemento);
            }
        }
        Lista<Producto> productosOrdenados = aux.inorden();
        Nodo<Producto> nodoActual = productosOrdenados.getPrimero();
        String[] paraEscribirArchivo = new String[productosOrdenados.cantElementos()];
        for (int i = 0; i < productosOrdenados.cantElementos(); i++) {
            if (nodoActual != null) {
                Producto prod = nodoActual.getDato();
                paraEscribirArchivo[i] = prod.getNombre()+ ", " + prod.getPrecio();
            }
            nodoActual = nodoActual.getSiguiente();
        }
        ManejadorArchivosGenerico.escribirArchivo("src/productos.txt", paraEscribirArchivo);
        return productosOrdenados;
    }
    
    public String buscarProductoPorCodigo(Comparable clave) {
        StringBuilder sb = new StringBuilder("El producto buscado es:");
        TElementoAB<Producto> elementoEncontrado = productos.buscar(clave);
        if (elementoEncontrado != null) {
            Producto producto = elementoEncontrado.getDatos();
            String disponibilidad = (producto.getStock() > 0) ? "Disponible" : "No disponible"; 
            sb.append("\nProducto: ").append(producto.getNombre())
                    .append(" | Disponibilidad: ").append(disponibilidad)
                    .append(" | Stock: ").append(producto.getStock());
        }
        return sb.toString();
    }
}
