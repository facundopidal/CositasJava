public abstract class Empleado {
    private String nombre;
    protected float salario;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    public abstract float calcularPago();

    public String getNombre(){
        return nombre;
    }
}
