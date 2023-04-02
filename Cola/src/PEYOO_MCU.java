import java.util.Scanner;
public class PEYOO_MCU{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ColaSimple a=new ColaSimple(5);
        char x;
        int opcion;
        do{
            opcion=menu();
            switch(opcion){
                case 1:
                    System.out.println("Introduce un valor");
                    a.insertar(x=input.next().charAt(0));
                    break;
    
                case 2:
                    a.eliminar();
                break;

                case 3:
                    a.imprimir();
                    break;
            }
        }while(opcion!=7);
        
    }

    public static int menu(){
        Scanner input=new Scanner(System.in);
        int opcion;
        System.out.println("Escoge una opcion");
        System.out.println("1) Agregar a la cola");
        System.out.println("2) Sacar de la cola");
        System.out.println("3) Ver la cola");
        opcion=input.nextInt();
        return opcion;
    }
}