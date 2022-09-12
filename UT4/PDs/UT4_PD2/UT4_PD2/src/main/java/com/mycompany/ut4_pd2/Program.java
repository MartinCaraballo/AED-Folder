/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ut4_pd2;

/**
 *
 * @author Martin
 */
public class Program {

    public static void main(String[] args) {
        TArbolBB<Integer> arbolBinarioClavesPrueba = new TArbolBB<>();
        String[] clavesPrueba = ManejadorArchivosGenerico.leerArchivo("src/clavesPrueba.txt");
        for (String clave : clavesPrueba) {
            int claveConvertida = Integer.parseInt(clave);
            TElementoAB<Integer> nodo = new TElementoAB<>(claveConvertida, claveConvertida);
            arbolBinarioClavesPrueba.insertar(nodo);
        }
        String preOrden = "Preorden: " + arbolBinarioClavesPrueba.preOrden();
        String inOrden = "Inorden: " + arbolBinarioClavesPrueba.inOrden();
        String postOrden = "postOrden: " + arbolBinarioClavesPrueba.postOrden();
        String[] recorridos = {preOrden, inOrden, postOrden};
        //ManejadorArchivosGenerico.escribirArchivo("src/salidaRecorridos.txt", recorridos);
        TArbolBB<Integer> arbolBinarioClaves = new TArbolBB<>();
        String[] claves = ManejadorArchivosGenerico.leerArchivo("src/claves1.txt");
        for (String clave : claves) {
            int claveConvertida = Integer.parseInt(clave);
            TElementoAB<Integer> nuevoNodo = new TElementoAB<>(claveConvertida, claveConvertida);
            arbolBinarioClaves.insertar(nuevoNodo);
        }
        System.out.println("Buscar 10635: " + arbolBinarioClaves.buscar(10635) != null);
        System.out.println("Buscar 4567: " + arbolBinarioClaves.buscar(4567) != null);
        System.out.println("Buscar 12: " + arbolBinarioClaves.buscar(12) != null);
        System.out.println("Buscar 8978: " + arbolBinarioClaves.buscar(8978) != null);
        
        System.out.println("Preorden: " + arbolBinarioClaves.preOrden());
        
        // La décima clave del listado en preorden es: 5354-4292-2601-192-104-1778-412-301-406-797
        // opción iii) 797.
    }
}
