import java.util.Scanner;

public class CotizadorSeguroAuto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precioBase = 5000;
        double precioTotal = precioBase;
        
        System.out.println("Bienvenido al cotizador de seguros de autos.");
        System.out.println("Por favor, ingrese la marca de su auto:");
        String marca = input.nextLine();
        System.out.println("Por favor, ingrese el modelo de su auto:");
        String modelo = input.nextLine();
        System.out.println("Por favor, ingrese el año de su auto:");
        int año = input.nextInt();
        input.nextLine();
        System.out.println("¿Tiene algún sistema de seguridad instalado en su auto? (s/n)");
        String respuestaSeguridad = input.nextLine();
        boolean tieneSeguridad = respuestaSeguridad.equalsIgnoreCase("s");
        
        // Cálculo del precio total del seguro
        precioTotal += 0.02 * precioBase * (2023 - año); // Año del auto
        if (marca.equalsIgnoreCase("Toyota")) {
            precioTotal += 0.1 * precioBase;
        } else if (marca.equalsIgnoreCase("Ford")) {
            precioTotal += 0.15 * precioBase;
        } else {
            precioTotal += 0.05 * precioBase;
        }
        if (modelo.equalsIgnoreCase("Sedán")) {
            precioTotal += 0.05 * precioBase;
        } else if (modelo.equalsIgnoreCase("SUV")) {
            precioTotal += 0.1 * precioBase;
        } else {
            precioTotal += 0.02 * precioBase;
        }
        if (tieneSeguridad) {
            precioTotal -= 0.03 * precioBase;
        } else {
            precioTotal += 0.02 * precioBase;
        }
        
        // Mostrar cotización al usuario
        System.out.printf("Su cotización para el seguro de su %s %s modelo %d es de $%.2f al año.", marca, modelo, año, precioTotal);
    }
}
