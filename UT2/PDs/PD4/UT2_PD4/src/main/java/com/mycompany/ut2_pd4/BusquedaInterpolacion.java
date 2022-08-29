/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut2_pd4;

/**
 *
 * @author Martin
 */
public class BusquedaInterpolacion {
    
    
    /*
        Si los datos de la matriz se encuentran ordenados, y uniformemente distribuidos,
        el algoritmo de búsqueda por interpolación es una muy buena opción, ya que
        cuando se cumplen las condiciones mencionadas, este algoritmo tiene en promedio 
        un mejor rendimiento que la busqueda binaria, pero la desventaja es que las aplicaciones
        son limitadas.
    */
    public int busquedaInterpolacion(int[] arr, int elementoBuscar) {
        int startIndex = 0;
        int lastIndex = arr.length - 1;
        
        // El indice inicial tiene que ser menor que el final. El elemento a buscar tiene que 
        // ser mayor que el elemento del indice inicial y menor que el elemento del indice final.
        while ( startIndex < lastIndex && 
                elementoBuscar >= arr[startIndex] && 
                elementoBuscar <= arr[lastIndex] ) {
            
            // Formula de interpolación:
            int pos = startIndex + 
                        ((lastIndex - startIndex) / (arr[lastIndex] - arr[startIndex]))
                        * (elementoBuscar - arr[startIndex]); 
            
            if(arr[pos] == elementoBuscar) {
                return pos;
            } else if (arr[pos] < elementoBuscar ) {
                startIndex = pos + 1;
            } else {
                lastIndex = pos - 1;
            }
        }
        return -1;
    }
}
