package org.example;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.printf("PR 5 Var 2 Student Prilepskiy A.N. Group RIBO-04-21 \n \n");
        Scanner scanner = new Scanner(System.in);
        String path;
        File file;


        while(true)
        {
            System.out.printf("Укажите путь к файлу: ");
            file = new File(scanner.nextLine());

            if(FileUtils.isExistFile(file))
            {
                try
                {
                    ArrayList<String> content = FileUtils.readFromFile(file);
                    FileUtils.writeToFile(FileUtils.mirrorLines(content), file.getParent());
                }
                catch (FileNotFoundException fnfe)
                {

                    System.out.println(fnfe.getMessage() + "\nДанный файл не существует, проверьте указанный путь: ");
                    continue;
                }
                catch (IOException ioe)
                {
                    System.out.println("Произошла ошибка при чтении");
                    ioe.getMessage();
                    break;
                }
                break;
            }
        }


    }
}