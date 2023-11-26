public class PasswordValidator extends UserService {


    public Boolean validate(String password, String repeatPassword) throws PasswordValidationException {

        if (password.equals(repeatPassword) && password.length() >= 10) {
            return true;

        } else {
            throw new PasswordValidationException("Your password is incorrect.");
        }

    }
}
