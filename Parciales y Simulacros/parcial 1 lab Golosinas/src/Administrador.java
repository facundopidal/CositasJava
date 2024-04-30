public class Administrador extends Empleado {
    private String area;

    @Override
    public double calcularSalario() {
        return 15;
    }

    @Override
    public String toString() {
        return "Administrador [legajo=" + legajo + ", area=" + area + ", nombre=" + nombre + ", apellido=" + apellido
                + ", direccion=" + direccion + ", fechaNac=" + fechaNac + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Administrador other = (Administrador) obj;
        if (area == null) {
            if (other.area != null)
                return false;
        } else if (!area.equals(other.area))
            return false;
        return true;
    }

    public Administrador(int legajo, String nombre, String apellido, String direccion, String fechaNac, String area) {
        super(legajo, nombre, apellido, direccion, fechaNac);
        this.area = area;
    }

    public Administrador() {
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    
}
