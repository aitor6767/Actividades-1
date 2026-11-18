import java.util.Scanner;

public class Ejercicio5IntercalarArreglos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Los dos arreglos tendran el mismo tamaño.
        System.out.print("Cuantos numeros tendra cada arreglo? ");
        int tamano = teclado.nextInt();
        int[] primero = new int[tamano];
        int[] segundo = new int[tamano];

        // Leemos el primer arreglo.
        System.out.println("Introduce los numeros del primer arreglo:");
        for (int i = 0; i < primero.length; i++) {
            primero[i] = teclado.nextInt();
        }

        // Leemos el segundo arreglo.
        System.out.println("Introduce los numeros del segundo arreglo:");
        for (int i = 0; i < segundo.length; i++) {
            segundo[i] = teclado.nextInt();
        }

        // Colocamos un numero de cada arreglo, alternandolos.
        int[] intercalado = new int[tamano * 2];
        for (int i = 0; i < tamano; i++) {
            intercalado[i * 2] = primero[i];
            intercalado[i * 2 + 1] = segundo[i];
        }

        // Mostramos el resultado.
        System.out.print("Arreglo intercalado: ");
        for (int i = 0; i < intercalado.length; i++) {
            System.out.print(intercalado[i] + " ");
        }

        teclado.close();
    }
}
