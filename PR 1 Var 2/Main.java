package org.example;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длительность вклада в месяцах:");
        int term = sc.nextInt();
        System.out.println("Введите годовой процент:");
        double perc = sc.nextDouble();
        System.out.println("Введите начальную сумму:");
        double deposit = sc.nextDouble();
        double initial = deposit;
        sc.close();

        for (int i = 1; i <= term; i++)
        {
            deposit += deposit * ((perc / 100.0) / 12.0);
        }
        double income = Math.round((deposit - initial) * 100.0) / 100.0;
        System.out.println("\nДоход за " + term + " месяцев: " + income + "\n");
        double avgIncome = Math.round((income / term) * 100.0) / 100.0;
        System.out.println("Средний ежемесячный доход: " + avgIncome + "\n");
    }
}