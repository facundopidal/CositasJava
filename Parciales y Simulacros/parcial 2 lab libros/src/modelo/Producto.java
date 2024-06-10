package src.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import src.interfaces.Identificable;
import src.iu.Menu;

public abstract class Producto implements Identificable{
    protected String titulo;
    protected String autor;
    protected LocalDate fechaPublicacion;
    protected int id;

     public void escanear() {
        System.out.println("Ingrese el título del producto:");
        titulo = Menu.sc.nextLine();

        System.out.println("Ingrese el autor del producto:");
        autor = Menu.sc.nextLine();

        System.out.println("Ingrese la fecha de publicación del producto (formato: yyyy-MM-dd):");
        String fechaStr = Menu.sc.nextLine();
        fechaPublicacion = LocalDate.parse(fechaStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        System.out.println("Ingrese el ID del producto:");
        id = Menu.sc.nextInt();

        Menu.sc.nextLine();

    }

    public Producto(){
    }

    public Producto(String titulo, String autor, LocalDate fechaPublicacion, int id) {
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.id = id;
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
    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }
    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return '{' + "Titulo: " + getTitulo() + "Autor: " + getAutor() + "ID: " + getId() + '}';
    }
}
