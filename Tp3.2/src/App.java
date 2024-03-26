public class App {
    public static void main(String[] args) {
        Autor a1 = new Autor( "Joshua", "Bloch", "joshua@email.com", 'M');
        Libro lib1 = new Libro("Effective Java",450, 150, a1);
        lib1.aumentarStock(50);
        lib1.imprimirMensaje();
    }
}
