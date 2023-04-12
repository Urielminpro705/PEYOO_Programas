package ColaSimple;
public class ColaSimple{
    char[] cola;
    char[] aux;
    int fin=-1;
    int contador=0;
    
    public ColaSimple(int tam){
        cola=new char[tam];
        aux=new char[tam];
    }

    public void insertar(char elemento){
        if(fin==-1){
            fin=0;
            cola[fin]=elemento;
            contador++;
        }
        else{
            if(fin<cola.length){
                fin++;
                cola[fin]=elemento;
                contador++;
            }       
        }      
    }

    public void eliminar(){
        if(fin==-1){
            System.out.println("No hay elementos en la cola");
        }
        else{
            if(contador==cola.length){
                for(int i=0; i<contador-1;i++){
                    aux[i]=cola[i+1];
                }
            }
            else{
                for(int i=0; i<contador;i++){
                    aux[i]=cola[i+1];
                }
            }            
            cola=aux;
            contador--;
            fin=contador-1;
        }
         
    }

    public void imprimir(){   
        for(int i=0; i<contador;i++){
            System.out.print(cola[i]);
        } 
        System.out.println("\n");      
    }
}