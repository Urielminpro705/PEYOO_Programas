public class Nodo1 {
    //Atributo para el nombre
    private String Nombre;
    //Atributo para el padecimiento
    private String padecimiento;
    //Atributo para el NSS
    private String NSS;
    //Atributo para la prioridad 
    public int prio;
    //Atributo para el siguiente nodo
    public Nodo1 sig;

    //Metodo constructor
    public Nodo1(String Nombre, String Padecimiento, String NSS, int prio){
        this.Nombre = Nombre;
        this.padecimiento = Padecimiento;
        this.NSS = NSS;
        this.sig = null;
        this.prio = prio;
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
