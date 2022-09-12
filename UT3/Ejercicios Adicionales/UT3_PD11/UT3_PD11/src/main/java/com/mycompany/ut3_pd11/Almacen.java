/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut3_pd11;

/**
 *
 * @author Martin
 */
public class Almacen {

    private String nombre;
    private Lista<Articulo> inventario;

    public Almacen(String unNombre) {
        nombre = unNombre;
        inventario = new Lista<>();
    }

    public String imprimirInventario() {
        if (inventario.esVacia()) {
            return "No hay articulos en el inventario.";
        } else {
            StringBuilder stringBuilder = new StringBuilder("Los elementos registrados en el inventario son:");
            Nodo<Articulo> nodoActual = inventario.getPrimero();
            while (nodoActual != null) {
                Articulo articulo = nodoActual.getDato();
                stringBuilder.append("\n\t").append(articulo.getCodigo())
                        .append("\t| ").append(articulo.getNombre()).append("| ").append(articulo.getDescipcion());
                nodoActual = nodoActual.getSiguiente();
            }
            return stringBuilder.toString();
        }
    }

    public void ordenaParesImpares() {
        if (inventario.esVacia()) {
            return;
        } else {
            ListaOrdenada<Articulo> codigosImpares = new ListaOrdenada<>();
            ListaOrdenada<Articulo> codigosPares = new ListaOrdenada<>();
            
            Nodo<Articulo> nodoActual = inventario.getPrimero();
            Nodo<Articulo> nodoImparMenor = inventario.getPrimero();
            Nodo<Articulo> nodoParMenor = inventario.getPrimero();
            while (nodoActual != null) {
                Articulo articulo = nodoActual.getDato();
                if (articulo.getCodigo() % 2 != 0) {
                    if (articulo.getCodigo() <= nodoImparMenor.getDato().getCodigo()) {
                        codigosImpares.insertar(new Nodo(articulo.getCodigo(), articulo));
                        inventario.eliminar(nodoActual.getEtiqueta());
                    }
                } else {
                    if (articulo.getCodigo() <= nodoParMenor.getDato().getCodigo()) {
                        codigosPares.insertar(new Nodo(articulo.getCodigo(), articulo));
                        inventario.eliminar(nodoActual.getEtiqueta());
                    }
                }
                nodoImparMenor = inventario.getPrimero();
                nodoParMenor = inventario.getPrimero();
                nodoActual = nodoActual.getSiguiente();
            }
            
            inventario = new Lista<>();
            
            nodoActual = codigosImpares.getPrimero();
            while (nodoActual != null) {
                inventario.insertar(new Nodo(nodoActual.getEtiqueta(), nodoActual.getDato()));
                nodoActual = nodoActual.getSiguiente();
            }
            nodoActual = codigosPares.getPrimero();
            while (nodoActual != null) {
                inventario.insertar(new Nodo(nodoActual.getEtiqueta(), nodoActual.getDato()));
                nodoActual = nodoActual.getSiguiente();
            }
        }
    }
    
    public void insertarArticuloInventario(Articulo articulo) {
        Nodo<Articulo> nodo = new Nodo(articulo.getCodigo(), articulo);
        inventario.insertar(nodo);
    }
    
    public void eliminarArticuloInventario(int codigo) {
        inventario.eliminar(codigo);
    }
    
    public Lista<Articulo> getInventario() {
        return inventario;
    }
}
