public class arbolito_MCU {
    public static void main(String[] args) {
        arbolito a = new arbolito();
        a.insertar(20);
        a.insertar(1);
        a.insertar(50);
        a.inorden(a.raiz);
    }
}
