package Day13;
abstract class Animals
{
    Animals()
       {
       System.out.println("Animal constructor");
       }
        void sound()
       {
        System.out.println("Animal makes a sound");
       }
}
class Dogs extends Animals
{
    Dogs()
    {
        System.out.println("Dog constructor");
    }
}
public class AbstractConstructor {
    public static void main(String[] args) {
        Animals a=new Dogs();
        a.sound();
        
    }
}
