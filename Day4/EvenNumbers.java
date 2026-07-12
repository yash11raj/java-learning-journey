package Day4;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the  even numbers you want to print: ");
        int n=sc.nextInt();
        System.out.println("Even numbers are:");
        for(int i=1;i<=n;i++)
        {
            if (i%2==0)
            {
                System.out.println(i);
            }
                
            }
        }
    }
    

