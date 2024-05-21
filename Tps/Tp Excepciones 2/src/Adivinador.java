import java.util.InputMismatchException;
import java.util.Scanner;

public class Adivinador {
    public static void jugar(){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int numAdivinar = (int)Math.floor(Math.random() * 500 + 1);
        int i = 0;
        while(num != numAdivinar){
            try{
                System.out.print("Ingrese un numero: ");
                num = sc.nextInt();
                i++;
                if(num == numAdivinar) {
                    System.out.println("¡¡¡¡¡Adivinaste!!!!!");
                    System.out.println("Lo intentaste " + i + " veces!!");
                    sc.close();
                    return;
                }
                if(num < numAdivinar){
                    System.out.println("Incorrecto");
                    System.out.println("El numero a adivinar es mayor al que ingresaste");
                }
                if(num > numAdivinar){
                    System.out.println("Incorrecto");
                    System.out.println("El numero a adivinar es menor al que ingresaste");
                }
            } catch(InputMismatchException e){
                System.out.println("Ingrese un numero valido");
                sc.nextLine();//Limpia el buffer para que no persista la excepcion
            }
        }
    }
}
