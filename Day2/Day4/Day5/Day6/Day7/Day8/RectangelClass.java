package Day2.Day4.Day5.Day6.Day7.Day8;
class Rectangle{
    double length;
    double breadth;
     double area()
    {
      return length*breadth;
    }

public class RectangelClass {
    public static void main(String[] args) {
        Rectangle rect=new Rectangle();
        rect.length=5.2;
        rect.breadth=3.5;
       System.out.println("Area="+ rect.area());
}   
}
}
