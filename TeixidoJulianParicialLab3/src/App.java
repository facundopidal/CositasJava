import Zoologico.Animal;
import Zoologico.Ave;
import Zoologico.EstadosSalud;
import Zoologico.Excursion;
import Zoologico.Mamifero;
import Zoologico.Reptil;
import Zoologico.gestionInventario;

public class App {
    public static void main(String[] args) throws Exception {
        
        ///Main de testeos

        Reptil r1 = new Reptil("Piton","Mati",5,EstadosSalud.ESTUPENDO,"tiki",true);
        Reptil r2 = new Reptil("Vibora","juan",5,EstadosSalud.REGULAR,"tiki",true);
        
        ///funciona agregar
        gestionInventario.agregarAnimal(r1);
        gestionInventario.agregarAnimal(r2);
        gestionInventario.mostrarAnimales();
        System.out.println("la valoracion de " + r1.getNombre() +" es " + r1.calcularValoracion());;
   
        ///funciona buscar
        if(gestionInventario.buscarPorEspecie("piton") instanceof Animal)///le mandamos piton con diferentes mayus y funciona igual
            System.out.println("se encontro el animal");

       
        Ave a1 = new Ave("Gorreon","Carla",8,EstadosSalud.MALO,"cualquiera",true);
        Mamifero m1 = new Mamifero("Leon","Hector",10,EstadosSalud.REGULAR,null,"cualquiera");
   
        gestionInventario.agregarAnimal(a1);
        gestionInventario.agregarAnimal(m1);
        gestionInventario.mostrarAnimales();
   
        
        ///funciona
        Excursion e1= new Excursion();
        System.out.println("Valor" + e1.calcularValoracion());

   
   
    }
}
