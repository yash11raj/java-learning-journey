package Day4;

import java.util.Scanner;

public class FactorialofN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter which number factorial you want:");
        int n=sc.nextInt();
        System.out.println("Factorial of the number is");
        int fact=1;
        for(int i=n;i>=1;i--)
        {
           fact=fact*i; 
        }
        System.out.println(fact);
        }
    
}
