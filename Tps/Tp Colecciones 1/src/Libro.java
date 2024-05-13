public class Libro {
    private String titulo;
    private String autor;
    private int anio;
    private double precio;

    public boolean esValido(){
        if(titulo.equals("Titulo invalido")) return false;
        if(autor.equals("Autor invalido")) return false;
        if(anio == -1) return false;
        if(precio == -1) return false;

        return true;
    }
    private boolean validarString(String string){
        if(string.equals("")) return false;
        if(string.charAt(0) == ' ') return false;
        for(int i=0; i<string.length(); i++){
            if(!Character.isLetter(string.charAt(i)) && string.charAt(i) != ' ')
                return false;
        }   
        return true;
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", anio=" + anio + ", precio=" + precio + "]";
    }

    public Libro(){
        this.titulo = "Titulo invalido";
        this.autor = "Autor invalido";
        this.anio = -1;
        this.precio = -1;
    }

    public Libro(String titulo, String autor, int anio, double precio) {
        this.titulo = validarString(titulo) ? titulo : "Titulo invalido";
        this.autor = validarString(autor) ? autor : "Autor invalido";
        this.anio = anio > 0 && anio < 2025 ? anio : -1;
        this.precio = precio > 0 ? precio : -1; 
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = validarString(titulo) ? titulo : "Titulo invalido";
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = validarString(autor) ? autor : "Autor invalido";
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio > 1900 && anio < 2025 ? anio : -1;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio > 0 ? precio : -1;
    }
    
}
