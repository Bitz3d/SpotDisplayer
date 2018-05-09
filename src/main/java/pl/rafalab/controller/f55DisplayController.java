package pl.rafalab.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.rafalab.repositories.SpotPointF55Repository;

@Controller
public class f55DisplayController {

    @Autowired
    SpotPointF55Repository spotPointF55Repository;

    @GetMapping("/f55")
    public String showf54(ModelMap modelMap){
        modelMap.addAttribute("f55SpotPoints", spotPointF55Repository.findAll());
        return "f55view";
    }

}
