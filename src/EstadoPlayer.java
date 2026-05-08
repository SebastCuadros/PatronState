/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author sebas
 */


/**
 * Interfaz que define las acciones comunes
 * para todos los estados del reproductor.
 */
interface EstadoPlayer {

    void play(MusicPlayer player);

    void pause(MusicPlayer player);

    void stop(MusicPlayer player);
}
