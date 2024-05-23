package Impuestos;
import java.util.Scanner;

public class Impuesto {
    

    public static void calcular(){

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Ingrese precio inicial");
            double precioInicial = sc.nextDouble();
            if(precioInicial <= 0) throw new IllegalArgumentException();
            sc.nextLine();///limpiamos buffer
            System.out.println("Ingrese categoria del producto (PN - SN - NI)");
            String categoria = sc.nextLine();
            
            try{
                Categorias cat = Categorias.valueOf(categoria); ///lanza excepcion directamente 
                System.out.println("Debe pegar: " + cat.getTasa() * 100 + "%" + " de impuestos");
                System.out.println("Precio final " + (precioInicial * (1 + cat.getTasa())));

            }catch(IllegalArgumentException e){
                throw new InvalidCategoryException("Categoria Invalida");
            }
        }catch(IllegalArgumentException e){
            System.out.println("Ingrese un precio valido");
        }catch(InvalidCategoryException e){
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();
        }

        
    }


}
