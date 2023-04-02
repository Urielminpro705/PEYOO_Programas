public class PEYOO_MCU{
    public static void main(String[] args) {
        ColaSimple a=new ColaSimple(5);
        a.insertar('a');
        a.insertar('b');
        a.insertar('c');
        a.insertar('d');
        a.eliminar('a');
        a.eliminar('b');
        a.eliminar('c');
        a.eliminar('d');
        a.eliminar('g');
    }
}