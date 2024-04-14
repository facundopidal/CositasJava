package electrodomestico;

public class Electrodomestico {
    private final String colorDefault = "blanco";
    private final char consumoDefault = 'F';
    private final double precioDefault = 100;
    private final int pesoDefault = 5;

    private String color;
    private char consumo;
    private double precioBase;
    private int peso;

    private void comprobarConsumo(char letra) {
        if(letra < 'A' || letra > 'F')
            consumo = consumoDefault;
        else
            consumo = letra;
    }

    private void comprobarColor(String colorString) {
         String[] colores = {"blanco", "negro", "rojo", "azul",  "gris"};
         boolean valido = false;
         for(String aux: colores) {
            if(colorString.equals(aux) || colorString.equals(aux.toUpperCase())){
                color = colorString;
                valido = true;
                break;
            }
         }
         if(!valido)
            color = colorDefault;
    }

    public double calcularPrecioFinal(){
        double precioFinal = precioBase;
        
        if (consumo == 'A') precioFinal += 100; 
        else if (consumo == 'B') precioFinal += 80; 
        else if (consumo == 'C') precioFinal += 60; 
        else if (consumo == 'D') precioFinal += 50; 
        else if (consumo == 'E') precioFinal += 30; 
        else if (consumo == 'F') precioFinal += 10; 

        if(peso < 20) precioFinal += 10;
        else if(peso < 50) precioFinal += 50;
        else if(peso < 80) precioFinal += 80;
        else precioFinal += 100;
        
        return precioFinal;
    }

    public Electrodomestico() {
        color = colorDefault;
        consumo = consumoDefault;
        precioBase = precioDefault;
        peso = pesoDefault;
    }
    
    public Electrodomestico(double precioBase, int peso) {
        color = colorDefault;
        consumo = consumoDefault;
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(String color, char consumo, double precioBase, int peso) {
        comprobarColor(color);
        comprobarConsumo(consumo);
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo() {
        return consumo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public int getPeso() {
        return peso;
    }
    
}
