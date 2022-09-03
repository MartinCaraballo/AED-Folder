/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sucursal;

import com.mycompany.ut3_pd6.Lista.Lista;
import com.mycompany.ut3_pd6.Nodo.Nodo;

/**
 *
 * @author Martin
 */
public class ManejadorSucursales {
    
    Lista<Sucursal> sucursales;
    
    
    public ManejadorSucursales() {
        sucursales = new Lista<>();
    }
    
    
    /**
     * Agregar una sucursal a la lista de sucursales. 
     * 
     * @param sucursal a agregar.
    */
    public void agregarSucursal(Sucursal sucursal) {
        sucursales.insertar(new Nodo<>(sucursal.getSucursal(), sucursal));
    }
    
    
    /**
     * Eliminar una sucursal de la lista de sucursales dada una clave. 
     * 
     * @param clave de la sucursal a eliminar.
    */
    public void eliminarSucursal(Comparable clave) {
        sucursales.eliminar(clave);
    }
    
    
    /**
     * Buscar una sucursal dada una clave. 
     * 
     * @param clave de la sucursal a buscar.
     * @return una sucursal si se encuentra, null en caso contrario.
    */
    public Sucursal buscarSucursal(Comparable clave) {
        Nodo<Sucursal> resultado = sucursales.buscar(clave);
        return (resultado == null) ? null : resultado.getDato();
    }
    
    
    /**
     * Retorna un string con todas las sucursales ingresadas.
     * 
     * @return String.
    */
    public String listarSucursales() {
        if (sucursales.esVacia()) {
            return "Lista vacía.";
        } else {
            StringBuilder stringBuilder = new StringBuilder("Lista de sucursales:\n");
            Nodo<Sucursal> nodoActual = sucursales.getPrimero();
            while(nodoActual != null) {
                stringBuilder.append(nodoActual.getDato().getSucursal()).append("\n");
                nodoActual = nodoActual.getSiguiente();
            }
            return stringBuilder.toString();
        }
    }
    
    
    /**
     * Retorna un string con todas las sucursales ingresadas separadas por el separador ingresado.
     * 
     * @return String.
    */
    public String listarSucursales(String separador) {
        if (sucursales.esVacia()) {
            return "Lista vacía.";
        } else {
            StringBuilder stringBuilder = new StringBuilder("Lista de sucursales:\n");
            Nodo<Sucursal> nodoActual = sucursales.getPrimero();
            while(nodoActual != null) {
                stringBuilder.append(nodoActual.getDato().getSucursal()).append(separador);
                nodoActual = nodoActual.getSiguiente();
            }
            return stringBuilder.toString();
        }
    }
    
    
    /**
     * Indica la cantidad de sucursales ingresadas.
     * 
     * @return int.
    */
    public int cantidadSucursales() {
        return sucursales.cantElementos();
    }
    
    
    /**
     * Indica si hay al menos una sucursal ingresada.
     * 
     * @return true o false.
    */
    public boolean existenSucursales() {
        return sucursales.esVacia();
    }
}
