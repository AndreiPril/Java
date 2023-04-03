package org.example;

import java.io.*;
import java.nio.file.FileSystem;
import java.util.ArrayList;
import java.util.Scanner;

public class FileUtils
{
    public  static  boolean isExistFile(File file)
    {
        if(file.exists())
        {
            return true;
        }
        else
        {
            System.out.println("Данный файл не существует, проверьте указанный путь: ");
            return false;
        }
    }
    public static ArrayList<String> readFromFile(File file) throws FileNotFoundException, IOException
    {
        ArrayList<String> content = new ArrayList<>();
        if(file.exists())
        {
            FileReader reader = new FileReader(file);
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNext())
            {
                content.add(scanner.nextLine());
            }
            reader.close();
            scanner.close();
            return content;
        }
        else
        {
            System.out.println("Файл не найден :( ");
            return content;
        }

    }

    public static ArrayList<String> mirrorLines(ArrayList<String> inList)
    {
        ArrayList<String> outList = new ArrayList<>();
        for(String str : inList)
        {
            outList.add(new StringBuilder(str).reverse().toString());
        }
        return outList;
    }

    public static void writeToFile(ArrayList<String> content, String path) throws IOException
    {

        FileWriter writer = new FileWriter(path + File.separator + "Output.txt");
        for(String str : content)
        {
            writer.write(str + "\n");
        }
        writer.close();
        System.out.println("Файл успешно создан по пути: " + path + File.separator + "Output.txt");
    }
}
