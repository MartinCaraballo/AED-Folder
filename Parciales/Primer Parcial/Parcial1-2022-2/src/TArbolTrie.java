
import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Martin
 */
public class TArbolTrie implements IArbolTrie {
    
    private TNodoTrie raiz;

    @Override
    public LinkedList<TDispositivo> buscarDispositivos(String mascaraSubRed) {
        if (raiz == null) {
            return null;
        } else {
            LinkedList<TDispositivo> dispositivos = new LinkedList<>();
            raiz.buscarDispositivos(mascaraSubRed, dispositivos);
            return dispositivos;
        }
    }

    @Override
    public void insertar(TDispositivo unDispositivo) {
        if (raiz == null) {
            raiz = new TNodoTrie();
        }
        raiz.insertar(unDispositivo);
    }
    
}
