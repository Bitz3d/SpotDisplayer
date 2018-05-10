package pl.rafalab.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.rafalab.repositories.SpotPointF56Repository;

@Controller
public class GenerateF56ModelController {


    @Autowired
    SpotPointF56Repository spotPointF56Repository;

    @GetMapping("/generateF56Model")
    public String generateF56(Model model){


        model.addAttribute("f56SpotPoints", spotPointF56Repository.findAll());

        return "F56Model";

    }


}
