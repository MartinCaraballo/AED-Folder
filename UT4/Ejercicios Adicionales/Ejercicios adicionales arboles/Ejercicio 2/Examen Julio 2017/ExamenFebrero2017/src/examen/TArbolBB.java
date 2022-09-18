package examen;

import java.util.ArrayList;

/**
 * @author Programacion2
 * @param <T>
 *
 */
public class TArbolBB<T> implements IArbolBB<T> {

    private TElementoAB<T> raiz;

    public TArbolBB() {
        raiz = null;
    }

    /**
     * @return
     */
    private boolean esVacio() {
        return (raiz == null);
    }

    @Override
    public ArrayList<T> listar() {
        if (esVacio()) {
            return null;
        } else {
            ArrayList<T> arrayList = new ArrayList<T>();
            raiz.listar(arrayList);
            return arrayList;
        } 
    }

    @Override
    public boolean insertar(TElementoAB<T> unElemento) {
        if (esVacio()) {
            raiz = unElemento;
            return true;
        } else {
            return raiz.insertar(unElemento);
        }
    }
    
    @Override
    public boolean esCompleto() {
        if (esVacio()) {
            return false;
        } else {
            return raiz.esCompleto();
        }
    }
    
    public TElementoAB<T> getRaiz() {
        return raiz;
    }

}
