package com.mycompany.ut3_ta10;


import java.util.ArrayList;

/**
 *
 * @author Martin
 */
public class ManejadorSucursales {

    private ArrayList<Sucursal> sucursales;

    public ManejadorSucursales() {
        sucursales = new ArrayList<>();
    }

    
    /**
     * Agregar una sucursal a la lista de sucursales. 
     * 
     * @param sucursal a agregar.
    */
    public void agregarSucursal(Sucursal sucursal) {
        sucursales.add(sucursal);
    }


    /**
     * Buscar una sucursal dada una localidad. 
     * 
     * @param clave de la sucursal a buscar.
     * @return una sucursal si se encuentra, null en caso contrario.
    */
    public Sucursal buscarSucursal(String localidad) {
        for (Sucursal sucursal : sucursales) {
            if (sucursal.getLocalidad().equals(localidad)) {
                return sucursal;
            }
        }
        return null;
    }

    
    /**
     * Eliminar una sucursal de la lista de sucursales. 
     * 
     * @param clave de la sucursal a eliminar.
    */
    public boolean eliminarSucursal(Sucursal sucursal) {
        if (sucursales.contains(sucursal)) {
            sucursales.remove(sucursal);
            return true;
        }
        return false;
    }
    
    /**
     * Eliminar una sucursal de la lista de sucursales dada una clave. 
     * 
     * @param clave de la sucursal a eliminar.
    */
    public boolean eliminarSucursalPorLocalidad(String localidad) {
        for (Sucursal sucursal : sucursales) {
            if (sucursal.getLocalidad().equals(localidad)) {
                sucursales.remove(sucursal);
                return true;
            }
        }
        return false;
    }

    /**
     * Retorna un string con todas las sucursales ingresadas.
     * 
     * @return String.
    */
    public String listarSucursales() {
        StringBuilder listaSucursales = new StringBuilder();
        for(Sucursal sucursal : sucursales) {
            listaSucursales.append(sucursal.getLocalidad());
            listaSucursales.append("\n");
        }
        return listaSucursales.toString();
    }

    
    /**
     * Retorna un string con todas las sucursales ingresadas separadas por el separador ingresado.
     * 
     * @return String.
    */
    public String listarSucursalesSeparador(String separador) {
        StringBuilder listaSucursales = new StringBuilder();
        for(Sucursal sucursal : sucursales) {
            listaSucursales.append(sucursal.getLocalidad()).append(separador);
        }
        return listaSucursales.toString();
    }

    
    /**
     * Indica la cantidad de sucursales ingresadas.
     * 
     * @return int.
    */
    public int cantidadSucursales() {
        return sucursales.size();
    }

    
    /**
     * Indica si hay al menos una sucursal ingresada.
     * 
     * @return true o false.
    */
    public Boolean existenSucursales() {
        return cantidadSucursales() == 0;
    }
}
