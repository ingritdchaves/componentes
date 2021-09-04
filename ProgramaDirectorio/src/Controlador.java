
public class Controlador {
    // Atributos
    Vista miVista = new Vista ();
    
    public void iniciar () {
        
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
    }
    
}
