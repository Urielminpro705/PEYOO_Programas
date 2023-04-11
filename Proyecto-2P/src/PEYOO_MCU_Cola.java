import java.util.Scanner;
public class PEYOO_MCU_Cola{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ColaSimple a;
        String x;
        int opcion, tam;
        System.out.println("Introduce el tamaño de la cola");
        tam=input.nextInt();
        a=new ColaSimple(tam);
        do{
            opcion=menu();
            switch(opcion){
                case 1:
                    do{
                        System.out.println("Introduce elementos en la cola (maximo " +tam+")");
                        x=input.next();
                        if(x.length()>tam){
                            System.out.println("Demasidado grande, vuelve a intentar");
                        }
                    }while(x.length()>tam);
                    

                    for(int i=0;i<x.length();i++){
                        a.push(x.charAt(i));
                    }
                break;

                case 2:
                    a.pop();
                break;

                case 3:
                    a.imprimir();
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