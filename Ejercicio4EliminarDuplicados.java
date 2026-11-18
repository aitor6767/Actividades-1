import java.util.Scanner;

public class Ejercicio4EliminarDuplicados {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Leemos los numeros del arreglo original.
        System.out.print("Cuantos numeros quieres introducir? ");
        int tamano = teclado.nextInt();
        int[] numeros = new int[tamano];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        // Guardamos en otro arreglo solo la primera aparicion de cada numero.
        int[] sinDuplicados = new int[tamano];
        int cantidad = 0;

        for (int i = 0; i < numeros.length; i++) {
            boolean repetido = false;

            for (int j = 0; j < cantidad; j++) {
                if (numeros[i] == sinDuplicados[j]) {
                    repetido = true;
                }
            }

            if (!repetido) {
                sinDuplicados[cantidad] = numeros[i];
                cantidad++;
            }
        }

        // Mostramos solo las posiciones que contienen numeros distintos.
        System.out.print("Arreglo sin duplicados: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.print(sinDuplicados[i] + " ");
        }

        teclado.close();
    }
}
