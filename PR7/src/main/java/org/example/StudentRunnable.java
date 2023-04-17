package org.example;

import java.util.concurrent.Semaphore;

import static java.lang.Thread.sleep;

public class StudentRunnable implements Runnable
{
    Semaphore semaphore;

    public StudentRunnable(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try{
            System.out.println(Thread.currentThread().getName() + " waiting");
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " eating");
            sleep(3000);
            System.out.println(Thread.currentThread().getName() + " exit");
            semaphore.release();

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
