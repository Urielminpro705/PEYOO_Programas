public class Lista1 {
    //Atributo para establecer el inicio de la lista
    Nodo1 inicio = null;
    //Atributo auxiliar
    Nodo1 aux = null;
    Nodo1 ant = null;

    //Metodo para insertar un elemento dentro de la lista
    public void Insertar(String nombre, String padec, String nss, int prio){
        Nodo1 nuevo = new Nodo1(nombre, padec, nss, prio);
        if(inicio == null || prio < inicio.prio) {
            nuevo.sig = inicio;
            inicio = nuevo;
        } else {
            if(inicio != null){
                aux = inicio;
                while(aux.sig != null && aux.sig.prio <= prio){
                    aux = aux.sig;
                }
                nuevo.sig = aux.sig;
                aux.sig = nuevo;
            }
        }
    }
    
    //Metodo para eliminar un elemento de la lista
    public void eliminar(){
        //Se guarda el inicio en el auxiliar
        aux = inicio;
        //if que analiza si el inicio no se a usado
        if(inicio == null){
            //Se imprime un mensaje
            System.out.println("Lista enlazada vacia");
        }
        else{
            //Ciclo que se repite mientras que el auxiliar sea diferente a null
            while(aux != null){
                //EL atributo ant es igual al auxiliar
                ant = aux;
                //El auxiliar es igual al atributo sig de si mismo
                aux = aux.sig;
            }
            //if que analiza si el auxiliar esta vacio
            if(aux == null){
                //Se imprime un mensaje
                System.out.println("No se encuantra el elemento");
            }
            else{
                //if que analiza si ant esta vacio
                if(ant == null){
                    //Se establece que inicio es igual al siguiente nodo
                    inicio = inicio.sig;
                }
                else{
                    //Se establece que el atributo sig de ant es igual al atributo sig del auxiliar
                    ant.sig = aux.sig;
                }
            }
        }
    }

    //Metodo para imprimir la lista
    public void ImprimirLista(){
        //Se guarda el inicio en el aux
        aux = inicio;
        //Se imprime el nombre de los atributos del nodo
        System.out.println("NSS ||\t" + "Nombre ||\t" + "Padecimiento ||" + "\t" + "prioridad");
        //Un ciclo que se repite mientras que el atributo sig del auxiliar este vacio
        while(aux.sig != null){
            //Se imprimen los atributos del nodo
            System.out.println(aux.getNSS() + "||\t" + aux.getNombre() + "" + "||\t" + aux.getPadecimiento() + "||\t" + aux.prio);
            //Se establece que el auxiliar es igual al atributo sig de el mismo
            aux = aux.sig;
        }
        //Se imprimen los atributos del nodo
        System.out.println(aux.getNSS() + "||\t" + aux.getNombre() + "||\t" + aux.getPadecimiento() + "||\t" + aux.prio);
    }
}
