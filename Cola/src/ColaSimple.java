public class ColaSimple{
    char[] cola;
    char[] aux;
    int fin=-1;
    int contador=0, i;
    
    public ColaSimple(int tam){
        cola=new char[tam];
        aux=new char[tam];
    }


    /*public void insertar(char elemento){
        if(fin==-1){
            inicio=0;
            fin=0;
            cola[fin]=elemento;
        }
        if(fin<cola.length){
            fin++;
            cola[fin]=elemento;
        }
        else{
            System.out.println("No hay espera");
        }
    }*/

    /*public void insertar(char elemento){
        if(fin==-1){
            fin=0;
            inicio=0;
            cola[fin]=elemento;
        }
        else{
            if(fin<cola.length){
                fin++;
                cola[fin]=elemento;
            }       
        }      
    }*/

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
            i=0;      
            do{
                aux[i]=cola[i+1];
                i++;
            }while(i<contador);
            cola=aux;
            contador--;
            fin=contador-1;
        }       
    }

    public void imprimir(){   
        for(int i=0; i<cola.length;i++){
            System.out.print(cola[i]);
        } 
        System.out.println("\n");      
    }

    /*public void eliminar(){        
        if(inicio<=fin){  
            if(fin==-1){
                System.out.println("No hay elementos en la cola");
            }         
            if(fin>=0 && fin<cola.length){
                cola[inicio]='\0';
                inicio++;
            }
            else{
                inicio=-1;
                fin=-1;
            } 
        }          
    }*/

    /*public void eliminar(char elemento){
        if(inicio<fin){
            if(fin>=0){
                cola[inicio]='\0';
                inicio++;
            }
            else{
                inicio=-1;
                fin=-1;
                System.out.println("Se reinicia la cola");
            }
        }
    }*/
}