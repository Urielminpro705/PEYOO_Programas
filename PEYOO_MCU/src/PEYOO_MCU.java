import java.util.Scanner;
public class PEYOO_MCU {
    public static void main(String[] args) {    
        Boolean valido=true;
        char simb=0;
        Scanner input=new Scanner(System.in);
        int i=0, n;
        char p, opuesto=0;
        System.out.println("Introduce el tamaño de la operacion");
        n=input.nextInt();
        Pila s=new Pila(n);
        while(i<n){
            System.out.println("Introduce un valor");
            simb=input.next().charAt(0);
            if(simb=='(' || simb=='[' || simb=='{'){
                s.push(simb);
            } 
            if(simb==')'){
                opuesto='(';
            }
            if(simb=='}'){
                opuesto='{';
            }
            if(simb==']'){
                opuesto='[';
            }

            if(simb==')'||simb==']'||simb=='}'){
                if(empty(s)==true){
                    valido=false;
                }
                else{
                    p= s.pop();
                    if(p!=opuesto){
                        valido=false;
                    }
                }
            }
            i++;
        }

        if(empty(s)==false){
            valido=false;
        }

        if(valido==true){
            System.out.println("La cadena es valida");
        }
        else{
            System.out.println("La cadena no es valida");
        }
    }

    public static boolean empty(Pila s) {
        if(s.tope==-1){
            return true;
        }
        return false;
    }
}
