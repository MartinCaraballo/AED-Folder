/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut3_pd7;

import com.mycompany.ut3_pd7.Nodo.Nodo;

/**
 *
 * @author Martin
 */
public class Clase {
    
    Conjunto<Alumno> alumnos;
    
    public Clase(Conjunto<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    public String imprimirAlumnos() {
        if (alumnos.getPrimero() == null) {
            return "Conjunto vacío";
        } else {
            StringBuilder stringBuilder = new StringBuilder("Los alumnos son:\n");
            Nodo<Alumno> nodoActual = alumnos.getPrimero();
            while (nodoActual != null) {
                Alumno alumno = nodoActual.getDato();
                stringBuilder.append("C.I: ").append(alumno.getCedulaIdentidad())
                        .append(" | Nombre: ").append(alumno.getNombre())
                        .append(" | Apellido: ").append(alumno.getApellido())
                        .append("\n");
                nodoActual = nodoActual.getSiguiente();
            }
            return stringBuilder.toString();
        }
    }
}
