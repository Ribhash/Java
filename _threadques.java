class _ThreadFirst extends Thread{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            try{
            System.out.println(i);
            Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
class _ThreadSecond extends Thread{
    public void run()
    {
        for(int i =11;i<=20;i++)
        {
            try
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        }

    }
}
public class _threadques {
    public static void main(String[] args)
    {
        _ThreadFirst b= new _ThreadFirst();
        _ThreadSecond b1= new _ThreadSecond();
        b.start();
        b1.start();
    }
    
}
