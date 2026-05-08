/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sebas
 */


/**
 * Clase principal del reproductor.
 * Mantiene el estado actual.
 */
class MusicPlayer {

    // Estado actual del reproductor
    private EstadoPlayer estado;

    /**
     * Constructor.
     * El reproductor inicia detenido.
     */
    public MusicPlayer() {

        estado = new DetenidoState();
    }

    /**
     * Permite cambiar el estado actual.
     */
    public void setEstado(EstadoPlayer estado) {

        this.estado = estado;
    }

    /**
     * Delegamos las acciones
     * al estado actual.
     */
    public void play() {

        estado.play(this);
    }

    public void pause() {

        estado.pause(this);
    }

    public void stop() {

        estado.stop(this);
    }
}
