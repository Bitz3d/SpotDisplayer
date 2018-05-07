package pl.rafalab.controller;


import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pl.rafalab.model.User;
import pl.rafalab.repositories.UserRepository;

import java.util.List;


@Controller
public class LoginController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/login")
    public String login(){

        return "login";
    }


    @PostMapping("/login")
    public String checkLogin(@RequestParam("username") String username, @RequestParam("password") String password)
    {

      List<User> userList =  userRepository.findAll();

      if(userList.stream().anyMatch(u -> u.getUserName().equals(username))
         && userList.stream().anyMatch(user -> BCrypt.checkpw(password,user.getPassword())))
        {

          return "home";
        }


        return "login";

    }


}
