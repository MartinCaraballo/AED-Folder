package com.mycompany.primer_parcial.Sets;

public class TConjunto<T> extends TLista<T> {

    public TConjunto() {
        primero = null;
    }

    public TConjunto<T> union(TConjunto<T> otroConjunto) {
        TConjunto<T> conjuntoResultado = new TConjunto<>();
        TNodo<T> aux1 = this.getPrimero();
        TNodo<T> aux2 = otroConjunto.getPrimero();
        while (aux1 != null && aux2 != null) {
            if (aux1.getEtiqueta().compareTo(aux2.getEtiqueta()) < 1)
            {
                TNodo<T> nodoInsertar = new TNodo<>(aux1.getEtiqueta(), aux1.getDato());
                conjuntoResultado.insertar(nodoInsertar);
                if (aux1.getEtiqueta().compareTo(aux2.getEtiqueta()) == 0) {
                    aux1 = aux1.getSiguiente();
                    aux2 = aux2.getSiguiente();
                } else {
                    aux1 = aux1.getSiguiente();
                }
            } else if (aux1.getEtiqueta().compareTo(aux2.getEtiqueta()) > 0) {
                TNodo<T> nodoInsertar = new TNodo<>(aux2.getEtiqueta(), aux2.getDato());
                conjuntoResultado.insertar(nodoInsertar);
                aux2 = aux2.getSiguiente();
            }
        }
        while (aux1 != null) {
            TNodo<T> nodoInsertar = new TNodo<>(aux1.getEtiqueta(), aux1.getDato());
            conjuntoResultado.insertar(nodoInsertar);
            aux1 = aux1.getSiguiente();
        }
        while (aux2 != null) {
            TNodo<T> nodoInsertar = new TNodo<>(aux2.getEtiqueta(), aux2.getDato());
            conjuntoResultado.insertar(nodoInsertar);
            aux2 = aux2.getSiguiente();
        }
        return conjuntoResultado;
    }

    public TConjunto<T> interseccion(TConjunto<T> otroConjunto) {
        TConjunto<T> conjuntoResultado = new TConjunto<>();
        TNodo<T> aux1 = this.getPrimero();
        TNodo<T> aux2 = otroConjunto.getPrimero();
        while (aux1 != null && aux2 != null) {
            Comparable aux1Etiqueta = aux1.getEtiqueta();
            Comparable aux2Etiqueta = aux2.getEtiqueta();
            if (aux1Etiqueta.compareTo(aux2Etiqueta) < 1)
            {
                if (aux1Etiqueta.compareTo(aux2Etiqueta) < 0)
                {
                    aux1 = aux1.getSiguiente();
                } else {
                    TNodo<T> nodoInsertar = new TNodo<>(aux1Etiqueta, aux1.getDato());
                    conjuntoResultado.insertar(nodoInsertar);
                    aux1 = aux1.getSiguiente();
                    aux2 = aux2.getSiguiente();
                }
            } else if (aux1.getEtiqueta().compareTo(aux2.getEtiqueta()) > 0) {
                aux2 = aux2.getSiguiente();
            }
        }
        return conjuntoResultado;
    }

    //Por la regla de la multiplicacion, el orden de tiempo de ejecucion de cada while es de O(n^2)
    //y por la regla de la suma, el orden del algoritmo es de O(n^2)
    public TConjunto<T> diferenciaSimetrica(TConjunto<T> otroConjunto) {
        TConjunto<T> conjuntoResultado = new TConjunto<>();                  //O(1)
        TNodo<T> aux1 = this.getPrimero();                                 //O(1)
        while (aux1 != null) {                                          //O(n)
            TNodo<T> aux2 = aux1;                                 //O(1)
            aux2.setSiguiente(null);                                    //O(1)
            if (otroConjunto.buscar(aux2.getEtiqueta()) == null) {      //O(n) Metodo buscar es de O(n)
                conjuntoResultado.insertarOrdenado(aux2);               //O(n)Metodo insertarOrdenado es de O(n)
            }
            aux1 = aux1.getSiguiente();                                 //O(1)
        }
        aux1 = otroConjunto.getPrimero();                               //O(1)
        while (aux1 != null) {                                          //O(n)
            TNodo<T> aux2 = aux1;                                 //O(1)
            aux2.setSiguiente(null);                                    //O(1)
            if (this.buscar(aux2.getEtiqueta()) == null) {              //O(n) Metodo buscar es de O(n)
                conjuntoResultado.insertarOrdenado(aux2);               //O(n) Metodo insertarOrdenado es de O(n)
            }
            aux1 = aux1.getSiguiente();                                 //O(1)
        }
        return conjuntoResultado;                                       //O(1)
    }

    public void insertarOrdenado(TNodo<T> nodo) {
        if (this.esVacia()) {
            this.primero = nodo;
            return;
        }
        if (primero.getEtiqueta().compareTo(nodo.getEtiqueta()) > 0) {
            TNodo<T> aux = primero;
            this.primero = nodo;
            nodo.setSiguiente(aux);
        } else {
            if (primero.getSiguiente() != null) {
                TNodo<T> auxAnt = primero;
                TNodo<T> aux = primero.getSiguiente();
                while (aux != null) {
                    if (aux.getEtiqueta().compareTo(nodo.getEtiqueta()) > 0) {
                        auxAnt.setSiguiente(nodo);
                        nodo.setSiguiente(aux);
                        return;
                    }
                    aux = aux.getSiguiente();
                    auxAnt = auxAnt.getSiguiente();
                }
                auxAnt.setSiguiente(nodo);
                return;
            }
            primero.setSiguiente(nodo);
        }
    }

    public TConjunto<T> diferencia(TConjunto<T> otroConjunto) {
        TConjunto<T> conjuntoResultado = new TConjunto();
        TNodo<T> aux1 = this.getPrimero();
        TNodo<T> aux2 = otroConjunto.getPrimero();
        while (aux1 != null && aux2 != null) {
            Comparable aux1Etiqueta = aux1.getEtiqueta();
            Comparable aux2Etiqueta = aux2.getEtiqueta();
            if (aux1Etiqueta.compareTo(aux2Etiqueta) < 1)
            {
                if (aux1Etiqueta.compareTo(aux2Etiqueta) < 0)
                {
                    conjuntoResultado.insertar(aux1);
                    aux1 = aux1.getSiguiente();
                } else {
                    aux1 = aux1.getSiguiente();
                    aux2 = aux2.getSiguiente();
                }
            } else if (aux1Etiqueta.compareTo(aux2Etiqueta) > 0) {
                aux2 = aux2.getSiguiente();
            }
        }
        while (aux1 != null) {
            conjuntoResultado.insertar(aux1);
            aux1 = aux1.getSiguiente();
        }
        return conjuntoResultado;
    }

    public TConjunto<T> complemento(TConjunto<T> universo) {
        return universo.diferencia(this);
    }
}
