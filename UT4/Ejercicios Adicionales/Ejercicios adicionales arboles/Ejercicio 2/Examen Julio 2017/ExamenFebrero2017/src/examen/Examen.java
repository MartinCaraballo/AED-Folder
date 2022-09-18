package examen;

import java.util.ArrayList;

public class Examen {

    public static void main(String[] args) {

        /**
         *
         * LEER ATENTAMENTE LAS INDICACIONES.
         *
         * Paso 1:
         *
         * 1.1 - instanciar una lista para la Universidad
         *
         *
         */
        Lista ucu = new Lista();

        /* 
        * 1.2 - cargar los alumnos del archivo "alumnos.csv" e insertarlos en
        *   String[] lineas = ManejadorArchivosGenerico.leerArchivo("src/examen/alumnos.csv");
        *    for (String l : lineas) {
        *      <completar... >
        *     }
        *
        *
        * Paso 2:
        * Instanciar un árbol binario de búsqueda (con T = TAlumno) y cargarlo con los alumnos de la carrera especificada 
        * (se indicará en el pizarrón) que se encuentran matriculados, 
        * usando como clave de búsqueda / inserción el campo “APELLIDO” (la etiqueta del TElementoAB es el Apellido, los datos<T> son el TAlumno correspondiente).
        *TArbolBB<TAlumno> elArbol = new TArbolBB<>();
        *<>
        * 
        * Paso 3:
        * Invocar al método “listar”, que devuelve en un arrayList todos los alumnos de la carrera especificada, 
        * que están matriculados (contenidos en el árbol), ordenados por su apellido. 
        *
	* ArrayList<TAlumno> elarrayList;
        * elarrayList = elArbol.listar();
        *
        * Paso 4: 
        * Imprimir por consola los datos de los alumnos contenidos en el arrayList, 
        * un alumno por línea, (APELLIDO,  CARRERA,  MATRICULADO)
        
         */
        String[] lineas = ManejadorArchivosGenerico.leerArchivo("src/examen/alumnos.csv");
        for (String linea : lineas) {
            String[] lineaSplitted = linea.split(",");
            boolean matriculado = (lineaSplitted[3].equals("SI"));
            TAlumno alumno = new TAlumno(Integer.parseInt(lineaSplitted[0]), lineaSplitted[1], lineaSplitted[2], matriculado);
            ucu.insertar(new Nodo(alumno.getCedula(), alumno));
        }
        Universidad ucudal = new Universidad(ucu);
        TArbolBB<TAlumno> informatica = new TArbolBB<>();
        ucudal.indizarPorApellido(informatica, "Ing. Informática");

        ArrayList<TAlumno> listaPorApellido = informatica.listar();
        StringBuilder sb = new StringBuilder("Alumnos en ing. Informática:");
        for (TAlumno alumno : listaPorApellido) {
            sb.append("\n").append("Apellido: ").append(alumno.getApellido())
                    .append(" | Carrera: ").append(alumno.getCarrera())
                    .append(" | Matriculado: ").append(alumno.getMatriculado());
        }
        System.out.println(sb.toString());
        
        System.out.println("Es un arbol completo: " + informatica.esCompleto());

    }

}
