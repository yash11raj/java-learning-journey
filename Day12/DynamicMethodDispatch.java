package Day12;
class Animal
{
    void sound()
    {
        System.out.println("Animal make sound");
    }
}
class Dog extends Animal
{
    void sound()
    {
        System.out.println("Dog barks");  
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
         Animal a=new Dog();
         a.sound();
    }
    
}
