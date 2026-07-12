package Day8;
class Circle
{
    double radius;
    void area()
    {
      System.out.println("Area of Circle="+(3.14*radius*radius));
    }
}
public class CircleClass {
 public static void main(String[] args) {
        Circle c=new Circle();
        c.radius=5.2;
        c.area();
 }   
}
