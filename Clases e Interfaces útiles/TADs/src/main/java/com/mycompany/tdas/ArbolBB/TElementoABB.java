/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tdas;

/**
 *
 * @author juan-
 */

/*Recorrer
    Funcion():
    accion
    if(this.izq != null)
        this.izq.funcion()
    if(this.der != null)
        this.der.funcion()

 */
public class TElementoABB<T> implements IElementoAB<T> {

    protected Comparable etiqueta;
    protected T dato;
    protected TElementoABB<T> hijoDer;
    protected TElementoABB<T> hijoIzq;

    public TElementoABB(Comparable pEtiqueta, T pDato, TElementoABB pIzq, TElementoABB pDer) {
        this.etiqueta = pEtiqueta;
        this.dato = pDato;
        this.hijoDer = pIzq;
        this.hijoIzq = pDer;
    }

    public TElementoABB(Comparable pEtiqueta, T pDato) {
        this.etiqueta = pEtiqueta;
        this.dato = pDato;
        this.hijoDer = null;
        this.hijoIzq = null;
    }

    @Override
    public Comparable getEtiqueta() {
        return this.etiqueta;
    }

    @Override
    public TElementoABB<T> getHijoIzq() {
        return this.hijoIzq;
    }

    @Override
    public TElementoABB<T> getHijoDer() {
        return this.hijoDer;
    }

    @Override
    public void setHijoIzq(TElementoABB<T> elemento) {
        this.hijoIzq = elemento;
    }

    @Override
    public void setHijoDer(TElementoABB<T> elemento) {
        this.hijoDer = elemento;
    }

    @Override
    public TElementoABB<T> buscar(Comparable unaEtiqueta) {
        TElementoABB<T> encontrado = null;
        int comp = this.etiqueta.compareTo(unaEtiqueta);
        if (comp < 0) //La etiqueta es mayor que la raiz 
        {
            if (this.hijoDer != null) {
                encontrado = this.hijoDer.buscar(unaEtiqueta);
            }
        } else if (comp > 0) //La etiqueta es menor que la raiz
        {
            if (this.hijoIzq != null) {
                encontrado = this.hijoIzq.buscar(unaEtiqueta);
            }
        } else {
            encontrado = this.clonar();
        }
        return encontrado;
    }

    @Override
    public void insertar(TElementoABB<T> elemento) {
        int comp = this.etiqueta.compareTo(elemento.getEtiqueta());
        if (comp < 0) {
            if (this.hijoDer == null) {
                this.hijoDer = elemento;
            } else {
                this.hijoDer.insertar(elemento);
            }
        } else if (comp > 0) {
            if (this.hijoIzq == null) {
                this.hijoIzq = elemento;
            } else {
                this.hijoIzq.insertar(elemento);
            }
        }
    }

    @Override
    public String preOrden() {
        String thisValue = this.getEtiqueta().toString();

        String izqStr = "";
        if (this.hijoIzq != null) {
            izqStr = ", " + this.hijoIzq.preOrden();
        }

        String derStr = "";
        if (this.hijoDer != null) {
            derStr = ", " + this.hijoDer.preOrden();
        }

        return thisValue + izqStr + derStr;
    }

    @Override
    public String inOrden() {
        String izqStr = "";
        if (this.hijoIzq != null) {
            izqStr = this.hijoIzq.inOrden() + ", ";
        }

        String thisValue = this.getEtiqueta().toString();

        String derStr = "";
        if (this.hijoDer != null) {
            derStr = ", " + this.hijoDer.inOrden();
        }

        return izqStr + thisValue + derStr;
    }

    @Override
    public String postOrden() {
        String izqStr = "";
        if (this.hijoIzq != null) {
            izqStr = this.hijoIzq.postOrden() + ", ";
        }

        String derStr = "";
        if (this.hijoDer != null) {
            derStr = this.hijoDer.postOrden() + ", ";
        }

        String thisValue = this.getEtiqueta().toString();

        return izqStr + derStr + thisValue;
    }

    @Override
    public T getDatos() {
        return this.dato;
    }

    //Retorna la raiz del arbol
    @Override
    public TElementoABB<T> eliminar(Comparable unaEtiqueta) {
        int comp = unaEtiqueta.compareTo(this.etiqueta);
        if (comp < 0) {
            if (this.hijoIzq != null) {
                this.hijoIzq = this.hijoIzq.eliminar(unaEtiqueta);
            }
            return this;
        }

        if (comp > 0) {
            if (this.hijoDer != null) {
                this.hijoDer = this.hijoDer.eliminar(unaEtiqueta);
            }
            return this;
        }
        return quitarElNodo();
    }

    public TElementoABB<T> quitarElNodo() {
        if (this.hijoIzq == null) {
            return this.hijoDer;
        }
        if (this.hijoDer == null) {
            return this.hijoIzq;
        }
        TElementoABB<T> elHijo = this.hijoIzq;
        TElementoABB<T> elPadre = this;
        while (elHijo.hijoDer != null) {
            elPadre = elHijo;
            elHijo = elHijo.hijoDer;
        }
        if (elPadre != this) {
            elPadre.hijoDer = elHijo.hijoIzq;
            elHijo.hijoIzq = this.hijoIzq;
        }
        elHijo.hijoDer = this.hijoDer;
        return elHijo;
    }

    @Override
    public TElementoABB<T> clonar() {
        return new TElementoABB(this.etiqueta, this.dato, this.hijoIzq, this.hijoDer);
    }

    @Override
    public int altura() {
        int altIzq = -1;
        int altDer = -1;

        if (this.hijoIzq != null) {
            altIzq = this.hijoIzq.altura();
        }
        if (this.hijoDer != null) {
            altDer = this.hijoDer.altura();
        }

        return Math.max(altIzq, altDer) + 1;
    }

    @Override
    public int tamanio() {
        int res = 1;

        if (this.hijoIzq != null) {
            res += this.hijoIzq.tamanio();
        }
        if (this.hijoDer != null) {
            res += this.hijoDer.tamanio();
        }

        return res;
    }

    @Override
    public int cantHojas() {
        if (this.hijoIzq == null && this.hijoDer == null) {
            return 1;
        }

        int res = 0;
        if (this.hijoIzq != null) {
            res += this.hijoIzq.cantHojas();
        }
        if (this.hijoDer != null) {
            res += this.hijoDer.cantHojas();
        }
        return res;
    }

    public int sumOneIfNotNeg1(int n) {
        if (n >= 0) {
            return n + 1;
        }
        return -1;
    }

    @Override
    public int nivelDe(Comparable etiqueta) {
        int comp = etiqueta.compareTo(this.getEtiqueta());
        if (comp < 0) {
            if (this.hijoIzq != null) {
                return sumOneIfNotNeg1(this.hijoIzq.nivelDe(etiqueta));
            } else {
                return -1;
            }
        } else if (comp > 0) {
            if (this.hijoDer != null) {
                return sumOneIfNotNeg1(this.hijoDer.nivelDe(etiqueta));
            } else {
                return -1;
            }
        } else {
            return 0;
        }
    }

    @Override
    public TElementoABB<T> menor() {
        if (this.hijoIzq == null) {
            return this;
        } else {
            return this.hijoIzq.menor();
        }
    }

    @Override
    public TElementoABB<T> mayor() {
        if (this.hijoDer == null) {
            return this;
        } else {
            return this.hijoDer.mayor();
        }
    }

    @Override
    public TElementoABB<T> elementoAnterior(Comparable etiqueta) {
        if (this.etiqueta.compareTo(etiqueta) > 0) {
            if (this.hijoIzq != null) {
                if (this.hijoIzq.etiqueta.compareTo(etiqueta) == 0) {
                    return this;
                } else {
                    return this.hijoIzq.elementoAnterior(etiqueta);
                }
            }
        } else {
            if (this.hijoDer != null) {
                if (this.hijoDer.etiqueta.compareTo(etiqueta) == 0) {
                    return this;
                } else {
                    return this.hijoDer.elementoAnterior(etiqueta);
                }
            }
        }
        return null;
    }

    @Override
    public TLista nodosEnNivel(int i, int pEntrada, TLista pLista) {
        if (this != null) {
            if (pEntrada == i) {
                if (pLista == null) {
                    pLista = new TLista();
                }
                TNodo nodo = new TNodo(this.etiqueta, this.dato);
                pLista.insertar(nodo);
            } else {
                if (this.hijoIzq != null) {

                    pLista = this.hijoIzq.nodosEnNivel(i, pEntrada + 1, pLista);
                }
                if (this.hijoDer != null) {
                    pLista = this.hijoDer.nodosEnNivel(i, pEntrada + 1, pLista);
                }
            }
        }
        return pLista;
    }

    @Override
    public int cantNodosEnNivelConLista(int nivel) {
        TLista listaDeNodosEnUnNivel = new TLista();
        listaDeNodosEnUnNivel = this.nodosEnNivel(nivel, 1, listaDeNodosEnUnNivel);
        return listaDeNodosEnUnNivel.cantElementos();
    }

    @Override
    public String imprimirHojas() {
        String res = "";
        if (this.hijoDer == null && this.hijoIzq == null) {
            return res + this.etiqueta.toString() + ", ";
        } else {
            if (this.hijoIzq != null) {
                res = res + this.hijoIzq.imprimirHojas();
            }
            if (this.hijoDer != null) {
                res = res + this.hijoDer.imprimirHojas();
            }
        }
        return res;
    }

    @Override
    public int sumaValoresNodosInternos() {
        int sumIzq = 0;
        int sumDer = 0;
        if (this.hijoDer != null || this.hijoIzq != null) {
            if (this.hijoDer != null) {
                sumDer = this.hijoDer.sumaValoresNodosInternos();
            }
            if (this.hijoIzq != null) {
                sumIzq = this.hijoIzq.sumaValoresNodosInternos();
            }
            return sumDer + sumIzq + (int) this.getEtiqueta();
        }
        return 0;
    }

    @Override
    public int cantNodosInternos() {
        int sumIzq = 0;
        int sumDer = 0;
        if (this.hijoDer != null || this.hijoIzq != null) {
            if (this.hijoDer != null) {
                sumDer = this.hijoDer.cantNodosInternos();
            }
            if (this.hijoIzq != null) {
                sumIzq = this.hijoIzq.cantNodosInternos();
            }
            return sumDer + sumIzq + 1;
        }
        return 0;
    }

    @Override
    public int sumaValoresDeHojas() {
        int sumIzq = 0;
        int sumDer = 0;
        if (this.hijoDer == null && this.hijoIzq == null) {
            return (int) this.getEtiqueta();
        } else {
            if (this.hijoDer != null || this.hijoIzq != null) {
                if (this.hijoDer != null) {
                    sumDer = this.hijoDer.sumaValoresDeHojas();
                }
                if (this.hijoIzq != null) {
                    sumIzq = this.hijoIzq.sumaValoresDeHojas();
                }
                return sumDer + sumIzq;
            }
        }
        return 0;
    }

    @Override
    public int sumaValoresNodosEnNivel(int nivel) {
        if (nivel == 1) {
            return (int) this.getEtiqueta();
        } else {
            int sumIzq = 0;
            int sumDer = 0;
            if (this.hijoIzq != null) {
                sumIzq = this.hijoIzq.sumaValoresNodosEnNivel(nivel - 1);
            }
            if (this.hijoDer != null) {
                sumDer = this.hijoDer.sumaValoresNodosEnNivel(nivel - 1);
            }
            return sumDer + sumIzq;
        }
    }

    @Override
    public int cantNodosCon2Hijos() {
        int sumIzq = 0;
        int sumDer = 0;
        if (this.hijoDer != null || this.hijoIzq != null) {
            if (this.hijoDer != null) {
                sumDer = this.hijoDer.cantNodosCon2Hijos();
            }
            if (this.hijoIzq != null) {
                sumIzq = this.hijoIzq.cantNodosCon2Hijos();
            }
            if (this.hijoDer != null && this.hijoIzq != null) {
                return sumDer + sumIzq + 1;
            } else {
                return sumDer + sumIzq;
            }
        }
        return 0;
    }

    @Override
    public int cantNodosCon1Hijo() {
        int sumIzq = 0;
        int sumDer = 0;
        if (this.hijoDer != null || this.hijoIzq != null) {
            if (this.hijoDer != null) {
                sumDer = this.hijoDer.cantNodosCon1Hijo();
            }
            if (this.hijoIzq != null) {
                sumIzq = this.hijoIzq.cantNodosCon1Hijo();
            }
            if ((this.hijoDer != null && this.hijoIzq == null) || (this.hijoDer == null && this.hijoIzq != null)) {
                return sumDer + sumIzq + 1;
            } else {
                return sumDer + sumIzq;
            }
        }
        return 0;
    }

    @Override
    public int cantNodosEnNivelRecorriendo(int nivel) {
        if (nivel == 1) {
            return 1;
        } else {
            int sumIzq = 0;
            int sumDer = 0;
            if (this.hijoIzq != null) {
                sumIzq = this.hijoIzq.cantNodosEnNivelRecorriendo(nivel - 1);
            }
            if (this.hijoDer != null) {
                sumDer = this.hijoDer.cantNodosEnNivelRecorriendo(nivel - 1);
            }
            return sumDer + sumIzq;
        }
    }

    @Override
    public boolean esDeBusqueda() {
        boolean izq = true;
        boolean der = true;
        if (this.hijoDer != null) {
            if (this.getEtiqueta().compareTo(this.hijoDer.getEtiqueta()) > 0) {
                der = false;
            } else {
                der = this.hijoDer.esDeBusqueda();
            }
        }
        if (der == false) {
            return false;
        } else {
            if (this.hijoIzq != null) {
                if (this.getEtiqueta().compareTo(this.hijoIzq.getEtiqueta()) < 0) {
                    izq = false;
                } else {
                    izq = this.hijoIzq.esDeBusqueda();
                }
            }
            return izq && der;
        }
    }

    @Override
    public boolean esCompleto() {
        boolean izq = true;
        boolean der = true;
        if ((this.hijoDer == null && this.hijoIzq != null) || (this.hijoIzq == null && this.hijoDer != null)) {    //Tiene un solo hijo
            return false;
        } else if (this.hijoDer == null && this.hijoIzq == null) {
            return izq && der; //retorna true
        } else {
            if (this.hijoDer != null) {
                der = this.hijoDer.esCompleto();
            } else {
                der = false;
            }
            if (der == false) {
                return false;
            } else {
                if (this.hijoIzq != null) {
                    izq = this.hijoIzq.esCompleto();
                } else {
                    izq = false;
                }
            }
        }
        return izq && der;
    }
}
