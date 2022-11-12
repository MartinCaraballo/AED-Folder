package com.mycompany.ut8_ta5;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class TVertice<T> implements IVertice, IVerticeKevinBacon {

    private Comparable etiqueta;
    private LinkedList<TAdyacencia> adyacentes;
    private boolean visitado;
    private T datos;
    private int numBacon = 0;

    public Comparable getEtiqueta() {
        return etiqueta;
    }

    public LinkedList<TAdyacencia> getAdyacentes() {
        return adyacentes;
    }

    public T getDatos() {
        return datos;
    }

    public TVertice(Comparable unaEtiqueta) {
        this.etiqueta = unaEtiqueta;
        adyacentes = new LinkedList();
        visitado = false;
    }

    public void setVisitado(boolean valor) {
        this.visitado = valor;
    }

    public boolean getVisitado() {
        return this.visitado;
    }

    @Override
    public TAdyacencia buscarAdyacencia(TVertice verticeDestino) {
        if (verticeDestino != null) {
            return buscarAdyacencia(verticeDestino.getEtiqueta());
        }
        return null;
    }

    @Override
    public Double obtenerCostoAdyacencia(TVertice verticeDestino) {
        TAdyacencia ady = buscarAdyacencia(verticeDestino);
        if (ady != null) {
            return ady.getCosto();
        }
        return Double.MAX_VALUE;
    }

    @Override
    public boolean insertarAdyacencia(Double costo, TVertice verticeDestino) {
        if (buscarAdyacencia(verticeDestino) == null) {
            TAdyacencia ady = new TAdyacencia(costo, verticeDestino);
            return adyacentes.add(ady);
        }
        return false;
    }

    @Override
    public boolean eliminarAdyacencia(Comparable nomVerticeDestino) {
        TAdyacencia ady = buscarAdyacencia(nomVerticeDestino);
        if (ady != null) {
            adyacentes.remove(ady);
            return true;
        }
        return false;
    }

    @Override
    public TVertice primerAdyacente() {
        if (this.adyacentes.getFirst() != null) {
            return this.adyacentes.getFirst().getDestino();
        }
        return null;
    }

    @Override
    public TAdyacencia buscarAdyacencia(Comparable etiquetaDestino) {
        for (TAdyacencia adyacencia : adyacentes) {
            if (adyacencia.getDestino().getEtiqueta().compareTo(etiquetaDestino) == 0) {
                return adyacencia;
            }
        }
        return null;
    }

    @Override
    public void bpf(Collection<TVertice> visitados) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TCaminos todosLosCaminos(Comparable etVertDest, TCamino caminoPrevio, TCaminos todosLosCaminos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void bea(Collection<TVertice> visitados) {
        Queue<TVertice> colaDeVertices = new LinkedList<>();
        colaDeVertices.add(this);
        visitado = true;
        visitados.add(this);
        while (!colaDeVertices.isEmpty()) {
            TVertice verticeX = colaDeVertices.poll();
            LinkedList<TAdyacencia> adyacentes = verticeX.getAdyacentes();
            for (TAdyacencia adyacente : adyacentes) {
                TVertice verticeY = adyacente.getDestino();
                if (!verticeY.visitado) {
                    verticeY.setVisitado(true);
                    colaDeVertices.add(verticeY);
                    visitados.add(verticeY);
                }
            }
        }
    }

    public void beaBacon(Comparable actor) {
        Queue<TVertice> colaDeVertices = new LinkedList<>();
        colaDeVertices.add(this);
        visitado = true;
        while (!colaDeVertices.isEmpty()) {
            TVertice verticeX = colaDeVertices.poll();
            LinkedList<TAdyacencia> adyacentes = verticeX.getAdyacentes();
            for (TAdyacencia adyacente : adyacentes) {
                TVertice verticeY = adyacente.getDestino();
                if (!verticeY.visitado) {
                    verticeY.setVisitado(true);
                    colaDeVertices.add(verticeY);
                    verticeY.setBacon(verticeX.getBacon() + 1);
                    if (verticeY.getEtiqueta().compareTo(actor) == 0) {
                        return;
                    }
                }
            }
        }
    }

    @Override
    public TVertice siguienteAdyacente(TVertice w) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean tieneCiclo(LinkedList<Comparable> camino) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean conectadoCon(TVertice destino) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getBacon() {
        return numBacon;
    }

    @Override
    public void setBacon(int newBacon) {
        numBacon = newBacon;
    }

}