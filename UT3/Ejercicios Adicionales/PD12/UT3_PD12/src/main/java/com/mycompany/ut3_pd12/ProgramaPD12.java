package com.mycompany.ut3_pd12;


import java.io.IOException;

public class ProgramaPD12 {

    public static void main(String[] args) throws IOException {

        // instanciar curso BasicoIng...
        Conjunto<Alumno> BasicoIng = new Conjunto<>();
        // cargar alumnos del curso BasicoIng desde el archivo “basico-ing.txt”
        String[] alumnosBasicoIng = ManejadorArchivosGenerico.leerArchivo("src/basico-ing.txt");
        for (String alumno : alumnosBasicoIng) {
            String[] alumnoSplitted = alumno.split(",");
            int codigoAlumno = Integer.parseInt(alumnoSplitted[0]);
            Alumno objetoAlumno = new Alumno(codigoAlumno, alumnoSplitted[1]);
            Nodo<Alumno> nodoNuevo = new Nodo(codigoAlumno, objetoAlumno);
            BasicoIng.insertar(nodoNuevo);
        }

        // instanciar curso BasicoEmp...
        Conjunto<Alumno> BasicoEmp = new Conjunto<>();
        // cargar alumnos del curso BasicoEmp desde el archivo “basico-emp.txt”
        String[] alumnosBasicoEmp = ManejadorArchivosGenerico.leerArchivo("src/basico-emp.txt");
        for (String alumnoEmp : alumnosBasicoEmp) {
            String[] alumnoEmpSplitted = alumnoEmp.split(",");
            int codigoAlumnoEmp = Integer.parseInt(alumnoEmpSplitted[0]);
            Alumno objetoAlumnoEmp = new Alumno(codigoAlumnoEmp, alumnoEmpSplitted[1]);
            Nodo<Alumno> nodoNuevo = new Nodo(codigoAlumnoEmp, objetoAlumnoEmp);
            BasicoEmp.insertar(nodoNuevo);
        }

        // generar el curso "integrador101" con los alumnos que están en condiciones de cursarlo  
        // guardar en un archivo "integrador101.txt"  - IDEALMENTE ordenados por código de alumno -
        Conjunto<Alumno> integrador101 = BasicoIng.union(BasicoEmp);
        String[] cursoIntegrador101 = new String[integrador101.cantElementos()];
        Nodo<Alumno> nodoActual = integrador101.getPrimero();
        int contador = 0;
        while (nodoActual != null && contador < integrador101.cantElementos()) {
            Alumno alumno = nodoActual.getDato();
            String lineaAlumno = alumno.getCodigo() + ", " + alumno.getNombre();
            cursoIntegrador101[contador] = lineaAlumno;
            nodoActual = nodoActual.getSiguiente();
            contador++;
        }
        ManejadorArchivosGenerico.escribirArchivo("src/integrador101.txt", cursoIntegrador101);

        // generar el curso "exigente102" con los alumnos que están en condiciones de cursarlo
        // guardar en un archivo "exigente102.txt" - IDEALMENTE ordenados por código de alumno -
        Conjunto<Alumno> exigente102 = BasicoIng.interseccion(BasicoEmp);
        String[] cursoExigente102 = new String[exigente102.cantElementos()];
        nodoActual = exigente102.getPrimero();
        contador = 0;
        while (nodoActual != null && contador < exigente102.cantElementos()) {
            Alumno alumno = nodoActual.getDato();
            String lineaAlumno = alumno.getCodigo() + ", " + alumno.getNombre();
            cursoExigente102[contador] = lineaAlumno;
            nodoActual = nodoActual.getSiguiente();
            contador++;
        }
        ManejadorArchivosGenerico.escribirArchivo("src/exigente102.txt", cursoExigente102);

    }

}
