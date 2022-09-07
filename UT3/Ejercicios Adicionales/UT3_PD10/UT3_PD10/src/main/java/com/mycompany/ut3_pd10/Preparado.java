/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut3_pd10;

/**
 *
 * @author Martin
 */
public class Preparado {

    /**
     *
     * @param idSuero id del suero que se desea usar en la preparación.
     * @param idsFarmacos lista de identificadores de farmacos que se desean
     * usar en la preparación.
     * @return true si el preparado es seguro, false en caso contrario.
     */
    public boolean preparadoViable(Comparable idSuero, Lista<INodo> idsFarmacos) {
        String[] listaNegra = ManejadorArchivosGenerico.leerArchivo("src\\listanegra.txt");
        String[] listaBlanca = ManejadorArchivosGenerico.leerArchivo("src\\listablanca.txt");
        // Guardo un contador de cuantos farmacos de los ingresados son válidos,
        // si todos son válidos retorno true, en caso contrario, retornamos false.
        int contadorResultados = 0;

        // Recorremos la lista de los farmacos ingresados como parametro.
        INodo farmaco = idsFarmacos.getPrimero();
        while (farmaco != null) {       // se repite N veces
            // Primero nos fijamos si en el archivo listanegra se encuetra esta combinacion de suero-fármaco,
            // en caso positivo, sabemos que este preparado es inválido.
            for (String combinacionInvalida : listaNegra) {     // se repite N veces
                String[] combinacionInvalidaSplitted = combinacionInvalida.split(",");
                String sueroListaNegra = combinacionInvalidaSplitted[0];
                String farmacoInvalido = combinacionInvalidaSplitted[1];
                if (idSuero.compareTo(sueroListaNegra) == 0 && farmaco.getEtiqueta().compareTo(farmacoInvalido) == 0) {
                    return false;
                }
            }

            // Si la combinación por el momento es válida, nos fijamos si este farmaco se encuentra en 
            // la lista blanca. Si es así, aumentamos el contador de resultados en 1.
            for (String farmacoValido : listaBlanca) {          // se repite N veces
                if (farmaco.getEtiqueta().equals(farmacoValido)) {
                    contadorResultados++;
                }
            }
            farmaco = farmaco.getSiguiente();

        }
        // En caso de que no se haya encontrado una combinacion inválida,
        // si el contadorResultados es igual al largo de la lista de los farmacos
        // ingresados, entonces quiere decir que todos los farmacos ingresados son correctos.
        // Si no es así, quiere decir que uno de los ingresados no esta en la lista blanca,
        // por lo tanto, retorna false.
        return contadorResultados == idsFarmacos.cantElementos();
    }
}

// EL ORDEN DE EJECUCIÓN DE ESTE ALGORITMO ES O(n2).
