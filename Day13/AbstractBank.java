package Day13;
abstract class Bank
{
    abstract double interestRate();
}
class SBI extends Bank
{
    double interestRate()
    {
        return 6.5;
    }
}
class HDFC extends Bank
{
    double interestRate()
    {
        return 8.2;
    }
}
public class AbstractBank {
    public static void main(String[] args) {
        Bank b1=new SBI();
        Bank b2=new HDFC();
        System.out.println("SBI Interest Rate is :"+b1.interestRate());
        System.out.println("HDFC Interest Rate is :"+b2.interestRate());
}
}
