public class Alumno {
    public String nombre;
    public double cal1;
    public double cal2;
    public double cal3;

    public Alumno(){}

    public double promedio(){
        double promedio;
        promedio=(cal1*0.2) + (cal2*0.2) + (cal3*0.6);
        return promedio;
    }
}
