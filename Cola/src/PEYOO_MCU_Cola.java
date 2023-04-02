import java.util.Scanner;
public class PEYOO_MCU_Cola{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ColaSimple a=new ColaSimple(50);
        String x;
        int opcion;
        do{
            opcion=menu();
            switch(opcion){
                case 1:
                    System.out.println("Introduce un valor");
                    x=input.next();
                    for(int i=0;i<x.length();i++){
                        a.insertar(x.charAt(i));
                    }
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