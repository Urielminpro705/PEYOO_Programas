package Omega.gamificacion.depresion;
import java.util.Scanner;

public class depresion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int amigos, n;
        int[] estomago;
        int[] c;
        int[] v;
        n=input.nextInt();;
        c = new int[n];
        v = new int[n];
        for(int i=0; i < n; i++){
            c[i] = input.nextInt();
            v[i] = input.nextInt();
        }
        
        amigos = input.nextInt();
        estomago = new int[amigos];
        for(int i = 0; i < amigos; i++){
            estomago[i] = input.nextInt();
        }       
    }

    public static void comprobar(){
        
    }
}


