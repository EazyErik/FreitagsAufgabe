

public class PasswortAufgabe {

    public static void main(String[] args) {

    }


    public static boolean checkPasswordLength(String password) {
        if(password.length() >= 8) {
            return true;
        }
        return false;
    }

    public static boolean checkForNumbers(String password) {
        if (password.matches("(.*[0-9].*)")) {
            System.out.println("Passwort enthaelt keine Zahlen.");
            return false;
        }
       return false;
    }


    public static boolean checkForSmallAndBigLetters(String password) {
        if (password.matches(".*[a-z]*") && (password.matches(".*[A-Z]*"))) {
            return true;
        }
        return false;
    }
}
