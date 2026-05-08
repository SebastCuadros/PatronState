/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sebas
 */



/**
 * Estado en el que el reproductor
 * está detenido.
 */
class DetenidoState implements EstadoPlayer {

    @Override
    public void play(MusicPlayer player) {

        System.out.println("Reproduciendo música...");

        // Cambiamos al estado reproduciendo
        player.setEstado(new ReproduciendoState());
    }

    @Override
    public void pause(MusicPlayer player) {

        System.out.println("No se puede pausar. El reproductor está detenido.");
    }

    @Override
    public void stop(MusicPlayer player) {

        System.out.println("El reproductor ya está detenido.");
    }
}
