package pl.rafalab.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.rafalab.repositories.SpotPointF54Repository;
import pl.rafalab.repositories.SpotPointF55Repository;
import pl.rafalab.repositories.SpotPointF56Repository;

@Controller
public class AllRobotsDisplayController {



    @Autowired
    SpotPointF56Repository spotPointF56Repository;
    @Autowired
    SpotPointF55Repository spotPointF55Repository;
    @Autowired
    SpotPointF54Repository spotPointF54Repository;

    @GetMapping("/allrobots")
    public String showf54(ModelMap modelMap){


        modelMap.addAttribute("f54SpotPoints", spotPointF54Repository.findAll());
        modelMap.addAttribute("f55SpotPoints", spotPointF55Repository.findAll());
        modelMap.addAttribute("f56SpotPoints", spotPointF56Repository.findAll());


        return "unZiped";
    }



}
