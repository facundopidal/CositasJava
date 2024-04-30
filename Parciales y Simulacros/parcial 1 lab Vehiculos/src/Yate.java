public class Yate implements Calculable {
    private double precio;
    private String cosasDeYate;

    public Yate(String cosasDeYate) {
        this.cosasDeYate = cosasDeYate;
        calcularPrecio();
    }

    @Override
    public double calcularPrecio() {
        precio = 100;
        return precio;
    }

    public String getCosasDeYate() {
        return cosasDeYate;
    }

    public double getPrecio() {
        return precio;
    }
    
}
