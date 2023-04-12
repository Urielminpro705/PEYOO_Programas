package Proyecto;
import java.util.Scanner;
public class Proyecto_Cola{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Cola a;
        Cancion x;
        int opcion, tam;
        System.out.println("Introduce el tamaño de la cola");
        tam=input.nextInt();
        a=new Cola(tam);
        do{
            opcion=menu();
            switch(opcion){
                case 1:
                    System.out.println("Introduce el nombre de la cancion");
                    x=new Cancion();
                    x.nombre=input.next();
                    a.push(x);                  
                break;

                case 2:
                    a.pop();
                break;

                case 3:
                    a.imprimirCola();
                break;

                case 4:
                    System.out.println("Adios");
                break;

                default:
                    System.out.println("La opcion no es valida");
                break;
            }
        }while(opcion!=4);
        
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