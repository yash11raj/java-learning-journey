package Day2;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Choose the following option:");
        int choice=sc.nextInt();
        System.out.println("Enter the first number:");
         int num1=sc.nextInt();
        System.out.println("Enter the second number:");
          int num2=sc.nextInt();
          if(choice==1)
          {
            int sum=num1+num2;
             System.out.println("Sum of the two numbers are "+sum);
          }
          else if(choice==2)
          {
            int sub=num1-num2;
            System.out.println("Difference of the two numbers are "+sub);
          }
          else if(choice==3)
          {
            int prod=num1*num2;
             System.out.println("Product of the two numbers are "+prod);
          }
          else if(choice==4)
          {
            if(num2!=0){
            int div=num1/num2;
            System.out.println("Division of the two numbers are "+div);
          }
          else{
            System.out.println("Cannot be divided by zero");
          }
        }
    }
}