import animales.*;

import java.util.ArrayList;

//Facundo Pidal Ruiz Diaz
public class Main {
    public static void main(String[] args) {
        String[] listaHabilidades1 = {"Correr","Saltar"};

        Mamifero m1 = new Mamifero("Gato", "Carlos", 4, EstadoSalud.ESTUPENDO, listaHabilidades1, "Normal");
        Mamifero m2 = new Mamifero("Perro", "Rodrigo", 1, EstadoSalud.MALO, listaHabilidades1, "Normal");
        Ave a1 = new Ave("Hornero", "Juan", 1, EstadoSalud.REGULAR, "Plumaje excelente", false);
        Ave a2 = new Ave("Condor", "Matias", 5, EstadoSalud.ESTUPENDO, "Plumaje excelente", true);
        Reptil r1 = new Reptil("Piton", "Martin", 20, EstadoSalud.ESTUPENDO, "Escamas gruesas", true);

        Inventario.agregar(m1);
        Inventario.agregar(m2);
        Inventario.agregar(a1);
        Inventario.agregar(a2);
        Inventario.agregar(r1);

        String[] listaActividades1 = {"Recorrido por el criadero de nutrias", "Degustacion de carne de elefante"};
        String[] listaActividades2 = {"Avistaje de aves", "Ponerse un loro en el hombro"};
        Excursion e1 = new Excursion(false, "Paseo con nutrias", listaActividades1);
        Excursion e2 = new Excursion(true, "Paseo con aves", listaActividades2);

        //Creo un array de excursiones para contar todas las valoraciones en un solo metodo
        Excursion[] excursiones = {e1, e2};
        ArrayList <Animal> animales = Inventario.devolverListado();
        mostrarValoraciones(animales, excursiones);
        System.out.println("Cantidad de elementos del inventario: " + Inventario.contar());
        System.out.println("Lista de animales completa: ");
        Inventario.mostrar();
        System.out.println("Lista de animales sin el condor Matias: ");
        Inventario.eliminarPorNombre("matias");
        Inventario.mostrar();
        System.out.println("Gato buscado por especie: " + Inventario.buscarPorEspecie("gato"));
        System.out.println("Cantidad de elementos sin el condor: " + Inventario.contar());
    }
    public static void mostrarValoraciones(ArrayList<Animal> animales, Excursion[] excursiones){
        Ave ave = null;
        Mamifero mamifero = null;
        Reptil reptil = null;
        System.out.println("Valoracion de animales: ");
        for (Animal animal: animales) {
            if(animal instanceof Ave){
                ave = (Ave) animal;
                System.out.println("Valoracion de " + ave.getEspecie() + ": " + ave.calcularValoracion());
            }
            if(animal instanceof Mamifero){
                mamifero = (Mamifero) animal;
                System.out.println("Valoracion de " + mamifero.getEspecie() + ": " + mamifero.calcularValoracion());
            }
            if(animal instanceof Reptil){
                reptil = (Reptil) animal;
                System.out.println("Valoracion de " + reptil.getEspecie() + ": " + reptil.calcularValoracion());
            }
        }
        System.out.println("Valoracion de excursiones: ");
        for(Excursion excursion: excursiones){
            System.out.println("Valoracion de " + excursion.getNombreExcursion() + ": " + excursion.calcularValoracion());
        }
    }
}