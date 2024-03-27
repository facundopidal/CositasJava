public class App {
    public static void main(String[] args) {
        Hora h1 = new Hora();
        System.out.println("Hora autogenerada: ");
        h1.mostrarHora();
        h1.avanzarSegundo();
        System.out.println("Hora +1: ");
        h1.mostrarHora();
        h1.retrocederSegundo();
        System.out.println("Hora -1: ");
        h1.mostrarHora();
        h1.avanzarSegundo().retrocederSegundo(); //Al retornar la instancia del objeto, se pueden encadenar los metodos
        System.out.println("Hora +1-1: ");
        h1.mostrarHora();
        h1.retrocederSegundo().retrocederSegundo();
        System.out.println("Hora -1-1: ");
        h1.mostrarHora();
        
    }
}
