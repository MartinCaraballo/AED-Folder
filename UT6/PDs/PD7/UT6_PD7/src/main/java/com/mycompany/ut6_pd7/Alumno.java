/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut6_pd7;

/**
 *
 * @author Martin
 */
public class Alumno {
    private int ID; 
    private String fullName; 
    private String email;    
    
    public String getFullName() {
        return fullName;
    }
    
    public String getEmail() {
        return email;
    }
    
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        Alumno alumno = (Alumno) obj;
        return ID == alumno.ID
                && (fullName.equals(alumno.getFullName()))
                && (email.equals(alumno.getEmail()));
    }
    
    public int hashCode() {
        int hash = 1;
        hash = hash * 31 + ID;
        hash = hash * 31 + ((fullName != null) ? fullName.hashCode() : 0);
        hash = hash * 31 + ((email != null) ? email.hashCode() : 0);
        return hash;
    }
}