package electrodomestico;

public class Television extends Electrodomestico {
    private final int pulgadasDefault = 20;
    private final boolean sintonizadorDefault = false;
    
    private int pulgadas;
    private boolean sintonizador;

    @Override
    public double calcularPrecioFinal(){
        double precioFinal = super.calcularPrecioFinal();
        if(pulgadas > 40) precioFinal *= 1.3;
        if(sintonizador) precioFinal += 50;
        return precioFinal;
    }

    public Television() {
        pulgadas = pulgadasDefault;
        sintonizador = sintonizadorDefault;
    }

    public Television(double precioBase, int peso) {
        super(precioBase, peso);
        pulgadas = pulgadasDefault;
        sintonizador = sintonizadorDefault;
    }

    public Television(String color, char consumo, double precioBase, int peso, int pulgadas, boolean sintonizador) {
        super(color, consumo, precioBase, peso);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }
}
