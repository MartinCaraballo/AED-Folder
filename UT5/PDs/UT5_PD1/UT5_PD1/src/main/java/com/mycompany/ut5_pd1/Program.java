/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ut5_pd1;

/**
 *
 * @author Martin
 */
public class Program {

    public static void main(String[] args) {
        ArbolGenerico<Comparable> arbol = new ArbolGenerico<>();
        
        arbol.insertar("Rectoria", "");
        
        arbol.insertar("Vicerectoria del medio universitario", "Rectoria");
        arbol.insertar("Vicerectoria academica", "Rectoria");
        arbol.insertar("Vicerectoria administrativa", "Rectoria");
        
        arbol.insertar("Facultad de ciencias empresariales", "Vicerectoria academica");
        arbol.insertar("Facultad de ciencias humanas", "Vicerectoria academica");
        arbol.insertar("Facultad de ingenieria y tecnologias", "Vicerectoria academica");
        arbol.insertar("Facultad de psicologia", "Vicerectoria academica");

        arbol.insertar("Departamento de informatica y ciencias de la computacion", "Facultad de ingenieria y tecnologias");
        arbol.insertar("Departamento de ingenieria electrica", "Facultad de ingenieria y tecnologias");
        arbol.insertar("Departamento de matematicas", "Facultad de ingenieria y tecnologias");        
        
        System.out.println(arbol.listarIndentado());
    }
}
