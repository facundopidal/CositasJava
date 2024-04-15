//import java.util.Scanner;

public class Password {
    
    int length;
    String password;
    
    public Password() {
        this.length = 8;
        this.password =null;
    }

    public Password(int length) {
        this.length = length ;
        generatePassword();
    }
    
    public boolean isStrong(){
        int lower = 0, upper = 0, nums =0;
        char aux;
        if(length<11)return false;
        for(int i=0; i< password.length(); i++){
            aux=password.charAt(i);
            if(aux >= 'a' && aux <= 'z')
                lower++;
            if(aux >= 'A' && aux <= 'Z')
                upper++;
            if(aux >= '0' && aux <= '9')
                nums++;
        }
        if(lower > 1 && upper > 2 && nums > 5)
            return true;

        return false;
    }


    public void generatePassword(){
        String characters = "0123456789abcdfghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        int randomIndex;
        password = "";
        for(int i=0; i < length; i++){
            randomIndex = (int)Math.round(Math.random() * 63);
            password += characters.charAt(randomIndex);
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getPassword() {
        return password;
    }


}
