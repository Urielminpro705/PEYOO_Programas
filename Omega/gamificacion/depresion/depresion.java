package Omega.gamificacion.depresion;
import java.util.Scanner;

public class depresion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, pos, a, e;
        botella mayor = new botella();
        n = input.nextInt();
        botella[] bot = new botella(n);
        for(int i = 0; i < bot.length; i++){
            bot[i].calorias = input.nextInt();
            bot[i].volumen = input.nextInt();
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(bot[j].calorias > mayor.calorias && bot[j].disponible == true){
                    mayor = bot[j];
                    pos = j;
                }
            }
            if(mayor.volumen <= e){
                bot[pos].disponible = false;
            }
        }     
    }
}

public class botella{
    public int volumen;
    public int calorias;
    public Boolean disponible = true;

    public botella(){}
}