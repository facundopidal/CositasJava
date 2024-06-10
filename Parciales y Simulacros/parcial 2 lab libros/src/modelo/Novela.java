package src.modelo;

import java.time.LocalDate;

import src.iu.Menu;

public class Novela extends Producto{
    private int cantCapitulos;

    @Override
    public void escanear(){
        super.escanear();
        System.out.println("Ingrese cantidad de capitulos: ");
        cantCapitulos = Menu.sc.nextInt();
        Menu.sc.nextLine();
    }

    public Novela(String titulo, String autor, LocalDate fechaPublicacion, int id, int cantCapitulos) {
        super(titulo, autor, fechaPublicacion, id);
        this.cantCapitulos = cantCapitulos;
    }

    public Novela() {
    }

    public int getCantCapitulos() {
        return cantCapitulos;
    }

    public void setCantCapitulos(int cantCapitulos) {
        this.cantCapitulos = cantCapitulos;
    }

    
    
}
