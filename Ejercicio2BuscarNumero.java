import java.util.Scanner;

public class Ejercicio2BuscarNumero {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Leemos los numeros que formaran el arreglo.
        System.out.print("Cuantos numeros tiene el arreglo? ");
        int tamano = teclado.nextInt();
        int[] numeros = new int[tamano];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        // Leemos el numero que queremos encontrar.
        System.out.print("Que numero quieres buscar? ");
        int buscado = teclado.nextInt();
        boolean encontrado = false;

        // Comprobamos cada posicion del arreglo.
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                encontrado = true;
            }
        }

        if (encontrado) {
            System.out.println("El numero esta en el arreglo.");
        } else {
            System.out.println("El numero no esta en el arreglo.");
        }

        teclado.close();
    }
}
