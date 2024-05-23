public class Calculadora<N extends Number> {

    public double multiplicar(N n1, N n2){
        return n1.doubleValue() * n2.doubleValue();
    }
    
    public double sumar(N n1, N n2){
        return n1.doubleValue() + n2.doubleValue();
    }

    public double restar(N n1, N n2){
        return n1.doubleValue() - n2.doubleValue();
    }

    public double dividir(N n1, N n2){
        if(n2.doubleValue() == 0) throw new ArithmeticException("No se puede dividir por cero");

        return n1.doubleValue() / n2.doubleValue();
    }
    
}
