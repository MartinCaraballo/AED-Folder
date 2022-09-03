/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pd8;

/**
 *
 * @author Martin
 */
public class Main {

    public static void main(String[] args) {
        ManejadorSucursales AED = new ManejadorSucursales();
        String[] sucursales = LectorArchivos.leerArchivo("src\\sucursales.txt");
        for (String localidad : sucursales) {
            Sucursal sucursal = new Sucursal(localidad);
            AED.agregarSucursal(sucursal);
        }

        System.out.println(AED.listarSucursales());
        Sucursal sucursal1 = AED.buscarSucursal("Montevideo");
        Sucursal sucursal2 = new Sucursal("Minas");
        AED.agregarSucursal(sucursal2);
        System.out.println(AED.listarSucursales());
        AED.eliminarSucursal(sucursal1);
        System.out.println(AED.listarSucursales());
        AED.eliminarSucursalPorLocalidad("Minas");
        System.out.println(AED.listarSucursales());
        System.out.println("Cantidad de sucursales: " + AED.cantidadSucursales());
        System.out.println(AED.existenSucursales());


        /*
        Pruebas comparativas TA_10
         */
        System.out.println("Pruebas comparativas TA_10");
        ManejadorSucursales manejadorSucursales = new ManejadorSucursales();
        String[] sucursalesPrueba = LectorArchivos.leerArchivo("src\\suc1.txt");
        for (String localidad : sucursalesPrueba) {
            Sucursal sucursal = new Sucursal(localidad);
            manejadorSucursales.agregarSucursal(sucursal);
        }

        System.out.println(manejadorSucursales.listarSucursales());
        System.out.println("La cantidad de sucursales es: " + manejadorSucursales.cantidadSucursales());
        manejadorSucursales.eliminarSucursalPorLocalidad("Chicago");
        System.out.println(manejadorSucursales.listarSucursales());

        ManejadorSucursales manejadorSucursales2 = new ManejadorSucursales();
        String[] sucursalesPrueba2 = LectorArchivos.leerArchivo("src\\suc2.txt");
        for (String localidad : sucursalesPrueba2) {
            Sucursal sucursal = new Sucursal(localidad);
            manejadorSucursales2.agregarSucursal(sucursal);
        }

        System.out.println(manejadorSucursales2.listarSucursales());
        manejadorSucursales2.eliminarSucursalPorLocalidad("Tokio");
        manejadorSucursales2.eliminarSucursalPorLocalidad("Shenzen");
        System.out.println(manejadorSucursales2.listarSucursales());

        ManejadorSucursales manejadorSucursales3 = new ManejadorSucursales();
        String[] sucursalesPrueba3 = LectorArchivos.leerArchivo("src\\suc3.txt");
        for (String localidad : sucursalesPrueba3) {
            Sucursal sucursal = new Sucursal(localidad);
            manejadorSucursales3.agregarSucursal(sucursal);
        }

        System.out.println(manejadorSucursales3.listarSucursalesSeparador(";_"));
    }
}
