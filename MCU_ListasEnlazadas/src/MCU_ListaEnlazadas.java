/*
Universidad De La Salle Bajío
Ingenieria en software y sistemas computacionales
Metodologia y programacion de sistemas
Uriel Mata Castellanos 76907
Crea una clase base Nodo, la cual contiene los datos del paciente
*/

//Código
public class MCU_ListaEnlazadas {
    public static void main(String[] args) {
        //Se crea un objeto de tipo lista
        Lista l = new Lista();
        //Se inserta un nodo
        l.Insertar("Paulina", "Temperatura alta", "83237324", 4);
        //Se inserta un nodo
        l.Insertar("Jose", "Diarrea", "83237324", 3);
        //Se inserta un nodo
        l.Insertar("Pedro", "Fractura", "83237324", 1);
        //Se inserta un nodo
        l.Insertar("Jacinto", "Temperatura alta", "83237324", 4);
        //Se llama el metodo para imprimir la lista
        l.ImprimirLista();
        l.eliminar("83237324");
        l.eliminar("83237324");
        l.ImprimirLista();
    }
}
