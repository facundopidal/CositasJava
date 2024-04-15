package producto;

public abstract class Producto {
    private final boolean entregadoDefault = false;

    private String titulo;
    private boolean entregado;
    private String genero;

    public void entregar() {
        entregado = true;
    }

    public void devolver() {
        entregado = false;
    }

    public boolean isEntregado() {
       return entregado;
    }

    public abstract int compareTo(Object a);

    public Producto() {
        titulo = "Producto a alquilar";
        entregado = entregadoDefault;
        genero = "Genero";
    }

    public Producto(String titulo) {
        this.titulo = titulo;
        entregado = entregadoDefault;
        genero = "Genero";
    }

    public Producto(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
        entregado = entregadoDefault;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
}
