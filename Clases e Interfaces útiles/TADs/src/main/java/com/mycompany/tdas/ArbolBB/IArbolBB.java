package com.mycompany.tdas;

public interface IArbolBB<T>{

    /**
     * Inserta un elemento en el arbol. En caso de ya existir un elemento con la
     * clave indicada en "unElemento", retorna falso.
     *
     * @param unElemento Elemento a insertar
     */

    public void insertar(TElementoABB<T> unElemento);

 

    /**
     * Busca un elemento dentro del árbol.
     *
     *
     * @param unaEtiqueta Etiqueta identificadora del elemento a buscar.
     * .
     * @return Elemento encontrado. En caso de no encontrarlo, retorna nulo.
     */
    public TElementoABB<T> buscar(Comparable unaEtiqueta);

    /**
     * Imprime en PreOrden los elementos del árbol, separados por guiones.
     *
     * @return String conteniendo el preorden separado por guiones.
     */
    public String preOrden();

    /**
     * Imprime en InOrden los elementos del árbol, separados por guiones.
     *
     * @return String conteniendo el preorden separado por guiones.
     */
    public String inOrden();

    /**
     * Imprime en PostOrden los elementos del árbol, separados por guiones.
     *
     * @return String conteniendo el preorden separado por guiones.
     */
    public String postOrden();

   
    /**
     * Elimina un elemento dada una etiqueta.
     * @param unaEtiqueta 
     *   
     */
    public void eliminar(Comparable unaEtiqueta);
    
    public int altura();
    
    public int tamanio();
    
    public int cantHojas();
    
    public int nivelDe(Comparable etiqueta);
    
    public TElementoABB<T> menor();
    
    public TElementoABB<T> mayor();
    
    public TElementoABB<T> elementoAnterior(Comparable etiqueta);
    
    public int cantNodosEnNivel(int nivel);
    
    public String imprimirHojas();
    
    public int sumaValoresNodosInternos();

    public int cantNodosInternos();

    public int sumaValoresDeHojas();

    public int sumaValoresNodosEnNivel(int nivel);

    public int cantNodosCon2Hijos();

    public int cantNodosCon1Hijo();
    
    public boolean esDeBusqueda();
    
    public boolean esCompleto();
    
	
}

