public class Moto extends Vehiculo {
    private int cilindrada;
    private boolean tieneBaul;

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Moto other = (Moto) obj;
        if(cilindrada != other.cilindrada)
            return false;
        if(tieneBaul != other.tieneBaul)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Moto [cilindrada=" + cilindrada + ", tieneBaul=" + tieneBaul + ", getCilindrada()=" + getCilindrada()
                + ", isTieneBaul()=" + isTieneBaul() + ", getPatente()=" + getPatente() + ", getMarca()=" + getMarca()
                + ", getCantRuedas()=" + getCantRuedas() + ", getConsumo()=" + getConsumo() + ", getPrecio()="
                + getPrecio() + "]";
    }
    public Moto(String patente, String marca, int cantRuedas, String consumo, double precio, int cilindrada,
            boolean tieneBaul) {
        super(patente, marca, cantRuedas, consumo, precio);
        this.cilindrada = cilindrada;
        this.tieneBaul = tieneBaul;
    }
    public Moto() {
        cilindrada = 110;
        tieneBaul = false;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public boolean isTieneBaul() {
        return tieneBaul;
    }

    public void setTieneBaul(boolean tieneBaul) {
        this.tieneBaul = tieneBaul;
    }

    
    
}
