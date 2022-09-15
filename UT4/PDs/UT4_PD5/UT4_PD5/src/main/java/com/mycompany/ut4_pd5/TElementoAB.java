package com.mycompany.ut4_pd5;


public class TElementoAB<T> implements IElementoAB<T> {

    private Comparable etiqueta;
    private TElementoAB hijoIzq;
    private TElementoAB hijoDer;
    private T datos;


    public TElementoAB(Comparable unaEtiqueta, T unosDatos) {
        etiqueta = unaEtiqueta;
        datos = unosDatos;
    }

    public TElementoAB<T> getHijoIzq() {
        return hijoIzq;
    }

    public TElementoAB<T> getHijoDer() {
        return hijoDer;
    }


    @Override
    public boolean insertar(TElementoAB<T> unElemento) {
        if (unElemento.getEtiqueta().compareTo(etiqueta) < 0) {
            if (hijoIzq != null) {
                return getHijoIzq().insertar(unElemento);
            } else {
                hijoIzq = unElemento;
                return true;
            }
        } else if (unElemento.getEtiqueta().compareTo(etiqueta) > 0) {
            if (hijoDer != null) {
                return getHijoDer().insertar(unElemento);
            } else {
                hijoDer = unElemento;
                return true;
            }
        } else {
            // ya existe un elemento con la misma etiqueta.-
            return false;
        }
    }


    @Override
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {

        if (unaEtiqueta.equals(etiqueta)) {
            return this;
        } else if (unaEtiqueta.compareTo(etiqueta) < 0) {
            if (hijoIzq != null) {
                return getHijoIzq().buscar(unaEtiqueta);
            } else {
                return null;
            }
        } else if (hijoDer != null) {
            return getHijoDer().buscar(unaEtiqueta);
        } else {
            return null;
        }
    }

    @Override
    public String inOrden() {
        StringBuilder tempStr = new StringBuilder();
        if (hijoIzq != null) {
            tempStr.append(getHijoIzq().inOrden());
            tempStr.append(TArbolBB.SEPARADOR_ELEMENTOS_IMPRESOS);
        }
        tempStr.append(imprimir());
        if (hijoDer != null) {
            tempStr.append(TArbolBB.SEPARADOR_ELEMENTOS_IMPRESOS);
            tempStr.append(getHijoDer().inOrden());
        }

        return tempStr.toString();
    }

    @Override
    public String preOrden() {
        StringBuilder tempStr = new StringBuilder();
        tempStr.append(imprimir());
        if (hijoIzq != null) {
            tempStr.append(TArbolBB.SEPARADOR_ELEMENTOS_IMPRESOS);
            tempStr.append(getHijoIzq().preOrden());
        }
        if (hijoDer != null) {
            tempStr.append(TArbolBB.SEPARADOR_ELEMENTOS_IMPRESOS);
            tempStr.append(getHijoDer().preOrden());
        }
        return tempStr.toString();
    }

    @Override
    public String postOrden() {
        StringBuilder tempStr = new StringBuilder();
        if (hijoIzq != null) {
            tempStr.append(getHijoIzq().postOrden());
            tempStr.append(TArbolBB.SEPARADOR_ELEMENTOS_IMPRESOS);
        }
        if (hijoDer != null) {
            tempStr.append(getHijoDer().postOrden());
            tempStr.append(TArbolBB.SEPARADOR_ELEMENTOS_IMPRESOS);
        }
        tempStr.append(imprimir());
        return tempStr.toString();
    }
    
    @Override
    public Comparable obtenerMenorClave() {
        if(hijoIzq == null) {
            return etiqueta;
        }
        return hijoIzq.obtenerMenorClave();
    }
    
    @Override
    public Comparable obtenerMayorClave() {
        if(hijoDer == null) {
            return etiqueta;
        }
        return hijoDer.obtenerMayorClave();
    }
    
    @Override
    public Comparable obtenerClaveAnterior(Comparable unaEtiqueta) {
        if (etiqueta.compareTo(unaEtiqueta) < 0) {
            if (hijoDer != null) {
                if (hijoDer.etiqueta.equals(unaEtiqueta)) {
                    return etiqueta;
                }
                return hijoDer.obtenerClaveAnterior(unaEtiqueta);
            }
        } else {
            if (hijoIzq != null) {
                if (hijoIzq.etiqueta.equals(unaEtiqueta)) {
                    return etiqueta;
                }
                return hijoIzq.obtenerClaveAnterior(unaEtiqueta);
            }
        }
        return null;
    }
    
    @Override
    public int obtenerCantNodosNivel(int nivel) {
        if (nivel == 0) {
            return 1;
        }
        int suma = 0;
        if (hijoIzq != null) {
            suma += hijoIzq.obtenerCantNodosNivel(nivel - 1);
        }
        if (hijoDer != null) {
            suma += hijoDer.obtenerCantNodosNivel(nivel - 1);
        }
        
        return suma;
    }
    
    @Override
    public void imprimirHojas(int nivel) {
        if (hijoIzq == null && hijoDer == null) {
            System.out.println("Elemento: " + etiqueta + "| Nivel: " + nivel);
        }
        if (hijoIzq != null) {
            hijoIzq.listarHojas(nivel + 1);
        }
        if (hijoDer != null) {
            hijoDer.listarHojas(nivel + 1);
        }
    }
    
    @Override
    public Lista<Comparable> listarHojas(int nivel) {
        Lista<Comparable> listaHojas = new Lista<>();
        if (hijoIzq == null && hijoDer == null) {
            INodo<Comparable> nodo = new Nodo<>(etiqueta, ("Elemento: " + etiqueta + "| Nivel: " + nivel));
        }
        if (hijoIzq != null) {
            hijoIzq.listarHojas(nivel + 1);
        }
        if (hijoDer != null) {
            hijoDer.listarHojas(nivel + 1);
        }
        return listaHojas;
    }
    
    @Override
    public boolean verificarArbol() {
        if (hijoIzq == null && hijoDer == null) {
            return true;
        }
        
        int compHijoIzq = (hijoIzq != null) ? etiqueta.compareTo(hijoIzq.etiqueta) : 1;
        int compHijoDer = (hijoDer != null) ? etiqueta.compareTo(hijoDer.etiqueta) : -1;
        
        boolean condicion = compHijoDer < 0 && compHijoIzq > 0;
        if (hijoIzq != null) {
            condicion = condicion && hijoIzq.verificarArbol();
        }
        
        if (hijoDer != null) {
            condicion = condicion && hijoDer.verificarArbol();
        }
        return condicion;
    }
    

    @Override
    public Comparable getEtiqueta() {
        return etiqueta;
    }


    public String imprimir() {
        return (etiqueta.toString());
    }

    @Override
    public T getDatos() {
        return datos;
    }

    @Override
    public void setHijoIzq(TElementoAB<T> elemento) {
        this.hijoIzq = elemento;

    }

    @Override
    public void setHijoDer(TElementoAB<T> elemento) {
        this.hijoDer = elemento;
    }

    @Override
    public TElementoAB<T> eliminar(Comparable unaEtiqueta) {
        if (unaEtiqueta.compareTo(this.getEtiqueta()) < 0) {
            if (this.hijoIzq != null) {
                this.hijoIzq = hijoIzq.eliminar(unaEtiqueta);
            }
            return this;
        }

        if (unaEtiqueta.compareTo(this.getEtiqueta()) > 0) {
            if (this.hijoDer != null) {
                this.hijoDer = hijoDer.eliminar(unaEtiqueta);

            }
            return this;
        }

        return quitaElNodo();
    }

    private TElementoAB<T> quitaElNodo() {
        if (hijoIzq == null) {    // solo tiene un hijo o es hoja
            return hijoDer;
        }

        if (hijoDer == null) { // solo tiene un hijo o es hoja
            return hijoIzq;
        }
        // tiene los dos hijos, buscamos el lexicograficamente anterior
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
        setHijoIzq(null);  // para que no queden referencias y ayudar al collector
        setHijoDer(null);
        return elHijo;
    }
	
}
