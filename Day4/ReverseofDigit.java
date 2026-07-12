package Day4;

import java.util.Scanner;

public class ReverseofDigit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the digits:");
        int n=sc.nextInt();
        System.out.println("Reverse of the digit is:");
        int reverse=0;
        while(n>0)
        {
            int digit=n%10;//Extract the last digit
            reverse=reverse*10+digit;
            n=n/10;//For removing the last digit
        }
        System.out.println(reverse);
    }
    
}
