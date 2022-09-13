

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
    
    @Override
    public Comparable obtenerMenorClave(TElementoAB<T> elemento) {
        if (esVacio()) {
            return null;
        } else {
            return raiz.obtenerMenorClave(elemento);
        }
    }
    
    @Override
    public Comparable obtenerMayorClave(TElementoAB<T> elemento) {
        if (esVacio()) {
            return null;
        } else {
            return raiz.obtenerMayorClave(elemento);
        }
    }
    
    @Override
    public Comparable obtenerClaveAnterior(Comparable unaEtiqueta) {
        if (esVacio()) {
            return null;
        } else {
            return raiz.obtenerClaveAnterior(unaEtiqueta);
        }
    }
    
    @Override
    public int obtenerCantNodosNivel(int nivel) {
        if (esVacio()) {
            return 0;
        } else {
            return raiz.obtenerCantNodosNivel(nivel);
        }
    }
    
    @Override
    public String listarHojas(int nivel) {
        if (esVacio()) {
            return "Es un árbol vacío.";
        } else {
            return (raiz.listarHojas(0));
        }
    }
    
    @Override
    public boolean verificarArbol() {
        if (esVacio()) {
            return true;
        } else {
            return raiz.verificarArbol();
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
