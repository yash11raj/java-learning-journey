package Day3;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       System.out.println("Enter the number:");
       int num=sc.nextInt();
       if(num<0)
       {
        System.out.println(num+" "+ "is negative number");
       }
       else if(num>0)
       {
        System.out.println(num+" "+ "is postive number");
       }
       else 
       {
        System.out.println("Zero");
       }

    }
    
}
