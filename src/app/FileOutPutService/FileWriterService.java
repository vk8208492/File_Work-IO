package app.FileOutPutService;

import app.utils.Constants;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriterService {

    String path;

    public void fileWriterMethod(String fileName,String myText) {
        try {
            path = Constants.BASE_PATH_OUT + fileName;

            FileOutputStream fileOutputStream = new FileOutputStream(path,true);

            byte[] somebytes = myText.getBytes();
            fileOutputStream.flush();
            fileOutputStream.write(somebytes);

            fileOutputStream.close();

        } catch (IOException e) {
            System.out.println("Exception" + e.getMessage());
            System.exit(0);
        }
        System.out.println("Файл Information створено,інформацію записано.");
    }
}