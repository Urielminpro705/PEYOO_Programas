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

    //funcion para evaluar una operacion posfija
    public static double posfija(String operacion){
        //Se crea un objeto de tipo Stack
        Stack<Double> pila=new Stack<Double>();
        int i=0;
        char symb;
        Double b1, b2, valor, a;
        //El cliclo sirve para partir el string en varios valores de tipo char   
        while(i<operacion.length()){
            symb=operacion.charAt(i);
            //Se evalua si el valor es un operando o un operador
            if(symb!='+' && symb!='-' && symb!='*' && symb!='/' && symb!='$'){ 
                //Si el valor de tipo char es un operando se va a convertir a string para despues convertise en tipo double y se inserta en la pila
                a=Double.parseDouble(String.valueOf(symb));       
                pila.push(a);
            }
            else{
                //Si el valor es un operador se va a sacar dos elementos de la pila para darle valor a dos variables
                b2=pila.pop();
                b1=pila.pop();
                //Se hace la operacion correspondiente al operador y el resultado se inserta en la pila
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
                }else if(symb=='$'){
                    valor=Math.pow(b1,b2);
                    pila.push(valor); 
                }
            }
            i++;           
        }
        //Cuando se termina el ciclo el ultimo elemento que queda en la pila es el resultado, asi que, el retorno es un pop
        return pila.pop();
    }   
}
