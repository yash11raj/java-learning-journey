package Day12;
class Person
{
    int age=20;
    final void gender()
    {
        System.out.println("Gender is male");
    }
}
class Student extends Person
{
    void genderIs()
    {
        System.out.println("Gender is female");
    }
}
public class FinalMethod {
    public static void main(String[] args) {
        Student s= new Student();
        s.gender();
        s.genderIs();
        System.out.println("Age is : "+s.age);
    }
}
