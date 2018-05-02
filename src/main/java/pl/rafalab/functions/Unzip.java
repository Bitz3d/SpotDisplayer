package pl.rafalab.functions;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;


@Component
public class Unzip {

    /**
     * Size of the buffer to read/write data
     */
    private static final int BUFFER_SIZE = 4096;


    public void unZipFile(MultipartFile files) throws IOException {
        final String destDirectory = "/home/rafau/Desktop/zipfiles/"+files.getOriginalFilename().replace(".zip","");

        File destDir = new File(destDirectory);

//        Trick to move file to server then unzip it.
        File rarFilePath = new File(files.getOriginalFilename());
        files.transferTo(rarFilePath);


//        Create new file if not exist
        if (!destDir.exists()) {
            destDir.mkdir();
        }
        ZipInputStream zipIn = new ZipInputStream(new FileInputStream(rarFilePath.getAbsoluteFile()));
        ZipEntry entry = zipIn.getNextEntry();

        while (entry != null) {
            String filePath = destDirectory + File.separator + entry.getName();
            if (!entry.isDirectory()) {
                // if the entry is a file, extracts it
                extractFile(zipIn, filePath);
            } else {
                // if the entry is a directory, make the directory
                File dir = new File(filePath);
                dir.mkdir();
            }
            zipIn.closeEntry();
            entry = zipIn.getNextEntry();
        }
        zipIn.close();
    }

    private void extractFile(ZipInputStream zipIn, String filePath) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
        byte[] bytesIn = new byte[BUFFER_SIZE];
        int read = 0;
        while ((read = zipIn.read(bytesIn)) != -1) {
            bos.write(bytesIn, 0, read);
        }
        bos.close();
    }


}

