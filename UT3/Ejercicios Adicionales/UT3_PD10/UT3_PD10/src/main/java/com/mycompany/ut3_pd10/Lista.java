package com.mycompany.ut3_pd10;

public class Lista<T> implements ILista<T> {

    private INodo<T> primero;

    public Lista() {
        primero = null;
    }

    public Lista(INodo<T> unNodo) {
        this.primero = unNodo;
    }

    /**
     * Inserta un INodo al final de la lista
     */
    public void insertar(INodo<T> unNodo) {
        if (esVacia()) {
            primero = unNodo;
        } else {
            INodo aux = primero;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(unNodo);
        }
    }

    /**
     * Busca un nodo en la lista a partir de la etiqueta. La etiqueta puede ser
     * cualquier tipo Comparable
     */
    public INodo<T> buscar(Comparable etiqueta) {
        if (esVacia()) {
            return null;
        } else {
            INodo aux = primero;
            while (aux != null) {
                if (aux.getEtiqueta().equals(etiqueta)) {
                    return aux;
                }
                aux = aux.getSiguiente();
            }
        }
        return null;
    }

    public boolean eliminar(Comparable clave) {
        if (esVacia()) {
            return false;
        }
        if (primero.getSiguiente() == null) {
            if (primero.getEtiqueta().equals(clave)) {
                primero = null;
                return true;
            }
        }
        INodo aux = primero;
        if (aux.getEtiqueta().compareTo(clave) == 0) {
            //Eliminamos el primer elemento
            INodo temp1 = aux;
            INodo temp = aux.getSiguiente();
            primero = temp;
            return true;
        }
        while (aux.getSiguiente() != null) {
            if (aux.getSiguiente().getEtiqueta().equals(clave)) {
                INodo temp = aux.getSiguiente();
                aux.setSiguiente(temp.getSiguiente());
                return true;

            }
            aux = aux.getSiguiente();
        }
        return false;
    }

    public String imprimir() {
        String aux = "";
        if (!esVacia()) {
            INodo temp = primero;
            while (temp != null) {
                temp.imprimirEtiqueta();
                temp = temp.getSiguiente();
            }
        }
        return aux;
    }

    public String imprimir(String separador) {
        String aux = "";
        if (esVacia()) {
            return "";
        } else {
            INodo temp = primero;
            aux = "" + temp.getEtiqueta();
            while (temp.getSiguiente() != null) {
                aux = aux + separador + temp.getSiguiente().getEtiqueta();
                temp = temp.getSiguiente();
            }

        }
        return aux;

    }

    public int cantElementos() {
        int contador = 0;
        if (esVacia()) {
            System.out.println("Cantidad de elementos 0.");
            return 0;
        } else {
            INodo aux = primero;
            while (aux != null) {
                contador++;
                aux = aux.getSiguiente();
            }
        }
        return contador;
    }

    @Override
    public boolean esVacia() {
        return primero == null;
    }

    public INodo<T> getPrimero() {
        return primero;
    }

    @Override
    public INodo<T> quitarPrimero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public INodo<T> getUltimo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
