
class Buffer
{
    int buffer[] = new int[5];
    int count = 0, in = 0, out = 0;

    synchronized void produce(int item) throws InterruptedException
    {
        while(count == buffer.length)
        {
            wait();
        }

        buffer[in] = item;
        in = (in + 1) % buffer.length;
        count++;

        notify();
    }

    synchronized int consume() throws InterruptedException
    {
        while(count == 0)
        {
            wait(); 
        }

        int item = buffer[out];
        out = (out + 1) % buffer.length;
        count--;

        notify(); 
        return item;
    }
}
class Producer extends Thread
{
    Buffer buffer;

    Producer(Buffer buffer)
    {
        this.buffer = buffer;
    }

    public void run()
    {
        try
        {
            for(int i = 1; i <= 10; i++)
            {
                buffer.produce(i);
                System.out.println("Produced: " + i);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class Consumer extends Thread
{
    Buffer buffer;

    Consumer(Buffer buffer)
    {
        this.buffer = buffer;
    }

    public void run()
    {
        try
        {
            for(int i = 1; i <= 10; i++)
            {
                int item = buffer.consume();
                System.out.println("Consumed: " + item);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class  task8b
{
    public static void main(String args[])
    {
        Buffer buffer = new Buffer();

        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);

        p.start();
        c.start();
    }
}
