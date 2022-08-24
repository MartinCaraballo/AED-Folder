/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut2_pd2;

/**
 *
 * @author Martin
 */
public class InvertirArray {
    
    public void invertirArray(int[] arr, int i, int j) {
        if (i < j) {
            int valorJ = arr[j];
            arr[j] = arr[i];
            arr[i] = valorJ;
            invertirArray(arr, i + 1, j - 1);
        }
        
    }
}
