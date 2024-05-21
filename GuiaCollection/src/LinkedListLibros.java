import java.util.LinkedList;

public class LinkedListLibros {

    private LinkedList<Libro> listaLibros;

    public LinkedListLibros() {
        listaLibros = new LinkedList<>();
    }

    public boolean agregarLibro(Libro aux){
        if(buscarLibroTituloYAutor(aux.getTitulo(), aux.getAutor()) != null)
            return false;
        return listaLibros.add(aux);
    }
    
    /// nos aseguramos sobre libros con el mismo nombre de dif autores
    public Libro buscarLibroTituloYAutor(String titulo,String autor){

        for (Libro libro : listaLibros) {
            if(libro.getTitulo().equalsIgnoreCase(titulo) && libro.getAutor().equalsIgnoreCase(autor))
                return libro;
        }
        return null;
    }

    public boolean eliminarLibro(String titulo,String autor){
        Libro aEliminar = buscarLibroTituloYAutor(titulo, autor);
        if(aEliminar == null)
            return false;
        listaLibros.remove(aEliminar);
        return true;
    }

    public void mostrarLibros(){
        for (Libro libro : listaLibros) {
            System.out.println(libro.toString());
        }
    }
    
    public int contarLibros(){
        return listaLibros.size();
    }

    public int calcularPrecioTotal(){
        int total=0;
        for (Libro libro : listaLibros) {
            total += libro.getPrecio();
        }
        return total;
    }

    public  Libro encontrarLibroMasCaro(){
        if( listaLibros.isEmpty())
            return null;

        Libro caro = listaLibros.getFirst();
        for (Libro libro : listaLibros) {
            if(libro.getPrecio() > caro.getPrecio())
                caro = libro;
        }
        return caro;
    }

    public Libro encontrarLibroMasBarato(){
        if(listaLibros.isEmpty())
            return null;
        
        Libro barato = listaLibros.getFirst();
        for (Libro libro : listaLibros) {
            if(libro.getPrecio() < barato.getPrecio())
                barato = libro;
        }
        return barato;
    }

    public boolean actualizarPrecioLibro(String titulo,String autor,int nuevoPrecio){
        if(listaLibros.isEmpty())return false;
        
        Libro aMod = buscarLibroTituloYAutor(titulo, autor);
        if(aMod == null)
            return false;

        aMod.setPrecio(nuevoPrecio);
        return true;
    }

    public LinkedList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(LinkedList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }



}
