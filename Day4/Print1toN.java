package Day4;

import java.util.Scanner;

public class Print1toN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to print:");
        int n=sc.nextInt();
        System.out.println("The numbers are:");
        for(int i=1;i<=n;i++)
        {
            System.out.println(i);
        }

    }
    
}
