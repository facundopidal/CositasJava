public class Calculadora<T extends Number> {

    public double multiplicar(T n1, T n2){
        return n1.doubleValue() * n2.doubleValue();
    }
    
    public double sumar(T n1, T n2){
        return n1.doubleValue() + n2.doubleValue();
    }

    public double restar(T n1, T n2){
        return n1.doubleValue() - n2.doubleValue();
    }

    public double dividir(T n1, T n2){
        if(n2.doubleValue() == 0) throw new ArithmeticException("No se puede dividir por cero");

        return n1.doubleValue() / n2.doubleValue();
    }
    
}
