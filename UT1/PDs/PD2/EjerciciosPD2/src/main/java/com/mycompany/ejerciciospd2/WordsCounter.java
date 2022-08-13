/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciospd2;

/**
 *
 * @author Martin
 */
public class WordsCounter {
    
    public static int wordsCounter(String text) {
        String[] words = text.split(" ");
        return words.length;
    }
}
