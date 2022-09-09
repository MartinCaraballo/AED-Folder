/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ut3_pd11;

/**
 *
 * @author Martin
 */
public class Program {

    public static void main(String[] args) {
        Almacen almacen = new Almacen("Almacen");
        
        /*
        for (int i = 10; i >= 0 ; i--) {
            Articulo articulo = new Articulo("Artículo " + i, "Artículo informático", i);
            almacen.insertarArticuloInventario(articulo);
        }*/
        
        Articulo articulo1 = new Articulo("Monitor", "Monitor oficina", 164);
        Articulo articulo2 = new Articulo("Mouse", "Mouse genérico", 845);
        Articulo articulo3 = new Articulo("Mouse inalámbrico", "Mouse inalámbrico Logitech", 1);
        Articulo articulo4 = new Articulo("Monitor gamer", "Monitor gamer 144Hz", 5432);
        Articulo articulo5 = new Articulo("Monitor curvo", "Monitor curvo 1080p", 3);
        Articulo articulo6 = new Articulo("Teclado gamer mecánico", "Teclado gamer mecánico Razer", 89);
        Articulo articulo7 = new Articulo("Auriculares", "Auriculares con cable", 45);
        Articulo articulo8 = new Articulo("Auriculares inalámbricos", "Auriculares inalámbricos Logitech", 12);
        Articulo articulo9 = new Articulo("Impresora", "Impresora multifunción", 15);
        Articulo articulo10 = new Articulo("Laptop HP", "Laptop HP core i5", 2022);
        almacen.insertarArticuloInventario(articulo1);
        almacen.insertarArticuloInventario(articulo2);
        almacen.insertarArticuloInventario(articulo3);
        almacen.insertarArticuloInventario(articulo4);
        almacen.insertarArticuloInventario(articulo5);
        almacen.insertarArticuloInventario(articulo6);
        almacen.insertarArticuloInventario(articulo7);
        almacen.insertarArticuloInventario(articulo8);
        almacen.insertarArticuloInventario(articulo9);
        almacen.insertarArticuloInventario(articulo10);
        
        //System.out.println(almacen.imprimirInventario());
        almacen.ordenaParesImpares();
        System.out.println(almacen.imprimirInventario());
    }
}
