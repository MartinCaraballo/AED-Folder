/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.primer_parcial;

import com.mycompany.primer_parcial.Hashing.TablaHashEncadenamientoSeparado;

/**
 *
 * @author Ikken
 */
public class Main {

    public static void main(String[] args) {
        TablaHashEncadenamientoSeparado tabla = new TablaHashEncadenamientoSeparado(10);
        tabla.insertar(1);
        tabla.insertar(2);
        tabla.insertar(3);
        tabla.insertar(4);
        tabla.imprimirTabla();

    }
}
