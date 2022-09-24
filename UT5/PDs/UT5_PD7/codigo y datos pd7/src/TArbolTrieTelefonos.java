import java.util.LinkedList;


public class TArbolTrieTelefonos implements IArbolTrieTelefonos {

    private TNodoTrieTelefonos raiz;

    @Override
    public LinkedList<TAbonado> buscarTelefonos(String pais, String area) {
        if (raiz == null) {
            return null;
        } else {
            LinkedList<TAbonado> resultado = new LinkedList<>();
            raiz.buscarTelefonos(pais, area, resultado);
            return resultado;
        }
    }

    @Override
    public void insertar(String numero, TAbonado unAbonado) {
        if (raiz == null) {
            raiz = new TNodoTrieTelefonos();
        }
        raiz.insertar(numero, unAbonado);
    }
    
    @Override
    public TNodoTrieTelefonos buscar(String palabra) {
        if (raiz== null){
              raiz = new TNodoTrieTelefonos();
        }
        return raiz.buscar(palabra);
    }

}
