public class nodito {
    int numero; // Atributo de numero
    nodito izq, der; // Atributos para direccionar los siguientes nodos

    //Metodo constructor
    public nodito(int numero){
        this.numero = numero; // Se iguala el atributo de numero con el que se inserta
        izq = null; // Se hace null al atributo de izquierda  
        der = null; // Se hace null al atributo de derecha
    }
}
