
package Ej02_Ruleta_Rusa_Acuatica;

import entidades.Juego;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        Juego game;
        
        game = new Juego();
        game.llenarJuegoArray();
        game.ronda();
    }
    
}
