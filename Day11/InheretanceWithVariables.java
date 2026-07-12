package Day11;
class Person
{
    String name="Yash";
}
class Student extends Person
{
    int rollno=01;
}
public class InheretanceWithVariables {
    public static void main(String[] args) {
        Student s1=new Student();
        System.out.println("Name is "+s1.name);
        System.out.println("Roll number is "+s1.rollno);
    }
}