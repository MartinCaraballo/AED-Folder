/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut6_pd3;

import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Martin
 */
public class EliminarNullMap {

    Map map;

    public EliminarNullMap(Map unMap) {
        map = unMap;
    }

    public void eliminarDatosNulos() {
        try {
            Iterator<Map.Entry> itr = map.entrySet().iterator();
            while (itr.hasNext()) {
                Map.Entry current = itr.next();
                if (current.getValue() == null) {
                    itr.remove();
                }
            }
        } catch (Exception e) {
            System.out.println("No se pudieron eliminar todos las entradas nulas.");;
        }
    }

}
