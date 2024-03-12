import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Libro lib1 = new Libro("Titulo1", "juan1", 2018, "Terror", 540);
        Libro lib2 = new Libro("Titulo2", "juan2", 2019, "Comedia", 223);
        Libro lib3 = new Libro("Titulo3", "juan3", 2014, "Porno", 209);

        int opcion, n;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.flush();
            System.out.println("1: Mostrar\n2: Cambiar Año\n3: Mostrar mayores de 500\n0: Salir");
            System.out.print("-->");
            opcion = scan.nextInt();
            switch (opcion) {
                case 0:
                    break;
                case 1:
                    lib1.mostrarLibro();
                    lib2.mostrarLibro();
                    lib3.mostrarLibro();
                    break;
                case 2:
                    System.out.print("Ingrese año de publicacion: ");
                    n = scan.nextInt();
                    lib1.setAño(n);
                    break;
                case 3:
                    lib1.mostrarMuchasPags();
                    lib2.mostrarMuchasPags();
                    lib3.mostrarMuchasPags();
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        } while(opcion != 0);
        scan.close();
    }
}
