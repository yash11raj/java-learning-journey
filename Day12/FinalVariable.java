package Day12;
class Addition
{
final int a=10;
int b=10;
void display()
{
    b=20;
    System.out.println("Sum of numbers are :"+(a+b));
}
}
public class FinalVariable {
    public static void main(String[] args) {
        Addition a= new Addition();
        a.display();
    }
    
}
