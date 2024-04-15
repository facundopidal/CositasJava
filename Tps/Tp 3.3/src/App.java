public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente1 = new Cliente("Juan", 1, 'm');
        Cuenta cuenta1 = new Cuenta(1, 10000, cliente1);
        cuenta1.extraer(3000);
        cuenta1.extraer(7000);
        cuenta1.extraer(3000);
        cuenta1.depositar(10000);
        cuenta1.extraer(2000);
        cuenta1.depositar(9000);
        cuenta1.extraer(3000);
        cuenta1.depositar(8000);
        cuenta1.extraer(4000);
        cuenta1.depositar(7000);
        cuenta1.extraer(5000);
        cuenta1.depositar(6000);
        cuenta1.extraer(6000);

        System.out.println();
        cuenta1.mostrarRegistros();

        
    }
}
