package Day2.Day4.Day5.Day6.Day7.Day8;
class Car{
    String brand;
    String model;
    double price;
    void display()
    {
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);
    }
}
public class CarClass {
    public static void main(String[] args) {
        Car car=new Car();
        car.brand="BMW";
        car.model="X5";
        car.price=600000;
        car.display();
    }
}
