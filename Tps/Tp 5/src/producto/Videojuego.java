package producto;

public class Videojuego extends Producto {
    private final int  horasDefault = 10;

    private int horasEstimadas;
    private String compañia;

    @Override
    public int compareTo(Object a) {
        if(this.getClass() == a.getClass()) {
            Videojuego videojuego = (Videojuego) a;
            return(videojuego.horasEstimadas == horasEstimadas ? 0 : (videojuego.horasEstimadas > horasEstimadas ? -1 : 1));
        }
        else return -404;
    }

    @Override
    public String toString() {
        return "Videojuego [horasEstimadas=" + horasEstimadas + ", compañia=" + compañia + ", isEntregado()="
                + isEntregado() + ", getTitulo()=" + getTitulo() + ", getGenero()=" + getGenero() + "]";
    }
    
    //Constructores

    public Videojuego() {
        horasEstimadas = horasDefault;
        compañia = "Empresa de videojuegos";
    }
    
    public Videojuego(String titulo, int horasEstimadas) {
        super(titulo);
        this.horasEstimadas = horasEstimadas;
        compañia = "Empresa de videojuegos";
    }
    public Videojuego(String titulo, String genero, int horasEstimadas, String compañia) {
        super(titulo, genero);
        this.horasEstimadas = horasEstimadas;
        this.compañia = compañia;
    }
    
    //Getters y setters

    public int getHorasEstimadas() {
        return horasEstimadas;
    }
    
    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }
    
    public String getCompañia() {
        return compañia;
    }
    
    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }
    
}
