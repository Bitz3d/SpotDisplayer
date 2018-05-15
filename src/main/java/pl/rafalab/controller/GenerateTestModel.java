package pl.rafalab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.rafalab.model.TestSpotPoint;

@Controller
public class GenerateTestModel {

    @Autowired
    TestSpotPoint testSpotPoint;

    @GetMapping("/generateTestModel")
    public String testSpot(Model model)
    {


        model.addAttribute("testSpotPoint", testSpotPoint.getTestSpotPointsList());

        return "testModel";


    }

}
