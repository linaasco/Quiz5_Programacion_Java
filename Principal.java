/**
 * Primera clase principal en ser ejecutada
 */
public class Principal {

    /**
     * Primer método que se ejecuta en mi aplicación
     * @param args
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public static void main(String[] args) {

        Biblioteca bibliotecaKonradLorenz = new Biblioteca();
        Libro Libro1 = new Libro("Cien años de soledad","Gabriel García Márquez",496);
        Libro Libro2 = new Libro("El codigo de Da Vinci","Dan Brown",656);
        Libro Libro3 = new Libro("1984","George Orwell",326);
        Libro Libro4 = new Libro("El Hobbit","J.R.R. Tolkien",310);
        Libro Libro5 = new Libro("La Odisea","Homero",448);

        bibliotecaKonradLorenz.registrarLibro(Libro1);
        bibliotecaKonradLorenz.registrarLibro(Libro2);
        bibliotecaKonradLorenz.registrarLibro(Libro3);
        bibliotecaKonradLorenz.registrarLibro(Libro4);
        bibliotecaKonradLorenz.registrarLibro(Libro5);

        System.out.println(bibliotecaKonradLorenz.buscarLibro("1984"));
        System.out.println(bibliotecaKonradLorenz.buscarLibro("Demian"));

        System.out.println(bibliotecaKonradLorenz.mostrarLibrosDisponibles());

    }
}
