package tarea;
public class nodito {
    int numero; // Atributo de numero
    nodito izq, der; // Atributos para direccionar los siguientes nodos

    //Metodo constructor
    public nodito(int numero){
        this.numero = numero; // Se guarda de numero dentro del atributo numero
        izq = null; // Se hace null al atributo de izquierda  
        der = null; // Se hace null al atributo de derecha
    }
}
