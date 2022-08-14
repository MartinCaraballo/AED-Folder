/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejericiciospd4;

import java.util.Random;

/**
 *
 * @author Martin
 */
public class NumberHolder {
    
    public int anInt;
    public float aFloat;
    
    public static NumberHolder initialize() {
        Random random = new Random();
        
        NumberHolder numberHolder = new NumberHolder();
        numberHolder.anInt = random.nextInt();
        numberHolder.aFloat = random.nextFloat();
        
        return numberHolder;
    }
}
