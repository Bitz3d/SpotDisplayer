package pl.rafalab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.rafalab.repositories.SpotPointF56Repository;

@Controller
public class f56DisplayController {

    @Autowired
    SpotPointF56Repository spotPointF56Repository;

    @GetMapping("/f56")
    public String showf54(ModelMap modelMap){
        modelMap.addAttribute("f56SpotPoints", spotPointF56Repository.findAll());
        return "f56view";
    }



}
