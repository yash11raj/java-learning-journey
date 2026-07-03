package Day2.Day4.Day5.Day6.Day7.Day8.Day9;
class Student
{
    String name;
    int age;
    public Student( String name,int age )
    {
      this.name=name;
      this.age=age;
    }
}
public class ConstructorStudent {
    public static void main(String[] args) {
        Student s1=new Student("Yash",23);
        System.out.println("Student name is "+ s1.name);
        System.out.println("Student age is "+s1.age);
    }
}
    

