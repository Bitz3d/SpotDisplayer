package pl.rafalab.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import pl.rafalab.model.TextFinder;
import pl.rafalab.model.Unzip;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Controller
public class UnzipController {

    @Autowired
    private Unzip unzip;

    @Autowired
    private TextFinder textFinder;

    @PostMapping("/files")
    public String submit(@RequestParam("file") List<MultipartFile> files, ModelMap modelMap) {
        modelMap.addAttribute("files", files);
        List<String> pathList = new ArrayList<>();
        List<File[]> textFilesList = new ArrayList<>();
        files.forEach((file) -> {
            try {
               pathList.add(unzip.unZipFile(file));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });



        String mainFolder = "/home/rafau/Desktop/zipfiles/";
        File dir = new File(mainFolder);
        pathList.forEach(s ->  textFinder.displayDirectoryContents(dir));


        return "unZiped";
    }





}
