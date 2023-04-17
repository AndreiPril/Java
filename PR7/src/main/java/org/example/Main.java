package org.example;

import java.util.concurrent.Semaphore;

public class Main
{
    public static void main(String[] args)
    {
        System.out.printf("ПР 7 Вариант 2 Прилепский А.Н. РИБО-04-21 \n \n");
        Semaphore table = new Semaphore(2);
        for(int i = 1; i<=7; i++){
            new Thread(new StudentRunnable(table), "Студент" + i).start();
        }
    }
}