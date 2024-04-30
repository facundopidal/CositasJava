import java.util.ArrayList;
import animales.*;
public class Inventario {
    // Declaro la lista y sus metodos como estaticos para tener solo una lista
    private static ArrayList<Animal> listaAnimal = new ArrayList<>();

    public static boolean agregar(Animal animal){
        return listaAnimal.add(animal);
    }
    public static ArrayList<Animal> buscarPorEspecie(String especie) {
        //Genero una arraylist para devolver todas las coincidencias
        ArrayList<Animal> animalesEspecie = new ArrayList<>();
        for (Animal animal : listaAnimal) {
            if (animal.getEspecie().equalsIgnoreCase(especie))
                animalesEspecie.add(animal);
        }
        return animalesEspecie;
    }

    public static int contar(){
        return listaAnimal.size();
    }

    public static ArrayList<Animal> devolverListado(){
        return listaAnimal;
    }

    public static ArrayList<Animal> eliminarPorNombre(String nombre) {
        //Genero una arraylist para devolver todas las coincidencias
        ArrayList<Animal> animalesNombre = new ArrayList<>();
        for (Animal animal : listaAnimal){
            if (animal.getNombre().equalsIgnoreCase(nombre)) {
                animalesNombre.add(animal);
                listaAnimal.remove(animal);
            }
        }
        return animalesNombre;
    }

    public static void mostrar(){
        for (Animal animal: listaAnimal){
            System.out.println(animal);
        }
    }
}
