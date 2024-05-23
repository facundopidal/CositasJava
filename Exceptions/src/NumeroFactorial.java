import java.util.Scanner;

public  abstract class NumeroFactorial {

    public static int calculoFactorial(int n){
       
        try{
            if(n < 0) throw new IllegalArgumentException();
            if(n == 0 || n == 1) return 1; 
            return n * calculoFactorial(n-1);
        }catch(IllegalArgumentException e){
            System.out.println("Ingrese un numero entero no negativo");
            return -1;
        }
    
    }
}
