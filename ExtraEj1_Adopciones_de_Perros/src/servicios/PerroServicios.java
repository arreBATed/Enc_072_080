package servicios;

import entidades.Perro;
import java.util.ArrayList;
import java.util.Scanner;

public class PerroServicios {
    
    ArrayList<Perro> grupoPerros;
    
    Scanner leer = new Scanner(System.in);
    
    public PerroServicios() {
        this.grupoPerros = new ArrayList();
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
        p.setAdoptado(false);
        return p; 
    }
    
    public void MostrarPerro(Perro p)   {
        
        if (p.isAdoptado()) {
            System.out.print(p.toString()+ " estado= adoptado");
        }   
        else    {
            System.out.print(p.toString()+ " estado= no adoptado");
        }
        System.out.println();
    }
    
    public void MostrarGrupoPerros()    {
        
        this.grupoPerros.forEach((pAux) -> {
            MostrarPerro(pAux);
        });
    }
    
    public boolean perroDisponible(String nombre)  {
        
        boolean presente = false;
        for (Perro pAux : this.grupoPerros) {
            if ((pAux.getNombre().equals(nombre)) && (!(pAux.isAdoptado())))  {
                presente = true;
                break;
            }
        }
        return presente; 
    }
    
    public void CrearListadoPerros()  {
        
        boolean continuar = true;
        System.out.println("--- Listado de Perros ---");
        int cont = 1;
        String ch;
        do  {
                System.out.println("Perro #"+cont+"...");
                this.grupoPerros.add(crearPerro());
                System.out.print("Desea continuar agregando perros (s/n): ");
                ch = leer.next();
                ch = ch.toLowerCase();
                if (ch.equals("n")) {
                    continuar = false;
                }
        } while (continuar);
    }
    
    public Perro buscarPerroGrupoPerros(String nombre)  {
        
        Perro p;
        
        p = new Perro();
        for (Perro pAux : this.grupoPerros) {
            if ((pAux.getNombre().equals(nombre)) && (!(pAux.isAdoptado())))  {
                p = pAux;
            }
        }
        return  p;
    }
}
