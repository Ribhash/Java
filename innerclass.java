public class innerclass {
    private String name="Ribhash";
    class innerclass1{
        public void Display()
        {
            System.out.println("Inner class invoked!!. Your name is:"+name);
        }

    }
    public static void main(String[] args) {
        
            innerclass b=new innerclass();
            innerclass.innerclass1 b1=b.new innerclass1();
            b1.Display();
        
    }
    
}
