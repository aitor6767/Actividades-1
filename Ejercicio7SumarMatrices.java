import java.util.Scanner;

public class Ejercicio7SumarMatrices {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Las dos matrices tendran las mismas dimensiones.
        System.out.print("Numero de filas: ");
        int filas = teclado.nextInt();
        System.out.print("Numero de columnas: ");
        int columnas = teclado.nextInt();

        int[][] primera = new int[filas][columnas];
        int[][] segunda = new int[filas][columnas];
        int[][] suma = new int[filas][columnas];

        // Leemos los valores de la primera matriz.
        System.out.println("Introduce los valores de la primera matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                primera[i][j] = teclado.nextInt();
            }
        }

        // Leemos los valores de la segunda matriz.
        System.out.println("Introduce los valores de la segunda matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                segunda[i][j] = teclado.nextInt();
            }
        }

        // Sumamos los valores que estan en las mismas posiciones.
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma[i][j] = primera[i][j] + segunda[i][j];
            }
        }

        // Mostramos la matriz resultante.
        System.out.println("Resultado de la suma:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(suma[i][j] + " ");
            }
            System.out.println();
        }

        teclado.close();
    }
}
