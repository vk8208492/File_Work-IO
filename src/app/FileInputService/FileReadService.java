package app.FileInputService;

import app.utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadService {

    static String path;
    static FileInputStream fin;

    public void fileReaderMethod(String fileName) {
//        fileName = "records_01.txt";
        path = Constants.BASE_PATH_IN + fileName;

        try {
            fin = new FileInputStream(path);
            int i;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }

    }

}



