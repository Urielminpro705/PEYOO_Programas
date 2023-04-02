public class MCU_Pila {
    public static void main(String[] args) {
        Pila s=new Pila();
        s.push('A');
        s.push('B');
        s.push('B');
        s.push('A');
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
