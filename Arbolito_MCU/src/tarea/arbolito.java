package tarea;
public class arbolito {
    nodito raiz; // Se declara el nodo que va a ser la raiz
    // Metodo constructor
    public arbolito () {
        raiz = null; // La raiz se inicializa como vacia
    }

    public void insertar(int e) {
        nodito nuevo = new nodito(e); // Se crea un nuevo nodo con el valor proporcionado
        if (raiz == null) {
            raiz = nuevo; // Si el arbol esta vacio, el nuevo nodo se convierte en la raiz
        } else {
            nodito ant = null; // Se declara un nodo anterior
            nodito aux = raiz; // Se declara un nodo auxiliar y se inicializa con la raiz actual
            while (aux != null) { // Se busca la posicion adecuada para insertar el nuevo nodo
                ant = aux; // Se guarda el nodo actual como el nodo anterior
                if (e <= aux.numero) { // Si el valor del nuevo nodo es menor o igual que el valor del nodo actual
                    aux = aux.izq; // Se mueve hacia la izquierda en el arbol
                    if (aux == null) {
                        ant.izq = nuevo; // Si el nodo auxiliar es nulo, se inserta el nuevo nodo a la izquierda del nodo anterior
                        return; // Se termina la insercion
                    }
                } else {
                    aux = aux.der; // Si el valor del nuevo nodo es mayor que el valor del nodo actual, se mueve hacia la derecha
                    if (aux == null) {
                        ant.der = nuevo; // Si el nodo auxiliar es nulo, se inserta el nuevo nodo a la derecha del nodo anterior
                        return; // Se termina la insercion
                    }
                }
            }
        }
    }

    //Metodo para mostrar el recorrido en preorden
    public void preorden(nodito r){
        // Si r no esta vacia
        if(r != null){ 
            System.out.print(r.numero + ", "); // Imprimir numero
            preorden(r.izq); // Se llama al mismo metodo por la izquierda
            preorden(r.der); // Se llama al mismo metodo por la derecha
        }
    }

    //Metodo para mostrar el recorrido en inorden
    public void inorden(nodito r){
        if(r != null){
            inorden(r.izq); // Se llama al mismo metodo por la izquierda
            System.out.print(r.numero + ", "); // Imprimir numero
            inorden(r.der); // Se llama al mismo metodo por la derecha
        }
    }

    //Metodo para mostrar el recorrido en postorden
    public void postorden(nodito r){
        if(r != null){
            postorden(r.izq); // Se llama al mismo metodo por la izquierda
            postorden(r.der); // Se llama al mismo metodo por la derecha
            System.out.print(r.numero + ", "); // Imprimir numero
        }
    }

    public void eliminar(int e) {
        raiz = eliminarNodo(raiz, e); // Se llama al metodo para eliminar el nodo, pasando la raiz actual y el valor a eliminar
    }
    
    public nodito eliminarNodo(nodito act, int valor) {
        if (act == null) {
            System.out.println("No se encontro el numero deseado");
            return act; // Si el arbol está vacio o se llego al final del arbol sin encontrar el valor, se retorna la raiz actual
        }
    
        // Si el valor a eliminar es menor que el valor de la raiz actual, se busca en el subarbol izquierdo
        if (valor < act.numero) {
            act.izq = eliminarNodo(act.izq, valor); // Se llama recursivamente al metodo para eliminar en el subárbol izquierdo
        }
        // Si el valor a eliminar es mayor que el valor de la raiz actual, se busca en el subarbol derecho
        else if (valor > act.numero) {
            act.der = eliminarNodo(act.der, valor); // Se llama recursivamente al metodo para eliminar en el subarbol derecho
        }
        // Si el valor a eliminar es igual al valor de la raiz actual, se encontro el nodo a eliminar
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
                nodito sucesor = buscarRemplazo(act.der); // Se busca el nodo sucesor (el nodo mas pequeño del subarbol derecho)
                act.numero = sucesor.numero; // Se reemplaza el valor del nodo actual con el valor del sucesor
                act.der = eliminarNodo(act.der, sucesor.numero); // Se elimina el sucesor recursivamente llamando al método de eliminacion
            }
        }
        return act; // Se devuelve la raiz actualizada después de eliminar el nodo
    }
    
    public nodito buscarRemplazo(nodito nodo) {
        nodito actual = nodo; // Se declara e inicializa con el valor del nodo a buscar
        while (actual.izq != null) {
            actual = actual.izq; // Se mueve hacia la izquierda hasta encontrar el nodo mas pequeño
        }
        return actual; // Se devuelve el nodo sucesor encontrado
    }
    
}
