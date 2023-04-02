public class Pila {
    public char[] arregloPila;
    public int tope;

    public Pila(int tam){
        arregloPila=new char[tam];
        tope=-1;
    }

    public Pila(){
        arregloPila=new char[5];
        tope=-1;
    }

    public void push(char elemento){
        if(this.tope<arregloPila.length){
            arregloPila[++this.tope]=elemento;
            
        }
        else{
            System.out.println("No hay mas espacio en la Pila, imposible guardar");
        }
    }
    
    public void verificar(){
        char a=0, b=0;
        for(int i=0;i<this.tope;i++){
            if(arregloPila[i]=='('){
                a++;
            }
            else{
                if(arregloPila[i]==')'){
                    b++;
                }
            }
        }
    }

    public char pop(){
        char aux='\0';
        if(this.tope>=0){
            aux=arregloPila[tope];
            arregloPila[tope]='\0';
            this.tope--;
        }
        else{
            System.out.println("No hay mas elementos en la Pila."); 
        }
        return aux;
    }
}