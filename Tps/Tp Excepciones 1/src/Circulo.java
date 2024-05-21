import java.util.Scanner;

public abstract class Circulo {
    private static final double PI = 3.14159;
    private static double radio;

    public static void calcularArea() {
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.print("Ingrese el radio del circulo: ");
            radio = sc.nextDouble();
            if(radio < 0) throw new IllegalArgumentException("El radio debe ser un numero positivo");
            System.out.println("El area del circulo es: " + (PI * radio * radio));
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }   
}
