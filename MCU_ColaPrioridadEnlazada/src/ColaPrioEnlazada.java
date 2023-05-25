import java.util.Scanner;
public class ColaPrioEnlazada {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Lista1 l = new Lista1();
        String nombre, padec, nss;
        int opcion;
        l.Insertar("Paulina", "Temperatura alta", "83237324", 3);
        l.Insertar("Jose", "Diarrea", "83237324", 2);
        l.Insertar("Pedro", "Fractura", "83237324", 1);
        l.Insertar("Jacinto", "Temperatura alta", "83237324", 4);
        l.ImprimirLista();
        l.eliminar();
        l.ImprimirLista();
        do{
            opcion = menu();
            switch(opcion){
                case 1:
                    System.out.println("Nombre del paciente:");
                    nombre = lector.next();
                    System.out.println("Padecimiento:");
                    padec = lector.next();
                    System.out.println("NSS:");
                    nss = lector.next();
                    
                    break;

                case 2:
                    
                    break;

                case 3:
                    l.ImprimirLista();
                    break;

                case 4:
                    System.out.println("Adios");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(opcion != 4);

        
    }

    public static int menu(){
        Scanner lector = new Scanner(System.in);
        int opcion;
        System.out.println("Escoge una opcion");
        System.out.println("1) Agregar paciente");
        System.out.println("2) Atender paciente");
        System.out.println("3) Ver lista de pacientes");
        System.out.println("4) Salir");
        opcion = lector.nextInt();
        return opcion;
    }
}
