public class arbolito {
    //Se declara el nodo que va a ser la raiz
    nodito raiz;
    //Metodo constructor
    public arbolito () {
        raiz = null;
    }

    //Metodo para insertar un nuevo nodo
    public void insertar (int e){
        //Se declara un nodo nuevo
        nodito nuevo;
        //Se inicializa el nodo con el numero
        nuevo = new nodito(e);
        //If que comprueba que es la primera raiz
        if (raiz == null)
            //Se guarda la raiz como nueva
            raiz = nuevo;
        else{
            //Se crea un nodo y se hace null
            nodito ant = null;
            //Se crea un nodo auxiliar
            nodito aux;
            //Se guarda la raiz en el auxiliar
            aux = raiz;
            //Ciclo para encontrar donde se debe insertar el nuevo nodo
            while (aux != null){
                ant = aux;
                if (e <= aux.numero){
                    aux = aux.izq;
                }
                else{
                    aux = aux.der;
                }
            }
            if (e <= ant.numero){
                ant.izq = nuevo;
            }
            else{
                ant.der = nuevo;
            }
        }
    }

    //Metodo para mostrar el recorrido en preorden
    public void preorden(nodito r){
        if(r != null){
            //Imprimir numero
            System.out.println(r.numero + ", ");
            //Se llama al mismo metodo por la izquierda
            preorden(r.izq);
            //Se llama al mismo metodo por la derecha
            preorden(r.der);
        }
    }

    //Metodo para mostrar el recorrido en inorden
    public void inorden(nodito r){
        if(r != null){
            //Se llama al mismo metodo por la izquierda
            preorden(r.izq);
            //Imprimir numero
            System.out.println(r.numero + ", ");
            //Se llama al mismo metodo por la derecha
            preorden(r.der);
        }
    }

    //Metodo para mostrar el recorrido en postorden
    public void postorden(nodito r){
        if(r != null){
            //Se llama al mismo metodo por la izquierda
            preorden(r.izq);
            //Se llama al mismo metodo por la derecha
            preorden(r.der);
            //Imprimir numero
            System.out.println(r.numero + ", ");
        }
    }
}
