package com.mycompany.ut6_pd5.ejercicio3;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ernesto
 */
public class TAbonado implements Comparable {

    private String nombre;
    private String telefono;

    public TAbonado(String unNombre, String unTelefono) {

        this.nombre = unNombre;
        this.telefono = unTelefono;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getTelefono() {
        return this.telefono;
    }

    @Override
    public int compareTo(Object o) {
        return (this.nombre.compareTo(((TAbonado)o).getNombre()));
    }
}
