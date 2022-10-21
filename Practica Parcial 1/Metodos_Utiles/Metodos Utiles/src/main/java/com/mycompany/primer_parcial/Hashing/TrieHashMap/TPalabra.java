package com.mycompany.primer_parcial.Hashing.TrieHashMap;

import java.util.LinkedList;

/**
 *
 * @author Ikken
 */
public class TPalabra implements Comparable {

    private String nombre;
    private LinkedList<Integer> paginas;

    TPalabra(String nombre, LinkedList<Integer> paginas) {
        this.nombre = nombre;
        this.paginas = paginas;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPaginas(Integer numeroDePagina) {
        this.paginas.add(numeroDePagina);
    }

    public LinkedList<Integer> getPaginas() {
        return this.paginas;
    }

    public String getStringPaginas() {
        StringBuilder sb = new StringBuilder();
        if (this.paginas.size() == 0) {
            return "No se encuentra";
        }
        for (Integer pagina : this.paginas) {
            sb.append(pagina).append(" ");
        }
        return sb.toString();
    }

    @Override
    public int compareTo(Object o) {
        return (this.nombre.compareTo(((TPalabra)o).getNombre()));
    }
}
