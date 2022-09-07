/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut3_pd10;

/**
 *
 * @author Martin
 */
public class Farmaco {
    
    private Comparable identificadorFarmaco;
    private String descripcionFarmaco;
    
    public Farmaco(Comparable idFarmaco, String descFarmaco) {
        identificadorFarmaco = idFarmaco;
        descripcionFarmaco = descFarmaco;
    }
    
    public Comparable getFarmacoID() {
        return identificadorFarmaco;
    }
    
    public String getDescripcionFarmaco() {
        return descripcionFarmaco;
    }
}
