

public class PasswortAufgabe {

    public static void main(String[] args) {

    }


    public static boolean checkPasswordLength(String password) {
        if (password.length() >= 8) {
            return true;
        }
        return false;
    }

    public static boolean checkForNumbers(String password) {
        if (password.matches("(.*[0-9].*)")) {
            return true;
        }
        return false;
    }


    public static boolean checkForSmallAndBigLetters(String password) {
        if (password.matches("([a-z])") && (password.matches("([A-Z])"))) {
            return true;
        }
        return false;
    }

    public static String checkPassword(String password) {
        if (checkPasswordLength(password) == true) {
            if (checkForNumbers(password) == true) {
                if (checkForSmallAndBigLetters(password) == true) {
                    return "valid";
                }else{
                    return "you should enter small AND big letters";
                }
            }else{
                return "you should enter NUMBERS";
            }
        }else{
            return "wrong length, should have at least 8 characters";
        }
}

public static String[] checkPasswords(String[] passwords) {

        String[] checkedPasswords = new String[passwords.length];
        for (int i = 0; i < passwords.length; i++) {
           String password =  passwords[i];
          String checkedPassword = checkPassword(password);
          checkedPasswords[i] = checkedPassword;
        }
return checkedPasswords;
}
}
