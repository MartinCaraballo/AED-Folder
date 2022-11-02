
import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Martin
 */
public class TNodoTrie implements INodoTrie {

    private static int CANT_NUMEROS = 10;
    private TNodoTrie[] hijos;
    private boolean esDireccion;
    private TDispositivo dispositivo;

    public TNodoTrie() {
        hijos = new TNodoTrie[CANT_NUMEROS];
        esDireccion = false;
    }

    @Override
    public void insertar(TDispositivo unDispositivo) {
        String direccion = comprobar(unDispositivo.getDirIP());
        TNodoTrie nodo = this;
        for (int c = 0; c < direccion.length(); c++) {
            int indice = (int) direccion.charAt(c) - '0';
            if (nodo.hijos[indice] == null) {
                nodo.hijos[indice] = new TNodoTrie();
            }
            nodo = nodo.hijos[indice];
        }
        nodo.esDireccion = true;
        nodo.dispositivo = unDispositivo;
    }

    @Override
    public void buscarDispositivos(String primerosDigitos, LinkedList<TDispositivo> dispositivos) {
        String prefijo = comprobar(primerosDigitos);
        TNodoTrie ultimoNodoPrefijo = buscarNodoTrie(prefijo);
        if (ultimoNodoPrefijo != null) {
            ultimoNodoPrefijo.predecir(prefijo, dispositivos, ultimoNodoPrefijo);
        }
    }

    private String comprobar(String cadena) {
        cadena = cadena.toLowerCase();
        char[] partes = cadena.toCharArray();
        StringBuilder string = new StringBuilder();
        for (char c : partes) {
            int index = c - '0';
            if (index >= 0 && index <= 10) {
                string.append(c);
            }
        }
        return string.toString();
    }

    private void predecir(String s, LinkedList<TDispositivo> dispositivos, TNodoTrie nodo) {
        if (nodo != null) {
            if (nodo.esDireccion) {
                dispositivos.add(nodo.dispositivo);
            }
            for (int c = 0; c < CANT_NUMEROS; c++) {
                if (nodo.hijos[c] != null) {
                    nodo.hijos[c].predecir(s + (char) (c + '0'), dispositivos, nodo.hijos[c]);
                }
            }
        }
    }
    
    private TNodoTrie buscarNodoTrie(String s) {
        s = s.toLowerCase();
        TNodoTrie nodo = this;
        for (int c = 0; c < s.length(); c++) {
            int indice = (int)s.charAt(c) - '0';
            if (nodo.hijos[indice] == null) {
                return null;
            }
            nodo = nodo.hijos[indice];
        }
        return nodo;
    }

}
