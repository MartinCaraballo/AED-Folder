

public class TArbolBB<T> implements IArbolBB<T> {

    private TElementoAB<T> raiz;

    
    public static final String SEPARADOR_ELEMENTOS_IMPRESOS = "-";

    public TArbolBB() {
        raiz = null;
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

    
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
        if (esVacio()) {
            return null;
        } else {
            return raiz.buscar(unaEtiqueta);
        }
    }

    @Override
    public String inOrden() {
        if (esVacio()) {
            return null;
        } else {
            return raiz.inOrden();
        }
    }


    @Override
    public String preOrden() {
        if (esVacio()) {
            return null;
        } else {
            return raiz.preOrden();
        }
    }


    @Override
    public String postOrden() {
        if (esVacio()) {
            return null;
        } else {
            return raiz.postOrden();
        }
    }

    @Override
    public void eliminar(Comparable unaEtiqueta) {
        if (!esVacio()) {
            this.raiz = this.raiz.eliminar(unaEtiqueta);
        }
    }


    public boolean esVacio() {
        return (raiz == null);
    }


    public boolean vaciar() {
        if (!esVacio()) {
            raiz = null;
            return true;
        }
        return false;
    }
}
