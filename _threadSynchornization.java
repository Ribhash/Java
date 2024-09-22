

class PrintTable
{
    public synchronized void Table(int n )
    {
        System.out.println("Table of:"+n);
        for(int i=1;i<=10;i++)
        {
            System.out.println(i*n);
        
        try{
            Thread.sleep(500);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
}
class Mythread extends Thread
{
    PrintTable pt;
    Mythread(PrintTable pt)
    {
        this.pt =pt;
    }
    public void run()
    {
        pt.Table(2);
    }
}
class Mythread1 extends Thread {
    PrintTable pt;

    public Mythread1(PrintTable pt) {
        this.pt=pt;
    }
    public void run()
    {
        pt.Table(5);
    }
    
}
public class _threadSynchornization {
public static void main(String[] args) {
    {
        PrintTable b= new PrintTable();
        Mythread b1=new Mythread(b);
        Mythread1 b2= new Mythread1(b);
        b1.start();
        b2.start();
    }
}    
}
