import java.util.Scanner;

public  abstract class ArrayNums {

    private static int[] nums = {10,20,30,40,50};
    
    public static void obtenerValor(){
        Scanner sc= new Scanner(System.in);
        int index;
        try{
            System.out.println("Ingrese un indice");
            index= sc.nextInt();
            System.out.println("El indice que ingresaste contiene: " + nums[index]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("El numero que ingresaste supera los limites del array");
        }
        finally{
            sc.close();
        }
    }
}
