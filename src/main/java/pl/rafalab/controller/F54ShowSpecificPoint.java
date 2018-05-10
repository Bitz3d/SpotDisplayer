package pl.rafalab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.rafalab.repositories.SpotPointF54Repository;

@Controller
public class F54ShowSpecificPoint {


    @Autowired
    SpotPointF54Repository spotPointF54Repository;

    @GetMapping("/F54ShowSpecificPoint/{id}")
    public String showF54SpecificPoint(@PathVariable String id, Model model){

        model.addAttribute("f54SpotPoints", spotPointF54Repository.findAll());
        model.addAttribute("robotId", Long.parseLong(id));

        return "F54SpecificPointModel";

    }

}
