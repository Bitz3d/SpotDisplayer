package pl.rafalab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.rafalab.repositories.SpotPointF56Repository;


@Controller
public class HomeController {


    @Autowired
    SpotPointF56Repository spotPointF56Repository;



    @RequestMapping("/test")
    @ResponseBody
    public String test(){


        String sisis = "sdsdsdsd";


//        sisis.equals();


        System.out.println(spotPointF56Repository.findBySpotName(sisis));



        return "sss";
    }





    @RequestMapping("/")
    public String home(){




        return "home";

    }

}
