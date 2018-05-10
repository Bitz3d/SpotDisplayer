package pl.rafalab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.rafalab.repositories.SpotPointF54Repository;


@Controller
public class GenerateF54ModelController {


    @Autowired
    SpotPointF54Repository spotPointF54Repository;

    @GetMapping("/generateF54Model")
    public String generateF54(Model model){


        model.addAttribute("f54SpotPoints", spotPointF54Repository.findAll());

        return "F54Model";

    }



}
