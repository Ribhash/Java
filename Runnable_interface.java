public class Runnable_interface implements Runnable {
    public void run()
    {
        System.out.println("Thread is running");
    }
    public static void main(String[] args)
    {
        Runnable_interface b = new Runnable_interface();
        Thread b1= new Thread(b);
        b1.start();
    }
    
}
