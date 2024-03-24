public class App {
    public static void main(String[] args) throws Exception {
        
        Autor autor1 = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');
        autor1.mostrar();
        Libro lib1 = new Libro( "Effective Java", 450, 150, autor1);
        lib1.mostrar();

        System.out.println("LIbro con el precio cambiado a 500");
        System.out.println("LIbro con el stock aumentado en 50 copias");
        lib1.setPrecio(500);
        lib1.aumentarStock(50);
        lib1.mostrar();
        lib1.mostrarMensaje();
    }
}
