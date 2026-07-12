package Day11;
class AnimalCtor
{
    AnimalCtor()
    {
        System.out.println("Animal constructor is created");

    }
}
class DogCtor extends AnimalCtor
{
    DogCtor()
    {
        super();
        System.out.println("Dog constructor is created");
    }
}

public class ConstructorInheritance {
    public static void main(String[] args) {
        DogCtor d=new DogCtor();
    }
}
