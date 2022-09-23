/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ut5_pd3;

/**
 *
 * @author Martin
 */
public class Program {

    public static void main(String[] args) {
        TArbolTrie palabrasIndice = new TArbolTrie();
        palabrasIndice.indizarLibro("src/palabras/PalabrasIndice.txt");
        //palabrasIndice.imprimir();
        //palabrasIndice.imprimirIndice();
        System.out.println(palabrasIndice.imprimirIndice());
        
        TArbolTrie libro = new TArbolTrie();
        libro.indizarLibro("src/libro.txt");
        System.out.println("\nLIBRO:\n");
        System.out.println(libro.imprimirIndice());
        System.out.println(libro.buscar("your"));
        System.out.println(libro.buscar("motobomba"));
    }
}

/*
    
*/
