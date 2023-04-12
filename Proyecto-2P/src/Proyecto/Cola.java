package Proyecto;
public class Cola{
    Cancion[] cola;
    Cancion[] aux;
    int fin=-1;
    int contador=0;
    
    public Cola(int tam){
        cola=new Cancion[tam];
        aux=new Cancion[tam];
    }

    public void push(Cancion elemento){
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

    public Boolean isVacia(){
        Boolean vacia;
        if(this.contador==0){
            vacia=true;
        }
        else{
            vacia=false;
        }
        return vacia;
    }

    public Cancion obtenerPrimero(){
        Cancion primero;
        primero=this.cola[0];
        return primero;
    }

    public int obtenerDimension(){
        int dimension;
        dimension=contador;
        return dimension;
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
        for(int i=0; i<contador;i++){
            System.out.print(cola[i].nombre);
        } 
        System.out.println("\n");      
    }
}