public abstract class Vehiculo implements Calculable {
    private String patente;
    private String marca;
    private int cantRuedas;
    private String consumo;
    private double precio;
    
    public Vehiculo(String patente, String marca, int cantRuedas, String consumo,double precio) {
        this.patente = patente;
        this.marca = marca;
        this.cantRuedas = cantRuedas;
        this.consumo = consumo;
        this.precio = precio;
    }

    public Vehiculo() {
        patente = "AA00";
        marca = "Marca";
        cantRuedas = 4;
        precio = 0;
        consumo = "Consumo";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vehiculo other = (Vehiculo) obj;
        if (patente == null) {
            if (other.patente != null)
                return false;
        } else if (!patente.equals(other.patente))
            return false;
        if (marca == null) {
            if (other.marca != null)
                return false;
        } else if (!marca.equals(other.marca))
            return false;
        if (cantRuedas != other.cantRuedas)
            return false;
        if (consumo == null) {
            if (other.consumo != null)
                return false;
        } else if (!consumo.equals(other.consumo))
            return false;
        if (Double.doubleToLongBits(precio) != Double.doubleToLongBits(other.precio))
            return false;
        return true;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }   
    
}
