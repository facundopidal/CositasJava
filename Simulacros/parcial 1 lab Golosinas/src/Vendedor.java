public class Vendedor extends Empleado {
    private int montoVenta;

    @Override
    public double calcularSalario() {
        return 0.3 * montoVenta;
    }

    @Override
    public String toString() {
        return "Vendedor [legajo=" + legajo + ", montoVenta=" + montoVenta + ", nombre=" + nombre + ", apellido="
                + apellido + ", direccion=" + direccion + ", fechaNac=" + fechaNac + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vendedor other = (Vendedor) obj;
        if (montoVenta != other.montoVenta)
            return false;
        return true;
    }

    public Vendedor(int legajo, String nombre, String apellido, String direccion, String fechaNac, int montoVenta) {
        super(legajo, nombre, apellido, direccion, fechaNac);
        this.montoVenta = montoVenta;
    }

    public Vendedor() {
    }

    public int getMontoVenta() {
        return montoVenta;
    }

    public void setMontoVenta(int montoVenta) {
        this.montoVenta = montoVenta;
    }

}
