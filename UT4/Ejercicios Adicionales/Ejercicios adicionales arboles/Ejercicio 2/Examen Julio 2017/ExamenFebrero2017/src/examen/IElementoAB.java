package examen;

import java.util.ArrayList;

public interface IElementoAB<T> {

 
    /**
     * Inserta un elemento dentro del arbol.
     *
     * @param elemento Elemento a insertar.
     * @return Exito de la operacion.
     */
    public boolean insertar(TElementoAB elemento);

    /**
     *
     * @param unArrayList
     */
    public void listar(ArrayList<T> unArrayList);
    
    /**
     * Un método que devuelve si el arbol es completo.
     * @return true si es completo, false si no es.
     */
    public boolean esCompleto();
    
}
