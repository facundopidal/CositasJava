public class EmpleadoPorHoras extends Empleado{

    private static int cantHoras = 0;
    private float valorHora;
    
    public EmpleadoPorHoras(String nombre, float valorHora) {
        super(nombre);
        this.valorHora = valorHora;
    }

    public void agregarHoras(int horasASumar){
        cantHoras += horasASumar;
    }

    
    public static void setCantHoras(int cantHoras) {
        EmpleadoPorHoras.cantHoras = cantHoras;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public static int getCantHoras() {
        return cantHoras;
    }

    public float getValorHora() {
        return valorHora;
    }

    @Override
    public float calcularPago() {

        return cantHoras * valorHora;
    }
}
