public class App {
    public static void main(String[] args) throws Exception {

        Libro l1 = new Libro("La Biblia", "Juan", 100, 1985);
        Libro l2 = new Libro("La Iliada", "Nicolas", 200, 100);
        Libro l3 = new Libro("La Odisea", "Mateo", 150, 1815);

        HashMapLibros mapa = new HashMapLibros();

        mapa.agregarLibro(l1);
        mapa.agregarLibro(l2);
        mapa.agregarLibro(l3);
        mapa.mostrarLibros();

        System.out.println("Elimina La Biblia");
        mapa.eliminarLibro("La Biblia");
        mapa.mostrarLibros();
        
        System.out.println("Modifica el precio de La Odisea");
        mapa.actualizarPrecioLibro("La Odisea", 300);
        mapa.mostrarLibros();
        
        System.out.println("Libro mas caro " + mapa.encontrarLibroMasCaro().toString());
        System.out.println("Libro mas barato " + mapa.encontrarLibroMasBarato().toString());
        
        
        
        /* 
        LinkedListLibros lista = new LinkedListLibros();

        lista.agregarLibro(l1);
        lista.agregarLibro(l2);
        lista.agregarLibro(l3);
        lista.mostrarLibros();
        
        System.out.println(lista.eliminarLibro("la biblia", "Juan"));
        System.out.println("eliminamos la bilblia de juan");
        lista.mostrarLibros();
        
        System.out.println(lista.actualizarPrecioLibro("LA iliada", "nicolas", 25));
        System.out.println("Actualizamos precio de La Iliada");
        lista.mostrarLibros();

        System.out.println("El libro mas caro es " + lista.encontrarLibroMasCaro().toString());
        System.out.println("El libro mas barato es " + lista.encontrarLibroMasBarato().toString());
        */
    }
}
