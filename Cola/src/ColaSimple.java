public class ColaSimple{
    char[] cola;
    int inicio, fin;
    
    public ColaSimple(int tam){
        cola=new char[tam];
    }


    public void insertar(char elemento){
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
    }

    public void eliminar(char elemento){
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
    }
}