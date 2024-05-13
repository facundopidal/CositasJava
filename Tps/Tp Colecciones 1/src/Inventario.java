import java.util.ArrayList;

public abstract class Inventario {
    private static ArrayList<Libro> libros = new ArrayList<>();

    public static boolean agregarLibro(Libro libro) {
        if(libro.esValido())
            return libros.add(libro);

        return false;
    }

    public static ArrayList<Libro> buscarPorTitulo(String titulo) {
        ArrayList<Libro> resultado = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) 
                resultado.add(libro);
        }
        return resultado;
    }

    public static ArrayList<Libro> buscarPorAutor(String autor) {
        ArrayList<Libro> resultado = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAutor().equalsIgnoreCase(autor)) 
                resultado.add(libro);
        }
        return resultado;
    }

    public static ArrayList<Libro> buscarPorAnio(int anio) {
        ArrayList<Libro> resultado = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAnio() == anio) 
                resultado.add(libro);
        }
        return resultado;
    }

    public static ArrayList<Libro> filtrarPorPrecio(int fromPrecio, int toPrecio) {
        ArrayList<Libro> resultado = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getPrecio() >= fromPrecio && libro.getPrecio() <= toPrecio) 
                resultado.add(libro);
        }
        return resultado;
    }

    //Actualizar el precio de un libro
    public static boolean actualizarPrecio(String titulo, String autor, double precio) {
        ArrayList<Libro> libros = buscarPorTitulo(titulo);
        boolean encontrado = false;
        if(libros.isEmpty()) return false;
        for (Libro libro : libros) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                libro.setPrecio(precio);
                encontrado = true;
            }
        }
        return encontrado;
    }

    public static ArrayList<Libro> getLibros() {
        return libros;
    }

    public static Libro eliminarLibro(String titulo, String autor) {
        ArrayList<Libro> libros = buscarPorTitulo(titulo);
        Libro libro = null;
        for (Libro l : libros) {
            if (l.getAutor().equalsIgnoreCase(autor)) 
                libro = l;
        }
        return Inventario.libros.remove(libro) ? libro : null; //Retorna libro si lo borra y null si no lo borra
        //uso Inventario.libros porque libros es la lista local
    }

    public static void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    public static int contarLibros(){
        return libros.size();
    }

    public static double calcularPrecioTotal() {
        double total = 0;
        for (Libro libro : libros) 
            total += libro.getPrecio();
        
        return total;
    }

    //Encontrar el libro mas caro y el mas barato

    public static Libro[] getLibroCaroYBarato() {
        Libro[] libros = {getLibroCaro(), getLibroBarato()};
        return libros; 
    }

    public static Libro getLibroCaro() {
        Libro masCaro = libros.get(0);
        for (Libro libro : libros) {
            if (libro.getPrecio() > masCaro.getPrecio()) 
                masCaro = libro;
        }
        return masCaro;
    } 

    public static Libro getLibroBarato() {
        Libro masBarato = libros.get(0);
        for (Libro libro : libros) {
            if (libro.getPrecio() < masBarato.getPrecio()) 
                masBarato = libro;
        }
        return masBarato;
    }
    
}

