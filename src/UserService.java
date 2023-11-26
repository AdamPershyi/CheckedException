public class UserService {
    public UserService() {

    }

    String login = "";
    String password;
    String repeatPassword;

    public UserService(String login, String password, String repeatPassword) {
        this.login = login;
        this.password = password;
        this.repeatPassword = repeatPassword;
    }

    public void registerUser() {


        try {
            PasswordValidator passwordValidator = new PasswordValidator();
            passwordValidator.validate(password, repeatPassword);
        } catch (PasswordValidationException e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            System.out.println("Ty man, for registration");
        }
        System.out.println("Hello, " + login);
    }
}
