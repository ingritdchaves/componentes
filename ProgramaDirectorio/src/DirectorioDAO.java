
import java.util.ArrayList;

public class DirectorioDAO implements DirectorioInterfaceDAO {
    
    public void crearRepositorio () {
        System.out.println ("Creando..");
    }
    
    public void adicionarEstudiante (Estudiante e) {
        System.out.println ("Adicionando");
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
    
    public ArrayList obtenerTodos () {
        System.out.println ("Obteniendo");
        return (null);
    }
}
