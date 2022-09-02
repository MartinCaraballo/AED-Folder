
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Martin
 */
public class Almacen implements IAlmacen {

    private String direccion;
    private String telefono;
    private String nombre;
    private Lista<Producto> listaProductos;
    private ListaOrdenada<Producto> listaVentas;

    public Almacen(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        listaProductos = new Lista<>();
        listaVentas = new ListaOrdenada<>();
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public void setDireccion(String direccion) {
        this.direccion = (!direccion.isEmpty() ? direccion : this.direccion);
    }

    @Override
    public String getTelefono() {
        return telefono;
    }

    @Override
    public void setTelefono(String telefono) {
        this.telefono = (!telefono.isEmpty() ? telefono : this.telefono);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public Lista<Producto> getListaProductos() {
        return listaProductos;
    }

    @Override
    public long obtenerValorStock() {
        long valorStock = 0;
        if (listaProductos.esVacia()) {
            return valorStock;
        } else {
            Nodo<Producto> nodoActual = listaProductos.getPrimero();
            Producto producto = nodoActual.getDato();
            while (nodoActual != null) {
                valorStock += producto.getPrecio();
                nodoActual = nodoActual.getSiguiente();
                producto = nodoActual.getDato();
            }
            return valorStock;
        }
    }

    @Override
    public void insertarProducto(Producto unProducto) {
        Nodo unNodo = new Nodo(unProducto.getCodProducto(), unProducto);
        listaProductos.insertar(unNodo);

    }

    @Override
    public boolean eliminarProducto(Comparable codProducto) {
        return (listaProductos.eliminar(codProducto));
    }

    @Override
    public String imprimirProductos() {
        if (listaProductos.esVacia()) {
            return "Lista vacía.";
        } else {
            StringBuilder stringBuilder = new StringBuilder("Los productos son:\n");
            Nodo<Producto> nodoActual = listaProductos.getPrimero();
            Producto producto = nodoActual.getDato();
            while (nodoActual != null) {
                producto = nodoActual.getDato();
                stringBuilder.append("Nombre: ").append(producto.getNombre())
                        .append(" | Precio: ").append(producto.getPrecio())
                        .append(" | Stock: ").append(producto.getStock())
                        .append(" | Código de Producto: ").append(producto.getCodProducto()).append("\n");
                nodoActual = nodoActual.getSiguiente();
            }
            return stringBuilder.toString();
        }
    }

    @Override
    public String imprimirSeparador(String separador) {
        if (listaProductos.esVacia()) {
            return "Lista vacía.";
        } else {
            StringBuilder stringBuilder = new StringBuilder("Los productos son:\n");
            Nodo<Producto> nodoActual = listaProductos.getPrimero();
            Producto producto = nodoActual.getDato();
            while (nodoActual != null) {
                stringBuilder.append(producto.getNombre()).append(separador).append(" ");
                nodoActual = nodoActual.getSiguiente();
                producto = nodoActual.getDato();
            }
            return stringBuilder.toString();
        }
    }

    @Override
    public Boolean agregarStock(Comparable codProducto, Integer cantidad) {
        Nodo<Producto> nodoAIncrementar = listaProductos.buscar(codProducto);
        if (nodoAIncrementar == null) {
            return false;
        } else {
            nodoAIncrementar.getDato().agregarCantidadStock(cantidad);
            return true;
        }
    }
    
    public void vender(Producto producto, Integer cantidad) {
        Comparable codProducto = producto.getCodProducto();
        restarStock(codProducto, cantidad);
        Comparable nombre = producto.getNombre();
        listaVentas.insertarOrdenado(new Nodo(nombre, producto));
    }

    @Override
    public Integer restarStock(Comparable codProducto, Integer cantidad) {
        Nodo<Producto> nodoProducto = listaProductos.buscar(codProducto);
        Producto producto = nodoProducto.getDato();
        int stockActual = producto.getStock();
        int nuevoStock = stockActual - cantidad;
        producto.setStock(nuevoStock);
        return nuevoStock;
    }

    @Override
    public Producto buscarPorCodigo(Comparable codProducto) {
        Nodo<Producto> nodoResultado = listaProductos.buscar(codProducto);
        return nodoResultado.getDato();
    }
    

    @Override
    public void listarOrdenadoPorNombre() {
        ListaOrdenada<Producto> listaOrdenada = new ListaOrdenada<>();
        Nodo<Producto> nodoActual = listaProductos.getPrimero();
        Producto producto = nodoActual.getDato();

        while (nodoActual != null) {
            producto = nodoActual.getDato();
            listaOrdenada.insertarOrdenado(new Nodo(producto.getNombre(), producto));
            nodoActual = nodoActual.getSiguiente();
        }
        listaOrdenada.imprimir();
    }

    @Override
    public Producto buscarPorDescripcion(String descripcion) {
        Nodo<Producto> nodoActual = listaProductos.getPrimero();
        Producto producto = nodoActual.getDato();
        String etiquetaDescripcion = producto.getNombre();

        while (nodoActual != null) {
            if (descripcion.equalsIgnoreCase(etiquetaDescripcion)) {
                return producto;
            }
            nodoActual = nodoActual.getSiguiente();
            producto = nodoActual.getDato();
            etiquetaDescripcion = producto.getNombre();
        }
        return null;
    }

    @Override
    public int cantidadProductos() {
        return listaProductos.cantElementos();
    }
    
    public String imprimirProductosVendidos() {
        if (listaVentas.esVacia()) {
            return "Lista vacía.";
        } else {
            StringBuilder stringBuilder = new StringBuilder("Los productos son:\n");
            Nodo<Producto> nodoActual = listaVentas.getPrimero();
            Producto producto = nodoActual.getDato();
            while (nodoActual != null) {
                producto = nodoActual.getDato();
                stringBuilder.append("Nombre: ").append(producto.getNombre())
                        .append(" | Precio: ").append(producto.getPrecio())
                        .append(" | Stock: ").append(producto.getStock())
                        .append(" | Código de Producto: ").append(producto.getCodProducto()).append("\n");
                nodoActual = nodoActual.getSiguiente();
            }
            return stringBuilder.toString();
        }
    }

}
