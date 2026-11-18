import java.util.Scanner;

public class Ejercicio3OrdenarBurbuja {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Pedimos el arreglo de numeros.
        System.out.print("Cuantos numeros quieres ordenar? ");
        int tamano = teclado.nextInt();
        int[] numeros = new int[tamano];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        // Comparamos los numeros vecinos y los cambiamos si estan desordenados.
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int auxiliar = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = auxiliar;
                }
            }
        }

        // Mostramos el arreglo en orden ascendente.
        System.out.print("Arreglo ordenado: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        teclado.close();
    }
}
