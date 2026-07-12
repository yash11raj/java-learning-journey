package Day5;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int[]num=new int[5];
        int sum=0;
        for(int i=0;i<num.length;i++)
        {
            num[i]=sc.nextInt();
        }
        System.out.println("Sum of all numbers are:");
        for(int i=0;i<num.length;i++)
        {
           sum=sum+num[i];
        }
        System.out.println(sum);
        
    }
    
}
