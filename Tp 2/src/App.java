import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int opt;
        float saldo;
        String nombre;
        Scanner sc = new Scanner(System.in);
        Cuenta cuenta = null;
        do {
            System.out.println("Home Banking");
            System.out.println("    1. Crear cuenta vacía");
            System.out.println("    2. Crear cuenta saldo inicial");
            System.out.println("    3. Ingresar dinero");
            System.out.println("    4. Sacar dinero");
            System.out.println("    5. Ver saldo");
            System.out.println("    6. Salir");
            System.out.print("--> ");
            opt = sc.nextInt();
            sc.nextLine(); // Limpia el buffer

            switch (opt) {
                case 1://Crear cuenta vacia
                    System.out.print("Ingrese su nombre y apellido: ");
                    nombre = sc.nextLine();
                    cuenta = new Cuenta(nombre);
                    System.out.println("Cuenta creada exitosamente");
                    break;
                case 2://Crear cuenta con saldo
                    System.out.print("Ingrese su nombre y apellido: ");
                    nombre = sc.nextLine();

                    System.out.print("Ingrese saldo inicial: ");
                    saldo = sc.nextFloat();
                    cuenta = new Cuenta(nombre, saldo);
                    System.out.println("Cuenta creada exitosamente con saldo de $" + saldo);
                    break;
                case 3://Ingresar
                    if(cuenta == null){
                        System.out.println("Primero debe crear la cuenta");
                        break;
                    }
                    System.out.print("Indique el monto a ingresar: ");
                    saldo = sc.nextFloat();
                    cuenta.ingresar(saldo);
                    break;
                case 4://Extraer
                    if(cuenta == null){
                        System.out.println("Primero debe crear la cuenta");
                        break;
                    }
                    System.out.print("Indique el monto a extraer: ");
                    saldo = sc.nextFloat();
                    cuenta.extraer(saldo);
                    break;
                case 5://Ver saldo
                    if(cuenta == null){
                        System.out.println("Primero debe crear la cuenta");
                        break;
                    }
                    System.out.println("Su saldo es de $" + cuenta.getSaldo());
                    break;
                case 6://Salir
                    System.out.println("Saliendo...");
                    break;
            
                default:
                System.out.println("Por favor ingrese una ");
                    break;
            }
        } while (opt != 6);
        sc.close();
    }
}
