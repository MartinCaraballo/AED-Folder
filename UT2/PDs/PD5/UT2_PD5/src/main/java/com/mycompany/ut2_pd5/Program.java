/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ut2_pd5;

import com.mycompany.ut2_pd5.Ejercicio1.HasTwoTrueValues;
import com.mycompany.ut2_pd5.Ejercicio1.Utils;

/**
 *
 * @author Martin
 */
public class Program {

    public static void main(String[] args) {
        HasTwoTrueValues instance = new HasTwoTrueValues();
        Utils utilsInstance = new Utils();

        boolean[] randomlyGenerated = utilsInstance.generateExtraLargeBooleanArray(1000000);
        boolean[] falseBooleanArray = {false, false, false, false, false, false, false, false};

        System.out.println("Version 1: " + instance.hasTwoTrueValuesV1(randomlyGenerated));
        System.out.println("Version 2: " + instance.hasTwoTrueValuesV2(randomlyGenerated));
        System.out.println("Version 3: " + instance.hasTwoTrueValuesV3(randomlyGenerated));
        System.out.println("Version 3 (false): " + instance.hasTwoTrueValuesV3(falseBooleanArray));

    }
}
