public class Calculadora <J extends Number> {

    public double sumar(J n1,J n2){
        return n1.doubleValue() + n2.doubleValue() ;
    }

    public double restar(J n1,J n2){
        return n1.doubleValue() - n2.doubleValue();
    }

    public double multiplicar(J n1,J n2){
        return n1.doubleValue() * n2.doubleValue();
    }

    public double dividir(J n1,J n2)throws ArithmeticException{
        if(n2.doubleValue() == 0) throw new ArithmeticException();
        return n1.doubleValue() * n2.doubleValue();
    }

    
}
