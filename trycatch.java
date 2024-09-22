public class trycatch {
public static void main(String[] args)
{
    try{
        int dividebyzero = 5/0;
        System.out.println("Rest of the code.");
    }
    catch(ArithmeticException e)
    {
        System.out.println("Arithmetic exception"+e.getMessage());
    }
    finally{
        System.out.println("Finally block executed.");
    }
}    
}
