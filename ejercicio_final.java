package EJERCICIO_FINAL;


//Importamos las librerias necesarias
import java.util.Scanner;
import java.nio.channels.Pipe.SourceChannel;
import javax.print.DocFlavor.STRING;

public class ejercicio_final {
    
 //Metodo estatico para validar datos de la reserva  
    
    public static void validarreserva(String nombre, int habitacion, int noches, double precioNoche) throws IllegalArgumentException {
        
        if (nombre == null || nombre.trim().isEmpty()) {

            throw new IllegalArgumentException("El nombre del cliente no puede estar vacio");
        }

        if (habitacion <0) {
            
            throw new IllegalArgumentException("El número de habitación tiene que ser mayor a 0");
        }

        if (precioNoche <0) {
            
            throw new IllegalArgumentException("El precio introducido no es valido, tiene que ser superior a 0");
        }

        if (noches <0) {
            
            throw new IllegalArgumentException("El número de noches debe ser superior a 0");
        }
    }


    //Metodo estatico para calcular el importe total de la estancia
    public static double calcularPrecio(int noches, double precioNoche) {
        
        return noches * precioNoche;
    }

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("---- SISTEMA DE RESERVAS DE HOTEL ----");

        System.out.println();

        System.out.print("Nombre del cliente: ");

        String nombre = teclado.nextLine();

        System.out.print("Numero de habitación: ");

        int habitacion = teclado.nextInt();

        System.out.print("Número de noches: ");

        int noches = teclado.nextInt();

        System.out.print("Precio noche: ");

        double precioNoche = teclado.nextDouble();

        System.out.println();

        teclado.close();

        try {
            //Llamada al método de validacón dentro del try catch

            validarreserva(nombre, habitacion, noches, precioNoche);

            //Si no se lanza excepción la reserva es correcta
                double precioTotal = calcularPrecio(noches, precioNoche);
                
                System.out.println("RESERVA REALIZADA CORRECTAMENTE");
                System.out.println();
                System.out.println("Cliente: " + nombre);
                System.out.println("Habitación: " + habitacion);
                System.out.println("Numero de Noches: " + noches);
                System.out.println("Precio por noche: " + precioNoche + " euro");
                System.out.println("PRECIO TOTAL: " + precioTotal + " euro"); 
        } catch (IllegalArgumentException e)  {
        
            //Captura de la excepcion y muestra el mensaje de error 
            System.out.println("LA RESERVA NO SE A PODIDO COMPLETAR , REVISE LOS DATOS E INTENTELO DE NUEVO");
        
        }
    }    
}
