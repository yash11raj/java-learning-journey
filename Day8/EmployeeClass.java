package Day8;
class Employee
    {
        String name;
        double salary;
        String department;
    }
    public class EmployeeClass {
    public static void main(String[] args) {
        Employee Emp=new Employee();
        Emp.name="Yash";
        Emp.salary=500000;
        Emp.department="IT";

        System.out.println("Name: " + Emp.name);
        System.out.println("Salary: " + Emp.salary);
        System.out.println("Department: " + Emp.department);
    }
}
