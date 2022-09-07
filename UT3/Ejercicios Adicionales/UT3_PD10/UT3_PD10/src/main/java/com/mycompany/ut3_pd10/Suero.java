/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut3_pd10;

/**
 *
 * @author Martin
 */
public class Suero {
    
    private Comparable identificadorSuero;
    private String descripcionSuero;
    
    public Suero(Comparable idSuero, String descSuero) {
        identificadorSuero = idSuero;
        descripcionSuero = descSuero;
    }
    
    public Comparable getSueroID() {
        return identificadorSuero;
    }
    
    public String getDescripcionSuero() {
        return descripcionSuero;
    }  
}
