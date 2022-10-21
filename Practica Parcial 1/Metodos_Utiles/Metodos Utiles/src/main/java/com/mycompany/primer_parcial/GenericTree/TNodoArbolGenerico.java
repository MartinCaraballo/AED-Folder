package com.mycompany.primer_parcial.GenericTree;

public class TNodoArbolGenerico<T> {
    protected Comparable etiqueta;
    protected T dato;
    protected TNodoArbolGenerico<T> primerHijo;
    protected TNodoArbolGenerico<T> siguienteHermano;

    public TNodoArbolGenerico(Comparable pEtiqueta, T pDato) {
        this.etiqueta = pEtiqueta;
        this.dato = pDato;
        this.primerHijo = null;
        this.siguienteHermano = null;
    }

    public TNodoArbolGenerico<T> getPrimerHijo() {
        return this.primerHijo;
    }

    public TNodoArbolGenerico<T> getSigHermano() {
        return this.siguienteHermano;
    }

    public void setSigHermano(TNodoArbolGenerico<T> hermano) {
        this.siguienteHermano = hermano;
    }
    public void setPrimerHijo(TNodoArbolGenerico<T> hijo) {
        this.primerHijo = hijo;
    }

    public Comparable getEtiqueta() {
        return this.etiqueta;
    }

    public T getDato() {
        return this.dato;
    }

    /**
     *
     * @param etiqueta
     * @return
     */
    public TNodoArbolGenerico<T> buscar(Comparable etiqueta) {
        if (this.etiqueta.equals(etiqueta)) {
            return this;
        } else {
            TNodoArbolGenerico<T> hijo = this.getPrimerHijo();
            TNodoArbolGenerico<T> res = null;
            while (hijo != null) {
                res = hijo.buscar(etiqueta);
                if (res != null) {
                    return res;
                } else {
                    hijo = hijo.getSigHermano();
                }
            }
            return null;
        }
    }

    /**
     *
     * @param etiqueta
     * @param etiquetaPadre
     * @return
     */
    public boolean insertar(Comparable etiqueta, Comparable etiquetaPadre) {
        TNodoArbolGenerico<T> padre = this.buscar(etiquetaPadre);
        if (padre != null) {
            TNodoArbolGenerico<T> aux = padre.getPrimerHijo();
            TNodoArbolGenerico<T> nodoInsertar = new TNodoArbolGenerico<>(etiqueta, null);
            if (aux == null) {
                padre.setPrimerHijo(nodoInsertar);
            } else {
                while (aux.getSigHermano() != null) {
                    aux = aux.getSigHermano();
                }
                aux.setSigHermano(nodoInsertar);
            }
            return true;
        }
        return false;
    }

    /**
     *
     * @param nodo
     * @param etiquetaPadre
     * @return
     */
    public boolean insertar(TNodoArbolGenerico<T> nodo, Comparable etiquetaPadre) {
        TNodoArbolGenerico<T> padre = this.buscar(etiquetaPadre);
        if (padre != null) {
            TNodoArbolGenerico<T> aux = padre.getPrimerHijo();
            if (aux == null) {
                padre.setPrimerHijo(nodo);
            } else {
                while (aux.getSigHermano() != null) {
                    aux = aux.getSigHermano();
                }
                aux.setSigHermano(nodo);
            }
            return true;
        }
        return false;
    }

    /**
     *
     * @return
     */
    public String listarIndentado() {
        StringBuilder s = new StringBuilder();
        listarIndentadoAux(0, s);
        return s.toString();
    }

    private void listarIndentadoAux(int tabs, StringBuilder s)
    {
        s.append("\t".repeat(tabs)).append(this.getEtiqueta().toString()).append("\n");
        if(this.getPrimerHijo() != null)
        {
            this.getPrimerHijo().listarIndentadoAux(tabs+1, s);
        }
        if(this.getSigHermano()!= null)
        {
            this.getSigHermano().listarIndentadoAux(tabs, s);
        }
    }

    /**
     *
     * @return
     */
    public int cantElementos() {
        if (this.getPrimerHijo() == null) {
            return 1;
        } else {
            TNodoArbolGenerico<T> hijo = this.getPrimerHijo();
            int res = 1;
            while (hijo != null) {
                res += hijo.cantElementos();
                hijo = hijo.getSigHermano();
            }
            return res;
        }
    }
}
