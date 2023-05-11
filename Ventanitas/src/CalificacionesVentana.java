import javax.swing.JOptionPane;
public class CalificacionesVentana {
    public static void main(String[] args) {
        String nombre=(String)JOptionPane.showInputDialog(null,"¿Cómo te llamas?","Nombre",3,null,null,"Escribe tu nombre aquí...");
        Alumno alumno=new Alumno();
        alumno.nombre=nombre;

        String calificacion1=(String)JOptionPane.showInputDialog(null,"¿Cual es su calificacion del primer parcial?","Calificacion",3,null,null,"Escribe aquí...");       
        alumno.cal1=Double.parseDouble(calificacion1);

        String calificacion2=(String)JOptionPane.showInputDialog(null,"¿Cual es su calificacion del segundo parcial?","Calificacion",3,null,null,"Escribe aquí...");       
        alumno.cal2=Double.parseDouble(calificacion2);

        String calificacion3=(String)JOptionPane.showInputDialog(null,"¿Cual es su calificacion del tercer parcial?","Calificacion",3,null,null,"Escribe aquí...");       
        alumno.cal3=Double.parseDouble(calificacion3);

        JOptionPane.showMessageDialog(null, "Hola " + alumno.nombre + " tu calificación final de PEyOO es: " + alumno.promedio(),"Promedio final",1);
    }
}
