package password;

public class Password {

    private String password;
    private int length;

    public boolean isStrong() { 
        if(length < 11) return false;
        int lower = 0, upper = 0, nums = 0;
        char passChar;
        for(int i = 0; i < password.length(); i++) {
            passChar = password.charAt(i);
            if(passChar >= 'a' && passChar <= 'z')
                lower++;
            if(passChar >= 'A' && passChar <= 'Z')
                upper++;
            if(passChar >= '0' && passChar <= '9')
                nums++;
        }
        if(lower > 1 && upper > 2 && nums > 5) return true;
        return false;
    }

    public void generatePassword() {
        String characters = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        password = "";
        int randomIndex;
        for(int i = 0; i < length; i++){
            randomIndex = (int) Math.round(Math.random() * 61);
            password += characters.charAt(randomIndex);
        }
    }

    public Password() {
        length = 8;
        generatePassword();
    }

    public Password(int length) {
        this.length = length;
        generatePassword();
    }

    public String getPassword() {
        return password;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
