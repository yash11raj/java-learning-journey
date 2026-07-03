package Day2.Day4.Day5.Day6.Day7.Day8.Day9.Day10;
class Employee
{
    private String name;
    private double salary;
    void setName(String name)
    {
        this.name=name;
    }
    String getName()
    {
        return name;
    }
    void setSalary(double salary)
    {
        if(salary>=0)
        {
            this.salary=salary;
        }
        else
        {
            System.out.println("Invalid salary");
        }
    }
        double getSalary()
        {
            return salary;
        }

    }

public class EmployeePrivate {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setName("Yash");
        e1.setSalary(50000);
        System.out.println("Name is "+e1.getName());
        System.out.println("Salary is "+e1.getSalary());
        e1.setSalary(-100);
}
}
