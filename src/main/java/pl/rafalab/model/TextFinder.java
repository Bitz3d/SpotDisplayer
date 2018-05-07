package pl.rafalab.model;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

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
                        System.out.println("     file:" + file.getCanonicalPath());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
