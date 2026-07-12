package Day4;

import java.util.Scanner;

public class SumofN {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int n=sc.nextInt();
        System.out.println("Sum of numbers are:");
         int sum =0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
           
        }
    System.out.println(sum);
}
}
