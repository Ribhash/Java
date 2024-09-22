public class _throws {
    public void method(int a) throws ArithmeticException{
        System.out.println(a/0);
    }
    public static void main(String[] args)
    {
        _throws b =new _throws();
        try{

            b.method(5);
        }
        catch(Exception e )
        {
            System.out.println(e.getMessage());
        }
    }
    
}
