
package ej3_baraja_espaniola;

import entidades.BarajaEspaniola;
import java.util.Scanner;

public class Ej3_Baraja_Espaniola {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        BarajaEspaniola bE = new BarajaEspaniola();
        boolean continuar = true;
        int opcion;
        int cantidadCartas; 
        do {
            System.out.println("------ Maquina Barajadora -------");
            System.out.println("1. Mostrar baraja.");
            System.out.println("2. Barajar.");
            System.out.println("3. Dar cartas. ");
            System.out.println("4. Siguiente carta.");
            System.out.println("5. Cartas disponible: ");
            System.out.println("6. Cartas del monton.");
            System.out.println("7. Salir del programa.");
            System.out.print("Ingrese el numero de opcion (1~5): ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1  :   
                            bE.mostrarBaraja();
                            break;
                case 2  : 
                            bE.barajar();
                            break;
                case 3  : 
                            System.out.print("Cuantas cartas quiere?: ");
                            cantidadCartas = leer.nextInt();
                            bE.darCartas(cantidadCartas);
                            System.out.print(".. listo... cartas dadas... ");
                            break;
                case 4  :
                            //bE.siguienteCarta();
                            break;
                case 5  :
                            System.out.println("La baraja tiene "+bE.cartasDisponibles()+ " disponibles.");
                            break;
                case 6  :   
                            //bE.cartasMonton();
                            break;
                case 7  :   
                            System.out.print("Gracias por utilizar el programa.");
                            continuar = false;
                            break;
                default :
                            System.out.println("La opcion es erronea. Vuelva a intentar....");
            }            
        } while (continuar);
    }
    
}
