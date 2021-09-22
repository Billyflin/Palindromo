import java.util.Scanner;

public class init {
    public static void main(String[] args) {
        hola();
    }
    public static void hola(){
        Scanner teclado = new Scanner(System.in);
        Palindromo p = new Palindromo();

        System.out.print("Ingrese una palabra: ");
        String s = teclado.nextLine();

        if(p.esPalindromo(s)){
            System.out.println("La palabra ingresada es un palíndromo");
        }
        else{
            System.out.println("La palabra ingresada no es un palíndromo");
        }
    }
}
