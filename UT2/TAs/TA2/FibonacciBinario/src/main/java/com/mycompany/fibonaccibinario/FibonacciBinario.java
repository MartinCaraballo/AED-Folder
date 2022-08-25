/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fibonaccibinario;

/**
 *
 * @author Martin
 */
public class FibonacciBinario {
    
    static int count;
    public static int fibonacciBinario(int n){
        count++;
        if(n == 0 || n == 1){
            System.out.println(count);
            return n;
        }
        else{
           return fibonacciBinario(n-1) + fibonacciBinario(n-2);
        }
    }
}
