
package EjerciciosEstructurasControl;

import java.util.*;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        /* 
        Inicializamos Scanner para leer la entrada del usuario y Random para generar la jugada de la máquina.
        También declaramos e inicializamos las variables
        */
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int jugador = 0, maquina = 0;
        int rondas = 0;

        //Mostramos un mensaje por pantalla.
        System.out.println("Juego de PIEDRA, PAPEL O TIJERA");
        
        //Iniciamos un bucle while que repite el juego hasta que el usuario salga o se completen tres rondas
        while (true) {
            System.out.println("\n1=Piedra, 2=Papel, 3=Tijera, (0=Salir): ");
            int eleccion = sc.nextInt();
            if (eleccion == 0) {
                break;
            }
            if (eleccion < 1 || eleccion > 3) {
                System.out.println("X Opcion invalida");
                continue;
            }

            int pc = rnd.nextInt(3) + 1;

            String textoJugador;
            if (eleccion == 1) {
                textoJugador = "Piedra";
            } else if (eleccion == 2) {
                textoJugador = "Papel";
            } else {
                textoJugador = "Tijera";
            }

            String textoMaquina;
            if (pc == 1) {
                textoMaquina = "Piedra";
            } else if (pc == 2) {
                textoMaquina = "Papel";
            } else {
                textoMaquina = "Tijera";
            }

            System.out.println("Tu: " + textoJugador + " | Maquina: " + textoMaquina);

            if (eleccion == pc) {
                System.out.println("Empate");
            } else if ((eleccion == 1 && pc == 3) || (eleccion == 2 && pc == 1) || (eleccion == 3 && pc == 2)) {
                System.out.println("Ganaste");
                jugador++;
            } else {
                System.out.println("Perdiste");
                maquina++;
            }
            //Mostramos el marcador de ambos jugadores.
            System.out.println("Marcador: Tu: " + jugador + " | Maquina: " + maquina);
            
            //Sumamos una ronda después de cada jugada válida. Es decir se seleccione una opcion valida.
            rondas++;

            //Si se han completado tres rondas, salimos del bucle con break
            if (rondas == 3) {
                break;
            }
        }

        System.out.println("Final: Tu: " + jugador + " | Maquina: " + maquina);

        sc.close();
    }
}
