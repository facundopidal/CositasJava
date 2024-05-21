import java.util.HashMap;
import java.util.Map;

public class HashMapLibros {

    private Map<String, Libro> mapaLibros;

    public HashMapLibros() {
        mapaLibros = new HashMap<>();
    }

    public void agregarLibro(Libro aux){
        mapaLibros.put(aux.getTitulo(),aux);
    }

    public boolean eliminarLibro(String titulo){/// utilizamos titulo como clave

        if(mapaLibros.isEmpty() || !buscarLibro(titulo))
            return false;
        mapaLibros.remove(titulo);
        return true;
    }

    public boolean buscarLibro(String titulo){
        return mapaLibros.containsKey(titulo);
    }

    public boolean actualizarPrecioLibro(String titulo,int nuevoPrecio){
        if(mapaLibros.isEmpty() || !buscarLibro(titulo))
            return false;
        Libro libro = mapaLibros.get(titulo);
        libro.setPrecio(nuevoPrecio);
        return true;
    }

    public void mostrarLibros(){
        for (Libro libro : mapaLibros.values()) {
            System.out.println(libro.toString());
        }
    }

    public Libro encontrarLibroMasCaro(){
        if(mapaLibros.isEmpty())
            return null;
        
        Libro libroCaro = mapaLibros.values().iterator().next(); ///igualar al primero significa

        for (Libro libro : mapaLibros.values()) {
            if(libro.getPrecio() > libroCaro.getPrecio())
                libroCaro = libro;
        }
        return libroCaro;
    }

    public Libro encontrarLibroMasBarato(){
        if(mapaLibros.isEmpty())
            return null;
        
        Libro libroBarato = mapaLibros.values().iterator().next(); ///igualar al primero significa

        for (Libro libro : mapaLibros.values()) {
            if(libro.getPrecio() < libroBarato.getPrecio())
                libroBarato = libro;
        }
        return libroBarato;
    }
}
