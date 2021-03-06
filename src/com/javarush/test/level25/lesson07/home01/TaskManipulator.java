package com.javarush.test.level25.lesson07.home01;
/*
     Output:
     first
     first
     second
     second
     second
     third
     fifth
     */

public class TaskManipulator implements Runnable,CustomThreadManipulator {

    Thread thread;
    String threadName;

    @Override
    public void run()
    {
        try
        {
            while (!thread.isInterrupted())
            {

                thread.sleep(0);
                System.out.println(threadName);
                thread.sleep(90);
            }


        }
        catch (InterruptedException e)
        {

        }
    }
    @Override
    public void start(String threadName)
    {
        this.threadName = threadName;
        thread = new Thread (this) ;
        thread.start();

    }

    @Override
    public void stop()
    {
        thread.interrupt();
    }
}