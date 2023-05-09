import java.util.Scanner;
public class Hospital {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        colaCircularPacientes cola=new colaCircularPacientes(3);
        int opcion, sexo, i=0;
        Paciente x;
        do{
            opcion=menu(cola);
            switch(opcion){
                case 1:
                    System.out.println("Introduce el nombre del paciente");
                    x=new Paciente();
                    x.setNombre(input.next());
                    System.out.println("Introduce el apellido paterno");
                    x.setApellidoPaterno(input.next());
                    System.out.println("Introduce el apellido materno");
                    x.setApellidoMaterno(input.next());
                    do{
                        System.out.println("Sexo:");
                        System.out.println("1) Hombre");
                        System.out.println("2) Mujer");
                        sexo=input.nextInt();
                        if(sexo==1){
                            x.setSexo("Hombre");
                            i++;
                        }
                        else{
                            if(sexo==2){
                                x.setSexo("Mujer");
                                i++;
                            }
                            else{
                                System.out.println("No es valido");
                            }
                        }
                    }while(i<1);
                    System.out.println("Introduce la edad");
                    x.setEdad(input.nextInt());
                    System.out.println("Agrega algun detalle adicional");
                    x.setAdicional(input.next());
                    cola.insertar(x);
                    break;

                case 2:
                    cola.eliminar();
                    break;

                case 3:
                    imprimir(cola);
                    break;

                case 4:
                    System.out.println("Hasta luego");
                    break;

                default:
                    System.out.println("No valido");
                    break;
            }
        }while(opcion!=4);
        

    }

    public static int menu(colaCircularPacientes cola){
        Scanner input=new Scanner(System.in);
        int opcion;
        System.out.println("---Escoge una opcion---");
        System.out.println("1) Agregar paciente");
        System.out.println("2) Atender paciente");
        System.out.println("3) Mostrar cola");
        System.out.println("4) Salir");
        opcion=input.nextInt();
        return opcion;
    }

    public static void imprimir(colaCircularPacientes cola){
        if(cola.contador == 0){
            System.out.println("No hay nadie en la cola");
        }        
        else{
            System.out.println("\n--Nombre\tApellido Paterno\tApellido Materno\tSexo\tEdad\tAdicional--");
            int j = cola.inicio + 1;
            for(int i=0; i < cola.contador; i++){
                if(j < cola.cola.length){
                    System.out.println(cola.cola[j].getNombre() + "\t\t" + cola.cola[j].getApellidoPaterno()+ "\t\t" + cola.cola[j].getApellidoMaterno()+ "\t\t" + cola.cola[j].getSexo()+ "\t\t" + cola.cola[j].getEdad()+ "\t\t" + cola.cola[j].getAdicional());
                    j++;
                }
                else{
                    j = 0;
                    System.out.println(cola.cola[j].getNombre() + "\t\t" + cola.cola[j].getApellidoPaterno()+ "\t\t" + cola.cola[j].getApellidoMaterno()+ "\t\t" + cola.cola[j].getSexo()+ "\t\t" + cola.cola[j].getEdad()+ "\t\t" + cola.cola[j].getAdicional());
                    j++;
                }
            }          
        }
    }
}
