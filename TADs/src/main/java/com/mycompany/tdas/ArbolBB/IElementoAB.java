package com.mycompany.tdas;

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
    public TElementoABB<T> getHijoIzq();

    /**
     * Obtiene el hijo derecho del nodo.
     *
     * @return Hijo derecho del nodo.
     */
    public TElementoABB<T> getHijoDer();

    /**
     * Asigna el hijo izquierdo del nodo.
     *
     * @return Elemento a ser asignado como hijo izquierdo.
     */
    public void setHijoIzq(TElementoABB<T> elemento);

    /**
     * Asigna el hijo derecho del nodo.
     *
     * @return Elemento a ser asignado como hijo derecho.
     */
    public void setHijoDer(TElementoABB<T> elemento);

    /**
     * Busca un elemento dentro del arbol con la etiqueta indicada.
     *
     * @param unaEtiqueta del nodo a buscar
     * @return Elemento encontrado. En caso de no encontrarlo, retorna nulo.
     */
    public TElementoABB<T> buscar(Comparable unaEtiqueta);

    /**
     * Inserta un elemento dentro del arbol.
     *
     * @param elemento Elemento a insertar.
     * @return Exito de la operaci�n.
     */
    public void insertar(TElementoABB<T> elemento);

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
     * Retorna los datos contenidos en el elemento.
     *
     * @return
     */
    public T getDatos();

    /**
     * Elimina un elemento dada una etiqueta.
     *
     * @param unaEtiqueta
     * @return
     */
    public TElementoABB<T> eliminar(Comparable unaEtiqueta);

    public TElementoABB<T> clonar();

    public int altura();

    public int tamanio();

    public int cantHojas();

    public int nivelDe(Comparable etiqueta);

    public TElementoABB<T> menor();

    public TElementoABB<T> mayor();

    public TElementoABB<T> elementoAnterior(Comparable etiqueta);

    public int cantNodosEnNivelRecorriendo(int nivel);

    public int cantNodosEnNivelConLista(int nivel);

    public String imprimirHojas();

    public TLista nodosEnNivel(int i, int pEntrada, TLista pLista);

    public int sumaValoresNodosInternos();

    public int cantNodosInternos();

    public int sumaValoresDeHojas();

    public int sumaValoresNodosEnNivel(int nivel);

    public int cantNodosCon2Hijos();

    public int cantNodosCon1Hijo();
    
    public boolean esDeBusqueda();
    
    public boolean esCompleto();
}
