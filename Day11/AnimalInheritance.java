package Day11;
class AnimalEat
{
   void eat()
   {
    System.out.println("Animal is eatiing");
   }
}
   class DogEat extends AnimalEat
   {
    void bark()
    {
     System.out.println("Dog is barking");
    }
   }

public class AnimalInheritance {
    public static void main(String[] args) {
      DogEat b1=new DogEat();
      b1.eat();
      b1.bark();
    }
}
