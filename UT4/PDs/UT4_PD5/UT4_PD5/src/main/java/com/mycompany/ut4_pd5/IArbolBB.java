package com.mycompany.ut4_pd5;


public interface IArbolBB<T> {

    /**
     * Inserta un elemento en el arbol. En caso de ya existir un elemento con la
     * clave indicada en "unElemento", retorna falso.
     *
     * @param unElemento Elemento a insertar
     * @return Exito de la operacián
     */

    public boolean insertar(TElementoAB<T> unElemento);

 

    /**
     * Busca un elemento dentro del árbol.
     *
     *
     * @param unaEtiqueta Etiqueta identificadora del elemento a buscar.
     * .
     * @return Elemento encontrado. En caso de no encontrarlo, retorna nulo.
     */
    public TElementoAB<T> buscar(Comparable unaEtiqueta);

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
     * Método para obtener la menor clave de un árbol.
     * @return la menor clave del árbol.
     */
    public Comparable obtenerMenorClave();
    
    /**
     * Método para obtener la mayor clave de un árbol.
     * @return la mayor clave del árbol.
     */
    public Comparable obtenerMayorClave();
    
    /**
     * Método para obtener la clave inmediata anterior a una clave dada (pasada por parámetro)
     * @param unaEtiqueta clave siguiente a devolver
     * @return retorna la clave anterior inmediada de la pasada por parametro.
     */
    public Comparable obtenerClaveAnterior(Comparable unaEtiqueta);
    
    /**
     * Método para obtener la cantidad de nodos de un nivel dado (por parámetro)
     * @param nivel nivel a buscar
     * @return Cantidad de nodos en ese nivel
     */
    public int obtenerCantNodosNivel(int nivel);
    
    /**
     * Método para listar todas las hojas cada una con su nivel.
     * @param nivel Nivel desde donde empezar, debe ser 0.
     * @return Las hojas con su nivel.
     */
    public void imprimirHojas();
    
    public Lista<Comparable> listarHojas();
    
    /**
     * Verifica si el árbol es de búsqueda
     * @return true si es de búsqueda, false en caso contrario.
     */
    public boolean verificarArbol();

   
       /**
     * Elimina un elemento dada una etiqueta.
     * @param unaEtiqueta 
     */
    public void eliminar(Comparable unaEtiqueta);

}

