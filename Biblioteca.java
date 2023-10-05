import java.util.LinkedList;

/**
 * Clase Biblioteca
 */
public class Biblioteca {
    /**
     * Lista para almacenar los libros disponibles
     */
    public LinkedList<Libro> librosDiponibles= new LinkedList<>();

    /***************************************************/
    /******************** Métodos ********************/
    /***************************************************/


    /**
     * Metodo para registrar libro
     * @param libro
     * Complejidad temporal: O(1) Tiempo constante
     * @return
     */

    public String registrarLibro(Libro libro){
        librosDiponibles.add(libro);
        return "Libro registrado exitosamente";
    }
    /**
     * Metodo para buscar libros
     * @param titulo
     * Complejidad temporal: O(N) Tiempo Lineal
     * @return
     */
    public String buscarLibro(String titulo){
        for (int i=0; i<librosDiponibles.size(); i++){
            Libro libro =librosDiponibles.get(i);
            if (libro.getTitulo().equals(titulo)) {
                return "El libro " + titulo + " está disponible en la biblioteca.";
            }

        }
        return "No hay ningun Libro con este titulo "+titulo ;
    }

    /**
     * Metodo para mostrar libros disponibles
     * @return
     * Complejidad Temporal : 0(1) Tiempo Constante
     */
    public LinkedList<Libro> mostrarLibrosDisponibles(){

        return librosDiponibles;

    }

}
