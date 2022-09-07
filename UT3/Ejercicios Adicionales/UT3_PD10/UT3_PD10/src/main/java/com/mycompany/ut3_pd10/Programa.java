package com.mycompany.ut3_pd10;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Josse
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ejercicio1();
    }

    public static void ejercicio1() {
        try {
            String[] suerosArray = ManejadorArchivosGenerico.leerArchivo("src/Sueros.txt");
            String[] farmacosArray = ManejadorArchivosGenerico.leerArchivo("src/farmacos.txt");
            Lista<Suero> listaSueros = new Lista<>();
            Lista<Farmaco> listaFarmacos = new Lista<>();
            StringBuilder stringResultadoAImprimir = new StringBuilder();

            for (String suero : suerosArray) {
                String[] sueroSplitted = suero.split(",");
                INodo<Suero> nodo = new Nodo(sueroSplitted[0], new Suero(sueroSplitted[0], sueroSplitted[1]));
                listaSueros.insertar(nodo);
            }

            for (String farmaco : farmacosArray) {
                String[] farmacoSplitted = farmaco.split(",");
                INodo<Farmaco> nodo = new Nodo(farmacoSplitted[0], new Farmaco(farmacoSplitted[0], farmacoSplitted[1]));
                listaFarmacos.insertar(nodo);
            }

            String identificadorSuero = "7";
            //String[] identificadoresFarmacos = {"256", "84", "169", "213", "123", "159", "300"};
            String[] identificadoresFarmacos = {"217", "85", "169", "209", "123", "158", "299"};    // todos en lista blanca
            Preparado preparado = new Preparado();

            Suero sueroUtilizado = listaSueros.buscar(identificadorSuero).getDato();
            stringResultadoAImprimir.append("Suero utilizado:\n\t").append(sueroUtilizado.getSueroID()).append(" | ").append(sueroUtilizado.getDescripcionSuero());
            Lista<Farmaco> farmacosUtilizados = new Lista<>();

            for (String identificador : identificadoresFarmacos) {
                Farmaco farmaco = listaFarmacos.buscar(identificador).getDato();
                farmacosUtilizados.insertar(new Nodo(farmaco.getFarmacoID(), farmaco));
            }

            Lista<INodo> idsFarmacos = new Lista<>();
            INodo<Farmaco> farmaco = farmacosUtilizados.getPrimero();
            stringResultadoAImprimir.append("\nFarmacos a utilizar:");
            while (farmaco != null) {
                idsFarmacos.insertar(new Nodo(farmaco.getEtiqueta()));
                stringResultadoAImprimir.append("\n\t").append(farmaco.getEtiqueta()).append(" | ").append(farmaco.getDato().getDescripcionFarmaco());
                farmaco = farmaco.getSiguiente();
            }

            stringResultadoAImprimir.append("\nEl preparado es viable: ").append(preparado.preparadoViable(identificadorSuero, idsFarmacos));
            System.out.println(stringResultadoAImprimir.toString());
        
        } catch (NullPointerException e) {
            System.out.println("Uno de los farmacos ingresados no es válido.");
        }
    }
}
/*
    Las estructuras de datos utilizadas fueron listas, éstas tienen la funcionalidad de poder buscar un elemento por su etiqueta, lo cual
    facilitó muchísimo la tarea de realizar la impresión de los componentes utilizados en el preparado.
    También usé arrays para por ejemplo almacenar los códigos de los fármacos que iba a utilizar en el algoritmo, dado que son una estructura
    de datos muy liviana y barata de recorrer y acceder.
*/