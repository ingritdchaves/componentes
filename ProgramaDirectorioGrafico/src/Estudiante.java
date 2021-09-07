
import java.io.Serializable;


public class Estudiante implements Serializable {
    // Atributos
    int codigo;
    String nombre;
    String programa;
    
    // Constructor
    public Estudiante (int cod, String nom, String prog) {
        codigo = cod;
        nombre = nom;
        programa = prog;
    }
    
    public int getCodigo () {
        return (codigo);
    }
    
    public String getNombre () {
        return (nombre);
    }
    
    public String getPrograma () {
        return (programa);
    }          
}
