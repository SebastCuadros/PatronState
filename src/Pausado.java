/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sebas
 */


/**
 * Estado en el que la música
 * está pausada.
 */
class PausadoState implements EstadoPlayer {

    @Override
    public void play(MusicPlayer player) {

        System.out.println("Continuando reproducción...");

        // Regresa al estado reproduciendo
        player.setEstado(new ReproduciendoState());
    }

    @Override
    public void pause(MusicPlayer player) {

        System.out.println("La música ya está pausada.");
    }

    @Override
    public void stop(MusicPlayer player) {

        System.out.println("Reproductor detenido.");

        // Cambia al estado detenido
        player.setEstado(new DetenidoState());
    }
}
