
package enumeradores;

public enum ValoresBarajaEsp {
    AS(1), DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6), SIETE(7), SOTA(10), CABALLO(11), REY(12);
    
    private final int numero;
    
    ValoresBarajaEsp(int numero)  {
        this.numero = numero;
    }
    
    public int retornarValor()  {
        return numero;
    }
    
}
