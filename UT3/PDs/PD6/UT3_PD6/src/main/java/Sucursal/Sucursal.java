/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sucursal;

/**
 *
 * @author Martin
 */
public class Sucursal {
    
    private Comparable ciudadSucursal;
    
    public Sucursal(Comparable ciudad) {
        ciudadSucursal = ciudad;
    }
    
    public Comparable getSucursal() {
        return ciudadSucursal;
    }
    
    public void setSucursal(Comparable ciudadNueva) {
        ciudadSucursal = (ciudadNueva != null) ? ciudadNueva : ciudadSucursal;
    }
    
}
