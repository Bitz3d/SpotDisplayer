package pl.rafalab.model;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;


@Component
public class TextFinder {


    public File[] finder(String dirName) {
        File dir = new File(dirName);

        return dir.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String filename) {
                return filename.endsWith(".mod");
            }
        });

    }


    public static void displayDirectoryContents(File dir) {

        try {
            File[] files = dir.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    displayDirectoryContents(file);
                } else {
                    if(file.getCanonicalPath().endsWith(".mod")){
                    System.out.println("     file:" + file.getCanonicalPath());}
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }





}



