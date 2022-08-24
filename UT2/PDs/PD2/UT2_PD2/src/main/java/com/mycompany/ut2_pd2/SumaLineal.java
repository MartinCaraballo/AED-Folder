/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut2_pd2;

/**
 *
 * @author Martin
 */
public class SumaLineal {
    
    public int sumaLineal(int[] arr, int numero) {
        if (numero == 1) {
            return arr[0];
        } else {
            return sumaLineal(arr, numero - 1) + arr[numero - 1];
        }
    }
}
