import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class AdivinaAdivinador {

    public static void jugar(){
        Scanner sc = new Scanner(System.in);
        int numero = (int)Math.floor(Math.random()*500 + 1);
        System.out.println("Respuesta (testeo) " + numero);
        int cont=0;
        int entrada = 0;
        while(numero != entrada){
            try{
                cont++;
                System.out.println("Adivina el valor: ");
                entrada = sc.nextInt();
                if(entrada == numero){
                    System.out.println("CORRECTOOOO!!!!");
                    System.out.println("El numero era " + numero);
                    System.out.println("Tu numero de intentos fue: " + cont);
                    sc.close();
                    return;
                }
                if(entrada < numero){
                    System.out.println("Nop ");
                    System.out.println("El numero a adivinar es mayor al que ingresaste");
                }
                else{
                    System.out.println("Nop ");
                    System.out.println("El numero a adivinar es menor al que ingresaste");
                } 
            }catch(InputMismatchException e){
                System.out.println("Numero Invalido, pero conto como intento");
                sc.nextLine();
            } 
        }
    }
    
}
