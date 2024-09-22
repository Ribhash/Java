public class multithreaded extends Thread {
    public void run()
    {
        System.out.println("Thread is running");
    }
    public static void main(String[] args)
    {
      multithreaded b = new multithreaded();
      b.start();  
    }
    
}
