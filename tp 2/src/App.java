import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        menu();
    }
    
    public static void menu(){
        int opt;
        Cuenta cuenta =null;
        String nombre;
        float saldo;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("BANCO SUPERVIELE");
            System.out.println("1. Crear cuenta vacia");
            System.out.println("2. Crear cuenta saldo inicial");
            System.out.println("3. Ingresar dinero");
            System.out.println("4. Sacar dinero");
            System.out.println("5. Ver saldo");
            System.out.println("6. Salir");
            System.out.print("---> ");
            opt= sc.nextInt();
            sc.nextLine();
            
            switch (opt) {
                case 1:
                    System.out.println("Ingrese su nombre");
                    cuenta = new Cuenta(sc.nextLine());
                    System.out.println("Cuenta creada exitosamente");
                    break;
                case 2:
                    System.out.println("Ingrese su nombre: ");
                    nombre= sc.nextLine();
                    System.out.print("Ingrese su saldo Inicial: ");
                    saldo= sc.nextFloat();
                    cuenta = new Cuenta(nombre,saldo);
                    System.out.println("Cuenta creada exitosamente");
                    break;
                case 3:
                    if(cuenta==null){
                        System.out.println("Primero debe crear su cuenta");
                        break;
                    }
                    System.out.print("Indique el monto a ingresar: ");
                    saldo= sc.nextFloat();
                    cuenta.ingresar(saldo);
                    System.out.println("Se ingresaron correctamente $" + saldo);
                    break;
                case 4:
                    if(cuenta==null){
                        System.out.println("Primero debe crear su cuenta");
                        break;
                    }
                    System.out.print("Indique el monto a extraer: ");
                    saldo= sc.nextFloat();
                    cuenta.extraer(saldo);
                    System.out.println("Se extrajeron correctamente $" + saldo);
                    break;
                case 5:
                    if(cuenta==null){
                        System.out.println("Primero debe crear su cuenta");
                         break;
                    }
                    System.out.println("Su saldo es de $" + cuenta.getSaldo());
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Ingrese un caracter valido");
                    break;
            }
        }while(opt!=6);
        sc.close();
    }
}