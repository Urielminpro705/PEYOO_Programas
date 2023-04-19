package Circular;
import java.util.Scanner;
public class Circular{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ColaCircular c=new ColaCircular(3);
        Persona c2;
        int opcion;
        do{
            opcion=menu();
            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el nombre de la persona");
                    c2=new Persona(input.nextLine());
                    c.insertar(c2);
                    break;
            
                case 2:
                    c.eliminar();
                    break;
    
                case 3:
                    c.imprimir();
                    break;

                case 4:
                    System.out.println("Adios");
                    break;

                default:
                    System.out.println("La opcion no es valida");
                    break;
            }
        }while(opcion != 4);   
    }

    public static int menu(){
        Scanner input=new Scanner(System.in);
        int opcion;
        System.out.println("\n---Escoge una opcion---");
        System.out.println("1) Agregar a la cola");
        System.out.println("2) Sacar de la cola");
        System.out.println("3) Ver la cola");
        System.out.println("4) Salir");
        opcion=input.nextInt();
        return opcion;
    }
}
