
package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
    
    private ArrayList<Jugador> listaJugadores;
    private RevolverAgua watergun;
    
    Scanner leer = new Scanner(System.in);
    
    public Juego()  {
        
        this.listaJugadores = new ArrayList();
        this.watergun = new RevolverAgua();
    }

    public Juego(ArrayList<Jugador> listaJugadores, RevolverAgua watergun) {
        this.listaJugadores = listaJugadores;
        this.watergun = watergun;
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public RevolverAgua getWatergun() {
        return watergun;
    }

    public void setWatergun(RevolverAgua watergun) {
        this.watergun = watergun;
    }
    
    public void llenarJuegoArray()  {
        
        this.watergun.LlenarRevolver();
        System.out.print("Ingrese el numero de jugadores: ");
        int cantJugadores = leer.nextInt();
        if  (cantJugadores >= 6)    {
            cantJugadores = 6;
            System.out.println("La cantidad maxima de jugadore es 6.");
        }
        Jugador jugadorAux;
        String ch;
        for (int i = 0; i < cantJugadores; i++) {
                jugadorAux = new Jugador();
                ch = Integer.toHexString(i+1);
                jugadorAux.setNombre("Jugador#"+ch);
                this.listaJugadores.add(jugadorAux);
        }
    }
    
    public void ronda() {
        
        System.out.println(".. arranca el juego!!!");
        for (Jugador jugadorAux : listaJugadores)  {
            jugadorAux.disparo(this.watergun);
            if (jugadorAux.isMojado())    {
                System.out.println("El "+jugadorAux.getNombre()+" se mojo!.. el juego ha terminado.");
                break;
            } 
            else {
                System.out.println(" El jugador "+jugadorAux.getNombre()+" zafo... el siguiente...");
            }
        }
       
    }
    
    
    
}
