/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciospd1;

/**
 *
 * @author Martin
 */
/*
    b) Al momento de ejecutar la funcion 'recorrer', me di cuenta que al momento de recorrer la cadena pasada como parámetro,
    intentaba obtener valores de tipo 'char' que no existían en la cadena enviada, ya que en el bucle 'for', se empezaba con un valor
    de 'i' = 1, y se repetía hasta que 'i' fuera menor o igual al largo de la cadena, lo cual genera error, ya que los índices de una cadena 
    comienzan en 0. Para solucionarlo, simplemente iniciamos 'i' en 0 (para que comience en el inicio de la cadena) e iteramos
    hasta que 'i' sea menor (menor estricto) que el largo de la cadena.

    c) En esta función, sucedía algo parecido a la anterior, se estaba intentando obtener un elemento que era mayor al largo del vector.
    Como el vector 'vector[]' tiene 8 elementos, para acceder al último lo hacemos buscando en el índice 8 - 1 (7).

    d) Al momento de leer el código de la función 'getPrimerCaracter()', me di cuenta de que se crea un vector de tipo 'String' pero como
    no se efectúa ninguna asignación a éste ni a ningún elemento dentro, todos los valores que posee son nulos, por lo tanto al intentar
    obtener un elemento el programa nos arroja una excepción. Para solucionarlo, lo que hice es convertir la palabara enviada como parámetro,
    a un array de tipo 'char', con el método '.toCharArray()', y para obtener el primer caracter retorno el carácter en la posición 0.

    e) Al leer el código de la función 'paraAString()', me di cuenta que para convertir un 'int' a 'String' se debe hacer
    llamando al método '.toString()', ya que desde un tipo de dato 'int' a otro 'String' no se puede convertir utilizando un 'casting'.
*/

public class Utils {
    
    public static int recorrer (String cadena) {
        int res = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
                res++;
            }
        }
        return res;
    }
    
    public static int getValor() {
        int vector[] = { 6, 16, 26,36,46,56,66,76 };
        int idx = 7;
        return vector[idx];
    }

    public static char getPrimerCaracter(String palabra) {
        char[] chars = palabra.toCharArray();
        return (chars[0]);
    }

    public static String paraAString(int a) {
        Object x1 = new Integer(a);
        return x1.toString() ;
    }
}
