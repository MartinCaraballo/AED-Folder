/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciospd8;

import java.util.Random;

/**
 *
 * @author Martin
 */
public class SimulacionSensores {
    private static final Random random = new Random();
    
    public short simValuePresionSanguinea() {
        return (short) random.nextInt(0, 250);
    }
    
    public short simValueFrecuenciaCardiaca() {
        return (short) random.nextInt(0, 226);
    }
    
    public short simValueAzucarEnSangre() {
        return (short) random.nextInt(0, 1000);
    }
    
    public long simValueMaxFuerzaExpuesto() {
        return random.nextLong(0, 3000000000L);
    }
    
    public float simValueMinimoTiempoEntreLatidos() {
        return random.nextFloat(0, 100);
    }
    
    public double simValueBateriaRestante() {
        return random.nextDouble(0, 100);
    }
}
