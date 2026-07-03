package Day2.Day4.Day5.Day6.Day7.Day8.Day9;
class BankAccount
{
    String accountholder;
    double balance;
    BankAccount()
    {
    }
    BankAccount(String accountholder,double balance)
    {
        this.accountholder=accountholder;
        this.balance=balance;
    }
    void deposit(double amount)
    {
        this.balance=balance+amount;
    }
    void withdraw(double amount)
    {
        if(amount>balance)
        {
            System.out.println("Insufficient balance");
        }
        else
        {
            this.balance=balance-amount;
        }
        }
    
    void display()
    {
        System.out.println("Account holder is "+accountholder);
        System.out.println("Balance is "+balance);
    }

public class ClassBankAcc {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount("Yash",10000);
        b1.deposit(2500);
        b1.withdraw(1500);
        b1.display();
        
}
}
}