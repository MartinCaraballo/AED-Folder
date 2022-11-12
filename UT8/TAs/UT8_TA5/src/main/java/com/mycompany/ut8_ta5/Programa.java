package com.mycompany.ut8_ta5;

public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // cargar grafo con actores y relaciones
        TGrafoNoDirigido grafoNoDirigido = UtilGrafos.cargarGrafo("./src/actores.csv", "./src/en_pelicula.csv",
                false, TGrafoNoDirigido.class);

        
        // invocar a numBacon como indica la letra y mostrar en consola el resultado
        String[] actoresABuscar = { "John_Goodman", "Tom_Cruise", "Jason_Statham", "Lukas_Haas", "Djimon_Hounsou" };
        
        for (String actor : actoresABuscar) {
            System.out.println("Numero de Bacon de " + actor + ": " + grafoNoDirigido.numBacon(actor));
        }
    }

}
