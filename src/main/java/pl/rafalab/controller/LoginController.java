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


      if(userValidation(userList,username)&&passwordValidation(userList,password))
        {

          return "home";
        }


        return "login";

    }

     private boolean userValidation(List<User> userList, String userToCheck)
     {
         for (User user:userList) {

             if(user.getUserName().equals(userToCheck)){
                 return true;
             }

         }
         return false;

     }

    private boolean passwordValidation(List<User> userList, String password)
    {


        for (User user:userList) {

           if (BCrypt.checkpw(password,user.getPassword())){
               return true;

           }


        }
        return false;

    }


}
