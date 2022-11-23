/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Martin
 */
public class Pila<T> extends Lista<T> {
    
    @Override
    public void insertar(Nodo<T> nodo) {
        nodo.setSiguiente(this.getPrimero());
        this.setPrimero(nodo);
    }
    
    
    // no se puede hacer override de eliminar de lista porque en este caso
    // la pila retorna el elemento al quitarlo.
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
