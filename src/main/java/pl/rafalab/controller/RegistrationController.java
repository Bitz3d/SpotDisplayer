package pl.rafalab.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.rafalab.model.User;
import pl.rafalab.repositories.UserRepository;
import javax.validation.Valid;


@Controller
@RequestMapping("/user")
public class RegistrationController {

    @Autowired
    UserRepository userRepository;


    @GetMapping("/registration")
    public String registration(Model model) {


        model.addAttribute("user", new User());


        return "form/registration";
    }

    @PostMapping("/registration")
    public String registration(@Valid User user, BindingResult result) {


        if (result.hasErrors()) {


            return "form/registration";
        }

        userRepository.save(user);
        return "center";

    }

}
