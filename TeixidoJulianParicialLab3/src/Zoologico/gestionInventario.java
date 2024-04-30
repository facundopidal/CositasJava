package Zoologico;
import java.util.ArrayList;

public class gestionInventario {/// establece que UN zoologico nos pide un sistema para mi la mejor manera es hacerlo estatico

    private static ArrayList<Animal> listaAnimales = new ArrayList<>();
    private static ArrayList<Excursion> listaExcursiones = new ArrayList<>();


    ///Agregar 
    public static void agregarAnimal(Animal a){
        listaAnimales.add(a);
    }

    public static void agregarExcursion(Excursion e){
        listaExcursiones.add(e);
    }

    ///Contar
    public static int contarAnimales(){
        return listaAnimales.size();
    }

    public static int contarExcursiones(){
        return listaExcursiones.size();
    }

    ///Buscar por especie
    public static Animal buscarPorEspecie(String especie){
        for (Animal animal : listaAnimales) {
            if(animal.getEspecie().equalsIgnoreCase(especie))/// utilizamos el ignoreCase para no tener problemas con mayus
                return animal;/// si lo encontramos lo retornamos
        }
        return null;/// caso que termina el for retornamos null
    }

    public static Excursion buscarExcursionPorNombre(String nombre){
        for (Excursion excursion : listaExcursiones) {
            if(excursion.getNombre().equalsIgnoreCase(nombre))
                return excursion;
        }
        return null;
    }

    ///Devolver listado
    public ArrayList<Animal> devolverLista(){ 
        return listaAnimales;/// podemos recibirla en el main y operarla de diferentes formas
    }

    public ArrayList<Excursion> devolverListaE(){
        return listaExcursiones;
    }


    ///Eliminar, si lo encuentra lo borra, esta funcion no precisa saber el indice
    /// si lo precisaramos se implementaria de otra manera , hacemos un pequeño return para finalizar el metodo
    /// sin seguir recorriendo el arraylist y sin tener que usar un flag
    /// utilizamos algun que otro print PARA TESTEO
    public static void eliminarPorNombre(String nombre){
        for (Animal animal : listaAnimales) {
            if (animal.getNombre().equalsIgnoreCase(nombre)){
                listaAnimales.remove(animal);
                System.out.println("Se elimino el animal: " +nombre + " correctamente");
                return;
            }
        }                                    
        System.out.println("El animal que se queria eliminar " + nombre + " no se encontro en el arraylist");
    }

    public static void mostrarAnimales(){
        System.out.println("Lista animales");
        for (Animal animal : listaAnimales) {
            System.out.println(animal.toString());
        }
    }

    public static void mostrarExcursiones(){
        for(Excursion excursion: listaExcursiones){
            System.out.println(excursion.toString());
        }
    }



}
