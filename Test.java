
 class Customexcep extends Exception {
    Customexcep(String str)
    {
        super(str);
    } }
  public  class Test{
        public void m(int age) throws Customexcep{
        if(age <18)
        {
            throw new Customexcep("You cannot vote");
        }
        else{
            System.out.println("You can vote");
        }

    }
    public static void main(String[] args) {
        {
            Test t = new Test();
            try{
                t.m(25);

            }
            catch(Customexcep e)
            {
                System.out.println(e.getMessage());
            }
        }
    }

    
}
