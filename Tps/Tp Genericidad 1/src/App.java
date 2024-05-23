public class App {
    public static void main(String[] args) throws Exception {
        // Almacenamiento<Integer> list = new Almacenamiento<>();

        // list.agregar(3);
        // list.agregar(4);
        // list.agregar(9);
        // list.agregar(9);
        // list.agregar(3);
        // System.out.println(list.buscar(3));
        // System.out.println(list.eliminar(9));
        // System.out.println(list);
        // System.out.println();
        
        // Almacenamiento<String> lista = new Almacenamiento<>();

        // lista.agregar("juan");
        // lista.agregar("Juan");
        // lista.agregar("Juan");
        // lista.agregar("rafa");
        // lista.agregar("Pidi");
        // lista.agregar("32d");
        // System.out.println(lista.buscar("Juan"));
        // System.out.println(lista.eliminar("Pidi"));
        // System.out.println(lista);

        // Pila<String> pila = new Pila<>();
        // System.out.println(pila.extraer());
        // pila.agregar("Pedro");
        // pila.agregar("Pidi");
        // System.out.println(pila.extraer());
        // pila.agregar("Pepe");
        // pila.agregar("Pidi");
        // pila.agregar("Tope");
        // System.out.println(pila.extraer());
        // System.out.println(pila.tope());
        // System.out.println(pila);
        
        // Pila<Integer> pilon = new Pila<>();
        // System.out.println(pilon.extraer());
        // pilon.agregar(5);
        // pilon.agregar(4);
        // System.out.println(pilon.extraer());
        // pilon.agregar(8);
        // pilon.agregar(8);
        // pilon.agregar(0);
        // System.out.println(pilon.extraer());
        // System.out.println(pilon.tope());
        // System.out.println(pilon);

        Calculadora<Long> calc = new Calculadora<>();
        long n1 = 1;
        long n2 = 5;
        System.out.println(calc.dividir(n1, n2));
        System.out.println(calc.restar(n1, n2));
        System.out.println(calc.sumar(n1, n2));
        System.out.println(calc.multiplicar(n1, n2));

        Calculadora<Integer> calcc = new Calculadora<>();
        int n3 = 2;
        int n4 = 9;
        System.out.println(calcc.sumar(n3,n4));
        System.out.println(calcc.multiplicar(n3,n4));
        System.out.println(calcc.restar(n3,n4));
        System.out.println(calcc.dividir(n3,n4));
    }
}
