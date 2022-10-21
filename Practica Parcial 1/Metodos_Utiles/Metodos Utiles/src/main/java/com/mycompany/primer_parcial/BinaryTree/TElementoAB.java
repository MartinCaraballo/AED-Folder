package com.mycompany.primer_parcial.BinaryTree;

import java.util.LinkedList;

public class TElementoAB<T> {

    private Comparable etiqueta;
    private TElementoAB<T> hijoIzq;
    private TElementoAB<T> hijoDer;
    private T dato;

    /**
     * @param unaEtiqueta Una etiqueta.
     * @param unDato Un dato.
     */
    public TElementoAB(Comparable unaEtiqueta, T unDato) {
        etiqueta = unaEtiqueta;
        dato = unDato;
    }

    public Comparable getEtiqueta() {
        return this.etiqueta;
    }

    public TElementoAB<T> getHijoIzq() {
        return this.hijoIzq;
    }

    public TElementoAB<T> getHijoDer() {
        return this.hijoDer;
    }

    public void setHijoIzq(TElementoAB<T> elemento) {
        this.hijoIzq = elemento;
    }

    public void setHijoDer(TElementoAB<T> elemento) {
        this.hijoDer = elemento;
    }

    public T getDatos() {
        return this.dato;
    }

    /**
     * Busca un elemento dentro del arbol.
     * @param unaEtiqueta Etiqueta del elemento a ser buscado.
     * @return Devuelve el elemento encontrado o null por el contrario.
     */
    @SuppressWarnings("unchecked")
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
        if (unaEtiqueta.compareTo(etiqueta) == 0) {
            return this;
        }
        if (unaEtiqueta.compareTo(etiqueta) < 0) {
            if (hijoIzq != null) {
                return hijoIzq.buscar(unaEtiqueta);
            } else {
                return null;
            }
        }
        if (hijoDer != null) {
            return hijoDer.buscar(unaEtiqueta);
        } else {
            return null;
        }
    }

    /**
     * Busca un elemento dentro del arbol.
     * @param unaEtiqueta Etiqueta del elemento a ser buscado.
     * @param contador Array donde se almacena la cantidad de comparaciones que toma buscar el elemento.
     * @return Devuelve el elemento encontrado o null por el contrario.
     */
    @SuppressWarnings("unchecked")
    public TElementoAB<T> buscarConContador(Comparable unaEtiqueta, int[] contador) {
        contador[0]++;
        if (unaEtiqueta.equals(etiqueta)) {
            return this;
        } else if (unaEtiqueta.compareTo(etiqueta) < 0) {
            if (hijoIzq != null) {
                return getHijoIzq().buscarConContador(unaEtiqueta, contador);
            } else {
                return null;
            }
        } else if (hijoDer != null) {
            return getHijoDer().buscarConContador(unaEtiqueta, contador);
        } else {
            return null;
        }
    }

    /**
     * Inserta un elemento en el arbol.
     * @param elemento Elemento a ser insertado.
     * @return Devuelve true si el elemento fue insertado con exito, false en caso contrario.
     */
    @SuppressWarnings("unchecked")
    public boolean insertar(TElementoAB<T> elemento) {
        if (elemento.getEtiqueta().compareTo(etiqueta) < 0) {
            if (hijoIzq == null) {
                hijoIzq = elemento;
                return true;
            } else {
                return getHijoIzq().insertar(elemento);
            }
        } else if (elemento.getEtiqueta().compareTo(etiqueta) > 0) {
            if (hijoDer == null) {
                hijoDer = elemento;
                return true;
            } else {
                return getHijoDer().insertar(elemento);
            }
        }
        return false;
    }

    /**
     * Inserta un elemento en el arbol.
     * @param elemento Elemento a ser insertado.
     * @param contador Array donde se almacena la cantidad de comparaciones que toma insertar el elemento.
     * @return Devuelve true si el elemento fue insertado con exito, false en caso contrario.
     */
    @SuppressWarnings("unchecked")
    public boolean insertarConContador(TElementoAB<T> elemento, int[] contador) {
        contador[0]++;
        if (elemento.getEtiqueta().compareTo(etiqueta) < 0) {
            if (hijoIzq == null) {
                hijoIzq = elemento;
                return true;
            } else {
                return getHijoIzq().insertarConContador(elemento, contador);
            }
        } else if (elemento.getEtiqueta().compareTo(etiqueta) > 0) {
            if (hijoDer == null) {
                hijoDer = elemento;
                return true;
            } else {
                return getHijoDer().insertarConContador(elemento, contador);
            }
        } else {
            return false;
        }
    }

    /**
     * Elimina un elemento del arbol por su etiqueta.
     * @param unaEtiqueta Etiqueta del elemento a ser eliminado.
     * @return Retorna el elemento eliminado.
     */
    @SuppressWarnings("unchecked")
    public TElementoAB<T> eliminar(Comparable unaEtiqueta) {
        if (unaEtiqueta.compareTo(this.getEtiqueta()) < 0) {
            if (hijoIzq != null) {
                hijoIzq = hijoIzq.eliminar(unaEtiqueta);
            }
            return this;
        }
        if (unaEtiqueta.compareTo(this.getEtiqueta()) > 0) {
            if (hijoDer != null) {
                hijoDer = hijoDer.eliminar(unaEtiqueta);
            }
            return this;
        }
        return quitarNodo();
    }

    private TElementoAB<T> quitarNodo() {
        if (hijoIzq == null) {
            return hijoDer;
        }
        if (hijoDer == null) {
            return hijoIzq;
        }

        TElementoAB<T> elHijo = hijoIzq;
        TElementoAB<T> elPadre = this;
        while (elHijo.getHijoDer() != null) {
            elPadre = elHijo;
            elHijo = elHijo.getHijoDer();
        }
        if (elPadre != this) {
            elPadre.setHijoDer(elHijo.getHijoIzq());
            elHijo.setHijoIzq(hijoIzq);
        }
        elHijo.setHijoDer(hijoDer);
        setHijoIzq(null);
        setHijoDer(null);
        return elHijo;
    }

    /**
     *
     * @return Devuelve una String con el preorden del arbol.
     */
    public String preOrden() {
        StringBuilder resultado = new StringBuilder();
        resultado.append(etiqueta.toString());
        if (hijoIzq != null) {
            resultado.append(TArbolBB.SEPARADOR_ELEMENTOS_IMPRESOS);
            resultado.append(getHijoIzq().preOrden());
        }
        if (hijoDer != null) {
            resultado.append(TArbolBB.SEPARADOR_ELEMENTOS_IMPRESOS);
            resultado.append(getHijoDer().preOrden());
        }
        return resultado.toString();
    }

    /**
     *
     * @return Devuelve una String con el inorden del arbol.
     */
    public String inOrden() {
        StringBuilder resultado = new StringBuilder();
        if (hijoIzq != null) {
            resultado.append(getHijoIzq().inOrden());
            resultado.append(TArbolBB.SEPARADOR_ELEMENTOS_IMPRESOS);
        }
        resultado.append(etiqueta.toString());
        if (hijoDer != null) {
            resultado.append(TArbolBB.SEPARADOR_ELEMENTOS_IMPRESOS);
            resultado.append(getHijoDer().inOrden());
        }
        return resultado.toString();
    }

    /**
     *
     * @return Devuelve una String con el postorden del arbol.
     */
    public String postOrden() {
        StringBuilder resultado = new StringBuilder();
        if (hijoIzq != null) {
            resultado.append(getHijoIzq().postOrden());
            resultado.append(TArbolBB.SEPARADOR_ELEMENTOS_IMPRESOS);
        }
        if (hijoDer != null) {
            resultado.append(getHijoDer().postOrden());
            resultado.append(TArbolBB.SEPARADOR_ELEMENTOS_IMPRESOS);
        }
        resultado.append(etiqueta.toString());
        return resultado.toString();
    }

    /**
     *
     * @return Retorna la altura del arbol.
     */
    public int altura() {
        int altIzq = -1;
        int altDer = -1;
        if (hijoIzq != null) {
            altIzq = hijoIzq.altura();
        }
        if (hijoDer != null) {
            altDer = hijoDer.altura();
        }
        return Math.max(altIzq, altDer) + 1;
    }

    /**
     *
     * @return Retorna un int con el size del arbol.
     */
    public int tamanio() {
        int resultado = 1;
        if (hijoIzq != null) {
            resultado += hijoIzq.tamanio();
        }
        if (this.hijoDer != null) {
            resultado += hijoDer.tamanio();
        }
        return resultado;
    }

    /**
     * Binary Tree
     * @return Retorna la cantidad de hojas totales en todo el arbol.
     */
    public int cantHojas() {
        if (hijoIzq == null && hijoDer == null) {
            return 1;
        }
        int resultado = 0;

        if (hijoIzq != null) {
            resultado += hijoIzq.cantHojas();
        }
        if (hijoDer != null) {
            resultado += hijoDer.cantHojas();
        }
        return resultado;
    }

    /**
     *
     * @param etiqueta Etiqueta del elemento a partir del cual se quiere encontrar su anterior.
     * @return Retorna el nodo anterior al especificado o null por el contrario.
     */
    @SuppressWarnings("unchecked")
    public TElementoAB<T> elementoAnterior(Comparable etiqueta) {
        if (this.etiqueta.compareTo(etiqueta) > 0) {
            if (hijoIzq != null) {
                if (hijoIzq.etiqueta.compareTo(etiqueta) == 0) {
                    return this;
                } else {
                    return hijoIzq.elementoAnterior(etiqueta);
                }
            }
        } else {
            if (hijoDer != null) {
                if (hijoDer.etiqueta.compareTo(etiqueta) == 0) {
                    return this;
                } else {
                    return hijoDer.elementoAnterior(etiqueta);
                }
            }
        }
        return null;
    }

    /**
     *
     * @param i
     * @param pEntrada
     * @param listaResultado
     * @return Retorna
     */
    public LinkedList<TElementoAB<T>> nodosEnNivel(int i, int pEntrada, LinkedList<TElementoAB<T>> listaResultado) {
        if (pEntrada == i) {
            TElementoAB<T> nodo = new TElementoAB<>(this.etiqueta, this.dato);
            listaResultado.add(nodo);
        } else {
            if (this.hijoIzq != null) {
                listaResultado = hijoIzq.nodosEnNivel(i, pEntrada + 1, listaResultado);
            }
            if (this.hijoDer != null) {
                listaResultado = hijoDer.nodosEnNivel(i, pEntrada + 1, listaResultado);
            }
        }
        return listaResultado;
    }

    /**
     * Binary Search Tree method.
     * @return Retorna el nodo con la etiqueta menor.
     */
    public TElementoAB<T> menor() {
        if (hijoIzq == null) {
            return this;
        } else {
            return hijoIzq.menor();
        }
    }

    /**
     * Binary Search Tree method.
     * @return Retorna el nodo con la etiqueta mayor.
     */
    public TElementoAB<T> mayor() {
        if (hijoDer == null) {
            return this;
        } else {
            return hijoDer.mayor();
        }
    }

    /**
     *
     * @param unaEtiqueta Etiqueta del nodo que se quiera obtener su nivel.
     * @return
     */
    @SuppressWarnings("unchecked")
    public int obtenerNivel(Comparable unaEtiqueta) {
        int comp = etiqueta.compareTo(this.getEtiqueta());
        if (unaEtiqueta.compareTo(etiqueta) < 0) {
            if (hijoIzq != null && hijoIzq.obtenerNivel(unaEtiqueta) >= 0) {
                return hijoIzq.obtenerNivel(unaEtiqueta) + 1;
            } else if (hijoIzq != null && hijoIzq.obtenerNivel(unaEtiqueta) < 0) {
                return -1;
            } else {
                return -1;
            }
        } else if (unaEtiqueta.compareTo(etiqueta) > 0) {
            if (hijoDer != null && hijoDer.obtenerNivel(unaEtiqueta) >= 0) {
                return hijoDer.obtenerNivel(unaEtiqueta) + 1;
            } else if (hijoDer != null && hijoDer.obtenerNivel(unaEtiqueta) < 0){
                return -1;
            } else {
                return -1;
            }
        } else {
            return 0;
        }
    }

    /**
     *
     * @return
     */
    public int sumaValoresNodosInternos() {
        int sumIzq = 0;
        int sumDer = 0;
        if (hijoDer != null || hijoIzq != null) {
            if (hijoDer != null) {
                sumDer = hijoDer.sumaValoresNodosInternos();
            }
            if (this.hijoIzq != null) {
                sumIzq = hijoIzq.sumaValoresNodosInternos();
            }
            return sumDer + sumIzq + (int) this.getEtiqueta();
        }
        return 0;
    }

    /**
     *
     * @return
     */
    public int cantNodosInternos() {
        int sumIzq = 0;
        int sumDer = 0;
        if (hijoDer != null || hijoIzq != null) {
            if (hijoDer != null) {
                sumDer = hijoDer.cantNodosInternos();
            }
            if (hijoIzq != null) {
                sumIzq = hijoIzq.cantNodosInternos();
            }
            return sumDer + sumIzq + 1;
        }
        return 0;
    }

    /**
     *
     * @return
     */
    public int sumaValoresDeHojas() {
        int sumIzq = 0;
        int sumDer = 0;
        if (hijoDer == null && hijoIzq == null) {
            return (int) this.getEtiqueta();
        } else {
            if (hijoDer != null) {
                sumDer = hijoDer.sumaValoresDeHojas();
            }
            if (hijoIzq != null) {
                sumIzq = hijoIzq.sumaValoresDeHojas();
            }
            return sumDer + sumIzq;
        }
    }

    /**
     *
     * @param nivel
     * @return
     */
    public int sumaValoresNodosEnNivel(int nivel) {
        if (nivel == 1) {
            return (int) this.getEtiqueta();
        } else {
            int sumIzq = 0;
            int sumDer = 0;
            if (hijoIzq != null) {
                sumIzq = hijoIzq.sumaValoresNodosEnNivel(nivel - 1);
            }
            if (hijoDer != null) {
                sumDer = hijoDer.sumaValoresNodosEnNivel(nivel - 1);
            }
            return sumDer + sumIzq;
        }
    }

    /**
     *
     * @return
     */
    public int cantNodosConUnHijo() {
        int sumIzq = 0;
        int sumDer = 0;
        if (this.hijoDer != null || this.hijoIzq != null) {
            if (hijoDer != null) {
                sumDer = hijoDer.cantNodosConUnHijo();
            }
            if (hijoIzq != null) {
                sumIzq = hijoIzq.cantNodosConUnHijo();
            }
            if ((hijoDer != null && hijoIzq == null) || (hijoDer == null && hijoIzq != null)) {
                return sumDer + sumIzq + 1;
            } else {
                return sumDer + sumIzq;
            }
        }
        return 0;
    }

    /**
     *
     * @return
     */
    public int cantNodosConDosHijos() {
        int sumIzq = 0;
        int sumDer = 0;
        if (hijoDer != null || hijoIzq != null) {
            if (hijoDer != null) {
                sumDer = hijoDer.cantNodosConDosHijos();
            }
            if (hijoIzq != null) {
                sumIzq = hijoIzq.cantNodosConDosHijos();
            }
            if (hijoDer != null && hijoIzq != null) {
                return sumDer + sumIzq + 1;
            } else {
                return sumDer + sumIzq;
            }
        }
        return 0;
    }

    /**
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public boolean esDeBusqueda() {
        boolean izq = true;
        boolean der = true;
        if (hijoDer != null) {
            if (this.getEtiqueta().compareTo(hijoDer.getEtiqueta()) > 0) {
                return false;
            } else {
                der = hijoDer.esDeBusqueda();
            }
        }
        if (der == false) {
            return false;
        } else {
            if (hijoIzq != null) {
                if (this.getEtiqueta().compareTo(hijoIzq.getEtiqueta()) < 0) {
                    return false;
                } else {
                    izq = hijoIzq.esDeBusqueda();
                }
            }
            return izq;
        }
    }

    /**
     *
     * @return
     */
    public boolean esCompleto() {
        boolean izq = true;
        boolean der = true;
        if ((hijoDer == null && hijoIzq != null) || (hijoIzq == null && hijoDer != null)) {    //Tiene un solo hijo
            return false;
        } else if (hijoDer == null) {
            return true;
        } else {
            der = hijoDer.esCompleto();
            if (der == false) {
                return false;
            } else {
                if (hijoIzq != null) {
                    izq = hijoIzq.esCompleto();
                } else {
                    return false;
                }
            }
        }
        return izq;
    }

}
