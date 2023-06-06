public class Nodo {
    //Atributo de nombre
    String nombre;
    //Atributo de edad
    int edad;
    //Atributo para direccionar los siguientes nodos
    Nodo izq, der;

    //Metodo constructor
    public Nodo(int edad, String nombre){
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
