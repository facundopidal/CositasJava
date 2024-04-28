package RRHH;

import java.time.LocalDate;

public class Administradores extends Empleado{

    private static int SUELDO = 15;
    private AreasDeTrabajo area;

    public Administradores() {
    }

    public Administradores(int legajo, String nombre, String apellido, String direccion, LocalDate fechaDeNacimiento,
            AreasDeTrabajo area) {
        super(legajo, nombre, apellido, direccion, fechaDeNacimiento);
        this.area = area;
    }

    @Override
    public String toString() {
        return "Administradores [area=" + area + ", toString()=" + super.toString() + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((area == null) ? 0 : area.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Administradores other = (Administradores) obj;
        if (area != other.area)
            return false;
        return true;
    }

    public double calcularSueldo(){
        return SUELDO;
    }

}
