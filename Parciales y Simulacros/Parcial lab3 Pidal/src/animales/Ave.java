package animales;

import java.util.Objects;

public class Ave extends Animal {
    private String tipoPlumaje;
    private boolean migratoria;

    @Override
    public double calcularValoracion() {
        if(estadoSalud == EstadoSalud.MALO)
            return 5;
        if(estadoSalud == EstadoSalud.ESTUPENDO)
            return 20;

        return 10;
    }
    @Override
    public String toString() {
        return "Ave{" +
                "tipoPlumaje='" + tipoPlumaje + '\'' +
                ", migratoria=" + migratoria +
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
        Ave ave = (Ave) o;
        return migratoria == ave.migratoria && Objects.equals(tipoPlumaje, ave.tipoPlumaje);
    }

    public Ave(String especie, String nombre, int edad, EstadoSalud estadoSalud, String tipoPlumaje, boolean migratoria) {
        super(especie, nombre, edad, estadoSalud);
        this.tipoPlumaje = tipoPlumaje;
        this.migratoria = migratoria;
    }

    public Ave() {
        tipoPlumaje = "Normal";
        migratoria = false;
    }

    public String getTipoPlumaje() {
        return tipoPlumaje;
    }

    public void setTipoPlumaje(String tipoPlumaje) {
        this.tipoPlumaje = tipoPlumaje;
    }

    public boolean isMigratoria() {
        return migratoria;
    }

    public void setMigratoria(boolean migratoria) {
        this.migratoria = migratoria;
    }
}
