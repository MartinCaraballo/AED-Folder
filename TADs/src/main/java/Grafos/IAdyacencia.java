package Grafos;

import Grafos.TVertice;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juan-
 */
public interface IAdyacencia {

    double getCosto();

    TVertice getDestino();

    Comparable getEtiqueta();
    
}
