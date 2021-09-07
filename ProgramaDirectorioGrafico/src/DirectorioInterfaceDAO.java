
import java.util.ArrayList;

public interface DirectorioInterfaceDAO {
    public void crearRepositorio ();
    public void adicionarEstudiante (Estudiante e);
    public void eliminarEstudiante (int codigo);
    public void buscarEstudiante (int codigo);
    public void actualizarEstudiante (int codigo, Estudiante nuevo);
    public ArrayList obtenerTodos ();
}
