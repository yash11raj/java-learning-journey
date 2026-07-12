package Day11;
class Animal
{
   void eat()
   {
    System.out.println("Animal is eatiing");
   } 
}
   class Dog extends Animal
   {
    void bark()
    {
     System.out.println("Dog is barking");
    }
   }

public class AnimalInheritance {
    public static void main(String[] args) {
      Dog b1=new Dog();
      b1.eat();
      b1.bark();
    }
}
