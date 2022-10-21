/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carolglass
 */

import java.util.Comparator;

public class Comparador implements Comparator<Producto> {

    @Override
    public int compare(Producto producto1, Producto producto2) {
        if (producto1.getCodigo() < producto2.getCodigo()) {
            return -1;
        } else if (producto1.getCodigo() > producto2.getCodigo()) {
            return 1;
        } else {
            return 0;
        }
    }
}
