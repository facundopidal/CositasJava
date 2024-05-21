import java.util.Scanner;

public class Password {

    public void validar(){
        Scanner sc = new Scanner(System.in);
        try{
            String password = sc.nextLine();
            int numeros = 0, mayus = 0;
            if(password.length() < 8) throw new InvalidPasswordException();
            for(int i = 0; i < password.length(); i++){
                if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') mayus++;
                if(password.charAt(i) >= '0' && password.charAt(i) <= '9') numeros++;
            }
            if(mayus < 1 || numeros < 1) throw new InvalidPasswordException();
        } catch(InvalidPasswordException e){
            System.out.println("Contraseña invalida");
        } finally{
            sc.close();
        }

    }
    
}
