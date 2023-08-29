package extraej1_adopciones_de_perros;

import entidades.Perro;
import java.util.Scanner;
import servicios.PerroServicios;
import servicios.PersonaServicios;

public class ExtraEj1_Adopciones_de_Perros {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        PerroServicios perroS = new PerroServicios();
        PersonaServicios persServ = new PersonaServicios();
        Perro perroAux;
        String cadena;
        boolean continuar = true;
        int opcion;
        do {
            System.out.println("------ Administrado Personas y Perros -------");
            System.out.println("1. Crear Persona.");
            System.out.println("2. Crear Perro.");
            System.out.println("3. Mostrar listado de Personas ");
            System.out.println("4. Mostrar listado de Perros .");
            System.out.println("5. Adoptar un perro. ");
            System.out.println("6. Salir del programa.");
            System.out.print("Ingrese el numero de opcion (1~6): ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1  :    
                            System.out.println("Vamos a crear el listado de persona....");
                            persServ.CrearListadoPersonas();
                            break;
                case 2  : 
                            System.out.println("Vamos a crear el listado de perros....");
                            perroS.CrearListadoPerros();
                            break;
                case 3  : 
                            System.out.println("El listado de las peronas que quieren adepotar es....");
                            persServ.MostrarGrupoPersonas();
                            break;
                case 4  :
                            System.out.println("El listado de los perros para adepotar es....");
                            perroS.MostrarGrupoPerros();
                            break;
                case 5  :
                            System.out.print("Ingrese el nombre del perro a adoptar: ");
                            cadena = leer.next();
                            
                            break;
                case 6  :   
                            System.out.print("Gracias por utilizar el programa.");
                            continuar = false;
                            break;
                default :
                            System.out.println("La opcion es erronea. Vuelva a intentar....");
            }            
        } while (continuar);
        
    }
    
}
