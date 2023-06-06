import java.util.Scanner;
public class Arbol_MCU {
    public static void main(String[] args) {
        //Se crea el arbol
        Arbol a = new Arbol();
        //Se crea un objeto de tipo scanner
        Scanner input = new Scanner(System.in);
        //Se declara variable para guardar la edad
        int edad;
        //Se declara variable para guardar el nombre
        String nombre;
        //Se declara variable para guardar la opcion
        int opcion;
        //Se inserta un nodo
        a.insertar(20, "Pepe");
        //Se inserta un nodo
        a.insertar(21, "Luis");
        //Se inserta un nodo
        a.insertar(15, "Luna");
        //Se inserta un nodo
        a.insertar(22, "Mary");
        //Se inserta un nodo
        a.insertar(20, "Jose");
        //Se inserta un nodo
        a.insertar(10, "Panfilo");
        //Se inserta un nodo
        a.insertar(1, "Baby");
        //Ciclo para mostrar el menu
        do{
            //Se iguala la variable opcion a la funcion menu
            opcion = menu();
            //Switch para ejecutar las acciones dependiendo de lo que se selecciona en el menu
            switch(opcion){
                case 1:
                    //Pregunta el nombre
                    System.out.println("Introduce el nombre");
                    //Se lee el nombre
                    nombre = input.next();
                    //Pregunta la edad
                    System.out.println("Introduce la edad");
                    //Se lee la edad
                    edad = input.nextInt();
                    //Se guardan los datos en los atributos del nodo y se inserta en el arbol
                    a.insertar(edad, nombre);
                    break;
                case 2:
                    //Imprime el titulo
                    System.out.println("***** Recorrido en preorden *****");
                    //Mostrar el recorrido en preorden
                    a.preorden(a.raiz);
                    break;
                case 3:
                    //Imprime el titulo
                    System.out.println("***** Recorrido en inorden *****");
                    //Mostrar el recorrido en inorden
                    a.inorden(a.raiz);
                    break;
                case 4:
                    //Imprime el titulo
                    System.out.println("***** Recorrido en postorden *****");
                    //Mostrar el recorrido en postorden
                    a.postorden(a.raiz);
                    break;
                case 5:
                    //Se imprime un mensaje de despedido
                    System.out.println("Adios");
                    break;
                default:
                    //Se imprime un mensaje de error
                    System.out.println("Opcion no valida");
                    break;
            }
        //El ciclo se repite siempre y cuando no se selecciona la opcion 5
        }while(opcion != 5);
    }

    //Metodo para imprimir un menu
    public static int menu(){
        //Se crea un objeto de tipo scanner
        Scanner input = new Scanner(System.in);
        //Se crea una variable para regresar la opcion seleccionada
        int opcion;
        //Imprime el titulo
        System.out.println("---Escoge una opcion---");
        //Se imprime la opcion
        System.out.println("1) Agregar persona");
        //Se imprime la opcion
        System.out.println("2) Mostrar en preorden");
        //Se imprime la opcion
        System.out.println("3) Mostrar en inorden");
        //Se imprime la opcion
        System.out.println("4) Mostrar en postorden");
        //Se imprime la opcion
        System.out.println("5) Salir");
        //Se lee la opcion
        opcion = input.nextInt();
        //Retorna la opcion seleccionada
        return opcion;
    }
}
