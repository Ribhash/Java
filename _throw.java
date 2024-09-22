public class _throw {
   void M(int age){

   
        try{

             if(age<18)
            {
                throw new ArithmeticException("You cannot vote"); 
            }
            else{
                System.out.println("You can vote");
            }
        
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) 
        {
            _throw b=new _throw();
            b.M(11);

        }
    }
  

