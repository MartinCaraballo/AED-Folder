/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ut3_pd7;

import com.mycompany.ut3_pd7.Nodo.Nodo;

/**
 *
 * @author Martin
 */
public class Program {

    public static void main(String[] args) {
        
        Conjunto<Alumno> aedI = new Conjunto<>();
        Conjunto<Alumno> pf = new Conjunto<>();
        
        Alumno jhonDoe = new Alumno("1234", "jhon", "Doe");
        Alumno juanGome = new Alumno("3124", "Juan", "Gome");
        Alumno renaultClio = new Alumno("5646", "Renault", "Clio");
        Alumno martinGallego= new Alumno("9647", "Martín", "Gallego");
        Alumno volkswagenGol = new Alumno("9756", "Volkswagen", "Gol");
        Alumno federicoCabezas = new Alumno("4574", "Federico", "Cabezas");
        Alumno santiagoOlivera = new Alumno("4712", "Santiago", "Olivera");
        Alumno dilanAguilar = new Alumno("2787", "Dilan", "Aguilar");
        
        aedI.insertar(new Nodo<>(jhonDoe.getCedulaIdentidad(), jhonDoe));
        aedI.insertar(new Nodo<>(juanGome.getCedulaIdentidad(), juanGome));
        aedI.insertar(new Nodo<>(renaultClio.getCedulaIdentidad(), renaultClio));
        aedI.insertar(new Nodo<>(martinGallego.getCedulaIdentidad(), martinGallego));
        aedI.insertar(new Nodo<>(volkswagenGol.getCedulaIdentidad(), volkswagenGol));
        aedI.insertar(new Nodo<>(dilanAguilar.getCedulaIdentidad(), dilanAguilar));
        aedI.insertar(new Nodo<>(santiagoOlivera.getCedulaIdentidad(), santiagoOlivera));
        
        pf.insertar(new Nodo<>(volkswagenGol.getCedulaIdentidad(), volkswagenGol));
        pf.insertar(new Nodo<>(federicoCabezas.getCedulaIdentidad(), federicoCabezas));
        pf.insertar(new Nodo<>(santiagoOlivera.getCedulaIdentidad(), santiagoOlivera));
        pf.insertar(new Nodo<>(dilanAguilar.getCedulaIdentidad(), dilanAguilar));
        pf.insertar(new Nodo<>(jhonDoe.getCedulaIdentidad(), jhonDoe));
        pf.insertar(new Nodo<>(juanGome.getCedulaIdentidad(), juanGome));
        
        Clase claseAEDI = new Clase(aedI);
        Clase clasePF = new Clase(pf);
        
        IConjunto<Alumno> ambosCursos = aedI.union(pf);
        IConjunto<Alumno> ambosCursosSimultaneo = aedI.interseccion(pf);
  
        System.out.println("Clase AED I: " + claseAEDI.imprimirAlumnos());
        System.out.println("Clase PF: " + clasePF.imprimirAlumnos());
        
        Clase claseAmbosCursos = new Clase((Conjunto) ambosCursos);
        Clase claseAmbosCursosSimultaneo = new Clase((Conjunto) ambosCursosSimultaneo);
        
        System.out.println("Clase AED I y PF: " + claseAmbosCursos.imprimirAlumnos());
        System.out.println("Clase AED I y PF simultaneamente: " + claseAmbosCursosSimultaneo.imprimirAlumnos());
            
    }
}
