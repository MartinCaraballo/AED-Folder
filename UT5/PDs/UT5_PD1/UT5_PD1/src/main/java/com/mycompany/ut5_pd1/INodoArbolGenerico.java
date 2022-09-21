/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut5_pd1;

/**
 *
 * @author Martin
 * @param <T> type.
 */
public interface INodoArbolGenerico<T> {
    
    /**
     * Método para insertar al arbol.
     * @param unaEtiqueta
     * @param etiquetaPadre
     * @return true si se pudo insertar, false si no.
     */
    public boolean insertar(Comparable unaEtiqueta, Comparable etiquetaPadre);
    
    /**
     * Método para buscar una etiqueta entre los nodos del árbol.
     * @param unaEtiqueta
     * @return El elemento si se encuentra, null en caso contrario.
     */
    public NodoArbolGenerico<T> buscar(Comparable unaEtiqueta);
    
    /**
     * Método para listar los elementos del árbol.
     * @return 
     */
    public void listarIndentado(int tabulaciones, StringBuffer string);
    
}
