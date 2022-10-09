package com.mycompany.ut6_pd5.ejercicio3;


import java.util.LinkedList;

public class TArbolTrieTelefonosHashMap implements IArbolTrieTelefonosHashMap {

    private TNodoTrieTelefonosHashMap raiz;

    @Override
    public LinkedList<TAbonado> buscarTelefonos(String pais, String area) {
        if (raiz == null) {
            return null;
        } else {
            LinkedList<TAbonado> resultado = new LinkedList<>();
            raiz.buscarTelefonos(pais, area, resultado);
            return resultado;
        }
    }

    @Override
    public void insertar(String numero, TAbonado unAbonado) {
        if (raiz == null) {
            raiz = new TNodoTrieTelefonosHashMap();
        }
        raiz.insertar(numero, unAbonado);
    }

    @Override
    public TNodoTrieTelefonosHashMap buscar(String palabra) {
        if (raiz == null) {
            raiz = new TNodoTrieTelefonosHashMap();
        }
        return raiz.buscar(palabra);
    }

}
