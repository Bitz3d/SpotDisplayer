package pl.rafalab.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import pl.rafalab.model.SpotPointWorker;
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

    @Autowired
    SpotPointWorker spotPointWorker;

    @PostMapping("/files")
    public String submit(@RequestParam("file") List<MultipartFile> files, ModelMap modelMap) {


            modelMap.addAttribute("files", files);

            List<String> pathList = new ArrayList<>();
            List<String> spotsList;

            files.forEach((file) -> {
                try {

                    pathList.add(unzip.unZipFile(file));

                } catch (IOException e) {

                    e.printStackTrace();

                }
            });

            //  Unzip and get text files from directories
            File dir = new File(unzip.getMainUnzipedFileFolder());
            pathList.forEach(s -> textFinder.displayDirectoryContents(dir));
            spotsList = TextFinder.getSpotsList();



            if(spotsList != null){
                spotsList.forEach(s -> spotPointWorker.spotPointRetriver(s));
            }


            return "unZiped";

    }


}
