import java.util.Stack;
import java.util.Scanner;
public class ProyectoPila {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Stack<Integer> pila=new Stack<Integer>();
        String operacion;
        System.out.println("Introduce una operacion");
        operacion=input.next();
        int i=0;
        char symb;
        int b1, b2, valor, a;   
        while(i<operacion.length()){
            symb=operacion.charAt(i);
            if(symb!='+' || symb!='-' ){ 
                a=symb-48;         
                pila.push(a);
            }
            else{
                b2=pila.pop();
                b1=pila.pop();
                if(symb=='+'){
                    valor=b1+b2;
                    pila.push(valor);
                }else if(symb=='-'){
                    valor=b1-b2;
                    pila.push(valor);
                }
                
            }
            i++;
        }
        System.out.println("El resultado es: "+pila.pop());

    }
}
