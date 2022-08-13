/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciospd1;

/**
 *
 * @author Martin
 */

/*
a) Cuando leí el código escrito en la clase "Alumno", me di cuenta que en ninguna parte se le 
asignaba un valor distinto de nulo a la variable de instancia privada "nombre"; por lo tanto al intentar invocar el 
método String.concat() se genera una excepción advirtiéndonos de que no se puede llamar al método concat()
de un string nulo. Para solucionarlo, simplemente le añadimos un parámetro de tipo String al constructor 
(sería el nombre), y cada vez que se crea un objeto del tipo alumno necesitamos pasarle un nombre como parámetro.
Una alternativa a esta solución, es en la sentencia 'nombre = null' del constructor, asignarle un valor distinto
de null, como por ejemplo 'nombre = "Pedro"', pero todos los objetos 'Alumno' tendrían el mimso nombre.
*/

public class Alumno {
    
    private String nombre;
    
    public Alumno (String name) {
        nombre = name;
    }
    
    public String getNombreAdmiracion() {
        return nombre.concat("!");
    }
}


