interface Animal{
    public void Display();
}
interface Animal1{
    public void Display1();
}
class Animal2 implements Animal,Animal1{
    public void Display()
    {
        System.out.println("Im the animal of interface first.");
    }
    public void Display1()
    {
        System.out.println("Im the animal of interface second.");
    }
}
public class multiple_inheritance_interface {
    public static void main(String[] args)
    {

    
    Animal2 b=new Animal2();
    b.Display();
    b.Display1();
    }
    
}
