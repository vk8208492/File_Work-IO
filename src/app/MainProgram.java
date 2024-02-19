package app;

import app.FileInputService.FileReadService;
import app.FileOutPutService.FileWriterService;

import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть назву файлу:");
        String fileName = scanner.nextLine();
        menu();
        String choose = scanner.nextLine();
        if ( choose.equals("1") ){
            FileReadService readService = new FileReadService();
            readService.fileReaderMethod(fileName);
        } else if ( choose.equals("2") ){
            FileWriterService writerService = new FileWriterService();
            System.out.println("Введіть свій текст");
            String myText = scanner.nextLine() + "\r\n";
            writerService.fileWriterMethod(fileName, myText);
        } else {
            System.out.println("wrong input");
        }
        scanner.close();


    }
    public static void menu(){
        System.out.println("Виберіть дію:");
        System.out.println("1.Читати файл");
        System.out.println("2.Записати у  файл");

    }
}
