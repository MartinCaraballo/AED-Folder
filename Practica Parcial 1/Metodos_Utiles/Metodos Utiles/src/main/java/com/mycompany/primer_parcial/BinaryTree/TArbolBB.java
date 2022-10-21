package com.mycompany.primer_parcial.BinaryTree;

public class TArbolBB<T> {

    private TElementoAB<T> raiz;

    /**
     * Separador utilizado entre elemento y elemento al imprimir la lista
     */
    public static final String SEPARADOR_ELEMENTOS_IMPRESOS = "-";

    public TArbolBB() {
        raiz = null;
    }

    /**
     * @param unElemento
     * @return
     */
    public boolean insertar(TElementoAB<T> unElemento) {
        if (esVacio()) {
            raiz = unElemento;
            return true;
        } else {
            return raiz.insertar(unElemento);
        }
    }

    /**
     *
     * @param elemento Elemento a insertar.
     * @return Devuelve true si el elemento fue insertado, false por el contrario.
     */
    public boolean insertarConContador(TElementoAB<T> elemento) {
        if (raiz != null) {
            int[] contador = new int[0];
            return raiz.insertarConContador(elemento, contador);
        }
        return false;
    }

    /**
     * @param unaEtiqueta
     * @return
     */
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
        if (this.raiz == null){
            return null;
        }
        return raiz.buscar(unaEtiqueta);
    }

    public int buscarConContador(Comparable etiqueta) {
        if (!esVacio()) {
            int[] contador = new int[1];
            raiz.buscarConContador(etiqueta, contador);
            return contador[0];
        }
        return 0;
    }

    /**
     * Elimina un elemento del arbol por su etiqueta.
     * @param unaEtiqueta Etiqueta del elemento que se quiera eliminar.
     * @return Devuelve true si el elemento fue eliminado con exito o false por el contrario.
     */
    public boolean eliminar(Comparable unaEtiqueta) {
        if (!esVacio()) {
            raiz = raiz.eliminar(unaEtiqueta);
            return true;
        }
        return false;
    }

    /**
     * Recorre el arbol en preorden.
     * @return Devuelve una String con las etiquetas de los nodos en preorden o null si esta vacio.
     */
    public String preOrden() {
        if (esVacio()) {
            return null;
        }
        return raiz.preOrden();
    }

    /**
     * Recorre el arbol en inorden.
     * @return Devuelve una String con las etiquetas de los nodos en inorden o null si esta vacio.
     */
    public String inOrden() {
        if (esVacio()) {
            return null;
        }
        return raiz.inOrden();
    }

    /**
     * Recorre el arbol en postorden.
     * @return Devuelve una String con las etiquetas de los nodos en postorden o null si esta vacio.
     */
    public String postOrden() {
        if (esVacio()) {
            return null;
        }
        return raiz.postOrden();
    }

    /**
     *
     * @return
     */
    public int obtenerAltura() {
        if (!esVacio()) {
            return raiz.altura();
        }
        return -1;
    }

    /**
     *
     * @return
     */
    public int obtenerTamanio() {
        if (!esVacio()) {
            return raiz.tamanio();
        }
        return 0;
    }

    /**
     *
     * @param unaEtiqueta
     * @return
     */
    public int obtenerNivel(Comparable unaEtiqueta) {
        if (!esVacio()) {
            return raiz.obtenerNivel(unaEtiqueta);
        }
        return -1;
    }

    /**
     *
     * @return Devuelve un int con la cantidad de hojas del arbol, o cero si esta vacio.
     */
    public int obtenerCantidadHojas() {
        if (!esVacio()) {
            return raiz.cantHojas();
        }
        return 0;
    }

    /**
     * @return Devuelve true si el arbol esta vacio, false por el contrario.
     */
    public boolean esVacio() {
        return (raiz == null);
    }

}
