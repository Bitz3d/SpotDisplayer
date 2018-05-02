package pl.rafalab.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import pl.rafalab.functions.Unzip;

import java.io.IOException;
import java.util.List;


@Controller
public class SaveController {

    @Autowired
    private Unzip unzip;

    @PostMapping("/save")
    public String submit(@RequestParam("file") List<MultipartFile> files, ModelMap modelMap) {
        modelMap.addAttribute("files", files);

        files.forEach((file) -> {
            try {
                unzip.unZipFile(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        return "saveFiles";
    }





}
