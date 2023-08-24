
package ej1_adoptando_un_perro;

import entidades.Perro;
import entidades.Persona;
import java.util.Scanner;
import servicios.PerroServicios;
import servicios.PersonaServicios;

public class Ej1_Adoptando_un_Perro {

    public static void main(String[] args) {
       
        Perro dog1, dog2;
        Persona persona1, persona2; 
        
        Scanner leer = new Scanner(System.in);
        
        PersonaServicios pS = new PersonaServicios();
        PerroServicios dS = new PerroServicios();
        System.out.println("Vamos a crear a las personas...");
        System.out.println("la primera persona...");
        persona1 = pS.crearPersona();
        System.out.println("la segunda persona: ");
        persona2 = pS.crearPersona();
        System.out.println("bien.. las personas creadas fueron... ");
        pS.MostrarPersona(persona1);
        System.out.println("... y...");
        pS.MostrarPersona(persona2);
        System.out.println("... ahora creamos los perros...");
        System.out.println("el primer perro...");
        dog1 = dS.crearPerro();
        System.out.println("el segundo perro...");
        dog2 = dS.crearPerro();
        System.out.println("bien.. los perros creados fueron... ");
        dS.MostrarPerro(dog1);
        System.out.println(".... y ....");
        dS.MostrarPerro(dog2);
        System.out.println("... ahora vamos a entregar el primer perro a la primera persona y el segundo perro a la segunda persona");
        pS.AsignarPerro(persona1,dog1);
        pS.AsignarPerro(persona2,dog2);
        System.out.println("bien.. ahora los datos de las personas son ... ");
        pS.MostrarPersona(persona1);
        System.out.println("... y...");
        pS.MostrarPersona(persona2);
        
    }
    
}
