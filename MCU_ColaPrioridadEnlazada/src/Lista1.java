public class Lista1 {
    Nodo1 inicio = null;
    Nodo1 aux = null;
    Nodo1 ant = null;

    //Metodo para insertar un elemento dentro de la lista
    public void Insertar(String nombre, String padec, String nss, int prio, int edad){
        Nodo1 nuevo = new Nodo1(nombre, padec, nss, prio, edad);
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
    public void eliminar() {
        if (inicio == null) {
            System.out.println("Lista enlazada vacia");
        }
        inicio = inicio.sig;
    }
    

    //Metodo para imprimir la lista
    public void ImprimirLista(){
        aux = inicio;
        System.out.println("NSS ||\t\t" + "Nombre ||\t" + "Padecimiento ||" + "\t" + "prioridad");
        while(aux.sig != null){
            System.out.println(aux.getNSS() + "||\t" + aux.getNombre() + "" + "||\t" + aux.getPadecimiento() + "||\t" + aux.getPadecimiento() + "||\t" + aux.prio);
            aux = aux.sig;
        }
        System.out.println(aux.getNSS() + "||\t" + aux.getNombre() + "||\t" + aux.getPadecimiento() + "||\t" + aux.getPadecimiento() + "||\t" + aux.prio + "\n");
    }
}
