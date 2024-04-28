package RRHH;
import Interfaces.*;
public class Repartidores  implements Sueldos{

    private static int VALOR_KM = 3;
    private String nombre;
    private String apellido;
    private double kmRecorridos;

    public Repartidores() {
    }

    public Repartidores(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.kmRecorridos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public double calcularSueldo(){
        return kmRecorridos * VALOR_KM;
    }

}
