public class Remis extends Vehiculo {
    private static double tarifaCuadra = 1.6;
    private int cuadrasRecorridas;

    public Remis(String marca, String modelo, String tipoCombustible, String patente, boolean disponible) {
        super(marca, modelo, tipoCombustible, patente, disponible);
    }

    public static double getTarifaCuadra() {
        return tarifaCuadra;
    }

    public static void setTarifaCuadra(double tarifaCuadra) {
        Remis.tarifaCuadra = tarifaCuadra;
    }

    public int getCuadrasRecorridas() {
        return cuadrasRecorridas;
    }

    public void setCuadrasRecorridas(int cuadrasRecorridas) {
        if (!disponible) 
            this.cuadrasRecorridas = cuadrasRecorridas;
    }
    
}
