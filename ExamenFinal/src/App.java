import java.util.Stack;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        String palabra;
        System.out.println("Introduce la palabra");
        palabra = lector.nextLine();
        if(esPolindromo(palabra) == true){
            System.out.println("Si es polindromo");
        }
        else{
            System.out.println("No es polindromo");
        }
    }

    public static Boolean esPolindromo(String palabra){
        Boolean polindromo = true;
        String palabra2 = palabra.replaceAll("\s+", "");
        Stack<Character> pila = new Stack<>();
        char[] letras = palabra2.toCharArray(); 
        int t=0;
        for(int i = 0; i < letras.length; i++){
            if(letras[i] != ' '){
                t++;
                pila.push(letras[i]);
            }    
        }

        for(int i = 0; i < t; i++){
            if(pila.pop() != letras[i]){
                polindromo = false;
                break;
            }
            else{
                polindromo = true;
            }
        }
        return polindromo;
    }
}
