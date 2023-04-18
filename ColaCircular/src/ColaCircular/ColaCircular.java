package ColaCircular;
public class ColaCircular{
    char[] cola;
    char[] aux;
    int inicio=-1;
    int fin=-1;
    int contador=0;
    
    public ColaCircular(int tam){
        cola=new char[tam];
        aux=new char[tam];
    }

    /*public void insertar(char elemento){
        if(fin==-1){
            fin=0;
            cola[fin]=elemento;
            contador++;
        }
        else{
            if(fin<cola.length){
                if(inicio==-1){
                    fin++;
                    cola[fin]=elemento;
                    contador++;
                }
                else{
                    if(inicio>-1){
                        inicio++;
                        cola[inicio]=elemento;
                        contador++;    
                    } 
                }
                
            }       
        }    
    }*/

    public void insertar(char elemento){
        if(fin==cola.length){
            fin=0;
        }else{
            if(fin==inicio){
                System.out.println("No hay espacio");
            }
            else{
                if(fin==-1){
                    fin=0;
                    cola[fin]=elemento;
                    contador++;
                }
                else{
                    if(fin<cola.length){
                        if(inicio==-1){
                            fin++;
                            cola[fin]=elemento;
                            contador++;
                        }
                        else{
                            if(inicio>-1){
                                fin++; 
                                cola[fin]=elemento;
                                contador++;   
                            } 
                        }
                        
                    }       
                }    
            }
        }        
    }

    public void eliminar(){
        if(contador==0){
            System.out.println("No hay elementos en la cola");
        }
        else{
            if(inicio==cola.length){
                inicio=-1;
            }
            else{
                if(inicio==-1){
                    inicio=0;
                    cola[inicio]='\0';
                    contador--;
                }
                else{
                    if(inicio>-1){
                        inicio++;
                        cola[inicio]='\0';
                        contador--;
                    }
                }
            }          
        }        
    }

    /*public void eliminar(){
        if(contador==0){
            System.out.println("No hay elementos en la cola");
        }
        else{
            if(inicio==-1){
                cola[0]='\0';
                contador--;
            }
            else{
                if(inicio>-1){
                    cola[inicio]='\0';
                    contador--;
                }
            }
        }        
    }*/

    public void imprimir(){
        if(inicio==-1){
            for(int i=0; i<contador;i++){
                System.out.print(cola[i]);
            } 
            System.out.println("\n");   
        }
        else{
            if(inicio>-1){
                for(int j=inicio; j<(fin-inicio);j++){
                    System.out.print(cola[j]);
                }                   
                
                System.out.println("\n");   
            }       
        }              
    }
}