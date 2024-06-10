package src.modelo;

import java.time.LocalDate;

import src.iu.Menu;

public class Libro extends Producto{
    private int cantPaginas;

    @Override
    public void escanear(){
        super.escanear();
        System.out.println("Ingrese cantidad de paginas: ");
        cantPaginas = Menu.sc.nextInt();
        Menu.sc.nextLine();
    }


    public Libro(String titulo, String autor, LocalDate fechaPublicacion, int id, int cantPaginas) {
        super(titulo, autor, fechaPublicacion, id);
        this.cantPaginas = cantPaginas;
    }

    public Libro() {
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }


    
}
