package Day4;

import java.util.Scanner;

public class ReverseCounting {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println("Reverse of the number is:");
        for(int i=n;i>=1;i--)
        {
            System.out.println(i);
        }
    }
    
}
