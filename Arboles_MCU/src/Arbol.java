public class Arbol {
    //Se declara el nodo que va a ser la raiz
    Nodo raiz;
    //Metodo constructor
    public Arbol () {
        raiz = null;
    }

    //Metodo para insertar un nuevo nodo
    public void insertar (int e, String n){
        //Se declara un nodo nuevo
        Nodo nuevo;
        //Se inicializa el nodo con la edad y el nombre
        nuevo = new Nodo(e,n);
        //If que comprueba que es la primera raiz
        if (raiz == null)
            //Se guarda la raiz como nueva
            raiz = nuevo;
        else{
            //Se crea un nodo y se hace null
            Nodo ant = null;
            //Se crea un nodo auxiliar
            Nodo aux;
            //Se guarda la raiz en el auxiliar
            aux = raiz;
            //Ciclo para encontrar donde se debe insertar el nuevo nodo
            while (aux != null){
                ant = aux;
                if (e <= aux.edad){
                    aux = aux.izq;
                }
                else{
                    aux = aux.der;
                }
            }
            if (e <= ant.edad){
                ant.izq = nuevo;
            }
            else{
                ant.der = nuevo;
            }
        }
    }

    //Metodo para mostrar el recorrido en preorden
    public void preorden(Nodo r){
        if(r != null){
            //Imprimir nombre y edad
            System.out.println(r.nombre + " tiene " + r.edad);
            //Se llama al mismo metodo por la izquierda
            preorden(r.izq);
            //Se llama al mismo metodo por la derecha
            preorden(r.der);
        }
    }

    //Metodo para mostrar el recorrido en inorden
    public void inorden(Nodo r){
        if(r != null){
            //Se llama al mismo metodo por la izquierda
            inorden(r.izq);
            //Imprimir nombre y edad
            System.out.println(r.nombre + " tiene " + r.edad);
            //Se llama al mismo metodo por la derecha
            inorden(r.der);
        }
    }

    //Metodo para mostrar el recorrido en postorden
    public void postorden(Nodo r){
        if(r != null){
            //Se llama al mismo metodo por la izquierda
            postorden(r.izq);
            //Se llama al mismo metodo por la derecha
            postorden(r.der);
            //Imprimir nombre y edad
            System.out.println(r.nombre + " tiene " + r.edad);
        }
    }
}
