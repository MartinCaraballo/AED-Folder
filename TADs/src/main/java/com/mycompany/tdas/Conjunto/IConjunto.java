/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.tdas;

/**
 *
 * @author juan-
 */
public interface IConjunto <T> extends ILista<T> {
    
    /**
     * Metodo encargado de realizar la union entre 2 conjuntos. El conjunto que llama a la funcion y el pasado por parametro.
     * En caso de que ambos conjuntos sean vacios, se retornara null
     * En caso de que haya un conjunto sin elementos, se retornara el conjunto que no lo es.
     * Para realizar el metodo, se tomara un conjunto como base, el cual copiaremos por completo al conjunto resultado. Luego se ira de a un elemento del conjunto parametro verficiando si no esta en el conjunto resultado, en ese caso se agregara al mismo.
     * Precondicion: Ambos conjuntos estan ordenados por clave de manera ascendiente.
     *               La clave tiene que ser un numero para poder compararse.
     * Postcondicion:No habran 2 elementos repetidos dentro del conjunto retorno.
     *               Los 2 conjuntos a los cuales se les aplica la union quedan intactos, no sufren cambios ni de orden ni de contenido.  
     *               El conjunto resultado tendra una copia de los nodos de ambos conjuntos pero no tendra los mismos.
     * @param otroConjunto
     * @return Retorna el conjunto resultado de realizar la union.
     */
    public TConjunto<T> union(IConjunto<T> otroConjunto);
    
    /**
     * 
     * @param otroConjunto
     * @return 
     */
    public TConjunto<T> interseccion(IConjunto<T> otroConjunto);
    
    public TConjunto<T> diferencia(IConjunto<T> otroConjunto);
    
    public TConjunto<T> complemento(IConjunto<T> otroConjunto);
    
    
}
