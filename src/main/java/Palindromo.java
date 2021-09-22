public class Palindromo {

    // Constructor
    public Palindromo() {
    }

    public boolean esPalindromo(String palabra){
        palabra = revisarString(palabra);

        if(palabra.equals("")){ // Caso de String vacío
            return false;
        }
        else if(palabra.length()==1){ // En caso de ingresar solo 1 letra o símbolo
            return false;
        }
        else {
            StringBuilder palabraAux = new StringBuilder();

            for (int i = palabra.length() - 1; i >= 0; i--) {
                char caracter = palabra.charAt(i);
                palabraAux.append(caracter);
            }
            return palabra.equals(palabraAux.toString());
        }
    }

    private String revisarString(String a){

        // Elimina los espacios
        a = a.replace(" ", "");

        // Reemplaza mayúsculas por minúsculas
//        String[] mayusculas = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
//        String[] minusculas = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
//        for(int i=0; i<mayusculas.length; i++){
//            a = a.replace(mayusculas[i], minusculas[i]);
//        }
        a=a.toLowerCase();

        // Elimina las tildes/diéresis
        String[] conTildes = {"Á", "á", "À", "à", "Ä", "ä", "É", "é", "È", "è", "Ë", "ë", "Í", "í", "Ì", "ì", "Ï", "ï", "Ó", "ó", "Ò", "ò", "Ö", "ö", "Ú", "ú", "Ù", "ù", "Ü", "ü", "Ý", "ý", "ÿ"};
        String[] sinTildes = {"a", "a", "a", "a", "a", "a", "e", "e", "e", "e", "e", "e", "i", "i", "i", "i", "i", "i", "o", "o", "o", "o", "o", "o", "u", "u", "u", "u", "u", "u", "y", "y", "y"};
        for(int i=0; i<conTildes.length; i++){
            a = a.replace(conTildes[i], sinTildes[i]);
        }

        return a;
    }
}
