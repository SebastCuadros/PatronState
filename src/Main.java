
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sebas
 */


/**
 * Clase de prueba.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MusicPlayer player = new MusicPlayer();

        int opcion;

        do {

            System.out.println("\n========== REPRODUCTOR ==========");
            System.out.println("1. Reproducir");
            System.out.println("2. Pausar");
            System.out.println("3. Detener");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:

                    player.play();
                    break;

                case 2:

                    player.pause();
                    break;

                case 3:

                    player.stop();
                    break;

                case 4:

                    System.out.println("\n👋 Saliendo del reproductor...");
                    break;

                default:

                    System.out.println("\n⚠ Opción inválida.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}
