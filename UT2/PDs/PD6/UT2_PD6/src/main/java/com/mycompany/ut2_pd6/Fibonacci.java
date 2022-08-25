/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut2_pd6;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Martin
 */
public class Fibonacci {

    Map<Long, Long> memo = new HashMap<>();
    int contadorLlamadasFibTopDown = 0;
    int contadorAccesosAMemoria = 0;
    int contadorAccesosIf = 0;
    
    // Esta implementación me parece una forma de reducir drásticamente la cantidad de llamadas
    // recursivas, ya que al almacenar los resultados se reduce muchisimo esta cantidad, ademas de 
    // tambien ser una forma de optimización, ya que esa cantidad de acceso que nos ahorramos
    // tambien son calculos que no hace nuestra computadora.
    // Pero no todo son ventajas, ya que para hacer posible esta optimización es necesario guardar
    // en memoria los resultados de las operaciones, lo cual con miles o millones de datos
    // quiza sea inmanejable la opcion de poder guardar los resultados (mas que nada por lo caro que es
    // el acceso a memoria secundaria).
    // Pero para valores que no sean abismales, teniendo una buena memoria RAM es una buena opción
    // para optimizar los cálculos y operaciones.
    public long fibonacciTopDown(long numero) {
        contadorLlamadasFibTopDown++;
        if (!memo.containsKey(numero)) {
            contadorAccesosIf++;
            if (numero <= 2) {
                memo.put(numero, 1L);
            } else {
                memo.putIfAbsent(numero,
                        fibonacciTopDown(numero - 1) + fibonacciTopDown(numero - 2));
            }
        }
        contadorAccesosAMemoria++;
        return memo.get(numero);
    }

    
    // Esta función también me parece una buena opción para optimizar, pero a mi parecer es como un punto
    // medio entre hacerlo a lo bruto y el enfoque "Top-Down", ya que no se usa tanta memoria como en el
    // enfoque mencionado, y tampoco se hacen todos los cálculos a lo loco, ya que guarda el ultimo resultado
    // de las operaciones. Desde el punto de vista de la memoria es más barato almacenar este enfoque, ya que solo
    // se hace uso de 3 variables. Las limitaciones que puede tener son mas que nada por el lado de los calculos,
    // quizas si necesitamos calcular muchisimas veces los mismos valores, el tiempo que va a demorar en retornar
    // el resultado va a ser un poco elevado, ya que no guarda todos los resultados, solo el ultimo que fue calculado;
    // a diferencia del enfoque "Top-Down" que guarda todos los calculos que hizo, por lo tanto en el escenario de necesitar
    // muchas veces los mismos resultados el enforque mencionado ofrece los resultados en un tiempo minimo (ya que los tiene o
    // deberia de tener almacenados).
    public long fibonacciBottomUp(long numero) {
        long fibAnterior;
        long fibActual;

        if (numero == 0) {
            return 0;
        } else {
            fibAnterior = 0;
            fibActual = 1;
            do {
                long fibNuevo = fibActual + fibAnterior;
                fibAnterior = fibActual;
                fibActual = fibNuevo;
                numero--;

            } while (numero > 1);

        }
        return fibActual;
    }
    
    // Para obtener los accesos a valores que fueron previamente almacenados, debemos restar el total de veces que
    // se retorno de memoria, con la cantidad de veces que se entro en el if (es decir la cantidad de veces que se agregaron valores).
    public int getCountAccesoValoresPrevAlmacenados() {
        return contadorAccesosAMemoria - contadorAccesosIf;
    }
}
