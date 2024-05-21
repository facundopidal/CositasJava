import java.util.Scanner;

public abstract class ArrayNums {

    private static final int[] nums = {10, 20, 30, 40, 50, 60};
    public static void obtenerValor() {
        Scanner sc = new Scanner(System.in);
        int index;
        try{
            System.out.print("Ingrese un numero del 0 al 5: ");
            index = sc.nextInt();
            System.out.println("El numero que elegiste es este: " + nums[index]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("El numero ingresado supera los limites del array");
        } finally{
            sc.close();
        }
    }
}
