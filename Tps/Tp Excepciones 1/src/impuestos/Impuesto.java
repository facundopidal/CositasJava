package impuestos;
import java.util.Scanner;

public class Impuesto {

    public static void calcular() {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Ingrese el precio del producto: ");
            double precio = sc.nextDouble();
            if(precio < 0) throw new IllegalArgumentException("El precio no puede ser negativo");
            sc.nextLine(); //Limpia el buffer(Creo)
            System.out.print("Ingrese el numero de categoria del producto(PN-SN-NI): ");
            String categoriaStr = sc.nextLine();
            try{
                Categoria categoria = Categoria.valueOf(categoriaStr);
                System.out.println("Debe pagar " + categoria.getTasa() * 100 + "%" + " de impuestos");
                System.out.println("EL precio final es: " + (precio * (1 + categoria.getTasa())));
            } catch(IllegalArgumentException e){
                throw new InvalidCategoryException();
            }

        }catch(IllegalArgumentException e){
            System.out.println("Introduzca un precio valido");
        }catch(InvalidCategoryException e){
            System.out.println("Introduzca una categoria valida");
        } finally {
            sc.close();
        }

    }
}
