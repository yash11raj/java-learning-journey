package Day4;

import java.util.Scanner;

public class CountingDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  numbers of digits:");
        int n=sc.nextInt();
        System.out.println("The count of digit is:");
        int count=0;
        while(n>0)
        {
            n=n/10;
            count++;
        }
       System.out.println(count);
    }
    
}
