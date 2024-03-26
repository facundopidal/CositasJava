public class ItemDeVenta {
    private int id;
    private int cant;
    private String descripcion;
    private double pUnitario;
    private double total;
    
    
    public ItemDeVenta(int id, int cant, String descripcion, double pUnitario) {
        this.id = id;
        this.cant = cant;
        this.descripcion = descripcion;
        this.pUnitario = pUnitario;
        total = pUnitario * cant;
    }

    public String toString() {
        return "ItemDeVenta [id=" + id + ", cant=" + cant + ", descripcion=" + descripcion + ", pUnitario=" + pUnitario
                + ", total=" + total + "]";
    }

    public int getId() {
        return id;
    }
    public int getCant() {
        return cant;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public double getpUnitario() {
        return pUnitario;
    }
    public double getTotal() {
        return total;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setpUnitario(double pUnitario) {
        this.pUnitario = pUnitario;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    
    

    

}
