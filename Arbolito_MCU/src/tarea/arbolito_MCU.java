/*
Universidad De La Salle Bajío
Ingenieria en software y sistemas computacionales
Programacion Estructurada y Orientada a Objetos
Uriel Mata Castellanos 76907
Arbol binario de busqueda
*/

//Código
package tarea;
import java.util.Scanner;
public class arbolito_MCU {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Se crea un objeto de tipo Scanner
        arbolito a = new arbolito(); // Se crea un objeto de la clase arbolito
        int opcion, numero; // Se declaran las variables opcion y numero
        // Se precargan algunos numeros
        a.insertar(17);
        a.insertar(15);
        a.insertar(1);
        a.insertar(0);
        a.insertar(3);
        a.insertar(20);
        a.insertar(18);
        a.insertar(40);
        do{
            opcion = menu(); // Se llama a la funcion menu() y se guarda el valor de retorno en la variable opcion
            switch(opcion){ // Se inicia un switch basado en el valor de la variable opcion
                case 1:
                    System.out.println("Introduce el numero"); // Se imprime un mensaje solicitando al usuario que ingrese un numero
                    numero = input.nextInt(); // Se lee el numero ingresado por el usuario y se guarda en la variable numero
                    a.insertar(numero); // Se inserta el numero en el arbol
                break;

                case 2:
                    System.out.println("Introduce el numero que quieras eliminar"); // Se imprime un mensaje pidiendole al usuario que ingrese el numero a eliminar
                    numero = input.nextInt(); // Se lee el numero ingresado por el usuario y se guarda en la variable numero
                    a.eliminar(numero); // Se elimina el numero del arbol
                break;

                case 3:
                    a.preorden(a.raiz); // Se muestran los elementos del arbol en preorden
                break;

                case 4:
                    a.inorden(a.raiz); // Se muestran los elementos del arbol en inorden
                break;

                case 5:
                    a.postorden(a.raiz); // Se muestran los elementos del arbol en postorden
                break;

                case 6:
                    System.out.println("Adios"); // Se imprime un mensaje de despedida
                break; 

                default:
                    System.out.println("Opcion no valida"); // Se imprime un mensaje indicando que la opcion no es valida
                break;
            }
        }while(opcion != 6); // El bucle se repite hasta que el usuario elija la opcion 6 (Salir)
    }

    // Funcion que imprime un menu de opciones
    public static int menu(){
        Scanner input = new Scanner(System.in); // Se crea un objeto de tipo Scanner
        int opcion; // Se declara la variable opcion
        // Se imprime el menu de opciones
        System.out.println("\n---Escoge una opcion---");
        System.out.println("1) Agregar un numero");
        System.out.println("2) Eliminar un numero");
        System.out.println("3) Mostrar en preorden");
        System.out.println("4) Mostrar en inorden");
        System.out.println("5) Mostrar en postorden");
        System.out.println("6) Salir");
        opcion = input.nextInt(); // Se guarda la opcion ingresada por el usuario en la variable opcion 
        return opcion; // Se devuelve el valor de la variable opcion
    }
}
