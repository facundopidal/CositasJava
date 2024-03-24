public class EmpleadoContratista extends Empleado {
    
    private String proyecto;
    private static int cantHoras = 0;
    private float valorHora;
    
    
    public EmpleadoContratista(String nombre, String proyecto, float valorHora) {
        super(nombre);
        this.proyecto = proyecto;
        this.valorHora = valorHora;
    }

    @Override
    public float calcularPago() {
        return cantHoras * valorHora;
    }

    public void agregarHoras(int horasASumar){
        cantHoras += horasASumar;
    }
    
    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public static void setCantHoras(int cantHoras) {
        EmpleadoContratista.cantHoras = cantHoras;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public String getProyecto() {
        return proyecto;
    }

    public static int getCantHoras() {
        return cantHoras;
    }

    public float getValorHora() {
        return valorHora;
    }

    
    
    

    
}
