package animales;

import java.util.Objects;

public class Reptil extends Animal{
    private String tipoEscamas;
    private boolean venenoso;

    @Override
    public double calcularValoracion() {
        if(estadoSalud == EstadoSalud.ESTUPENDO)
            return 75;

        return 25;
    }

    @Override
    public String toString() {
        return "Reptil{" +
                "tipoEscamas='" + tipoEscamas + '\'' +
                ", venenoso=" + venenoso +
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
        Reptil reptil = (Reptil) o;
        return venenoso == reptil.venenoso && Objects.equals(tipoEscamas, reptil.tipoEscamas);
    }

    public Reptil(String especie, String nombre, int edad, EstadoSalud estadoSalud, String tipoEscamas, boolean venenoso) {
        super(especie, nombre, edad, estadoSalud);
        this.tipoEscamas = tipoEscamas;
        this.venenoso = venenoso;
    }

    public Reptil() {
        tipoEscamas = "Normal";
        venenoso = false;
    }

    public String getTipoEscamas() {
        return tipoEscamas;
    }

    public void setTipoEscamas(String tipoEscamas) {
        this.tipoEscamas = tipoEscamas;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }
}
