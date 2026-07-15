package Day13;
abstract class Animal
{
    void eat()
    {
        System.out.println("Animal eats food");
    }

abstract void sound();
} 
class Dog extends Animal
{
    void sound()
    {
        System.out.println("Dogs Barks");
    }
}
public class AbstractAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sound();
    }
}
