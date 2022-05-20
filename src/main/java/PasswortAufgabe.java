

public class PasswortAufgabe {

    public static void main(String[] args) {

    }


    public static boolean checkPasswordLength(String password) {
        return password.length() >= 8;
    }

    public static boolean checkForNumbers(String password) {
        return password.matches("(.*[0-9].*)");
    }


    public static boolean checkForSmallAndBigLetters(String password) {
        return password.matches("(.*[a-z].*)") && (password.matches("(.*[A-Z].*)"));
    }

    public static String checkPassword(String password) {
        if (checkPasswordLength(password)) {
            if (checkForNumbers(password)) {
                if (checkForSmallAndBigLetters(password)) {
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
