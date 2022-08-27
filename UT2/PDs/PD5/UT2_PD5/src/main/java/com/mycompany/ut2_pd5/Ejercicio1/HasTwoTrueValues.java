/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut2_pd5.Ejercicio1;

/**
 *
 * @author Martin
 */
public class HasTwoTrueValues {
    
    public boolean hasTwoTrueValuesV1(boolean[] arr) {
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i])
                count++;
        }
        return count >= 2;
    }
    
    public boolean hasTwoTrueValuesV2(boolean[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] && arr[j])
                    return true;
            }
        }
        return false;
    }
    
    public boolean hasTwoTrueValuesV3(boolean[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i])
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j])
                        return true;
                }
        }
        return false;
    }
}
