package pl.rafalab.model;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class TextFinder {


    private  static List<String> spotsList = new ArrayList();

    public static List<String> getSpotsList() {
        return spotsList;
    }

    public static void displayDirectoryContents(File dir) {

        try {
            File[] files = dir.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    displayDirectoryContents(file);
                } else {
                    if (file.getCanonicalPath().endsWith(".mod")) {
                        parseFile(file.getCanonicalPath());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private static void parseFile(String fileName) throws FileNotFoundException {


        Scanner scan = new Scanner(new File(fileName));
        while(scan.hasNext()){
            String line = scan.nextLine().toLowerCase().toString();
            if(line.contains("robtarget")){
                spotsList.add(line);
            }
        }

    }



}
