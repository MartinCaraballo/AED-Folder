/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut3_pd7;

/**
 *
 * @author Martin
 */
public class Alumno {
    private Comparable cedulaIdentidad;
    private String nombre;
    private String apellido;
    
    public Alumno(Comparable cedula, String nombre, String apellido) {
        cedulaIdentidad = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public Comparable getCedulaIdentidad() {
        return cedulaIdentidad;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
}
