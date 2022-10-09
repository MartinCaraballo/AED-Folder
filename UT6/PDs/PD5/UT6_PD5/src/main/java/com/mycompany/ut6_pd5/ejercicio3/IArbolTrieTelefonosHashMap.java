package com.mycompany.ut6_pd5.ejercicio3;

import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ernesto
 */
public interface IArbolTrieTelefonosHashMap {

    LinkedList<TAbonado> buscarTelefonos(String pais, String area);

    void insertar(String numero, TAbonado unAbonado);
    public TNodoTrieTelefonosHashMap buscar(String palabra);
}
