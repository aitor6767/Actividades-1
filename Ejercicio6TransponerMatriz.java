import java.util.Scanner;

public class Ejercicio6TransponerMatriz {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Pedimos las filas y columnas de la matriz.
        System.out.print("Numero de filas: ");
        int filas = teclado.nextInt();
        System.out.print("Numero de columnas: ");
        int columnas = teclado.nextInt();

        int[][] matriz = new int[filas][columnas];

        // Leemos todos los valores de la matriz.
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Valor de la posicion [" + i + "][" + j + "]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }

        // En la transpuesta, las filas pasan a ser columnas.
        System.out.println("Matriz transpuesta:");
        for (int j = 0; j < columnas; j++) {
            for (int i = 0; i < filas; i++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        teclado.close();
    }
}
