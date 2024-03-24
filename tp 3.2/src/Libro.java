public class Libro {
    private String titulo;
    private float precio;
    private int stock;
    private Autor autor;
    
    
    public Libro(String titulo, float precio, int stock, Autor autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor = autor;
    }

    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }



    public String getTitulo() {
        return titulo;
    }
    public float getPrecio() {
        return precio;
    }
    public int getStock() {
        return stock;
    }
    public Autor getAutor() {
        return autor;
    }

    public void mostrar(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Precio: "+precio);
        System.out.println("Stock: "+stock);
        System.out.println("Autor:" + autor.getNombre() +" "+ autor.getApellido());
       
    }

    ///Manejo de Stock

    public void aumentarStock(int aumento){
        stock+=aumento;
    }
    public void disminuirStock(int disminucion){
        stock-=disminucion;
    }


    public void mostrarMensaje(){
        System.out.println("El libro, "+titulo+" de " +autor.getNombre()+" "+autor.getApellido()+". Se vende a "+precio+" pesos.");
    }
}

