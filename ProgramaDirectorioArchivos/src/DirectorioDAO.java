
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DirectorioDAO implements DirectorioInterfaceDAO {
    // Atributo: Lista en Menoria
    ArrayList <Estudiante> miLista;
    
    public void crearRepositorio () {
        miLista = new ArrayList <Estudiante> ();
        recuperarse ();
    }
    
    public void adicionarEstudiante (Estudiante e) {
        
        System.out.println ("Adicionando");
        miLista.add (e);
        guardarse ();
    }
    
    public void eliminarEstudiante (int codigo) {
        System.out.println ("Eliminado...");
        guardarse();
    }
    
    public void buscarEstudiante (int codigo) {
        System.out.println ("Buscando...");
    }
    
    public void actualizarEstudiante (int codigo, Estudiante nuevo) {
        System.out.println ("Actualizando..");
        guardarse ();
    }
    
    public ArrayList obtenerTodos () {;
        return (miLista);
    }
    
    private void guardarse() {
        FileOutputStream fileOutputStream
                = null;
        try {
            fileOutputStream = new FileOutputStream("datos.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            
            //int N = miLista.size ();
            //objectOutputStream.writeObject(N);
            objectOutputStream.writeObject(miLista);
            
            
            
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DirectorioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DirectorioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(DirectorioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    private void recuperarse() {
        FileInputStream fileInputStream
                = null;
        try {
            fileInputStream = new FileInputStream("datos.dat");
            ObjectInputStream objectInputStream
                    = new ObjectInputStream(fileInputStream);
            
            
            miLista = (ArrayList<Estudiante>) objectInputStream.readObject();
//             Person p2 = (Person) objectInputStream.readObject();
          
            
            
            
            objectInputStream.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DirectorioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DirectorioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DirectorioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(DirectorioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
