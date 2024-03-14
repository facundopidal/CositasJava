public class Libro {
    private String titulo;
    private String autor;
    private int año;
    private String genero;
    private int cantPaginas;

    public Libro(String titulo, String autor, int año, String genero, int cantPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.genero = genero;
        this.cantPaginas = cantPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    public void mostrarLibro() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Año de publicación: " + año);
        System.out.println("Género: " + genero);
        System.out.println("Autor: " + autor);
        System.out.println("Pags: " + cantPaginas + "\n");
    }
    
    public void mostrarMuchasPags() {
        System.out.println(cantPaginas > 500 ? cantPaginas : "Coño eto e muy pequeño");
    }
}
