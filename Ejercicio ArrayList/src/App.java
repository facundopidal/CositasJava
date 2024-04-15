import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList <Edificio> edificios = new ArrayList<>();
        edificios.add(new EdificioOficinas(2.5,10));
        edificios.add(new EdificioOficinas(5,30));
        edificios.add(new Polideportivo(10, "Rafa"));
        edificios.add(new Polideportivo(20, "Fran"));
        edificios.add(new Polideportivo(30.5, "Magnolo"));
        System.out.println(edificios);
    }
}
