package Day9;
class Laptop
{
    String brand;
    String processor;
    double price;
    Laptop(String brand,String processor,double price)
    {
     this.brand=brand;
     this.processor=processor;
     this.price=price;
    }
 void display()
      {
        System.out.println("Brand is "+brand);
        System.out.println("Processor is "+processor);
        System.out.println("Price is "+price);
      }
    }
public class LaptopClass {
    public static void main(String[] args)
    {
        Laptop l1=new Laptop("Dell","i7",75000);
        Laptop l2=new Laptop("HP","Ryzen 5",65000);
        Laptop l3=new Laptop("Lenovo","i5",60000);
        l1.display();
        l2.display();
        l3.display();
    }
}  

