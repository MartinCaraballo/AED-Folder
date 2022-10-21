package com.mycompany.primer_parcial.Hashing;

import java.util.LinkedList;

public class TablaHashEncadenamientoSeparado {

    private final LinkedList<Integer>[] tabla;

    public TablaHashEncadenamientoSeparado(int cantidadClaves) {
        tabla = new LinkedList[cantidadClaves];
    }

    public boolean insertar(int clave) {
        int hash = funcionHash(clave);
        if (!buscar(clave)) {
            tabla[hash] = new LinkedList<>();
            tabla[hash].add(clave);
            return true;
        }
        return false;
    }

    public boolean buscar(int clave) {
        int hash = funcionHash(clave);
        if (tabla[hash] != null) {
            return tabla[hash].size() != 0 && tabla[hash].contains(clave);
        }
        return false;
    }

    public int funcionHash(int clave) {
        return (int) (tabla.length * (((float) clave / 7) % 1));
    }

    public int cantidadElementos() {
        int cantidad = 0;
        for (LinkedList<Integer> elementos : tabla) {
            cantidad += elementos.size();
        }
        return cantidad;
    }

    public void imprimirTabla() {
        StringBuilder celda = new StringBuilder();
        for (int i = 0; i < tabla.length; i++) {
            celda = new StringBuilder("[" + i + "]" + " --> ");
            if (tabla[i] != null) {
                for (Integer elemento : tabla[i]) {
                    celda.append(elemento).append(" ");
                }
            }
            System.out.println(celda);
        }
    }

}
