package pl.rafalab.Validators;

import org.springframework.beans.factory.annotation.Autowired;
import pl.rafalab.model.User;
import pl.rafalab.repositories.UserRepository;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;


public class UserNameConfirmation implements ConstraintValidator<UserNameContirmator, String > {

    @Autowired
    UserRepository userRepository;

    @Override
    public void initialize(UserNameContirmator userNameContirmator) {

    }

    @Override
    public boolean isValid(String userName, ConstraintValidatorContext constraintValidatorContext) {
        List<User> allUsers = userRepository.findAll();

        for (User user: allUsers) {

            if(user.getUserName().equals(userName)){
                return false;
            }


        }

        return true;
    }
}
