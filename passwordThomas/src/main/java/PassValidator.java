import java.util.Locale;

public class PassValidator {

    private static final int MIN_LENGTH = 10;

    public static String passwordValidator(String passwordToCheck){
        String answer = "";
        answer += checkLength(passwordToCheck);
        answer += checkLetters(passwordToCheck);
        answer += checkNumbers(passwordToCheck);
        answer += checkCapital(passwordToCheck);
        if (answer.length()>0){
            return answer;
        }
        return passwordToCheck +" ist ein gutes Passwort.";
    }

    public static String[] passwordValidator(String[] passwordsToCheck){
        String[] answers = new String[passwordsToCheck.length];
        for (int i = 0; i < answers.length; i++) {
            answers[i] = passwordValidator(passwordsToCheck[i]);
        }
        return answers;
    }

    private static String checkLength (String password){
        if (password.length()<MIN_LENGTH){
            return "Zu wenig Zeichen, bitte mindestens 10 Zeichen verwenden. ";
        };
        return "";
    }

    private static String checkNumbers (String password){
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))){
                return "";
            }
        }
        return "Mindestens eine Zahl verwenden. ";
    }

    private static String checkLetters (String password){
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLetter(password.charAt(i))){
                return "";
            }
        }
        return "Mindestens einen Buchstaben verwenden. ";
    }

    private static String checkCapital (String password){
        if (password.toLowerCase(Locale.ROOT).equals(password)){
            return "Mindestens einen Großbuchstaben verwenden. ";
        } else if (password.toUpperCase(Locale.ROOT).equals(password)){
            return "Mindestens einen Kleinbuchstaben verwenden. ";
        } else {
            return "";
        }
    }

}
