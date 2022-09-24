
import java.util.LinkedList;

public class TNodoTrieTelefonos implements INodoTrieTelefonos {
    
    private static final int CANT_NUMEROS = 10;
    private TNodoTrieTelefonos[] hijos;
    private boolean esNumero;
    private TAbonado abonado;
    
    public TNodoTrieTelefonos() {
        hijos = new TNodoTrieTelefonos[CANT_NUMEROS];
        esNumero = false;
    }
    
    @Override
    public void buscarTelefonos(String codigoPais, String codigoArea, LinkedList<TAbonado> abonados) {
        String prefijo = codigoPais + codigoArea;
        TNodoTrieTelefonos ultimoPrefijo = buscarNodoTrie(prefijo);
        if (ultimoPrefijo != null) {
            ultimoPrefijo.predecir(prefijo, abonados, ultimoPrefijo);
        }
    }

    @Override
    public void insertar(String numero, TAbonado unAbonado) {
        numero = comprobar(numero);
        TNodoTrieTelefonos nodo = this;
        for (int c = 0; c < numero.length(); c++) {
            int indice = (int)numero.charAt(c) - '0';
            if (nodo.hijos[indice] == null) {
                nodo.hijos[indice] = new TNodoTrieTelefonos();
            }
            nodo = nodo.hijos[indice];
        }
        nodo.esNumero = true;
        nodo.abonado = unAbonado;
    }
    
    @Override
    public TNodoTrieTelefonos buscar(String s) {
        TNodoTrieTelefonos nodo = this;
        int comparaciones = 0;
        for (int c = 0; c < s.length(); c++) {
            int indice = s.charAt(c) - 'a';
            if (nodo.hijos[indice] == null) {
                return null;
            } else {
                nodo = nodo.hijos[indice];
                comparaciones += 1;
            }
        }
        return nodo;
    }
    
    private String comprobar(String cadena) {
        cadena = cadena.toLowerCase();
        char[] partes = cadena.toCharArray();
        StringBuilder string = new StringBuilder();
        int cont = 0;
        
        for(char c : partes) {
            int index = c-'0';
            if( index >= 0 && index <=10) {
                string.append(c);
            } 
        }
        return string.toString();
    }
    
    private TNodoTrieTelefonos buscarNodoTrie(String s) {
        s = s.toLowerCase();
        TNodoTrieTelefonos nodo = this;
        for (int c = 0; c < s.length(); c++) {
            int indice = (int)s.charAt(c) - '0';
            if (nodo.hijos[indice] == null) {
                return null;
            }
            nodo = nodo.hijos[indice];
        }
        return nodo;
    }

    private void predecir(String s, LinkedList<TAbonado> abonados, TNodoTrieTelefonos nodo) {
        // implementar
        if (nodo != null) {
            if (nodo.esNumero) {
                abonados.add(nodo.abonado);
            }
            for (int c = 0; c < CANT_NUMEROS; c++) {
                if (nodo.hijos[c] != null) {
                    nodo.hijos[c].predecir(s + (char) (c + '0'), abonados, nodo.hijos[c]);
                }
            }
        }
        
    }    
}
