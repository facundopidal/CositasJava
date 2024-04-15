import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        
        ///Main punto 1
        Persona p1 = new Persona("RAFINHADOPAQUETA",21,'h');
        p1.setPeso(71.3);
        p1.setAltura(1.76);
        System.out.println(p1.calcularIMC());
        System.out.println(p1.toString());
        if(p1.esMayorDeEdad())
        System.out.println("MAyor de eddad");
    
        ///Main punto 3
        Password[] arregPasswords = new Password[5];
        Boolean[] status = new Boolean[5]; 
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.println("Ingrese la longitud de la pass");
            Password pw1 = new Password(scan.nextInt());
            arregPasswords[i] = pw1;
            status[i] = pw1.isStrong();
            System.out.println("La password es " + pw1.password);
            if(status[i] == true){
                System.out.println("Es fuerte");
            }
            else{
                System.out.println("Es debil");
            }
        }
        
       
        scan.close();
    }
}
