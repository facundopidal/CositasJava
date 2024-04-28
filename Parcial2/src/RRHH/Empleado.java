package RRHH;
import Interfaces.*;
import java.time.LocalDate;


public abstract class Empleado implements Sueldos{

protected int legajo;
protected String nombre;
protected String apellido;
protected String direccion;
protected LocalDate fechaDeNacimiento;


public Empleado(int legajo, String nombre, String apellido, String direccion, LocalDate fechaDeNacimiento) {
    this.legajo = legajo;
    this.nombre = nombre;
    this.apellido = apellido;
    this.direccion = direccion;
    this.fechaDeNacimiento = fechaDeNacimiento;
}


public Empleado() {
}


public int getLegajo() {
    return legajo;
}


public void setLegajo(int legajo) {
    this.legajo = legajo;
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


public String getDireccion() {
    return direccion;
}


public void setDireccion(String direccion) {
    this.direccion = direccion;
}


public LocalDate getFechaDeNacimiento() {
    return fechaDeNacimiento;
}


public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
    this.fechaDeNacimiento = fechaDeNacimiento;
}


@Override
public String toString() {
    return "Empleado [legajo=" + legajo + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
            + ", fechaDeNacimiento=" + fechaDeNacimiento + "]";
}


@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + legajo;
    result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
    result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
    result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
    result = prime * result + ((fechaDeNacimiento == null) ? 0 : fechaDeNacimiento.hashCode());
    return result;
}


@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Empleado other = (Empleado) obj;
    if (legajo != other.legajo)
        return false;
    if (nombre == null) {
        if (other.nombre != null)
            return false;
    } else if (!nombre.equals(other.nombre))
        return false;
    if (apellido == null) {
        if (other.apellido != null)
            return false;
    } else if (!apellido.equals(other.apellido))
        return false;
    if (direccion == null) {
        if (other.direccion != null)
            return false;
    } else if (!direccion.equals(other.direccion))
        return false;
    if (fechaDeNacimiento == null) {
        if (other.fechaDeNacimiento != null)
            return false;
    } else if (!fechaDeNacimiento.equals(other.fechaDeNacimiento))
        return false;
    return true;
}






}
