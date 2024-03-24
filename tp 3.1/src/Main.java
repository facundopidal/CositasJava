
public class Main {
    public static void main(String[] args) {
        EmpleadoTiempoCompleto pp = new EmpleadoTiempoCompleto("Pablo Andres", 2000);
        EmpleadoPorHoras pj = new EmpleadoPorHoras("Pablo Joaquin", 20);
        pp.setSalario(2100);
        pj.agregarHoras(10);
        pj.agregarHoras(150);
        System.out.println(pp.calcularPago());
        System.out.println(pj.calcularPago());


    }
}