

import java.util.LinkedList;


public class TArbolTrie implements IArbolTrie {

    private TNodoTrie raiz;

    @Override
    public void insertar(String palabra) {
        if (raiz == null) {
            raiz = new TNodoTrie();
        }
        raiz.insertar(palabra);
    }

    @Override
    public void imprimir() {
        if (raiz != null) {
            raiz.imprimir();
        }
    }

    @Override
    public int buscar(String palabra) {
        if (raiz== null){
              raiz = new TNodoTrie();
        }
        return raiz.buscar(palabra);
    }

    @Override
    public LinkedList<String> predecir(String prefijo) {
        if (raiz == null) {
            return null;
        } else {
            LinkedList<String> resultado = new LinkedList<>();
            raiz.predecir(prefijo, resultado);
            return resultado;
        }
    }
    
    
}
