public abstract class Factorial {
    
    public static int calcular(int n){
        try{
            if(n < 0) throw new IllegalArgumentException();
            if(n == 0 || n == 1) return 1;
            return n * calcular(n-1);
        } catch(IllegalArgumentException e){
            System.out.println("Por favor ingrese un entero no negativo");
            return -1;
        }
    }
}
