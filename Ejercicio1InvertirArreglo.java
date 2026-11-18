import java.util.Scanner;

public class Ejercicio1InvertirArreglo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Pedimos el tamaño y los numeros del arreglo.
        System.out.print("Cuantos numeros quieres introducir? ");
        int tamano = teclado.nextInt();
        int[] numeros = new int[tamano];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        // Mostramos los numeros desde el ultimo hasta el primero.
        System.out.print("Arreglo invertido: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        teclado.close();
    }
}
