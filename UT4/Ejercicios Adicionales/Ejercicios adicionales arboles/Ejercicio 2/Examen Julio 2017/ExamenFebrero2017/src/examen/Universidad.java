/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author Martin
 */
public class Universidad {
    
    Lista<TAlumno> alumnos;
    
    public Universidad(Lista<TAlumno> unosAlumnos) {
        alumnos = unosAlumnos;
    }
    
    public void indizarPorApellido(TArbolBB unArbol, String unaCarrera) {
        Nodo<TAlumno> nodoActual = alumnos.getPrimero();                                                                            // O(1)
        while (nodoActual != null) {                                                                                                // se repite n veces
            TAlumno alumno = nodoActual.getDato();                                                                                  // O(1)
            if (alumno.getCarrera().equals(unaCarrera)) {                                                                   // O(1)
                if (alumno.getMatriculado()) {                                                                                      // O(1)
                    TElementoAB<TAlumno> elementoAlumno = new TElementoAB(alumno.getApellido(), alumno);         // O(1)
                    unArbol.insertar(elementoAlumno);                                                                    // O(n)
                }
            }
            nodoActual = nodoActual.getSiguiente();                                                                               // O(1)
        }
    }
}


// El orden de ejecución del algoritmo es O(n).