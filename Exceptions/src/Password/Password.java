package Password;

import java.util.Scanner;

public class Password {

    private String word;

    public Password(String word) {
        this.word = word;
    }

    public Password(){

    }
    
    public String getPassword() {
        return word;
    }

    public void setword(String word) {
        this.word = word;
    }

    public void validar(){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Ingrese su contraseña");
            String password = sc.nextLine();
            int nums = 0, mayus = 0;
            if(password.length() < 8) throw new InvalidPasswordException();
            for (int i = 0; i < password.length(); i++) {
                if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') mayus++;
                if(password.charAt(i) >= '0' && password.charAt(i) <= '9') nums++;
            }
            if(mayus < 1 || nums < 1) throw new InvalidPasswordException();
            setword(password);
            System.out.println("Contraseña cargada correctamente");
        }catch(InvalidPasswordException e){
            System.out.println("Contrasenia invalida");
        }finally{
            sc.close();
        }
    }
}
