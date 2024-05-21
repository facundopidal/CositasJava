public class Libro {

    private String titulo;
    private String Autor;
    private int precio;
    private int anioPubli;
    
    public Libro(String titulo, String autor, int precio, int anioPubli) {
        this.titulo = titulo;
        Autor = autor;
        this.precio = precio;
        this.anioPubli = anioPubli;
    }

    public Libro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getAnioPubli() {
        return anioPubli;
    }

    public void setAnioPubli(int anioPubli) {
        this.anioPubli = anioPubli;
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", Autor=" + Autor + ", precio=" + precio + ", anioPubli=" + anioPubli + "]";
    }

    
}
