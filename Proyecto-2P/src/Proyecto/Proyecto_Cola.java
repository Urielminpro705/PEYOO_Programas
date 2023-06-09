/*
Universidad De La Salle Bajío
Ingenieria en software y sistemas computacionales
Metodologia y programacion de sistemas
Uriel Mata Castellanos 76907
Proyecto de cola simple del segundo parcial
*/

//Código
package Proyecto;
import java.util.Scanner;
public class Proyecto_Cola{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ColaSimple a;
        Cancion x;
        int opcion, tam, tamActual;
        System.out.println("Introduce el tamaño de la cola de reproduccion");
        tam=input.nextInt();
        a=new ColaSimple(tam);
        //Ciclo que permite que el usuario pueda acceder al menu varias veces
        do{
            opcion=menu(a);
            //El switch actua dependiendo de que opcion selecciono el usuario
            switch(opcion){
                //Agrega un objeto tipo cancion a la cola
                case 1:
                    tamActual=a.obtenerDimension();
                    if(tamActual==tam){
                        System.out.println("Ya no hay espacio en la fila");
                    }
                    else{
                        System.out.println("Introduce el nombre de la cancion");
                        x=new Cancion();
                        x.nombre=input.next();
                        System.out.println("Introduce la duracion de la cancion");
                        x.duracion=input.next();
                        System.out.println("Introduce el compositor de la cancion");
                        x.compositor=input.next();
                        a.push(x); 
                    }                      
                break;

                //Saca un elemento de la cola
                case 2:
                    a.pop();
                break;

                //Imprime la cola
                case 3:
                    imprimirCola(a);
                break;

                //Termina el ciclo
                case 4:
                    System.out.println("Adios");
                break;

                //Muestra un mensaje de error
                default:
                    System.out.println("La opcion no es valida");
                break;
            }
            //El ciclo se va a acabar hasta que opcion sea igual a 4
        }while(opcion!=4);
        
    }

    //Funcion que imprime el menu de opciones
    public static int menu(ColaSimple a){
        Scanner input=new Scanner(System.in);
        int opcion;
        System.out.println("\n---ESCOGE UNA OPCION---");
        System.out.println("Esta sonando ("+ a.obtenerPrimero() +")");
        System.out.println("1) Agregar a la cola de reproduccion (" + a.obtenerDimension() + " canciones en la cola)");
        System.out.println("2) Reproducir la siguiente cancion");
        System.out.println("3) Ver la cola de reproduccion");
        System.out.println("4) Salir");
        opcion=input.nextInt();
        System.out.println("\n");
        return opcion;
    }

    //Funcion para imprimir todos los objetos de la cola
    public static void imprimirCola(ColaSimple a){   
        System.out.println("---Cola de reproduccion--");
        System.out.println("Cancion\tCompositor\tDuracion");
        for(int i = a.getIncio(); i<=a.getFin();i++){
            System.out.println(a.getCola()[i].nombre + "\t" + a.getCola()[i].compositor + "\t" +a.getCola()[i].duracion);
        } 
        System.out.println("\n");      
    }
}