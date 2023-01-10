import java.lang.invoke.WrongMethodTypeException;
import java.util.regex.Pattern;

public class Credentials {
    public static void checkCredentials(String login, String password, String confirmPassword)
            throws WrongPasswordException {
        if (!StringCorrect(login)) {
            throw new WrongLoginException("Логин указан НЕ верно!");
        }
        if (StringCorrect(password) && password.equals(confirmPassword)) {
            System.out.println("Логин и пароль указаны-корректно");
        } else {
            throw new WrongPasswordException("Пароль указан НЕ верно!");

        }
    }
    private static boolean StringCorrect(String checkString){

        if (checkString==null
        ||checkString.isEmpty()
        ||checkString.isBlank()
        ||checkString.length()>20){
            return false;
        }
        return Pattern.matches("[a-zA-Z0-9_]*$" ,checkString)

    }
}