package animales;

import java.util.Arrays;
import java.util.Objects;

public class Mamifero extends Animal{
    private String[] listaHabilidades;
    private String tipoPelaje;

    @Override
    public double calcularValoracion() {
        if(estadoSalud == EstadoSalud.REGULAR)
            return 60;
        if (estadoSalud == EstadoSalud.ESTUPENDO)
            return 90;

        return 30;
    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "listaHabilidades=" + Arrays.toString(listaHabilidades) +
                ", tipoPelaje='" + tipoPelaje + '\'' +
                ", especie='" + especie + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", estadoSalud=" + estadoSalud +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mamifero mamifero = (Mamifero) o;
        return Arrays.equals(listaHabilidades, mamifero.listaHabilidades) && Objects.equals(tipoPelaje, mamifero.tipoPelaje);
    }
    public Mamifero(String especie, String nombre, int edad, EstadoSalud estadoSalud, String[] listaHabilidades, String tipoPelaje) {
        super(especie, nombre, edad, estadoSalud);
        this.listaHabilidades = listaHabilidades;
        this.tipoPelaje = tipoPelaje;
    }

    public Mamifero() {
        listaHabilidades = new String[3];
        tipoPelaje = "Normal";
    }

    public String[] getListaHabilidades() {
        return listaHabilidades;
    }

    public void setListaHabilidades(String[] listaHabilidades) {
        this.listaHabilidades = listaHabilidades;
    }

    public String getTipoPelaje() {
        return tipoPelaje;
    }

    public void setTipoPelaje(String tipoPelaje) {
        this.tipoPelaje = tipoPelaje;
    }
}
