public class ColaPrioridad{
    private Videojuego[] cola;
    private Videojuego[] aux;
    private int fin=-1;
    private int contador=0;
    
    public ColaPrioridad(int tam){
        cola=new Videojuego[tam];
        aux=new Videojuego[tam];
    }

    public void push(Videojuego elemento){
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

    public void pop(){
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

    public void imprimirCola(){   
        System.out.println("---Cola de reproduccion--");
        for(int i=0; i<contador;i++){
            System.out.println((i+1)+") "+cola[i].titulo);
        } 
        System.out.println("\n");      
    }

    public void ordenar(){
        for(int i=0;i<=fin;i++){
            int pos_menor=i;
            for(int j=i;j<=fin;j++){
                if(cola[pos_menor].prioridad<cola[j].prioridad){
                    pos_menor=j;
                }
            }

            Videojuego aux=cola[i];
            cola[i]=cola[pos_menor];
            cola[pos_menor]=aux;
        }
    }
}