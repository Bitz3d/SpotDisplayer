package pl.rafalab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.rafalab.repositories.SpotPointF56Repository;


@Controller
public class HomeController {


    @Autowired
    SpotPointF56Repository spotPointF56Repository;

    @RequestMapping("/")
    public String home(){

        return "center";

    }

}
