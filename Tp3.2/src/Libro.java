public class Libro {
    private String titulo;
    private float precio;
    private int stock;
    private Autor autor;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public Libro(String titulo, float precio, int stock, Autor autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor = autor;
    }

    public void aumentarStock(int sumaStock){
        stock += sumaStock;
    }
    
    public void reducirStock(int restaStock){
        stock -= restaStock;
    }

    public void mostrar(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
        System.out.println("Autor: " + autor.getNombre() + autor.getApellido());
    }

    public void imprimirMensaje(){
        System.out.println("El libro, " + titulo + " de "+ autor.getNombre() + ", se vende a " + precio + " pesos.");
    }

}
