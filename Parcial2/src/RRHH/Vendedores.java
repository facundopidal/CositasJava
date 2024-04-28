package RRHH;

import java.time.LocalDate;

public class Vendedores extends Empleado {
    
    private int montoMensual;
    
    public Vendedores(int legajo, String nombre, String apellido, String direccion, LocalDate fechaDeNacimiento) {
        super(legajo, nombre, apellido, direccion, fechaDeNacimiento);
        this.montoMensual = 0;
    }
    
    public Vendedores() {
    }
    
    public int getMontoMensual() {
        return montoMensual;
    }
    
    public void setMontoMensual(int montoMensual) {
        this.montoMensual = montoMensual;
    }
    
    @Override
    public String toString() {
        return "Vendedores [montoMensual=" + montoMensual + ", toString()=" + super.toString() + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + montoMensual;
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
        Vendedores other = (Vendedores) obj;
        if (montoMensual != other.montoMensual)
            return false;
        return true;
    }

    public double calcularSueldo(){
        return (double)montoMensual* 0.3;
    }


    

}
