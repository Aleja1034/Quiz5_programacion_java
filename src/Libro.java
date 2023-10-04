/* clase Libro*/
public class Libro {
    /**
     * Atributos
     **/

    private String Titulo;
    private String Autor;
    private int NumeroPaginas;

    /**
     * Metodos
     **/

    public Libro(String Titulo, String Autor, int numeroPaginas) {
        Titulo = Titulo;
        Autor = Autor;
        NumeroPaginas = 0;
    }
    /**
     * Método constuctor para inicializar los atributos de la clase
     * @param Titulo es el titulo del Libro
     * Se almacena el titulo del libro luego del ingreso por consola.
     * @param Autor es el autor del Libro
     * Se almacena el autor del libro luego de el ingreso por consola.
     * @param NumeroPaginas es el numero de paginas del Libro
     * S e almacena el número de paginas del libro luego del ingreso por consola.
     *
     * Complejidad temporal: O(1) Tiempo constante
     */


    /* Getter*/

    /**
    *Método ara obtener el tiitulo del libro
    * @return Retorna el titulo del libro
    *
    * Complejidad temporal: 0(1) Tiempo constante
     */
    public String getTitulo() {
        return Titulo;
    }
    /**
     * Método para obtener el autor del libro
     * @return Retorna el autor del libro
     *
     * Complejidad temporal: O(1) Tiempo constante
     */

    public String getAutor() {
        return Autor;
    }
    /**
     * Método para obtener el numero de paginas del libro
     * @return Retorna el numero de paginas del libro
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public int getNumeroPaginas() {
        return NumeroPaginas;
    }

    /* Setter */

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public void setAutor(String autor) {
        this.Autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.NumeroPaginas = numeroPaginas;
    }
}
