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

    public static void displayDirectoryContents(File dir) {

        try {
            File[] files = dir.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    displayDirectoryContents(file);
                } else {
                    if (file.getCanonicalPath().endsWith(".mod")) {
                        System.out.println("     file: " + file.getName());
                        parseFile(file.getCanonicalPath());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private static void parseFile(String fileName) throws FileNotFoundException {

        List<String> listOfRobtargets = new ArrayList();

        Scanner scan = new Scanner(new File(fileName));
        while(scan.hasNext()){
            String line = scan.nextLine().toLowerCase().toString();
            if(line.contains("robtarget")){
                System.out.println(line);
                listOfRobtargets.add(line);
            }
        }

    }



}
