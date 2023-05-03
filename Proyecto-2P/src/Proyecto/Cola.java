package Proyecto;
public class Cola{
    private Cancion[] cola;
    private int fin=-1;
    private int contador=0;
    private int inicio=0;
    
    public Cola(int tam){
        cola=new Cancion[tam];
    }

    public void push(Cancion elemento){
        if(contador==cola.length){
            System.out.println("Ya no hay espacio en la cola");
        }
        else{
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

    public String obtenerPrimero(){
        String primero;
        if(contador==0){
            primero="No hay canciones en la cola";
        }
        else{
            primero=this.cola[inicio].nombre;
        }
        return primero;
    }

    public int obtenerDimension(){
        int dimension;
        dimension=contador;
        return dimension;
    }

    public void pop(){
        if(contador==0){
            System.out.println("No hay elementos en la cola");
        }
        else{
            cola[inicio]=null;
            inicio++;
            contador--;
        }        
    }

    public void imprimirCola(){   
        System.out.println("---Cola de reproduccion--");
        for(int i = inicio; i<cola.length;i++){
            System.out.println("Titulo: "+cola[i].nombre);
        } 
        System.out.println("\n");      
    }
}