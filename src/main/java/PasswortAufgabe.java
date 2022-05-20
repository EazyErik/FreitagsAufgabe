

public class PasswortAufgabe {

    public static void main(String[] args) {

    }


    public static boolean checkPasswordLength(String password) {
        if(password.length() >= 8) {
            return true;
        }
        return false;
    }
}
