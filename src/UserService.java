public class UserService {



public void registerUser(String login, String password, String repeatPassword) {


        try {
            PasswordValidator passwordValidator = new PasswordValidator();
            passwordValidator.validate(password, repeatPassword);
            System.out.println("Hello, " + login);
        } catch (PasswordValidationException e) {
            System.out.println("Wrong password");
        } finally {
            System.out.println("Ty man, for registration");
        }


}

}
