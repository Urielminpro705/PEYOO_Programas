package Proyecto;
public class ColaSimple{
    //Atributos privados
    private Cancion[] cola;
    private int fin=-1;
    private int contador=0;
    private int inicio=0;
    
    //Constructor
    public ColaSimple(int tam){
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
    
    //Metodos para ver los atributos
    public int getFin(){
        return this.fin;
    }
    
    public int getContador(){
        return this.contador;
    }

    public int getIncio(){
        return this.inicio;
    }

    public Cancion[] getCola(){
        return this.cola;
    }

    //Metodos para modificar los atributos
    public void setFin(int fin){
        this.fin=fin;
    }

    public void setContador(int contador){
        this.contador=contador;
    }

    public void setInicio(int inicio){
        this.inicio=inicio;
    }

    public void setCola(Cancion[] cola){
        this.cola=cola;
    }
}