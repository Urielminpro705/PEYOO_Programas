import java.util.Stack;
import java.util.Scanner;
public class ProyectoPila {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String operacion;
        System.out.println("Introduce una operacion");
        operacion=input.next();
        System.out.println("El resultado es: " + posfija(operacion));

    }

    public static double posfija(String operacion){
        Stack<Double> pila=new Stack<Double>();
        int i=0;
        char symb;
        Double b1, b2, valor, a;   
        while(i<operacion.length()){
            symb=operacion.charAt(i);
            if(symb!='+' && symb!='-' && symb!='*' && symb!='/'){ 
                a=Double.parseDouble(String.valueOf(symb));;       
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
                }else if(symb=='*'){
                    valor=b1*b2;
                    pila.push(valor);
                }else if(symb=='/'){
                    valor=b1/b2;
                    pila.push(valor);
                }  
            }
            i++;
        }
        return pila.pop();
    }
}
