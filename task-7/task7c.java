
class LongRunningTask extends Thread
{
    public void run()
    {
        try
        {
            System.out.println("Long running task started...");

            for(int i = 1; i <= 5; i++)
            {
                System.out.println("Working... " + i);
                Thread.sleep(1000);
            }

            System.out.println("Long running task completed!");
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
class  task7c
{
    public static void main(String args[])
    {
        LongRunningTask task1 = new LongRunningTask();

        System.out.println("Before starting task1: " + task1.isAlive());

        task1.start();

        System.out.println("After starting task1: " + task1.isAlive());

        try
        {
            System.out.println("Main thread waiting for task1 to complete using join()...");
            task1.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }

        System.out.println("After join(): " + task1.isAlive());
        System.out.println("Main thread continues after task1 completed");
    }
}
