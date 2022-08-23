package TA3;


public class Ejer1 {
        
    public int ContadorPalabras(String frase){
        int cont = 0;
        boolean isPalabra = false;
        for(int i = 0; i < frase.length(); i++){
            char characterLeido = frase.charAt(i);
            if (Character.isLetter(characterLeido)) {
                isPalabra = true;
            }
            if (isPalabra == true && characterLeido == ' ') {
                cont++;
                isPalabra = false;
            }
        }
        return cont;
    }
    
    public int[] ContadorVocalesConsonantes(String frase) {
        int[] resultados = new int[2];
        String stringALeer = frase.toLowerCase();
        int contVocales = 0;
        int contConsonantes = 0;
        for(int i = 0; i < frase.length(); i++){
            char characterLeido = frase.charAt(i);
            if (Character.isLetter(characterLeido)) {
                if (characterLeido == 'a' || characterLeido == 'e' || characterLeido == 'i'|| characterLeido == 'o'|| characterLeido == 'u') {
                    contVocales++;
                } else {
                    contConsonantes++;
                }
            }
        }
        resultados[0] = contVocales;
        resultados[1] = contConsonantes;
        return resultados;
    }
}
