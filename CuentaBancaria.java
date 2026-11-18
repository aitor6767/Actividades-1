import java.util.Scanner;

// Clase adicional: SIN "public", porque el archivo ya tiene una clase pública
class SaldoInsuficienteException extends Exception {

    // Variables que pide el enunciado
    private String titular;
    private double saldo;

    // Constructor: recibe el mensaje, el titular y el saldo disponible
    public SaldoInsuficienteException(String mensaje, String titular, double saldo) {
        super(mensaje);          // guarda el mensaje en Exception (para getMessage())
        this.titular = titular;
        this.saldo = saldo;
    }
public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}

// Clase principal: la única "public", con el mismo nombre que el archivo
public class CuentaBancaria {

    // static para poder usarla desde los métodos estáticos
    static String titular = "Juan";

    // throws: declara que puede lanzar SaldoInsuficienteException
    public static double retirarDinero(double saldo, double cantidad)
            throws SaldoInsuficienteException {

        // Si se pide más de lo que hay, se lanza la excepción con throw
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException(
                    "Saldo insuficiente para realizar la operación.",
                    titular,
                    saldo);
        }

        // Si hay saldo suficiente, devuelve el nuevo saldo
        return saldo - cantidad;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double saldo = 500;

        System.out.println("Titular: " + titular);
        System.out.printf("Saldo inicial: %.2f €%n", saldo);

        System.out.print("\nCantidad que desea retirar: ");
        double cantidad = teclado.nextDouble();

        try {
            saldo = retirarDinero(saldo, cantidad);
            System.out.println("\nRetirada realizada correctamente.");
        } catch (SaldoInsuficienteException e) {
            System.out.println("\nError: " + e.getMessage());
        }

        // Se ejecuta en ambos casos
        System.out.printf("\nSaldo actual: %.2f €%n", saldo);

        teclado.close();
    }
}