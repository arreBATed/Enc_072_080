package servicios;

import entidades.Perro;
import entidades.Persona;
import java.util.Scanner;

public class PersonaServicios {
    
    Scanner leer = new Scanner(System.in);
    
    public PersonaServicios() {
    }
    
    public Persona crearPersona()   {
        
        Persona p;
        
        p = new Persona();
        System.out.println("---- Datos de la persona ----");
        System.out.print("Ingrese el nombre de la persona: ");
        p.setNombre(leer.next());
        System.out.println();
        System.out.print("Ingrese el apellido de la persona: ");
        p.setApellido(leer.next());
        System.out.println();
        System.out.print("Ingrese la edad de la persona: ");
        p.setEdad(leer.nextInt());
        System.out.println();
        System.out.print("Ingrese el DNI de la persona: ");
        p.setDocumento(leer.nextInt());
        p.setMascota(new Perro());
        System.out.println();
        return p;   
    }
    
    public Persona AsignarPerro(Persona p, Perro d)   {
        
        p.setMascota(d);
        return p; 
    }
    
    public void MostrarPersona(Persona p)   {
        
        System.out.println("---- Datos del perro ----");
        System.out.println("Nombre: "+p.getNombre());
        System.out.println("Apellido: "+p.getApellido());
        System.out.println("Edad: "+p.getEdad()+" años");
        System.out.println("DNI: "+p.getDocumento());
        if (!(p.getMascota().getNombre().equals("No_posee")))  {
            System.out.println("Mascota: perro. Los datos del perro son... ");
            System.out.println(p.getMascota().toString());
        }        
        
    }
}
