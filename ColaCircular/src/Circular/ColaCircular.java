package Circular;
public class ColaCircular{
    Persona[] cola;
    int inicio = -1, fin = -1, contador = 0;

    public ColaCircular(int tam){
        cola=new Persona[tam];
    }

    public void insertar(Persona nuevo){
        if(contador == cola.length){
            System.out.println("Ya no hay espacio");
        }
        else{
            if(fin == -1){
                fin++;
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
            System.out.println("No hay nadie en la cola");
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
            System.out.println("No hay nadie en la cola");
        }        
        else{
            System.out.println("\n--Cola para pagar en la tienda--");
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