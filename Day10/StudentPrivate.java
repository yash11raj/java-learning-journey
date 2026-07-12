package Day10;
class Student
{
    private String name;
    private int age;
    void setName(String name)
    {
        this.name=name;
    }
    String getName()
    {
        return name;
    }
    void setAge(int age)
    {
        this.age=age;
    }
    int getAge()
    {
        return age;
    }
}
public class StudentPrivate {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("Yash");
        s1.setAge(22);
        System.out.println("Name is "+s1.getName());
        System.out.println("Age is "+s1.getAge());
    }
    
}
