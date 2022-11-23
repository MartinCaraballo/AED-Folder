package com.mycompany.ut4_pd5;


public interface IElementoAB<T> {

    /**
     * Obtiene el valor de la etiqueta del nodo.
     *
     * @return Etiqueta del nodo.
     */
    public Comparable getEtiqueta();

    /**
     * Obtiene el hijo izquierdo del nodo.
     *
     * @return Hijo Izquierdo del nodo.
     */
    public TElementoAB<T> getHijoIzq();

    /**
     * Obtiene el hijo derecho del nodo.
     *
     * @return Hijo derecho del nodo.
     */
    public TElementoAB<T> getHijoDer();

    /**
     * Asigna el hijo izquierdo del nodo.
     *
     * @return Elemento a ser asignado como hijo izquierdo.
     */
    public void setHijoIzq(TElementoAB<T> elemento);

    /**
     * Asigna el hijo derecho del nodo.
     *
     * @return Elemento a ser asignado como hijo derecho.
     */
    public void setHijoDer(TElementoAB<T> elemento);

    /**
     * Busca un elemento dentro del arbol con la etiqueta indicada.
     *
     * @param unaEtiqueta del nodo a buscar
     * @return Elemento encontrado. En caso de no encontrarlo, retorna nulo.
     */
    public TElementoAB<T> buscar(Comparable unaEtiqueta);

 

    /**
     * Inserta un elemento dentro del arbol.
     *
     * @param elemento Elemento a insertar.
     * @return Exito de la operaci�n.
     */
    public boolean insertar(TElementoAB<T> elemento);

    /**
     * Imprime en preorden el arbol separado por guiones.
     *
     * @return String conteniendo el PreOrden
     */
    public String preOrden();

    /**
     * Imprime en inorden el arbol separado por guiones.
     *
     * @return String conteniendo el InOrden
     */
    public String inOrden();

    /**
     * Imprime en postorden el arbol separado por guiones.
     *
     * @return String conteniendo el PostOrden
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
    public void imprimirHojas(int nivel);
    
    /**
     * Método para devolver en una lista todas las hojas del árbol junto con su nivel.
     * @param nivel
     * @return 
     */
    public Lista<Comparable> listarHojas(int nivel);
    
    /**
     * Verifica si el árbol es de búsqueda
     * @return true si es de búsqueda, false en caso contrario.
     */
    public boolean verificarArbol();

    /**
     * Retorna los datos contenidos en el elemento.
     *
     * @return
     */
    public T getDatos();
	
	 /**
     * Elimina un elemento dada una etiqueta.
     * @param unaEtiqueta
     * @return 
     */
    public TElementoAB eliminar(Comparable unaEtiqueta);

}
