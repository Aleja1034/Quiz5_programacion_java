import java.util.LinkedList;

/**
 * Clase Biblioteca
 */
public class Biblioteca {
    // se utilizo una LinkedList para lamacenar los libos disponibles. 
    
    LinkedList<Libro> librosDisponibles = new LinkedList<Libro>();

    // Método para registrar un libro en la biblioteca.
    // Complejidad temporal: 0(1) - operación de tiempo constante.

    public void registrarLibro (Libro libro)
    {
        librosDisponibles.add(libro);
    }
    // Metodo para buscar un libro pot título 
    // complejidad temporal: 0(n)
    public Libro buscarLibro(String titulo)
    {
        for (int i = 0; i < librosDisponibles.size(); i = i + 1)
        {
            // se obtiene el libro en la posición i.
            
            Libro libro1 = librosDisponibles.get(i);
            
            // se compara el titulo del libro en la posición i.
            if (titulo.equals(libro1.getTitulo()))
            {
                // si coincide, devolvemos el libro encontrado
                
                return libro1;
            }
        }
        //si no se encuentra nungún libro con el título buscado, devolvemos null.
        
        return null;
        
    }
    
    // Mé todo para obtener la lista de los libros disponibles.
    // Complejidad temporal: 0(1) - operaqción de tiempo constante.
    
    public LinkedList<Libro> getLibrosDisponibles()
    {
        return librosDisponibles;
    }

}
