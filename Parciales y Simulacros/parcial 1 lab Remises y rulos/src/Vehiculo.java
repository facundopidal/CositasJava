public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected String tipoCombustible;
    protected String patente;
    protected boolean disponible;

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vehiculo other = (Vehiculo) obj;
        if (marca == null) {
            if (other.marca != null)
                return false;
        } else if (!marca.equals(other.marca))
            return false;
        if (modelo == null) {
            if (other.modelo != null)
                return false;
        } else if (!modelo.equals(other.modelo))
            return false;
        if (tipoCombustible == null) {
            if (other.tipoCombustible != null)
                return false;
        } else if (!tipoCombustible.equals(other.tipoCombustible))
            return false;
        if (patente == null) {
            if (other.patente != null)
                return false;
        } else if (!patente.equals(other.patente))
            return false;
        if (disponible != other.disponible)
            return false;
        return true;
    }

    public Vehiculo(){
    }

    public Vehiculo(String marca, String modelo, String tipoCombustible, String patente, boolean disponible) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustible = tipoCombustible;
        this.patente = patente;
        this.disponible = disponible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
}
