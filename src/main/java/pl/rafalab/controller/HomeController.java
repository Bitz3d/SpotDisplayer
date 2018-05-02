package pl.rafalab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.rafalab.repositories.SpotPointRepository;

@Controller
public class HomeController {

    @Autowired
    SpotPointRepository spotPointRepository;


    @RequestMapping("/")
    public String home(){



        return "home";
    }

}
