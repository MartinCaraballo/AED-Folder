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
public interface INodoTrieTelefonosHashMap {

    public void buscarTelefonos(String codigoPais, String codigoArea, LinkedList<TAbonado> abonados);

    void insertar(String numero, TAbonado unAbonado);
    TNodoTrieTelefonosHashMap buscar(String s);
    
}
