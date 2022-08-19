/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerciciospd8;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Martin
 */
/*
Documentación: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
    Peso del objeto Marcapasos:
        La presion sanguinea es un numero de 16 bits, ocupa 2 bytes.
        La frecuencia cardiaca es un numero de 16 bits, ocupa 2 bytes.
        El nivel de azucar en sangre es un numero de 16 bits, ocupa 2 bytes.
        La maxima fuerza a la que fue expuesto es un numero de 64 bits, ocupa 8 bytes.
        El tiempo entre latidos es un numero de 32 bits, ocupa 4 bytes.
        El nivel de bateria restante es un numero de 64 bits, ocupa 8 bytes.
        El codigo del fabricante es un String, ocupa aproximadamente un byte por caracter, 
        lo cual al ser un codigo de 8 digitos, nos deja un peso de 8 bytes.
        
        Peso total: 2 + 2 + 2 + 8 + 4 + 8 + 8 = 34 bytes.
*/


public class Program {

    public static void main(String[] args) {
        Marcapasos marcapasos = new Marcapasos("ad1321a1");
        double bateriaRestante = marcapasos.getBateriaRestante();
        System.out.println("Cargando datos del marcapasos...");
        
        Timer timer = new Timer();
        TimerTask refrescarValores = new TimerTask() {
            @Override
            public void run() {
                StringBuilder sensoresMarcapasos = new StringBuilder("Los valores del marcapasos son:\n");
                sensoresMarcapasos.append("Presión sanguínea: ").append(marcapasos.getPresionSanguinea());
                sensoresMarcapasos.append("\nFrecuenciaCardíaca: ").append(marcapasos.getFrecuenciaCardiaca());
                sensoresMarcapasos.append("\nAzucar en sangre: ").append(marcapasos.getAzucarEnSangre());
                sensoresMarcapasos.append("\nMaxima fuerza a la que fue expuesto: ").append(marcapasos.getMaxFuerzaExpuesto());
                sensoresMarcapasos.append("\nMinimo tiempo entre latidos: ").append(marcapasos.getMinimoTiempoEntreLatidos());       
                sensoresMarcapasos.append("\nBatería restante: ").append(bateriaRestante);
                System.out.println(sensoresMarcapasos.toString());
            }
        };
        // Cada 500 ms se actualizan las lecturas.
        timer.schedule(refrescarValores, 0, 500);    
    }
}
