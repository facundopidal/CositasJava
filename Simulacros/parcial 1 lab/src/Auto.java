public class Auto extends Vehiculo{
    private String listaPrestaciones;
    private ModoCambios modoPasarCambios;

    @Override
    public String toString() {
        return "Auto [listaPrestaciones=" + listaPrestaciones + ", modoPasarCambios=" + modoPasarCambios
                + ", getPatente()=" + getPatente() + ", getMarca()=" + getMarca()
                + ", getCantRuedas()=" + getCantRuedas() + ", getConsumo()=" + getConsumo() + ", getPrecio()="
                + getPrecio() + "]";
    }

    @Override
    public double calcularPrecio() {
        setPrecio(15);
        return getPrecio();   
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Auto other = (Auto) obj;
        if (listaPrestaciones == null) {
            if (other.listaPrestaciones != null)
                return false;
        } else if (!listaPrestaciones.equals(other.listaPrestaciones))
            return false;
        if (modoPasarCambios != other.modoPasarCambios)
            return false;
        return true;
    }

    public Auto(String patente, String marca, int cantRuedas, String consumo, double precio, String listaPrestaciones,
            ModoCambios modoPasarCambios) {
        super(patente, marca, cantRuedas, consumo, precio);
        this.listaPrestaciones = listaPrestaciones;
        this.modoPasarCambios = modoPasarCambios;
    }

    public Auto() {
        listaPrestaciones = "";
        modoPasarCambios = ModoCambios.MANUAL;
    }

    public String getListaPrestaciones() {
        return listaPrestaciones;
    }

    public void setListaPrestaciones(String listaPrestaciones) {
        this.listaPrestaciones = listaPrestaciones;
    }

    public ModoCambios getModoPasarCambios() {
        return modoPasarCambios;
    }

    public void setModoPasarCambios(ModoCambios modoPasarCambios) {
        this.modoPasarCambios = modoPasarCambios;
    }    
    
}