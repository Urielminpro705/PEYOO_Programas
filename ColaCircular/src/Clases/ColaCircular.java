package Clases;
public class ColaCircular{
    Cancion[] cola;
    int inicio = -1, fin = -1, contador = 0;

    public ColaCircular(int tam){
        cola=new Cancion[tam];
    }

    public void insertar(Cancion nuevo){
        if(contador == cola.length){
            System.out.println("Ya no hay espacio");
        }
        else{
            if(fin == -1){
                fin++;;
                cola[fin] = nuevo;
                contador++;
            }
            else{
                if(fin < (cola.length - 1)){
                    fin++;
                    cola[fin] = nuevo;
                    contador++;
                }
                else{
                    fin = 0;
                    cola[fin] = nuevo;
                    contador++;
                }
            }
        }
    }

    public void eliminar(){
        if(contador == 0){
            System.out.println("No hay elementos en la cola");
        }
        else{
            if(inicio == -1){
                inicio++;
                cola[inicio] = null;
                contador--;
            }
            else{
                if(inicio < (cola.length - 1)){
                    inicio++;
                    cola[inicio] = null;
                    contador--;
                }
                else{
                    inicio = 0;
                    cola[inicio] = null;
                    contador--;
                }
            }
        }
    }

    public void imprimir(){
        if(contador == 0){
            System.out.println("No hay canciones en la cola");
        }
        else{
            System.out.println("\n--Cola de reproduccion--");
            if(inicio == 0){               
                for(int i = 0; i < cola.length; i++){
                    System.out.println(cola[i].nombre);
                }     
            }
            else{
                int j = inicio + 1;
                for(int i=0; i < contador; i++){
                    if(j < cola.length){
                        System.out.println(cola[j].nombre);
                        j++;
                    }
                    else{
                        j = 0;
                        System.out.println(cola[j].nombre);
                        j++;
                    }
                }
            }           
        }
    }

    // public void imprimir(){
    //     for(int i = 0; i < cola.length; i++){
    //         System.out.println(cola[i].nombre);
    //     }  
    // }
}