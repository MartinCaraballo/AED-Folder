/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tdas;

/**
 *
 * @author juan-
 */
public class TArbolBB<T> implements IArbolBB<T> {

    protected TElementoABB<T> raiz;

    @Override
    public void insertar(TElementoABB<T> unElemento) {
        if (this.raiz == null) {
            this.raiz = unElemento;
        } else {
            this.raiz.insertar(unElemento);
        }
    }

    @Override
    public TElementoABB<T> buscar(Comparable unaEtiqueta) {
        TElementoABB<T> encontrado = null;
        if (this.raiz != null) {

            encontrado = this.raiz.buscar(unaEtiqueta);

        }
        return encontrado;
    }

    @Override
    public String preOrden() {
        String preOrden = "";
        if (this.raiz != null) {
            preOrden = this.raiz.preOrden();
        }
        return preOrden;
    }

    @Override
    public String inOrden() {
        String inOrden = "";
        if (this.raiz != null) {
            inOrden = this.raiz.inOrden();
        }
        return inOrden;
    }

    @Override
    public String postOrden() {
        String postOrden = "";
        if (this.raiz != null) {
            postOrden = this.raiz.postOrden();
        }
        return postOrden;
    }

    @Override
    public void eliminar(Comparable unaEtiqueta) {
        if (this.raiz != null) {
            this.raiz = this.raiz.eliminar(unaEtiqueta);
        }
    }

    @Override
    public int altura() {
        if (this.raiz != null) {
            return this.raiz.altura();
        }
        return -1;
    }

    @Override
    public int tamanio() {
        if (this.raiz != null) {
            return this.raiz.tamanio();
        }
        return 0;
    }

    @Override
    public int cantHojas() {
        if (this.raiz != null) {
            return this.raiz.cantHojas();
        }

        return 0;
    }

    @Override
    public int nivelDe(Comparable etiqueta) {
        if (this.raiz != null) {
            return this.raiz.nivelDe(etiqueta);
        }
        return -1;
    }

    @Override
    public TElementoABB<T> menor() {
        if (this.raiz != null) {
            return this.raiz.menor();
        }
        return null;
    }

    @Override
    public TElementoABB<T> mayor() {
        if (this.raiz != null) {
            return this.raiz.mayor();
        }
        return null;
    }

    @Override
    public TElementoABB<T> elementoAnterior(Comparable etiqueta) {
        if (this.raiz != null) {
            if (this.raiz.etiqueta.compareTo(etiqueta) != 0) {
                return this.raiz.elementoAnterior(etiqueta);
            }
        }
        return null;
    }

    @Override
    public int cantNodosEnNivel(int nivel) {
        if (nivel >= 1) {
            if (this.raiz != null) {
                if (nivel == 1) {
                    return 1;
                } else {
                    return this.raiz.cantNodosEnNivelRecorriendo(nivel);
                }
            }
        }
        return 0;
    }

    @Override
    public String imprimirHojas() {
        if (this.raiz != null) {
            return this.raiz.imprimirHojas();
        }
        return "";
    }

    @Override
    public int sumaValoresNodosInternos() {
        if (this.raiz != null) {
            return this.raiz.sumaValoresNodosInternos();
        }
        return 0;
    }

    @Override
    public int cantNodosInternos() {
        if (this.raiz != null) {
            return this.raiz.cantNodosInternos();
        }
        return 0;
    }

    @Override
    public int sumaValoresDeHojas() {
        if (this.raiz != null) {
            return this.raiz.sumaValoresDeHojas();
        }
        return 0;
    }

    @Override
    public int sumaValoresNodosEnNivel(int nivel) {
        if (this.raiz != null) {
            return this.raiz.sumaValoresNodosEnNivel(nivel);
        }
        return 0;
    }

    @Override
    public int cantNodosCon2Hijos() {
        if (this.raiz != null) {
            return this.raiz.cantNodosCon2Hijos();
        }
        return 0;
    }

    @Override
    public int cantNodosCon1Hijo() {
        if (this.raiz != null) {
            return this.raiz.cantNodosCon1Hijo();
        }
        return 0;
    }

    @Override
    public boolean esDeBusqueda() {
        if (this.raiz != null) {
            return this.raiz.esDeBusqueda();
        }
        return false;
    }

    @Override
    public boolean esCompleto() {
        if (this.raiz != null) {
            return this.raiz.esCompleto();
        }
        return false;
    }

}
