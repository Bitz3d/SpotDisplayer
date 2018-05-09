package pl.rafalab.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class TextFinder {

    @Autowired
    SpotPointWorker spotPointWorker;


    public void displayDirectoryContents(File dir) {

        try {
            File[] files = dir.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    displayDirectoryContents(file);
                } else {
                    if (file.getName().matches("F\\d\\dM\\d\\d\\_\\d\\dR\\d\\d\\.mod")) {
                        parseFile(file.getCanonicalPath());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private void parseFile(String fileName) throws FileNotFoundException {

        String robName = null;
        String lineName = null;


        Scanner scan = new Scanner(new File(fileName));
        while (scan.hasNext()) {
            String line = scan.nextLine().toLowerCase().toString();
            if (line.contains("module")) {

                robName = spotPointWorker.getRobName(line);
                lineName = spotPointWorker.getLineName(line);

            }

            if (line.contains("robtarget")) {

                spotPointWorker.spotPointSaver(line, robName, lineName);
            }

        }

    }


}
