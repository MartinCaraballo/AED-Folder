/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ut3_pd6;

import Sucursal.ManejadorSucursales;
import Sucursal.Sucursal;
import com.mycompany.ut3_pd4.ManejadorArchivosGenerico;

/**
 *
 * @author Martin
 */
public class Program {

    public static void main(String[] args) {
        ManejadorSucursales manejadorSucursales = new ManejadorSucursales();
        
        String[] lectura = ManejadorArchivosGenerico.leerArchivo("src\\suc1.txt");
        for (int i = 0; i < lectura.length; i++) {
            Sucursal sucursal = new Sucursal(lectura[i]);
            manejadorSucursales.agregarSucursal(sucursal);
        }
        System.out.println("Cantidad de sucursales: " + manejadorSucursales.cantidadSucursales());
        System.out.println(manejadorSucursales.listarSucursales());
        
        manejadorSucursales.eliminarSucursal("Chicago");
        System.out.println(manejadorSucursales.listarSucursales());
       
        ManejadorSucursales manejadorSucursales2 = new ManejadorSucursales();
        String[] lectura2 = ManejadorArchivosGenerico.leerArchivo("src\\suc2.txt");
        for (int i = 0; i < lectura2.length; i++) {
            Sucursal sucursal = new Sucursal(lectura2[i]);
            manejadorSucursales2.agregarSucursal(sucursal);
        }
        manejadorSucursales2.eliminarSucursal("Shenzen");
        manejadorSucursales2.eliminarSucursal("Tokio");
        System.out.println(manejadorSucursales2.listarSucursales());
        
        ManejadorSucursales manejadorSucursales3 = new ManejadorSucursales();
        String[] lectura3 = ManejadorArchivosGenerico.leerArchivo("src\\suc3.txt");
        for (int i = 0; i < lectura3.length; i++) {
            Sucursal sucursal = new Sucursal(lectura3[i]);
            manejadorSucursales3.agregarSucursal(sucursal);
        }
        System.out.println(manejadorSucursales3.listarSucursales(";_"));
    }
}

/*
Ejericicio 1:
    La cantidad de elementos en la lista es de 107 (opción D).

Ejercicio 2:
    Al borrar Chicago, la ciudad que le sigue a Hong Kong es Shenzhen.

Ejercicio 3:
    El archivo suc2.txt, solemente tiene una ciudad, Tokio, por lo tanto, no puede 
    eliminar la ciudad Shenzen porque no existe, solamente elimina Tokio.

Ejercicio 4:
    El resultado de imprimir las sucursales con el separador ";_" es:
        Montreal;_Caracas;_Tulsa;_Mobile;_Vancouver;_
*/
