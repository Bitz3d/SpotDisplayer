package pl.rafalab.Validators;

import org.springframework.beans.factory.annotation.Autowired;
import pl.rafalab.model.User;
import pl.rafalab.repositories.UserRepository;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

public class EmailConfirmation implements ConstraintValidator<EmailConfirmator, String> {

    @Autowired
    UserRepository userRepository;

    @Override
    public void initialize(EmailConfirmator emailConfirmator) {

    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        List<User> allUsers = userRepository.findAll();

        for (User user: allUsers) {

            if(user.getEmail().equals(email)){
                return false;
            }


        }

        return true;

    }
}
