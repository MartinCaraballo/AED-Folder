/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut3_pd9;

import java.util.List;
import java.util.Stack;

/**
 *
 * @author Martin
 */
public class Expresion {
    
    public boolean controlCorchetes(char[] entrada) {
        Stack pila = new Stack();
        for (Character character : entrada) {
            if (!Character.isLetter(character)) {
                if (character.equals('{')) {
                    pila.push(1);
                } else if (character.equals('}')) {
                    if (pila.isEmpty()) {
                        return false;
                    } else {
                        pila.pop();
                    }
                }
            }
        }
        return pila.isEmpty();
    }
}
