import java.util.Scanner;

public class Ejercicio1 {

    // Método que realiza la división
    public static int dividir(int a, int b) {
        return a / b; // Puede lanzar ArithmeticException si b es 0
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo numero: ");
        int num2 = sc.nextInt();

        try {
            int resultado = dividir(num1, num2);
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("\nError: No se puede dividir entre cero.");
        }

        System.out.println("El programa sigue ejecutandose correctamente.");
        sc.close();
    }
}