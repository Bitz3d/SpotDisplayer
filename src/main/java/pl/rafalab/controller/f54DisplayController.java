package pl.rafalab.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.rafalab.repositories.SpotPointF54Repository;

@Controller
public class f54DisplayController {

    @Autowired
    SpotPointF54Repository spotPointF54Repository;

    @GetMapping("/f54")
    public String showf54(ModelMap modelMap){
        modelMap.addAttribute("f54SpotPoints", spotPointF54Repository.findAll());
        return "f54view";
    }


}
