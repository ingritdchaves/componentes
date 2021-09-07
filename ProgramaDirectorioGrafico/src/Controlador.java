
import java.util.ArrayList;


public class Controlador {
    // Atributos
    Vista miVista = new Vista ();
    DirectorioDAO miModelo = new DirectorioDAO ();
    
    VistaIngreso vIngreso;
    
    public void iniciar () {
        vIngreso = new VistaIngreso (this);
        
        miModelo.crearRepositorio();
        
        while (true) {
            miVista.mostrarMenu ();
            int opcion = miVista.leerOpcion();

            switch (opcion) {
                case 0: System.exit (0);
                case 1: adicionar (); break;
                case 2: eliminar (); break;
                case 3: buscar (); break;
                case 4: actualizar (); break;
                case 5: mostrarTodos ();break;
            } 
        }
    }
    
    public void adicionar () {
        System.out.println ("Adicionando...");
        //Estudiante e = miVista.leerEstudiante();
        vIngreso.setVisible (true);
        //miModelo.adicionarEstudiante(e);
        
    }
    public void eliminar () {
        System.out.println ("Eliminando...");
    }
    public void buscar () {
        System.out.println ("Buscando...");
    }
    public void actualizar () {
        System.out.println ("Actualizando...");
    }
    public void mostrarTodos () {
        System.out.println ("Mostrando...");
        ArrayList<Estudiante> listaEstudiantes = miModelo.obtenerTodos();
        
        miVista.mostrarTodos (listaEstudiantes);
    }
    
    public void estudianteIngresado (Estudiante e) {
        miModelo.adicionarEstudiante(e);
    }
    
}
