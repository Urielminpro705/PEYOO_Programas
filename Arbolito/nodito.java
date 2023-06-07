package Arbolito;

public class nodito {
    //Atributo de numero
    int numero;
    //Atributo para direccionar los siguientes nodos
    nodito izq, der;

    //Metodo constructor
    public nodito(int numero){
        //Se iguala el atributo de numero con el que se inserta
        this.numero = numero;
        //Se hace null al atributo de izquierda
        izq = null;
        //Se hace null al atributo de derecha
        der = null;
    }
}
