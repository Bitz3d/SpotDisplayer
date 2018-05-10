package pl.rafalab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.rafalab.repositories.SpotPointF55Repository;

@Controller
public class GenerateF55ModelController {


    @Autowired
    SpotPointF55Repository spotPointF55Repository;

    @GetMapping("/generateF55Model")
    public String generateF55(Model model){


        model.addAttribute("f55SpotPoints", spotPointF55Repository.findAll());

        return "F55Model";

    }


}
