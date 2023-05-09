public class colaCircularPacientes{
    public Paciente[] cola;
    public int inicio = -1;
    public int fin = -1;
    public int contador = 0;

    public colaCircularPacientes(int tam){
        cola=new Paciente[tam];
    }

    public void insertar(Paciente nuevo){
        if(contador == cola.length){
            System.out.println("Ya no hay espacio");
        }
        else{
            if(fin < (cola.length - 1)){
                fin++;
                cola[fin] = nuevo;
                contador++;
            }
            else{
                if(fin == cola.length-1 && contador<cola.length){
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
}