/**
 * Clase Libro
 */
public class Libro {
    /**
     * Atributos
     */
    private String titulo = "";
    private String autor = "";
    private int numeropaginas =0;


    /**
     * Constructor de la clase
     * @param titulo
     * @param autor
     * @param numeropaginas
     *
     * Complejida Temporal: 0(1) Tiempo Constante
     */
    public Libro (String titulo, String autor, int numeropaginas ){

        this.titulo=titulo;
        this.autor=autor;
        this.numeropaginas=numeropaginas;
    }
    /***************************************************/
    /******************** Métodos ********************/
    /***************************************************/

    /**
     * Método para obtener el titulo del libro
     * @return Retorna el titulo del libro
     *
     * Complejidad temporal: O(1) Tiempo constante
     */

    public String getTitulo(){
        return titulo;
    }
    /**
     * Método para obtener el autor del libro
     * @return Retorna el autor del libro
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public String getAutor(){
        return autor;
    }
    /**
     * Método para obtener el numero de paginas del libro
     * @return Retorna el número de paginas
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public int getNumeropaginas(){
        return numeropaginas;
    }
    /**
     * Método para modificar el titulo del libro
     * Complejidad temporal: O(1) Tiempo constante
     */

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    /**
     * Método para modificar el autor del libro
     * Complejidad temporal: O(1) Tiempo constante
     */
    public void setAutor(String autor){
        this.autor= autor;
    }
    /**
     * Método para modificar el numero de paginas del libro
     * Complejidad temporal: O(1) Tiempo constante
     */
    public void setNumeropaginas(){
        this.numeropaginas= numeropaginas;
    }

}