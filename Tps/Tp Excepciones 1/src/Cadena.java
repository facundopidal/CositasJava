import java.util.Scanner;

public class Cadena {
    
    public static void calcularLargo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena: ");
        String cadena = sc.nextLine();

        try{
            Integer.parseInt(cadena); //Intentamos pasar la cadena a numero
            System.out.println("Por favor ingrese una cadena de texto"); // Avisamos del error
        } catch(NumberFormatException e){
            System.out.println("La longitud de la cadena es: " + cadena.length());
        }
        finally{
            sc.close();
        }
    }
}
