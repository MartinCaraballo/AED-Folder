/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.tdas;

/**
 *
 * @author juan-
 */
public interface INodoColaCircular<T> {
     /**
     * devuelve el dato del nodo
     * @return 
     */
    public T getDato();
    
    /**
     * Imprime los datos del nodo
     */
    
    
    
    public void imprimir();

    /**
     * Imprime la etiqueta del nodo
     */
    
    public void imprimirEtiqueta();

    
    /**
     * Retorna la etiqueta del nodo
     *
     * @return etiqueta del nodo
     */
    public Comparable getEtiqueta();
//	/**
//	 *
//	 * @param unNodo
//	 * @return devueve -1 si this tiene una clave menor, 0 si son iguales, 1 si es mayor
//	 */
//	public int compareTo(INodo<E> unNodo);

    /**
     *
     * @param etiqueta
     * @return devueve -1 si this tiene una etiqueta menor, 0 si son iguales, 1
     * si es mayor
     */
    public int compareTo(Comparable etiqueta);

    public TNodoColaCircular<T> clonar();
    
    public boolean equalsTo(T pDato);

}
