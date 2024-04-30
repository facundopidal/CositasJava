package animales;
import interfaces.Valorable;
import java.util.Objects;

public abstract class Animal implements Valorable{
    protected String especie;
    protected String nombre;
    protected int edad;
    protected EstadoSalud estadoSalud;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return edad == animal.edad && Objects.equals(especie, animal.especie) && Objects.equals(nombre, animal.nombre) && estadoSalud == animal.estadoSalud;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", estadoSalud=" + estadoSalud +
                '}';
    }

    public Animal(String especie, String nombre, int edad, EstadoSalud estadoSalud) {
        this.especie = especie;
        this.nombre = nombre;
        this.edad = edad;
        this.estadoSalud = estadoSalud;
    }


    public Animal(){
        especie = "Perro";
        nombre = "Firu";
        edad = 1;
        estadoSalud = EstadoSalud.REGULAR;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public EstadoSalud getEstadoSalud() {
        return estadoSalud;
    }

    public void setEstadoSalud(EstadoSalud estadoSalud) {
        this.estadoSalud = estadoSalud;
    }
}
