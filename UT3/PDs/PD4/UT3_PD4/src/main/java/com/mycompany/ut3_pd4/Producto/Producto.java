/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut3_pd4.Producto;

/**
 *
 * @author Martin
 */
public class Producto implements IProducto {
    
    private Comparable etiqueta;
    private int precio;
    private int stock;
    private String nombre;
    
    public Producto(Comparable etiqueta, int precio, int stock, String nombre) {
        this.etiqueta = etiqueta;
        this.precio = precio;
        this.stock = stock;
        this.nombre = nombre;
    }

    @Override
    public Comparable getEtiqueta() {
        return etiqueta;
    }

    @Override
    public Integer getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public Integer getStock() {
        return stock;
    }

    @Override
    public void setStock(Integer stock) {
        this.stock = (stock <= 0) ? 0 : stock; 
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = (!nombre.isEmpty()) ? nombre : this.nombre;
    }
    
}
