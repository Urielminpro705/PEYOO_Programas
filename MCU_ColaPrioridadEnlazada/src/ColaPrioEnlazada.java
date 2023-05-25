/*
Universidad De La Salle Bajío
Ingenieria en software y sistemas computacionales
Programacion Estructurada y Orientada a Objetos
Uriel Mata Castellanos 76907
Para el caso de la atención de Urgencias, implementa una cola de prioridad con listas enlazadas.
*/

//Código
import java.util.Scanner;
public class ColaPrioEnlazada {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Lista1 l = new Lista1();
        String nombre, padec, nss;
        int opcion, edad, prio;
        l.Insertar("Paulina", "Temperatura alta", "83237324", 3, 14);
        l.Insertar("Jose", "Diarrea", "83237324", 2, 3);
        l.Insertar("Pedro", "Fractura", "83237324", 1, 78);
        l.Insertar("Jacinto", "Temperatura alta", "83237324", 4, 30);
        l.ImprimirLista();
        l.eliminar();
        l.ImprimirLista();
        l.eliminar();
        l.ImprimirLista();
        l.Insertar("Jose", "Diarrea", "83237324", 2, 3);
        l.Insertar("Pedro", "Fractura", "83237324", 1, 78);
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
                    System.out.println("Edad:");
                    edad = lector.nextInt();
                    if(edad > 0 && edad < 5) {
                        prio = 2;
                    } else {
                        if (edad >= 60) {
                            prio = 1;
                        } else {
                            prio = 3;
                        }
                    }
                    l.Insertar(nombre, padec, nss, prio, edad);
                    break;

                case 2:
                    l.eliminar();
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

    //Metodo para mostrar menu
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
