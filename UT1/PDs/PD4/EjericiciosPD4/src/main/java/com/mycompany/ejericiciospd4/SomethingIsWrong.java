/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejericiciospd4;

import java.awt.Rectangle;

/**
 *
 * @author Martin
 */

/*
    El error con esta clase, es que la variable myRect era nula, es decir nunca se le asignaba un objeto de tipo Rectangle.
    El segundo error, es que la clase Rectangle no tiene un método .area(). Para resolverlo escribí un método 
    area(int width, int height) que devuelve el area de un rectangulo pasandole el largo y ancho como parámetro.
*/
public class SomethingIsWrong {
    
    public static void somethingIsWrong() {
        Rectangle myRect = new Rectangle();
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + SomethingIsWrong.area(myRect.width, myRect.height));        
    }
    
    public static int area(int width, int height) {
        return width * height;
    }
}
