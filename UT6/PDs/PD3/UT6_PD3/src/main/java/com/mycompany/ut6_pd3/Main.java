/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ut6_pd3;

import com.mycompany.ut6_pd3.ibmjavacollectionsexcercises.AbstractListModel;
import com.mycompany.ut6_pd3.ibmjavacollectionsexcercises.SortedListModel;
import com.mycompany.ut6_pd3.ibmjavacollectionsexcercises.WordCount;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Martin
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("EJERCICIO 1:");
        
        Map map = new HashMap();
        
        map.put("algo", "algunacosa");
        map.put("clave", "valor");
        map.put("nulo", null);
        map.put("unaClave", "unValor");
        map.put("key", "value");
        map.put("otraClave", null);
        
        System.out.println("Antes de eliminar: " + map);
        
        EliminarNullMap instance = new EliminarNullMap(map);
        instance.eliminarDatosNulos();
        
        System.out.println("Despues de eliminar: " + map);
        System.out.println("\nEJERCICIO 2:");
        
        Map<String, String> map2 = new HashMap<>();
        map2.put("unaClave", "unValor");
        map2.put("otraClave", "otroValor");
        map2.put("asdasdasd", "dsadsafgasfas");
        map2.put("dasdasdsadasd", "dsadasdsada");
        map2.put("asdasdsadsad", "dasdasddasd");
        
        IntercambiarClaveValorMap ins = new IntercambiarClaveValorMap();
        Map<String, String> result = ins.intercambiarClaveValor(map2);
        System.out.println(result);
        
        System.out.println("\nEJERCICIO 3:");
        
        String[] entrada = {"Hola", "Adios", "Chau", "Ok", "Algoritmos", "Y", "Estructuras", "De", "Datos", "Agua"};
        CadenasOrdenadas inst = new CadenasOrdenadas();
        inst.cadenasOrdenadas(entrada);
        
        System.out.println("\nEJERCICIO4 :");
        ImprimirAleatorio instan = new ImprimirAleatorio();
        instan.imprimirAleatorio("src/libro.txt", 10);
        
        // EJERCICIOS IBM JAVA COLLECTIONS
        
        System.out.println("\nIBM - EJERCICIO 2:");
        SortedListModel sortedListModel = new SortedListModel();
        List paraAgregar = List.of("One", "Two", "Three", "Four", "Five", "Five", "Six", "Seven", "Eight", "Nine", "Ten");
        sortedListModel.addAll(paraAgregar);
        sortedListModel.printAction();
        
        System.out.println("\nIBM - EJERCICIO 3:");
        AbstractListModel lista = new AbstractListModel(new LinkedList());
        lista.addElement("Jim");
        lista.addElement("Joe");
        lista.addElement("Mary");
        lista.addElement("prueba");
        lista.printElements();
        System.out.println("....................");
        lista.removeElement("prueba");
        lista.printElements();
        
        System.out.println("\nIBM - Ejercicio 4:");
        WordCount wc = new WordCount();
        wc.addWords("This is a test is test");
        wc.count();
    }
}
