package src.iu;


import java.util.Scanner;

import src.contenedores.Biblioteca;
import src.exceptions.AutorNotFoundException;
import src.exceptions.DuplicatedIdException;
import src.exceptions.IdNotFoundException;
import src.interfaces.Identificable;
import src.modelo.Libro;
import src.modelo.Novela;

public abstract class Menu {
    public static Scanner sc = new Scanner(System.in);

    public static void menuPrincipal(){
        int op;
        do {

            System.out.println("Ingrese el tipo a trabajar");
            System.out.println("1.Libro");
            System.out.println("2.Novela");

            System.out.print("-->");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    menuSecundario(new Libro());
                    break;
                case 2:
                    menuSecundario(new Novela());
                    break;
                case 0:
                    sc.close();
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
            
        }
        while(op != 0);
    }

    @SuppressWarnings("unchecked")
    public static <T extends Identificable> void menuSecundario(T e){
        int op;
        Biblioteca<T> biblio = new Biblioteca<>();
        do {

            System.out.println("Ingrese una opcion");
            System.out.println("1.Agregar");
            System.out.println("2.Eliminar");
            System.out.println("3.Buscar Por id");
            System.out.println("4.Filtrar por autor");
            System.out.println("5.Listar");
            System.out.println("0.Salir");
            System.out.print("-->");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Ingrese un producto");
                    if(e instanceof Novela){
                        Novela n = new Novela();
                        n.escanear();
                        e = (T) n;
                    }
                    else if(e instanceof Libro){
                        Libro l = new Libro();
                        l.escanear();
                        e = (T) l;
                    }
                    else{
                        throw new RuntimeException();
                    } 
                    try{
                        biblio.agregar(e);
                        System.out.println("Se agrego correctamente");
                    } catch (DuplicatedIdException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Ingrese un producto");
                    if(e instanceof Novela){
                        Novela n = new Novela();
                        n.escanear();
                        e = (T) n;
                    }
                    else if(e instanceof Libro){
                        Libro l = new Libro();
                        l.escanear();
                        e = (T) l;
                    }
                    else{
                        throw new RuntimeException();
                    } 
                    try{
                        T eliminado = biblio.eliminar(e);
                        System.out.println("Se elimino correctamente: " + eliminado);
                    } catch (IdNotFoundException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Ingrese un id:");
                    int id = sc.nextInt();
                    sc.nextLine();
                    try {
                        T buscado = biblio.buscar(id);
                        System.out.println("Se encontro el elemento: \n" + buscado);
                    } catch (IdNotFoundException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Ingrese un autor:");
                    String autor = sc.nextLine();
                    try {
                        String filtrado = biblio.filtrarPorAutorString(autor);
                        System.out.println("Se encontraron los elementos: \n" + filtrado);
                    } catch (AutorNotFoundException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 5:
                    System.out.println(biblio);
                    break;
                case 0:
                    System.out.println("Saliendo");
                    break;
            
                default:
                System.out.println("Por favor ingrese una opcion valida");
                    break;
            }


        } while(op != 0);

    }

}
