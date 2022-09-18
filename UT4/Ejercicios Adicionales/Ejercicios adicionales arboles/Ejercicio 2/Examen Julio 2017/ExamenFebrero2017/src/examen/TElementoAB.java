package examen;

import java.util.ArrayList;


public class TElementoAB<T> implements IElementoAB<T> {

    private Comparable etiqueta;
    private TElementoAB hijoIzq;
    private TElementoAB hijoDer;
    private T datos;

    /**
     * @param unaEtiqueta
     * @param unosDatos
     */
    @SuppressWarnings("unchecked")
    public TElementoAB(Comparable unaEtiqueta, T unosDatos) {
        etiqueta = unaEtiqueta;
        datos = unosDatos;
    }

    public TElementoAB getHijoIzq() {
        return hijoIzq;
    }

    public TElementoAB getHijoDer() {
        return hijoDer;
    }

    /**
     * @param unElemento
     * @return
     */
   

    public Comparable getEtiqueta() {
        return etiqueta;
    }

    public T getDatos() {
        return datos;
    }

    public void setHijoIzq(TElementoAB elemento) {
        this.hijoIzq = elemento;

    }

    public void setHijoDer(TElementoAB elemento) {
        this.hijoDer = elemento;
    }

   

    @Override
    public void listar(ArrayList<T> unArrayList) {
        if (hijoIzq != null) {                  // O(1)
            hijoIzq.listar(unArrayList);        // O(n)
        }
        unArrayList.add(datos);               // O(n)
        if (hijoDer != null) {                  // O(1)
            hijoDer.listar(unArrayList);        // O(n).
        }
    }
    
    // El orden de ejecución del algoritmo es O(n).

    @Override
    public boolean insertar(TElementoAB elemento) {
        if (elemento.getEtiqueta().compareTo(etiqueta) < 0) {
            if (hijoIzq != null) {
                return getHijoIzq().insertar(elemento);
            } else {
                hijoIzq = elemento;
                return true;
            }
        } else if (elemento.getEtiqueta().compareTo(etiqueta) > 0) {
            if (hijoDer != null) {
                return getHijoDer().insertar(elemento);
            } else {
                hijoDer = elemento;
                return true;
            }
        } else {
            // ya existe un elemento con la misma etiqueta.-
            return false;
        }
    }

    
    @Override
    public boolean esCompleto() {
        if (hijoIzq == null && hijoDer != null || hijoDer == null && hijoIzq != null) {
            return false;
        }
        boolean condicion = true;
        if (hijoIzq != null) {
            condicion = condicion && hijoIzq.esCompleto();
        }
        if (hijoDer != null) {
            condicion = condicion && hijoDer.esCompleto();
        }
        return condicion;
    }
    
    // El orden de ejecucíon del algoritmo es O(n).
}
