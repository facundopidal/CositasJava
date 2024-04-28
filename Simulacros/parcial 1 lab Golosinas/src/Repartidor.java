public class Repartidor implements Trabajadores {
    private String nombre;
    private String apellido;
    private double kmRecorridos;

    @Override
    public double calcularSalario() {
        return 3 * kmRecorridos;
    }

    @Override
    public String toString() {
        return "Repartidor [kmRecorridos=" + kmRecorridos + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Repartidor other = (Repartidor) obj;
        if (kmRecorridos != other.kmRecorridos)
            return false;
        return true;
    }

    public Repartidor(String nombre, String apellido, double kmRecorridos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.kmRecorridos = kmRecorridos;
    }

    public Repartidor() {
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
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

    
    
}
