package com.mycompany.primer_parcial.Hashing;

public class TablaHashSondeoLineal {

    private Integer[] tabla;

    public TablaHashSondeoLineal(int cantidadClaves) {
        tabla = new Integer[tableSize(cantidadClaves)];
    }

    public int tableSize(int cantidadClaves) {
        return cantidadClaves + (int)(cantidadClaves * 0.1);
    }

    /**
     *
     * @param unaClave
     * @return
     */
    public int buscar(int unaClave) {
        int i = 0;
        int capacidad = tabla.length;
        int comparaciones = 0;
        int hash = funcionHashing(unaClave);
        while (i < capacidad) {
            comparaciones++;
            if (tabla[hash] == null) {
                return comparaciones;
            } else if (tabla[hash] == unaClave) {
                return comparaciones;
            } else {
                i++;
                if (hash + 1 >= capacidad) {
                    hash = (hash + 1) % capacidad;
                } else {
                    hash++;
                }
            }
        }
        return comparaciones;
    }

    /**
     *
     * @param unaClave
     * @return
     */
    public int insertar(int unaClave) {
        int i = 0;
        int capacidad = tabla.length;
        int comparaciones = 0;
        int hash = funcionHashing(unaClave);
        while (i < capacidad) {
            comparaciones++;
            if (tabla[hash] == null) {
                tabla[hash] = unaClave;
                break;
            } else {
                i++;
                if (hash + 1 >= capacidad) {
                    hash = (hash + 1) % capacidad;
                } else {
                    hash++;
                }
            }
        }
        return comparaciones;
    }

    /**
     *
     */
    public void imprimirTabla() {
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("[" + i + "]" + " --> " + tabla[i]);
        }
    }

    /**
     *
     * @param unaClave
     * @return
     */
    public int funcionHashing(int unaClave) {
        int suma = 0;
        String stringClave = String.valueOf(unaClave);
        for (int i = 0; i < stringClave.length(); i++) {
            suma += stringClave.charAt(i);
        }
        suma = suma % tabla.length;
        return suma;
    }
}
