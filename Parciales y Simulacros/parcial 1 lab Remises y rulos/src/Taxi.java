public class Taxi extends Vehiculo {
    private double contadorKM;
    private static double bajadaBandera = 2;
    private static double precioKM = 15;

    public Taxi(){
    }

    public Taxi(String marca, String modelo, String tipoCombustible, String patente, boolean disponible) {
        super(marca, modelo, tipoCombustible, patente, disponible);
    }


    public double getContadorKM() {
        return contadorKM;
    }

    public void setContadorKM(double contadorKM) {
        if(!disponible)
            this.contadorKM = contadorKM;
    }

    public static double getBajadaBandera() {
        return bajadaBandera;
    }

    public static void setBajadaBandera(double bajadaBandera) {
        Taxi.bajadaBandera = bajadaBandera;
    }

    public static double getPrecioKM() {
        return precioKM;
    }

    public static void setPrecioKM(double precioKM) {
        Taxi.precioKM = precioKM;
    }
    
}
