public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente1 = new Cliente("Juan", 1, 'm');
        Cuenta cuenta1 = new Cuenta(1, 10000, cliente1);
        cuenta1.extraer(3000);
        cuenta1.extraer(7000);
        cuenta1.extraer(3000);


        
    }
}
