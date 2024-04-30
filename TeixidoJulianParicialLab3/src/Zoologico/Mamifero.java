package Zoologico;

import java.util.ArrayList;

public class Mamifero extends Animal {

    private ArrayList<String> listaHabilidades = new ArrayList<>();
    private String tipoDePelaje; /// Me gustaria implementar un enum, pero no se absolutamente nada de pelajes
    private static int valoracionBase = 30;

    /// Constructor completo
    public Mamifero(String especie, String nombre, int edad, EstadosSalud estadoSalud,
            ArrayList<String> listaHabilidades, String tipoDePelaje) {
        super(especie, nombre, edad, estadoSalud);
        this.listaHabilidades = listaHabilidades;
        this.tipoDePelaje = tipoDePelaje;
    }
    /// Constructor por defecto

    public Mamifero() {
        listaHabilidades.add("Lista aun no desarrollada");
        tipoDePelaje = "Pelaje sin Especificar";
    }

    /// Getters y Setters
    public ArrayList<String> getListaHabilidades() {
        return listaHabilidades;
    }

    public void setListaHabilidades(ArrayList<String> listaHabilidades) {
        this.listaHabilidades = listaHabilidades;
    }

    public String getTipoDePelaje() {
        return tipoDePelaje;
    }

    public void setTipoDePelaje(String tipoDePelaje) {
        this.tipoDePelaje = tipoDePelaje;
    }

    public static int getValoracionBase() {
        return valoracionBase;
    }

    public static void setValoracionBase(int valoracionBase) {
        Mamifero.valoracionBase = valoracionBase;
    }

    @Override
    public String toString() {
        return "Mamifero [listaHabilidades=" + listaHabilidades + ", tipoDePelaje=" + tipoDePelaje + ", toString()="
                + super.toString() + "]";
    }

    /// Equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Mamifero other = (Mamifero) obj;
        if (listaHabilidades == null) {
            if (other.listaHabilidades != null)
                return false;
        } else if (!listaHabilidades.equals(other.listaHabilidades))
            return false;
        if (tipoDePelaje == null) {
            if (other.tipoDePelaje != null)
                return false;
        } else if (!tipoDePelaje.equals(other.tipoDePelaje))
            return false;
        return true;
    }

    
    ///Metodo Interfaz
    @Override
    public int calcularValoracion() {
        int valoracionActual = getValoracionBase();
        if (getEstadoSalud() == EstadosSalud.ESTUPENDO)/// Caso estupendo TRIPLICA
            return valoracionActual * 3;
        if (getEstadoSalud() == EstadosSalud.REGULAR)/// Caso regular duplica
            return valoracionActual * 2;
        return valoracionActual; ///Caso malo permacene valorBase
    }

}
