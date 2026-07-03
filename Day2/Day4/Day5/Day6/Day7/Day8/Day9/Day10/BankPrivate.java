package Day2.Day4.Day5.Day6.Day7.Day8.Day9.Day10;
class BankAccount
{
     private String accountholder;
    private double balance;
      void  setAccountholder(String accountholder)
    {
        this.accountholder=accountholder;
    }
    String getAccountholder()
    { 
        return accountholder;
    }
    void setBalance(double balance)
    {
        this.balance=balance;
    }
    double getBalance()
    {
        return balance;
    }
    void deposit(double amount)
    {
        if(amount>0)
        {
        this.balance=balance+amount;
       }
       else
       {
        System.out.println("Invalid balance");
       }
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
        System.out.println("Account holder is "+getAccountholder());
        System.out.println("Balance is "+getBalance());
    }
}

public class BankPrivate {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount();
        b1.setAccountholder("Yash");
        b1.setBalance(10500);
        b1.deposit(2500);
        b1.withdraw(1500);
        b1.display();
        
}
}
