public class ColaPrioridad{
    private Videojuego[] cola;
    private Videojuego[] aux;
    private int fin=-1;
    private int contador=0;
    
    //Metodo constructor que asigna el tamaño del arreglo
    public ColaPrioridad(int tam){
        cola=new Videojuego[tam];
        aux=new Videojuego[tam];
    }

    //Metodo para insertar elementos de tipo Videojuego a la cola
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
        //Se invoca el metodo para ordenar cada que se agrega un elemento nuevo
        ordenar();      
    }

    //Metodo para sacar el primer elemento de la cola
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

    //Metodo para imprimir todos los atributos de un objeto tipo Videojuego
    public void imprimirCola(){  
        if(contador==0){
            System.out.println("No hay elementos en la cola");
        }
        else{
            System.out.println("---Cola de videojuegos--");
            System.out.println("Prioridad\tTitulo\t\tGenero\t\tAlmacenamiento\tDesarrollador");
            for(int i=0; i<contador;i++){
                System.out.println(cola[i].prioridad + ")\t\t"+ cola[i].titulo + "\t" + cola[i].genero+ "\t" +cola[i].almacenamiento+ "\t" +cola[i].desarrollador);
            } 
            System.out.println("\n");     
        } 
    }

    //Metodo de seleccion para ordenar el arreglo cola
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