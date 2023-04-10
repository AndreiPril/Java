package com.mirea.kt.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LoaderRunnable implements Runnable
{
    private String path;

    public LoaderRunnable(String path)
    {
        this.path = path;
    }

    @Override
    public void run()
    {
        if(this.path != null && new File(this.path).exists())
        {
            FileInputStream fis;
            try
            {
                fis = new FileInputStream(path);
                ObjectInputStream ois = new ObjectInputStream(fis);
                Message message = (Message) ois.readObject();
                ois.close();

                System.out.println(message.toString());
            }
            catch (ClassNotFoundException | IOException e)
            {
                System.out.println("Что-то пошло не так \n" + e.getClass() + " " + e.getMessage());
            }
        }
    }

}
