import java.util.Scanner;
public class ColaPrioridadMenu{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int opcion;
        ColaPrioridad cola= new ColaPrioridad(5);
        Videojuego juego;
        do{
            opcion=menu();
            switch(opcion){
                case 1:
                    juego=new Videojuego();
                    System.out.println("Introduce el titulo del videojuego");
                    juego.titulo=input.nextLine();
                    System.out.println("Introduce el genero");
                    juego.genero=input.next();
                    System.out.println("Introduce el desarrollador");
                    juego.desarrollador=input.next();
                    System.out.println("Introduce el la fecha de lanzamiento");
                    juego.fecha=input.next();
                    System.out.println("Introduce cuanto pesa en GB");
                    juego.almacenamiento=input.nextFloat();
                    System.out.println("Introduce la prioridad en la fila");
                    juego.prioridad=input.nextInt();
                    cola.push(juego);
                    break;

                case 2:
                    cola.pop();
                    break;

                case 3:
                    cola.imprimirCola();
                    break;

                case 4:
                    System.out.println("Adios");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(opcion!=4);
    }

    //Metodo para imprimir un menu
    public static int menu(){
        Scanner input=new Scanner(System.in);
        int opcion;
        System.out.println("---Escoge una opcion---");
        System.out.println("1) Agregar videojuego a la fila");
        System.out.println("2) Eliminar videojuego de la fila");
        System.out.println("3) Ver cola de videojuegos");
        System.out.println("4) Salir");
        opcion=input.nextInt();
        return opcion;
    }
}