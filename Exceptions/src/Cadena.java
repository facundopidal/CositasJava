import java.util.Scanner;

public class Cadena {

    public static void calcularLargo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese una cadena");
        String cadena = sc.nextLine();
        try{
            Integer.parseInt(cadena);
            System.out.println("Por favor ingrese una cadena de texto");
        }
        catch (NumberFormatException e){
            System.out.println("La longitud es " + cadena.length());
        }
        finally{
            sc.close();
        }
    }
}

