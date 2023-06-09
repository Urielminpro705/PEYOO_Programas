public class arbolito {
    nodito raiz; // Se declara el nodo que va a ser la raiz
    // Metodo constructor
    public arbolito () {
        raiz = null; // La raiz empieza como vacia
    }

    /*
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
    }*/

    public void insertar(int e) {
        nodito nuevo = new nodito(e); // Se crea un nuevo nodo con el valor proporcionado
        if (raiz == null) {
            raiz = nuevo; // Si el árbol está vacío, el nuevo nodo se convierte en la raíz
        } else {
            nodito aux = raiz; // Se declara un nodo auxiliar y se inicializa con la raíz actual
            nodito ant; // Se declara un nodo anterior
            while (aux != null) { // Se busca la posición adecuada para insertar el nuevo nodo
                ant = aux; // Se guarda el nodo actual como el nodo anterior
                if (e <= aux.numero) { // Si el valor del nuevo nodo es menor o igual que el valor del nodo actual
                    aux = aux.izq; // Se mueve hacia la izquierda en el árbol
                    if (aux == null) {
                        ant.izq = nuevo; // Si el nodo auxiliar es nulo, se inserta el nuevo nodo a la izquierda del nodo anterior
                        return; // Se termina la inserción
                    }
                } else {
                    aux = aux.der; // Si el valor del nuevo nodo es mayor que el valor del nodo actual, se mueve hacia la derecha
                    if (aux == null) {
                        ant.der = nuevo; // Si el nodo auxiliar es nulo, se inserta el nuevo nodo a la derecha del nodo anterior
                        return; // Se termina la inserción
                    }
                }
            }
        }
    }

    //Metodo para mostrar el recorrido en preorden
    public void preorden(nodito r){
        // Si r no esta vacia
        if(r != null){ 
            System.out.println(r.numero + ", "); // Imprimir numero
            preorden(r.izq); // Se llama al mismo metodo por la izquierda
            preorden(r.der); // Se llama al mismo metodo por la derecha
        }
    }

    //Metodo para mostrar el recorrido en inorden
    public void inorden(nodito r){
        if(r != null){
            preorden(r.izq); // Se llama al mismo metodo por la izquierda
            System.out.println(r.numero + ", "); // Imprimir numero
            preorden(r.der); // Se llama al mismo metodo por la derecha
        }
    }

    //Metodo para mostrar el recorrido en postorden
    public void postorden(nodito r){
        if(r != null){
            preorden(r.izq); // Se llama al mismo metodo por la izquierda
            preorden(r.der); // Se llama al mismo metodo por la derecha
            System.out.println(r.numero + ", "); // Imprimir numero
        }
    }

    public void eliminar(int e) {
        raiz = eliminarNodo(raiz, e); // Se llama al método privado para eliminar el nodo, pasando la raíz actual y el valor a eliminar
    }
    
    private nodito eliminarNodo(nodito act, int valor) {
        if (act == null) {
            return act; // Si el árbol está vacío o se llegó al final del árbol sin encontrar el valor, se retorna la raíz actual
        }
    
        // Si el valor a eliminar es menor que el valor de la raíz actual, se busca en el subárbol izquierdo
        if (valor < act.numero) {
            act.izq = eliminarNodo(act.izq, valor); // Se llama recursivamente al método para eliminar en el subárbol izquierdo
        }
        // Si el valor a eliminar es mayor que el valor de la raíz actual, se busca en el subárbol derecho
        else if (valor > act.numero) {
            act.der = eliminarNodo(act.der, valor); // Se llama recursivamente al método para eliminar en el subárbol derecho
        }
        // Si el valor a eliminar es igual al valor de la raíz actual, se encontró el nodo a eliminar
        else {
            // Caso 1: El nodo a eliminar es una hoja (no tiene hijos)
            if (act.izq == null && act.der == null) {
                act = null; // Se elimina el nodo estableciéndolo como nulo
            }
            // Caso 2: El nodo a eliminar tiene solo un hijo (izquierdo o derecho)
            else if (act.izq == null) {
                act = act.der; // Se reemplaza el nodo actual por su hijo derecho
            } else if (act.der == null) {
                act = act.izq; // Se reemplaza el nodo actual por su hijo izquierdo
            }
            // Caso 3: El nodo a eliminar tiene dos hijos
            else {
                nodito sucesor = buscarRemplazo(act.der); // Se busca el nodo sucesor (el nodo más pequeño del subárbol derecho)
                act.numero = sucesor.numero; // Se reemplaza el valor del nodo actual con el valor del sucesor
                act.der = eliminarNodo(act.der, sucesor.numero); // Se elimina el sucesor recursivamente llamando al método de eliminación
            }
        }
        return act; // Se devuelve la raíz actualizada después de eliminar el nodo
    }
    
    private nodito buscarRemplazo(nodito nodo) {
        nodito actual = nodo;
        while (actual.izq != null) {
            actual = actual.izq; // Se mueve hacia la izquierda hasta encontrar el nodo más pequeño (sucesor)
        }
        return actual; // Se devuelve el nodo sucesor encontrado
    }
    
}
