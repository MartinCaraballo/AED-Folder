package com.mycompany.ut6_pd1.Medicion;


import com.mycompany.ut6_pd1.TArbolTrie;
import com.mycompany.ut6_pd1.TArbolTrieHashMap;
import java.util.HashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Martin
 */
public class MedicionPredecirTrieHashMap extends Medible {
    
    TArbolTrieHashMap tArbolTrieHashMap;

    public MedicionPredecirTrieHashMap(TArbolTrieHashMap unTrieHashMap) {
        tArbolTrieHashMap = unTrieHashMap;
    }
    
    @Override
    public void ejecutar(Object... params) {
        int repeticion = (int) params[0];
        String[] palabras = (String[]) params[1];
        for(int i = 0; i < repeticion; i++){
            for(String palabra : palabras){
                tArbolTrieHashMap.predecir(palabra);
            }
        }
    }

    @Override
    public Object getObjetoAMedirMemoria() {
        return tArbolTrieHashMap;
    }
    
}
