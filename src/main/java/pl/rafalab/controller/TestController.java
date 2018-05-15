package pl.rafalab.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.rafalab.model.TestSpotPoint;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {


    @Autowired
    TestSpotPoint testSpotPoint;




    @GetMapping("/testSpotPoint")
    public String testSpot(Model model)
    {


    model.addAttribute("testSpotPoint", testSpotPoint.getTestSpotPointsList());



        return "testView";


    }


}
