/*
Universidad De La Salle Bajío
Ingenieria en software y sistemas computacionales
Programacion Estructurada y Orientada a Objetos
Uriel Mata Castellanos 76907
Aplicar recursividad en factoriales y en fibonacci
*/

//Código
import java.util.Scanner;
public class Recursividad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion, n;
        do{
            opcion = menu();
            switch(opcion){
                case 1:
                    System.out.println("Introduce el limite de digitos en la secuencia");
                    n = input.nextInt();
                    System.out.println("La secuencia es:");
                    for (int i = 0; i < n; i++) {
                        System.out.print(fibonacci(i) + " ");
                    }
                    System.out.println("\n\n");
                    break;
                
                case 2:
                    System.out.println("Introduce un numero");
                    n = input.nextInt();
                    System.out.println("El factorial de " + n + " es: " + fibonacci(n) + "\n");
                    break;

                case 3:
                    System.out.println("Adios");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(opcion != 3);       
    }

    //Metodo para imprimir un menu
    public static int menu(){
        Scanner input = new Scanner(System.in);
        int opcion;
        System.out.println("Escoge una opcion");
        System.out.println("1) Fibonacci");
        System.out.println("2) Factorial");
        System.out.println("3) Salir");
        opcion = input.nextInt();
        return opcion;
    }

    //Metodo para hacer la secuencia fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    //Metodo para sacar factorial
    public static int factorial (int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
