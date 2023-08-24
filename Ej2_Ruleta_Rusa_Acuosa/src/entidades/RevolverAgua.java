
package entidades;

public class RevolverAgua {
    
    private int posicionActual;
    private int posicionAgua;

    public RevolverAgua() {
    }

    public RevolverAgua(int posicionActual, int poiscionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = poiscionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPoiscionAgua() {
        return posicionAgua;
    }

    public void setPoiscionAgua(int poiscionAgua) {
        this.posicionAgua = poiscionAgua;
    }
    
    public void LlenarRevolver()    {
        this.setPoiscionAgua((int) (Math.random() * 6) + 1);
        this.setPosicionActual((int) (Math.random() * 6) + 1);
    }
    
    public boolean mojar()  {
        return (this.getPoiscionAgua() == this.getPosicionActual());
    }
    
    public void SiguientePoscion()   {
        
        if (this.getPosicionActual() == 6)   {
                this.setPosicionActual(1);
        }
        else    {
            this.setPosicionActual(this.getPosicionActual()+1);
        }
    }
    
    @Override
    public String toString()    {
        
        return ("La posicion del tambor es "+posicionActual+" y la bala de agua esta en la posicion "+posicionAgua);
    }
}
