public class Autor {
    private String nombre;
    private String apellido;
    private String email;
    private char genero;
    
    public Autor(String nombre, String apellido, String email, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getEmail() {
        return email;
    }
    public char getGenero() {
        return genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void mostrar(){
        System.out.println("Nombre y Apellido: " + nombre +" "+ apellido);
        System.out.println("Email: " + email);
        System.out.println(genero =='M' ? "Genero: Masculino" : "Genero Femenino" ); ///TERNARIO
    }
    

}
