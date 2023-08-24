
package entidades;

public class Jugador {
    
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    public void crearJugador(int numero) {
       
       String ch = String.valueOf(numero);
       this.setNombre("Jugador#" + ch);
       this.setMojado(false);
    }
    
    public RevolverAgua disparo(RevolverAgua r)    {
        
        if (r.mojar())  {
            this.mojado = true;
        }
        else    {
            r.SiguientePoscion();
        }
        return r;
    }

    @Override
    public String toString() {
        if (this.mojado)    {
            return "mojado";
        }
        else    {
            return "no mojado";
        }
    }
 
}
