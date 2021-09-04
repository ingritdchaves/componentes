
import java.util.ArrayList;
import java.util.Scanner;

public class Vista {
    // Atributos
    Scanner lector = new Scanner (System.in);
    
    // Metodos
    public void mostrarEstudiante (Estudiante e ) {
        int codigo = e.getCodigo();
        String nombre = e.getNombre();
        String programa = e.getPrograma ();
        
        System.out.println ("CODIGO: "+ codigo + " NOMBRE: "+ nombre+ " PROGRAMA: "+programa);
    }
    
    // Metodo para mostrar las opciones de un menu
    public void mostrarMenu () {
        System.out.println ("0. Salir");
        System.out.println ("1. Adicionar un estudiante");
        System.out.println ("2. Eliminar un estudiante");
        System.out.println ("3. Buscar un estudiante");
        System.out.println ("4. Actualizar un estudiane");
        System.out.println ("5. Mostrar todos");
    }
    
    public int leerOpcion () {
        System.out.println ("Cual opcion? ");
        int opcion = lector.nextInt ();
        return (opcion);
    }
    
    public Estudiante leerEstudiante () {
        System.out.println ("Codigo: ");
        int codigo = lector.nextInt ();
        lector.nextLine();
        System.out.println ("Nombre: ");
        String nombre = lector.nextLine();
        System.out.println ("Programa: ");
        String programa = lector.nextLine ();
        
        Estudiante e = new Estudiante (codigo, nombre, programa);
        
        return (e);
    }
    
    public void mostrarTodos (ArrayList<Estudiante> listaEstudiantes) {
        
        for (Estudiante e : listaEstudiantes) {
            mostrarEstudiante (e);
        }
        
    }
    
}
