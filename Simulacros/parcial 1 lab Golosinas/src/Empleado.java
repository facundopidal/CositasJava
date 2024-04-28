public abstract class Empleado implements Trabajadores {
    protected int legajo;
    protected String nombre;
    protected String apellido;
    protected String direccion;
    protected String fechaNac;

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
        if (fechaNac == null) {
            if (other.fechaNac != null)
                return false;
        } else if (!fechaNac.equals(other.fechaNac))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Empleado [legajo=" + legajo + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion="
                + direccion + ", fechaNac=" + fechaNac + "]";
    }

    public Empleado(int legajo, String nombre, String apellido, String direccion, String fechaNac) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.fechaNac = fechaNac;
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
    public String getFechaNac() {
        return fechaNac;
    }
    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    
}
