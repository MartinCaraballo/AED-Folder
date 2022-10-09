/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut6_pd3.ibmjavacollectionsexcercises;

import java.util.*;

/**
 *
 * @author Martin
 */
public class WordCount {

    Map<String, Integer> map;

    public WordCount() {
        map = new HashMap();
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void clear() {
        map.clear();
    }

    public void addWords(String words) {
        StringTokenizer st = new StringTokenizer(words);
        while (st.hasMoreTokens()) {
            String actual = st.nextToken();
            if (map.containsKey(actual)) {
                int value = map.get(actual);
                map.put(actual, ++value);
            } else {
                map.put(actual, 1);
            }
        }
    }

    public void count() {
        TreeMap<String, Integer> tree = new TreeMap(new Comparator<String>() {
            @Override
            public int compare(String e1, String e2) {
                return e1.compareTo(e2);
            }
        });
        tree.putAll(map);
        tree.forEach((K, v) -> {
            System.out.println("Palabra: " + K + " Repeticiones: " + v);
        });
    }
}
