import java.util.Scanner;
public class ColaPrioridadMenu{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int opcion;
        ColaPrioridad cola= new ColaPrioridad(5);
        do{
            opcion=menu();
            switch(opcion){
                case 1:
                    System.out.println("Introduce el titulo del videojuego");
                    
                    break;

                default:
                    break;
            }
        }while(opcion!=4);
    }

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