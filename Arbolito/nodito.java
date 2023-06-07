package Arbolito;

public class nodito {
    //Atributo de nombre
    String nombre;
    //Atributo de edad
    int edad;
    //Atributo para direccionar los siguientes nodos
    nodito izq, der;

    //Metodo constructor
    public nodito(int edad, String nombre){
        //Se iguala el atributo de edad con el que se inserta
        this.edad = edad;
        //Se iguala el atributo de nombre con el que se inserta
        this.nombre = nombre;
        //Se hace null al atributo de izquierda
        izq = null;
        //Se hace null al atributo de derecha
        der = null;
    }
}
