package producto;

public class Serie extends Producto {
    private int temporadas;
    private String creador;

    @Override
    public int compareTo(Object a) {
        Serie serie = (Serie) a;
        return (serie.temporadas == temporadas) ? 0 : (serie.temporadas > temporadas ? -1 : 1);
    }

    @Override
    public String toString() {
        return "Serie [temporadas=" + temporadas + ", creador=" + creador + ", isEntregado()=" + isEntregado()
                + ", getTitulo()=" + getTitulo() + ", getGenero()=" + getGenero() + "]";
    }

    //Constructores

    public Serie() {
        temporadas = 0;
        creador = "Creador de la serie";
    }

    public Serie(String titulo, String creador) {
        super(titulo);
        temporadas = 0;
        this.creador = creador;
    }

    public Serie(String titulo, String genero, int temporadas, String creador) {
        super(titulo, genero);
        this.temporadas = temporadas;
        this.creador = creador;
    }

    //Getters y setters

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }
    
}
