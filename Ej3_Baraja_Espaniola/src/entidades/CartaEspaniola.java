package entidades;

import enumeradores.PalosBarajaEsp;
import enumeradores.ValoresBarajaEsp;

public class CartaEspaniola {
    
    private ValoresBarajaEsp valor;
    private PalosBarajaEsp palo;
    
    public CartaEspaniola()   {
    }

    public CartaEspaniola(ValoresBarajaEsp valores, PalosBarajaEsp palo) {
        this.valor = valores;
        this.palo = palo;
    }

    public ValoresBarajaEsp getValores() {
        return valor;
    }

    public void setValores(ValoresBarajaEsp valores) {
        this.valor = valores;
    }

    public PalosBarajaEsp getPalo() {
        return palo;
    }

    public void setPalo(PalosBarajaEsp palo) {
        this.palo = palo;
    }
    
    @Override
    public String toString() {
        return valor + " de " + palo;
    }
    
}
