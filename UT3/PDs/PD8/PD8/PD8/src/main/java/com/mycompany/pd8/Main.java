/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pd8;

/**
 *
 * @author Ikken
 */
public class Main {

    public static void main(String[] args) {
        Empresa AED = new Empresa();
        String[] sucursales = LectorArchivos.leerArchivo("src\\sucursales.txt");
        for (String localidad : sucursales) {
            Sucursal sucursal = new Sucursal(localidad);
            AED.agregarSucursal(sucursal);
        }

        System.out.println(AED.listarSucursales());
        Sucursal sucursal1 = AED.buscarSucursalPorLocalidad("Montevideo");
        Sucursal sucursal2 = new Sucursal("Minas");
        AED.agregarSucursal(sucursal2);
        AED.imprimirPorConsolaSucursal(sucursal1);
        System.out.println(AED.listarSucursales());
        AED.eliminarSucursal(sucursal1);
        System.out.println(AED.listarSucursales());
        AED.eliminarSucursalPorLocalidad("Minas");
        System.out.println(AED.listarSucursales());
        System.out.println("Cantidad de sucursales: " + AED.cantidadSucursales());
        System.out.println(AED.directorioEstaVacio());


        /*
        Pruebas comparativas TA_10
         */
        System.out.println("Pruebas comparativas TA_10");
        Empresa EmpresaPrueba = new Empresa();
        String[] sucursalesPrueba = LectorArchivos.leerArchivo("src\\suc1.txt");
        for (String localidad : sucursalesPrueba) {
            Sucursal sucursal = new Sucursal(localidad);
            EmpresaPrueba.agregarSucursal(sucursal);
        }

        System.out.println(EmpresaPrueba.listarSucursales());
        System.out.println("La cantidad de sucursales es: " + EmpresaPrueba.cantidadSucursales());
        EmpresaPrueba.eliminarSucursalPorLocalidad("Chicago");
        System.out.println(EmpresaPrueba.listarSucursales());

        Empresa EmpresaPrueba2 = new Empresa();
        String[] sucursalesPrueba2 = LectorArchivos.leerArchivo("src\\suc2.txt");
        for (String localidad : sucursalesPrueba2) {
            Sucursal sucursal = new Sucursal(localidad);
            EmpresaPrueba2.agregarSucursal(sucursal);
        }

        System.out.println(EmpresaPrueba2.listarSucursales());
        EmpresaPrueba2.eliminarSucursalPorLocalidad("Tokio");
        EmpresaPrueba2.eliminarSucursalPorLocalidad("Shenzen");
        System.out.println(EmpresaPrueba2.listarSucursales());

        Empresa EmpresaPrueba3 = new Empresa();
        String[] sucursalesPrueba3 = LectorArchivos.leerArchivo("src\\suc3.txt");
        for (String localidad : sucursalesPrueba3) {
            Sucursal sucursal = new Sucursal(localidad);
            EmpresaPrueba3.agregarSucursal(sucursal);
        }

        System.out.println(EmpresaPrueba3.listarSucursalesSeparador(";_"));
    }
}
