
class DaemonThread extends Thread
{
    public void run()
    {
        try
        {
            while(true)
            {
                System.out.println("Daemon thread running");
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
class UserThread extends Thread
{
    public void run()
    {
        try
        {
            for(int i = 1; i <= 5; i++)
            {
                System.out.println("User thread iteration: " + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
class  task8a
{
    public static void main(String args[])
    {
        UserThread userThread = new UserThread();
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true);
        userThread.start();
        daemonThread.start();
    }
}
