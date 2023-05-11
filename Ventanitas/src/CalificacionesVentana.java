/*
Universidad De La Salle Bajío
Ingenieria en software y sistemas computacionales
Metodologia y programacion de sistemas
Uriel Mata Castellanos 76907
Realiza un programa que solicite por medio de JOptionPane el nombre de un alumno y su calificación 
de cada parcial, el programa deberá calcular la calificación integrada (20% primer y segundo 
parcial y 60% el tercer parcial) y mostrar el resultado con JOptionPane. Por ejemplo, si se 
introdujo “Paulina”, 8, 7, 10 se mostrará “Hola Paulina tu calificación final de PEyOO es: 9”.
*/

//Código
import javax.swing.JOptionPane;
public class CalificacionesVentana {
    public static void main(String[] args) {
        //Ventana para pedir nombre
        String nombre=(String)JOptionPane.showInputDialog(null,"¿Cómo te llamas?","Nombre",3,null,null,"Escribe tu nombre aquí...");
        Alumno alumno=new Alumno();
        alumno.nombre=nombre;

        //Ventana para pedir calificacion del primer parcial
        String calificacion1=(String)JOptionPane.showInputDialog(null,"¿Cual es su calificacion del primer parcial?","Calificacion",3,null,null,"Escribe aquí...");       
        alumno.cal1=Double.parseDouble(calificacion1);

        //Ventana para pedir calificacion del segundo parcial
        String calificacion2=(String)JOptionPane.showInputDialog(null,"¿Cual es su calificacion del segundo parcial?","Calificacion",3,null,null,"Escribe aquí...");       
        alumno.cal2=Double.parseDouble(calificacion2);

        //Ventana para pedir calificacion del tercer parcial
        String calificacion3=(String)JOptionPane.showInputDialog(null,"¿Cual es su calificacion del tercer parcial?","Calificacion",3,null,null,"Escribe aquí...");       
        alumno.cal3=Double.parseDouble(calificacion3);

        //Ventana para imprimir calificacion final
        JOptionPane.showMessageDialog(null, "Hola " + alumno.nombre + " tu calificación final de PEyOO es: " + alumno.promedio(),"Promedio final",1);
    }
}
