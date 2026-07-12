package Day9;
class Mobile
{
    String brand;
    double price;
    Mobile()
    {

    }
    Mobile(String brand)
    {
        this.brand=brand;
    }
    Mobile(String brand,double price)
    {
        this.brand=brand;
        this.price=price;
    }
    void display()
    {
        System.out.println("Brand is "+brand);
        System.out.println("Price is "+price);
    }
}
public class MobileConstructorOvload {
    public static void main(String[] args) {
        Mobile m1=new Mobile();
        Mobile m2=new Mobile("Apple");
        Mobile m3=new Mobile("Samsung",50000);
        m1.display();
        m2.display();
        m3.display();
    }
}
