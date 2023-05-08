import java.util.Scanner;
public class practica{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] lista=new int[5];
        for(int i=0;i<lista.length;i++){
            System.out.println("Introduce un numero");
            lista[i]=input.nextInt();
        }
        seleccion(lista);
        imprimir(lista);
        
    }

    public static void imprimir(int[] l){
        System.out.println("Lista de numeros");
        for(int i=0;i<l.length;i++){
            System.out.println(l[i]);
        }
    }

    public static void seleccion(int[] lista){
        int pos, menor, aux;
        for(int i=0; i < lista.length; i++){
            menor=lista[i];
            pos=i;
            for(int j=i; j <lista.length; j++){
                if(lista[j] < menor){
                    menor=lista[j];
                    pos=j;
                }
            }

            aux=lista[i];
            lista[i]=menor;
            lista[pos]=aux;
        }
    }
}