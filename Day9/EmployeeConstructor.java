package Day9;
class Employee
{
    String name;
    double salary;
    Employee(String name,double salary)
    {
        this.name=name;
        this.salary=salary;
    }
    void display()
    {
        System.out.println("Salary of "+name + " is " +salary);
    }
}
public class EmployeeConstructor {
    public static void main(String[] args) {
        Employee s1=new Employee("Yash",50000);
        Employee s2=new Employee("Rahul",40000);
        Employee s3=new Employee("Priya",20000);
        s1.display();
        s2.display();
        s3.display();
    }
}
