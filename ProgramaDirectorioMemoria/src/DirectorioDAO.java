
import java.util.ArrayList;

public class DirectorioDAO implements DirectorioInterfaceDAO {
    // Atributo: Lista en Menoria
    ArrayList <Estudiante> miLista;
    
    public void crearRepositorio () {
        miLista = new ArrayList <Estudiante> ();
    }
    
    public void adicionarEstudiante (Estudiante e) {
        
        System.out.println ("Adicionando");
        miLista.add (e);
    }
    
    public void eliminarEstudiante (int codigo) {
        System.out.println ("Eliminado...");
    }
    
    public void buscarEstudiante (int codigo) {
        System.out.println ("Buscando...");
    }
    
    public void actualizarEstudiante (int codigo, Estudiante nuevo) {
        System.out.println ("Actualizando..");
    }
    
    public ArrayList obtenerTodos () {;
        return (miLista);
    }
}
