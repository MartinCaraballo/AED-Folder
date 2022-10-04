/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ut6_pd1;

/**
 *
 * @author Martin
 */
public class Program {

    public static void main(String[] args) {
        TArbolTrieHashMap trie = new TArbolTrieHashMap();

        String[] palabrasclave = ManejadorArchivosGenerico.leerArchivo("./src/palabras1.txt");
        for (String p : palabrasclave) {
                trie.insertar(p);
        }
        trie.imprimir();    
    }
}
