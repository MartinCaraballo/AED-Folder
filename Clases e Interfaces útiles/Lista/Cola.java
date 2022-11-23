/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Martin
 */
public class Cola<T> extends Lista<T> {
    
    private Nodo<T> ultimo;
    
    public Cola() {
        ultimo = null;
    }
    
    @Override
    public void insertar(Nodo<T> nodo) {
        if (primero == null) {
            primero = nodo;
        } else {
            ultimo.setSiguiente(nodo);
        }
        ultimo = nodo;
    }
    
    public Nodo<T> pop() {
        if (this.primero == null) {
            return null;
        }
        Nodo<T> aux = this.primero;
        this.setPrimero(aux.getSiguiente());
        aux.setSiguiente(null);
        return aux;
    }
    
}
