public class Nodo1 {
    private String Nombre;
    private String padecimiento;
    private String NSS;
    public int prio;
    public Nodo1 sig;
    private int edad;

    //Metodo constructor
    public Nodo1 (String Nombre, String Padecimiento, String NSS, int prio, int edad) {
        this.Nombre = Nombre;
        this.padecimiento = Padecimiento;
        this.NSS = NSS;
        this.sig = null;
        this.prio = prio;
        this.edad = edad;
    }

    //Metodo para obtener NSS
    public String getNSS() {
        return this.NSS;
    }

    //Metodo para obtener el nombre
    public String getNombre() {
        return this.Nombre;
    }

    //Metodo para obtener el padecimiento
    public String getPadecimiento() {
        return this.padecimiento;
    }

    //Metodo para obtener la edad
    public int getEdad() {
        return edad;
    }

    //Metodo para establecer la edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Metodo para establecer el NSS
    public void setNSS(String NSS){
        this.NSS = NSS;
    }

    //Metodo para establecer el nombre
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

    //Metodo para establecer el padecimiento
    public void setPadecimiento(String padecimiento){
        this.padecimiento = padecimiento;
    }
}
