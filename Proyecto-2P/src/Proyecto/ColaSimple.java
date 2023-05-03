package Proyecto;
public class ColaSimple{
    //Atributos privados
    private Cancion[] cola;
    private int fin=-1;
    private int contador=0;
    private int inicio=0;
    
    //Constructor
    public Cola(int tam){
        cola=new Cancion[tam];
    }

    //Funcion para insertar un objeto de tipo Cancion en la cola
    public void push(Cancion elemento){
        if(contador==cola.length){
            System.out.println("Ya no hay espacio en la cola");
        }
        else{
            if(fin<cola.length){
                fin++;
                cola[fin]=elemento;
                contador++;
            }           
        }          
    }

    //Funcion para comprobar si la cola esta vacia
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

    //Funcion para obtener el primer valor de la cola
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

    //Funcion para obtener la dimension de la cola
    public int obtenerDimension(){
        int dimension;
        dimension=contador;
        return dimension;
    }

    //Funcion para sacar un elemento de la cola
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

    //Funcion para imprimir todos los objetos de la cola
    public void imprimirCola(){   
        System.out.println("---Cola de reproduccion--");
        System.out.println("Cancion\tCompositor\tDuracion");
        for(int i = inicio; i<=fin;i++){
            System.out.println(cola[i].nombre + "\t" + cola[i].compositor + "\t" +cola[i].duracion);
        } 
        System.out.println("\n");      
    }
}