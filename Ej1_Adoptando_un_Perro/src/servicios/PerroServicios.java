package servicios;

import entidades.Perro;
import java.util.Scanner;

public class PerroServicios {
    
    Scanner leer = new Scanner(System.in);
    
    public PerroServicios() {
    }
    
    public Perro crearPerro()   {
        
        Perro p;
        
        p = new Perro();
        System.out.println("Datos del perro ----");
        System.out.print("Ingrese el nombre del perro: ");
        p.setNombre(leer.next());
        System.out.println();
        System.out.print("Ingrese la raza del perro: ");
        p.setRaza(leer.next());
        System.out.println();
        System.out.print("Ingrese la edad del perro: ");
        p.setEdad(leer.nextInt());
        System.out.println();
        System.out.print("Ingrese el tamaño del perro: ");
        p.setTamanio(leer.next());
        System.out.println();
        return p;   
    }
    
    public void MostrarPerro(Perro p)   {
        
        System.out.println("---- Datos del perro ----");
        System.out.println("Nombre: "+p.getNombre());
        System.out.println("Raza: "+p.getRaza());
        System.out.println("Edad: "+p.getEdad()+" años");
        System.out.println("Tamaño: "+p.getTamanio());
    }
    
}
