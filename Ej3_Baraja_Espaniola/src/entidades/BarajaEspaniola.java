package entidades;

import enumeradores.PalosBarajaEsp;
import enumeradores.ValoresBarajaEsp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class BarajaEspaniola {
    
    private ArrayList<CartaEspaniola> baraja;
    private ArrayList<CartaEspaniola> cartasJugadas;
    
    public BarajaEspaniola()    {
                
        this.baraja = new ArrayList();
        this.cartasJugadas = new ArrayList();
        for (PalosBarajaEsp palos : PalosBarajaEsp.values())  {
            for (ValoresBarajaEsp valores : ValoresBarajaEsp.values())  {
                this.baraja.add(new CartaEspaniola(valores,palos));
            }                
        }
    }

    public BarajaEspaniola(ArrayList<CartaEspaniola> baraja) {
        this.baraja = baraja;
    }

    public ArrayList<CartaEspaniola> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<CartaEspaniola> baraja) {
        this.baraja = baraja;
    }
    
    public ArrayList<CartaEspaniola> getCartasJugadas() {
        return baraja;
    }

    public void setCartasJugadas(ArrayList<CartaEspaniola> cartasJugadas) {
        this.cartasJugadas = cartasJugadas;
    } 
    
    public void mostrarBaraja() {
        
        this.baraja.forEach((cartaAux) -> {
            System.out.println(cartaAux.toString());    
        });         
    }
    
    public void barajar()   {
      
        Collections.shuffle(this.baraja);          
    }
    
    public int cartasDisponibles() {

        int cont;
        
        cont = 0;
        Iterator itBaraja = this.baraja.iterator();
        while (itBaraja.hasNext()) {
            cont = cont + 1;
            itBaraja.next();
        }
        return cont;        
     }
    
    //public void siguienteCarta()    {
    //}

    public void darCartas(int cantidadCartas) {  
        
        if (cantidadCartas <= cartasDisponibles())  {
            for (int i = 0; i <= (cantidadCartas - 1); i++)    {
                    this.cartasJugadas.add(baraja.get(0));
                    this.baraja.remove(0);
                            
            }
        }
        else    {
            System.out.println("Solicito mas cartas que las que tiene la baraja disponibles....");
        }
    }

    public void cartasMonton()  {
        
        this.cartasJugadas.forEach((cartaAux) -> {
            System.out.println(cartaAux.toString());
        });
    }

}
