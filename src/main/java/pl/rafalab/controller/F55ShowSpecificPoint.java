package pl.rafalab.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.rafalab.repositories.SpotPointF55Repository;

@Controller
public class F55ShowSpecificPoint {


    @Autowired
    SpotPointF55Repository spotPointF55Repository;

    @GetMapping("/F55ShowSpecificPoint/{id}")
    public String showF54SpecificPoint(@PathVariable String id, Model model){

        model.addAttribute("f55SpotPoints", spotPointF55Repository.findAll());
        model.addAttribute("robotId", Long.parseLong(id));

        return "F55SpecificPointModel";

    }



}
