import java.util.ArrayList;
import java.util.HashMap;
public class InventarioPorAutores {
    private static HashMap<String, ArrayList<Libro>> libros = new HashMap<>();
    public static boolean agregarLibro(Libro libro) {
        if(!libros.containsKey(libro.getAutor())){
            libros.put(libro.getAutor(), new ArrayList<Libro>());
            return libros.get(libro.getAutor()).add(libro);
        }
        if(libro.esValido())
            return libros.get(libro.getAutor()).add(libro);
        return false;
    }

    public static ArrayList<Libro> getLibrosPorAutor(String autor) {
        return libros.get(autor);
    } 

    public static Libro buscarLibro(String titulo, String autor) {
        for (Libro libro : libros.get(autor)) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) 
                return libro;
        }
        return null;
    }

    public static ArrayList<Libro> filtrarPorPrecios(double fromPrecio, double toPrecio) {
        ArrayList<Libro> librosFiltrados = new ArrayList<>();
        // Recorro la lista de libros de todos lo autores
        for(ArrayList<Libro> autores : libros.values()) {
            for(Libro libro : autores){
                if(libro.getPrecio() >= fromPrecio && libro.getPrecio() <= toPrecio)
                    librosFiltrados.add(libro);
            }
        }
        return librosFiltrados;
    }

    public static boolean actualizarPrecio(String titulo, String autor, double precio){
        Libro libro = buscarLibro(titulo, autor);
        if(libro!= null){
            libro.setPrecio(precio);
            return true;
        }
        return false;
    }

    public static HashMap<String, ArrayList<Libro>> getLibros() {
        return libros;
    }

    public static ArrayList<Libro> getListaLibros() {
        ArrayList<Libro> listaLibros = new ArrayList<>();
        for(ArrayList<Libro> autor : libros.values())
            listaLibros.addAll(autor);
        
        return listaLibros;
    }

    public static Libro eliminarLibro(String titulo, String autor) {
        Libro libro = buscarLibro(titulo, autor);
        if(libro!= null)
            libros.get(autor).remove(libro);
        
        return libro;
    }    

    public static int contarLibros() {
        int contador = 0;
        for(ArrayList<Libro> autor : libros.values())
            contador += autor.size();
        
        return contador;
    }

    public static double calcularPrecioTotal() {
        double total = 0;
        for(ArrayList<Libro> autor : libros.values()){
            for(Libro libro : autor)
                total += libro.getPrecio();
        }

        return total;
    }

    public static Libro getLibroCaro() {
        double masCaro = Double.MIN_VALUE; //minimo valor posible
        Libro libroCaro = null;

        for(ArrayList<Libro> autor : libros.values()){
            for(Libro libro : autor){
                if(libro.getPrecio() > masCaro){
                    masCaro = libro.getPrecio();
                    libroCaro = libro;
                }
            }
        }

        return libroCaro;
    }

    public static Libro getLibroBarato() {
        double masBarato = Double.MAX_VALUE; //maximo valor posible
        Libro libroBarato = null;

        for(ArrayList<Libro> autor : libros.values()){
            for(Libro libro : autor){
                if(libro.getPrecio() < masBarato){
                    masBarato = libro.getPrecio();
                    libroBarato = libro;
                }
            }
        }

        return libroBarato;
    }

    public static Libro[] getLibroCaroYBarato() {
        Libro[] libros = {getLibroCaro(), getLibroBarato()};
        return libros; 
    }

    
}
