/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut3_pd11;

/**
 *
 * @author Martin
 */
public class Articulo {
    
    private String nombre;
    private String descripcion;
    private final int codigo;
    
    public Articulo(String unNombre, String unaDescripcion, int unCodigo) {
        nombre = unNombre;
        descripcion = unaDescripcion;
        codigo = unCodigo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getDescipcion() {
        return descripcion;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public void setNombre(String nuevoNombre) {
        nombre = (nuevoNombre.isEmpty()) ? nombre : nuevoNombre;
    }
    
    public void setDescripcion(String nuevaDescripcion) {
        descripcion = (nuevaDescripcion.isEmpty()) ? descripcion : nuevaDescripcion;
    }
}
