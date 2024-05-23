import java.util.Scanner;

public abstract class Division {

    private static int a;
    private static int b;
    private static Scanner sc = new Scanner(System.in);

    public static void dividir(){
        System.out.println("Ingrese el numero a dividir");
        a = sc.nextInt();
        System.out.println("Ingrese el numero divisor");
        b = sc.nextInt();

        try {
            System.out.println("El resultado de la division es " + (a/b));
        } 
        catch (ArithmeticException e) {
            System.out.println("Recuerda que no puedes dividir por 0 !!!!");
        } 
        finally{
            sc.close();
        }
    }
}
