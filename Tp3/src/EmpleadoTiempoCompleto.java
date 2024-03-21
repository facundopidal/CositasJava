public class EmpleadoTiempoCompleto extends Empleado{

    public EmpleadoTiempoCompleto(String nombre, float salario) {
        super(nombre);
        this.salario = salario;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    @Override
    public float calcularPago() {
        return salario;
    }
}
