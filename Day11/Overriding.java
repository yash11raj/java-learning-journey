package Day11;
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
        System.out.println("Dogs barks");
    }
}

public class Overriding {
    public static void main(String[] args) {
Dog d= new Dog();
d.sound();
}    
}
