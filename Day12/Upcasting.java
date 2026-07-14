package Day12;
class Vehicle
{
    void run()
    {
        System.out.println("Vehicle runs on four or six or eight wheels");
    }
}
class Car extends Vehicle
{
    void run()
    {
        System.out.println("Car runs on four wheels");
    }
    void rooftop()
    {
        System.out.println("Car has a rooftop");
    }
}
public class Upcasting {
    public static void main(String[] args) {
        Vehicle v=new Car();
        v.run();
    }
}
