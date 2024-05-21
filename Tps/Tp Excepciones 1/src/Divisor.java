import java.util.Scanner;

public abstract class Divisor {
    private static int a;
    private static int b;
    private static Scanner sc = new Scanner(System.in);

    public static void dividir() throws ArithmeticException {
        System.out.println("Ingrese un numero: ");
        a = sc.nextInt();
        System.out.println("Ingrese otro numero: ");
        b = sc.nextInt();

        try {
            System.out.println("El resultado de la division es " + a/b);
        }
        catch(ArithmeticException e) {
            System.out.println("Recuerda que no se puede dividir por cero");
        }
        finally{
            sc.close();
        }
    }

    public static void dividir(int a, int b) throws ArithmeticException {
        try {
            System.out.println("El resultado de la division es " + a/b);
        }
        catch(ArithmeticException e) {
            System.out.println("Recuerda que no se puede dividir por cero");
        }
    }

}
