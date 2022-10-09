/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Martin
 */
public class THash implements IHash {

    Integer[] tabla;
    int tamanio;

    public THash(int unTamanio) {
        tabla = new Integer[unTamanio];
        tamanio = unTamanio;
    }

    @Override
    public int buscar(int unaClave) {
        int hash = funcionHashing(unaClave);
        for (int i = 0; i < tamanio; i++) {
            if (tabla[hash] == null) {
                return i + 1;
            } else if (tabla[hash].equals(unaClave)) {
                return i + 1;
            }
            hash = (hash + 1) % tamanio;
        }
        return tamanio;
    }

    @Override
    public int insertar(int unaClave) {
        int hash = funcionHashing(unaClave);
        for (int i = 0; i < tamanio; i++) {
            if (tabla[hash] == null) {
                tabla[hash] = unaClave;
                return i + 1;
            } else if (tabla[hash].equals(unaClave)) {
                return i + 1;
            }
            hash = (hash + 1) % tamanio;
        }
        return tamanio;
    }

    @Override
    public int funcionHashing(int unaClave) {
        return (int) (tamanio * (((float) unaClave / 7) % 1));
    }

}
