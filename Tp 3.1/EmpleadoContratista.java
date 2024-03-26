public class EmpleadoContratista extends Empleado{
    private static int cantHoras = 0;
    private float valorHora;
    private String proyecto;

    public EmpleadoContratista(String nombre, float valorHora, String proyecto) {
        super(nombre);
        this.valorHora = valorHora;
        this.proyecto = proyecto;
    }

    public static void agregarHoras(int horasASumar) {
        cantHoras += horasASumar;
    }

    public static void setCantHoras(int cantHoras) {
        EmpleadoContratista.cantHoras = cantHoras;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    
    public static int getCantHoras() {
        return cantHoras;
    }

    public float getValorHora() {
        return valorHora;
    }

    public String getProyecto() {
        return proyecto;
    }

    @Override
    public float calcularPago() {
        return cantHoras * valorHora;
    }
    
}
