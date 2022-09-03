package com.mycompany.pd8;


import java.util.ArrayList;

public class Empresa {

    private ArrayList<Sucursal> sucursales;

    public Empresa() {
        sucursales = new ArrayList<>();
    }

    public void agregarSucursal(Sucursal sucursal) {
        sucursales.add(sucursal);
    }


    public Sucursal buscarSucursal(Sucursal sucursal) {
        if (sucursales.contains(sucursal)) {
            return sucursal;
        }
        return null;
    }

    public Sucursal buscarSucursalPorLocalidad(String localidad) {
        for (Sucursal sucursal : sucursales) {
            if (sucursal.getLocalidad().equals(localidad)) {
                return sucursal;
            }
        }
        return null;
    }

    public Sucursal eliminarSucursal(Sucursal sucursal) {
        if (sucursales.contains(sucursal)) {
            sucursales.remove(sucursal);
            return sucursal;
        }
        return null;
    }

    public void eliminarSucursalPorLocalidad(String localidad) {
        for (Sucursal sucursal : sucursales) {
            if (sucursal.getLocalidad().equals(localidad)) {
                sucursales.remove(sucursal);
                break;
            }
        }
    }

    public void imprimirPorConsolaSucursal(Sucursal sucursal) {
        if (sucursal != null) {
            System.out.println(sucursal.getLocalidad());
        }
    }

    public StringBuilder listarSucursales() {
        StringBuilder listaSucursales = new StringBuilder();
        for(Sucursal sucursal : sucursales) {
            listaSucursales.append(sucursal.getLocalidad());
            listaSucursales.append("\n");
        }
        return listaSucursales;
    }

    public StringBuilder listarSucursalesSeparador(String separador) {
        StringBuilder listaSucursales = new StringBuilder();
        for(Sucursal sucursal : sucursales) {
            listaSucursales.append(sucursal.getLocalidad());
            listaSucursales.append(separador);
        }
        return listaSucursales;
    }

    public int cantidadSucursales() {
        return sucursales.size();
    }

    public Boolean directorioEstaVacio() {
        return cantidadSucursales() == 0;
    }
}
