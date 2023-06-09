import java.util.Scanner;
public class arbolito_MCU {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        arbolito a = new arbolito();
        int opcion, numero;
        a.insertar(20);
        a.insertar(1);
        a.insertar(50);
        a.insertar(60);
        a.inorden(a.raiz);
        a.eliminar(20);
        a.inorden(a.raiz);
        do{
            opcion = menu();
            switch(opcion){
                case 1:
                    System.out.println("Introduce el numero");
                    numero = input.nextInt();
                    a.insertar(numero);
                break;

                case 2:
                    System.out.println("Introduce el numero que quieras eliminar");
                    numero = input.nextInt();
                    a.eliminar(numero);
                break;

                case 3:
                    
                break;
            }
        }while(opcion != 6);
    }

    public static int menu(){
        Scanner input = new Scanner(System.in);
        int opcion;
        System.out.println("---Escoge una opcion---");
        System.out.println("1) Agregar un numero");
        System.out.println("2) Eliminar un numero");
        System.out.println("3) Mostrar en preorden");
        System.out.println("4) Mostrar en inorden");
        System.out.println("5) Mostrar en postorden");
        System.out.println("6) Salir");
        opcion = input.nextInt();
        return opcion;
    }
}
