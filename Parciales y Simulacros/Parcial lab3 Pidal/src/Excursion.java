import interfaces.Valorable;

import java.util.Arrays;
import java.util.Objects;

public class Excursion implements Valorable {
    private boolean finDeSemana;
    private String nombreExcursion;
    private String[] listaActividades;

    @Override
    public double calcularValoracion() {
        if (finDeSemana)
            return 100;

        return 50;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Excursion excursion = (Excursion) o;
        return finDeSemana == excursion.finDeSemana && Objects.equals(nombreExcursion, excursion.nombreExcursion) && Arrays.equals(listaActividades, excursion.listaActividades);
    }

    public Excursion(boolean finDeSemana, String nombreExcursion, String[] listaActividades) {
        this.finDeSemana = finDeSemana;
        this.nombreExcursion = nombreExcursion;
        this.listaActividades = listaActividades;
    }

    public Excursion() {
        finDeSemana = false;
        nombreExcursion = "Paseo";
        listaActividades = new String[3];
    }

    public boolean isFinDeSemana() {
        return finDeSemana;
    }

    public void setFinDeSemana(boolean finDeSemana) {
        this.finDeSemana = finDeSemana;
    }

    public String getNombreExcursion() {
        return nombreExcursion;
    }

    public void setNombreExcursion(String nombreExcursion) {
        this.nombreExcursion = nombreExcursion;
    }

    public String[] getListaActividades() {
        return listaActividades;
    }

    public void setListaActividades(String[] listaActividades) {
        this.listaActividades = listaActividades;
    }
}
