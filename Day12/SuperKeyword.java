package Day12;
class Animals
{
    void sound()
    {
        System.out.println("Animal makes sounds");
    }
}
class Doggy extends Animals
{
    void sound()
    {
        super.sound(); // Calls Animal's sound method
        System.out.println("Dogs barks");
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        Doggy d= new Doggy();
        d.sound();
    }
    }
