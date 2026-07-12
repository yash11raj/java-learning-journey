package Day4;

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        System.out.println("Sum of the digits are:");
        int sum=0;
        while(num>0)
        {
           int digit=num%10;//Extract last digit
             sum=sum+digit;
             num=num/10;
            }
            System.out.println(sum);
    }
    
}
