package pl.rafalab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.rafalab.repositories.SpotPointF56Repository;

@Controller
public class F56ShowSpecificPoint {

    @Autowired
    SpotPointF56Repository spotPointF56Repository;

    @GetMapping("/F56ShowSpecificPoint/{id}")
    public String showF54SpecificPoint(@PathVariable String id, Model model){

        model.addAttribute("f56SpotPoints", spotPointF56Repository.findAll());
        model.addAttribute("robotId", Long.parseLong(id));

        return "F56SpecificPointModel";

    }
}
