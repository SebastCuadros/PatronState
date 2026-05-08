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
 * se está reproduciendo.
 */
class ReproduciendoState implements EstadoPlayer {

    @Override
    public void play(MusicPlayer player) {

        System.out.println("La música ya se está reproduciendo.");
    }

    @Override
    public void pause(MusicPlayer player) {

        System.out.println("Música pausada.");

        // Cambia al estado pausado
        player.setEstado(new PausadoState());
    }

    @Override
    public void stop(MusicPlayer player) {

        System.out.println("Música detenida.");

        // Cambia al estado detenido
        player.setEstado(new DetenidoState());
    }
}
