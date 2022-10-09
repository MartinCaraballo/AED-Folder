package com.mycompany.ut6_pd1.Medicion;

import com.mycompany.ut6_pd1.TArbolTrie;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Martin
 */
public class MedicionPredecirTrie extends Medible {
    
    TArbolTrie tArbolTrie;

    public MedicionPredecirTrie(TArbolTrie unTArbolTrie) {
        tArbolTrie = unTArbolTrie;
    }
    
    @Override
    public void ejecutar(Object... params) {
        int repeticion = (int) params[0];
        String[] palabras = (String[]) params[1];
        for(int i = 0; i < repeticion; i++){
            for(String palabra : palabras){
                tArbolTrie.predecir(palabra);
            }
        }
    }

    @Override
    public Object getObjetoAMedirMemoria() {
        return tArbolTrie;
    }
    
    
    
}
