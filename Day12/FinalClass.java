package Day12;
   final class Company
{
  String companyName="GOOGLE";
  String Location="INDIA";
  void display()
  {
      System.out.println("Company name is :"+companyName);
      System.out.println("Company location is :"+Location);
  }
}
class Employee 
{
    int id=101;
    String name="John";
    void display()
    {
        System.out.println("Employee id is :"+id);
        System.out.println("Employee name is :"+name);
    }
}
public class FinalClass {
    public static void main(String[] args) {
        Employee e= new Employee();
        e.display();
       
    }
    
}
