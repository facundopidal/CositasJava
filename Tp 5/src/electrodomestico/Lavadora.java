package electrodomestico;

public class Lavadora extends Electrodomestico {
    private final int cargaDefault = 5;

    private int carga;

    @Override
    public double calcularPrecioFinal() {
        return (carga > 30) ? super.calcularPrecioFinal() + 50 : super.calcularPrecioFinal();
    }

    public Lavadora() {
        carga = cargaDefault;
    }

    public Lavadora(double precioBase, int peso) {
        super(precioBase, peso);
        carga = cargaDefault;
    }

    public Lavadora(String color, char consumo, double precioBase, int peso, int carga) {
        super(color, consumo, precioBase, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }
    
}
