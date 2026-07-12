package Day4;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  fibonacci number");
        int num=sc.nextInt();
        System.out.println("Fibonacci series is:");
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=3;i<=num;i++)
        {
            int next=a+b;
            System.out.println(next);
            a=b;
            b=next;
        }
    }
    
}
