public class Paciente {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String sexo;
    private int edad;
    private String adicional;

    public Paciente(){}

    public Paciente(String nombre, String sexo, int edad, String adicional){
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.adicional = adicional;
    }

    public String getNombre(){

        return this.nombre;
    }

    public String getApellidoPaterno(){
        return this.apellidoPaterno;
    }

    public String getApellidoMaterno(){
        return this.apellidoMaterno;
    }

    public String getSexo(){
        return this.sexo;
    }

    public int getEdad(){
        return this.edad;
    }

    public String getAdicional(){
        return this.adicional;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno){
        this.apellidoPaterno=apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno){
        this.apellidoMaterno=apellidoMaterno;
    }

    public void setSexo(String sexo){
        this.sexo=sexo;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }

    public void setAdicional(String adicional){
        this.adicional=adicional;
    }
}
