/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciospd8;

/**
 *
 * @author Martin
 */
public class Marcapasos {
    
    private static final SimulacionSensores simulador = new SimulacionSensores();
    
    // almacena la presion sanguinea (no puede ser bytes ya que el rango de los bytes va desde -128 hasta 127)
    // short debido a la ausencia de unsigned byte en java
    private short presionSanguinea;
    
    // almacena la frecuencia cardiaca (no puede ser bytes ya que el rango de los bytes va desde -128 hasta 127)
    // short debido a la ausencia de unsigned byte en java
    private short frecuenciaCardiaca;
    
    // almacena el nivel de azucar en sangre
    private short azucarEnSangre;
    
    // almacena la maxima fuerza a la que fue expuesto, no puede ser int debido a los rangos de este.
    // long debido a la ausencia de unsigned int en java
    private long maxFuerzaExpuesto;
    
    // almacena el minimo tiempo entre los latidos
    private float minimoTiempoEntreLatidos;
    
    // almacena el nivel de bateria restante con doble presición
    private double bateriaRestante;
    
    // almacena el codigo del fabricante
    private final String codigoFabricante;
    
    public Marcapasos(String codigoFabricacion) {
        this.presionSanguinea = 0;
        this.frecuenciaCardiaca = 0;
        this.azucarEnSangre = 0;
        this.maxFuerzaExpuesto = 0;
        this.minimoTiempoEntreLatidos = 0;
        this.bateriaRestante = 0;
        this.codigoFabricante = codigoFabricacion;
    }
    
    
    // getters
    public short getPresionSanguinea() {
        this.presionSanguinea = simulador.simValuePresionSanguinea();
        return this.presionSanguinea;
    }
    
    public short getFrecuenciaCardiaca() {
        this.frecuenciaCardiaca = simulador.simValueFrecuenciaCardiaca();
        return this.frecuenciaCardiaca;
    }
    
    public short getAzucarEnSangre() {
        this.azucarEnSangre = simulador.simValueAzucarEnSangre();
        return this.azucarEnSangre;
    }
    
    public long getMaxFuerzaExpuesto() {
        this.maxFuerzaExpuesto = simulador.simValueMaxFuerzaExpuesto();
        return this.maxFuerzaExpuesto;
    }
    
    public float getMinimoTiempoEntreLatidos() {
        this.minimoTiempoEntreLatidos = simulador.simValueMinimoTiempoEntreLatidos();
        return this.minimoTiempoEntreLatidos;
    }
    
    public double getBateriaRestante() {
        this.bateriaRestante = simulador.simValueBateriaRestante();
        return this.bateriaRestante;
    }
    
    public String getCodigoFabricante() {
        return this.codigoFabricante;
    }
    
}
